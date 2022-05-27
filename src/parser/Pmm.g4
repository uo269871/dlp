grammar Pmm;

@header{
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
}

program returns[Program ast]
        locals [List<Definition> def = new ArrayList<Definition>(),
        List<Statement> funcDefBody = new ArrayList<Statement>();]:
        (d=definition {$def.addAll($d.ast);})*
        a='def' m='main' '(' ')' ':' '{'
        (v1=varDefList {$funcDefBody.addAll($v1.ast);} ';')*
        (st=statement{$funcDefBody.addAll($st.ast);})* '}'
        {$def.add(
            new FuncDefinition(
                $funcDefBody,
                $m.text,
                new FunctionType(
                    VoidType.getInstance(),
                    new ArrayList<VarDefinition>(),
                    $a.getLine(),
                    $a.getCharPositionInLine()
                ),
                $a.getLine(),
                $a.getCharPositionInLine()));
        }
        {$ast = new Program($def, $a.getLine(), $a.getCharPositionInLine());}
        EOF;

definition returns [List<Definition> ast = new ArrayList<Definition>()]
            locals [List<Statement> funcDefinitionBody = new ArrayList<Statement>(),
            List<VarDefinition> functionTypeParams = new ArrayList<VarDefinition>()]:
            a='def' ID '('
            v=paramsList {$functionTypeParams.addAll($v.ast);}
            ')' ':' {Type ty = VoidType.getInstance(); }
            (pt=primitiveType {ty = $pt.ast;})?
            '{' (v1=varDefList {$funcDefinitionBody.addAll($v1.ast);} ';')*
            (st=statement{$funcDefinitionBody.addAll($st.ast);})*
           '}' {
            $ast.add(
                new FuncDefinition(
                    $funcDefinitionBody,
                    $ID.text,
                    new FunctionType(
                        ty,
                        $functionTypeParams,
                        $ID.getLine(),
                        $ID.getCharPositionInLine()
                    ),
                    $ID.getLine(),
                    $ID.getCharPositionInLine()
                )
            );
            }
            | vD=varDefList {$ast.addAll($vD.ast);} ';'
    ;

varDefList returns[List<VarDefinition> ast = new ArrayList<VarDefinition>()]
        locals[List<String> variableDefNames = new ArrayList<String>()]:
        ID1=ID {$variableDefNames.add($ID1.text);}
        (',' ID2=ID {
            if(!$variableDefNames.contains($ID2.text))
                $variableDefNames.add($ID2.text);
            else
                new ErrorType("Variable repetida",$ID1.getLine(),$ID1.getCharPositionInLine());
        })* ':'
        ty=type {
            for (String v :$variableDefNames)
                $ast.add(
                    new VarDefinition(
                        v,
                        $ty.ast,
                        $ID1.getLine(),
                        $ID1.getCharPositionInLine()
                    )
                );
        }
    ;

paramsList returns[List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
    (ID1=ID ':' ty1=primitiveType {
        $ast.add(
            new VarDefinition(
                $ID1.text,
                $ty1.ast,
                $ID1.getLine(),
                $ID1.getCharPositionInLine()
            )
        );
    }
    (',' ID2=ID ':' ty2=primitiveType {
        $ast.add(
            new VarDefinition(
                $ID2.text,
                $ty2.ast,
                $ID2.getLine(),
                $ID2.getCharPositionInLine()
            )
        );
    })*)?
    ;

type returns [Type ast]:
    p=primitiveType { $ast = $p.ast; }
    | '['INT_CONSTANT']' t=type {
            $ast = new ArrayType(
                LexerHelper.lexemeToInt($INT_CONSTANT.text),
                $t.ast,
                $INT_CONSTANT.getLine(),
                $INT_CONSTANT.getCharPositionInLine()
            );
        }
    | s ='struct' '{' fields=structFields '}' {
            $ast = new RecordType(
                $fields.struct,
                $s.getLine(),
                $s.getCharPositionInLine()
            );
        }
    ;

structFields returns [List<RecordField> struct = new ArrayList<RecordField>()] locals [List<String> names = new ArrayList<String>()]:
        (ID1=ID {$names.add($ID1.text);}
        (',' ID2=ID {$names.add($ID2.text);} )*
        ':' t=type {
            for(String v: $names) {
                RecordField r = new RecordField(
                                    v,
                                    $t.ast,
                                    $ID1.getLine(),
                                    $ID1.getCharPositionInLine()
                                );
                if(!$struct.contains(r))
                    $struct.add(r);
                else
                    new ErrorType("Campo de struct repetido",$ID1.getLine(),$ID1.getCharPositionInLine());
            }
            $names = new ArrayList<String>();
        } ';')*
    ;

primitiveType returns [Type ast]:
    i='int' { $ast = IntType.getInstance();}
    | d='double' { $ast = DoubleType.getInstance();}
    | c='char' { $ast = CharType.getInstance();}
    | b='boolean' { $ast = BooleanType.getInstance();}
    ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]
    locals [List<Statement> whileBody = new ArrayList<Statement>(),
    List<Statement> ifBody = new ArrayList<Statement>(),
    List<Statement> elseBody = new ArrayList<Statement>(),
    List<Expression> functionParams = new ArrayList<Expression>()]:
        ID'(' (exp1=expression {$functionParams.add($exp1.ast);}
        (',' (exp2=expression {$functionParams.add($exp2.ast);}))*)? ')' ';'
        {$ast.add(
            new FunctionInvocation(
                new Variable(
                    $ID.text,
                    $ID.getLine(),
                    $ID.getCharPositionInLine()+1
                ),
                $functionParams,
                $ID.getLine(),
                $ID.getCharPositionInLine()+1)
            );
        }
        | 'while' exp=expression ':' (
                '{' (st=statement {$whileBody.addAll($st.ast);})* '}'
                | (st1=statement {$whileBody.addAll($st1.ast);})
            ) {
                $ast.add(
                    new WhileLoop(
                        $whileBody,
                        $exp.ast,
                        $exp.ast.getLine(),
                        $exp.ast.getColumn()
                    )
                );
            }
        | 'if' exp=expression ':' (
            '{' (st1=statement {$ifBody.addAll($st1.ast);})* '}'
            | st2=statement {$ifBody.addAll($st2.ast);})
            ('else' ('{'
                (st3=statement {$elseBody.addAll($st3.ast);})* '}'
                | st4=statement {$elseBody.addAll($st4.ast);})
            )?
            {$ast.add(
                new If_Else(
                    $ifBody,
                    $elseBody,
                    $exp.ast,
                    $exp.ast.getLine(),
                    $exp.ast.getColumn()
                )
            );}
        | exp1=expression '=' exp2=expression';'{
            $ast.add(new Assignment(
                $exp1.ast,
                $exp2.ast,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            ));
        }
        | p='print' exp1=expression {
            $ast.add(new Print(
                $exp1.ast,
                $p.getLine(),
                $p.getCharPositionInLine()+1
            ));
        }
        (','exp2=expression {
                $ast.add(new Print(
                    $exp2.ast,
                    $p.getLine(),
                    $p.getCharPositionInLine()+1
                ));
            }
        )*';'
        | i='input' exp1=expression {
            $ast.add(new Input(
                $exp1.ast,
                $i.getLine(),
                $i.getCharPositionInLine()+1
            ));
        }
        (','exp2=expression {
                $ast.add(new Input(
                    $exp2.ast,
                    $i.getLine(),
                    $i.getCharPositionInLine()+1
                ));
            }
        )*';'
        | 'return' e=expression';'{
            $ast.add(new Return(
                $e.ast, $e.ast.getLine(),$e.ast.getColumn()
            ));
        }
    ;

expression returns[Expression ast] locals[List<Expression> params = new ArrayList<Expression>()]:
    INT_CONSTANT {
            $ast = new IntLiteral(
                LexerHelper.lexemeToInt($INT_CONSTANT.text),
                $INT_CONSTANT.getLine(),
                $INT_CONSTANT.getCharPositionInLine()+1
            );
        }
    | REAL_CONSTANT {
            $ast = new RealLiteral(
                LexerHelper.lexemeToReal($REAL_CONSTANT.text),
                $REAL_CONSTANT.getLine(),
                $REAL_CONSTANT.getCharPositionInLine()+1
            );

        }
    | CHAR_CONSTANT {
            $ast = new CharLiteral(
                LexerHelper.lexemeToChar($CHAR_CONSTANT.text),
                $CHAR_CONSTANT.getLine(),
                $CHAR_CONSTANT.getCharPositionInLine()+1
            );
        }
    | BOOL_CONSTANT{
        $ast = new BooleanLiteral(
                LexerHelper.lexemeToBoolean($BOOL_CONSTANT.text),
                $BOOL_CONSTANT.getLine(),
                $BOOL_CONSTANT.getCharPositionInLine()+1
            );
        }
    | ID {
            $ast = new Variable(
                $ID.text,
                $ID.getLine(),
                $ID.getCharPositionInLine()+1
            );
        }

    | '(' exp=expression ')'{
            $ast = $exp.ast;
        }
    | exp1=expression'[' exp2=expression ']'{
            $ast = new ArrayAccess(
                $exp1.ast,
                $exp2.ast,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            );
        }
    | exp=expression'.'ID {
            $ast = new FieldAccess(
                $exp.ast,
                $ID.text,
                $exp.ast.getLine(),
                $exp.ast.getColumn()
            );
        }
    | a='('t=primitiveType')' exp=expression{
            $ast = new Cast(
                $exp.ast,
                $t.ast,
                $a.getLine(),
                $a.getCharPositionInLine()
            );
        }
    | '-' exp=expression {
            $ast = new UnaryMinus(
                $exp.ast,
                $exp.ast.getLine(),
                $exp.ast.getColumn()
            );
        }
    | '!' exp=expression {
            $ast = new Not(
                $exp.ast,
                $exp.ast.getLine(),
                $exp.ast.getColumn()
            );
        }
    | exp1=expression OP=('*'|'/'|'%') exp2=expression {
            $ast = new Arithmetic(
                $exp1.ast,
                $exp2.ast,
                $OP.text,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            );
        }
    | exp1=expression OP=('+'|'-') exp2=expression {
            $ast = new Arithmetic(
                $exp1.ast,
                $exp2.ast,
                $OP.text,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            );
        }
    | exp1=expression OP=('>'|'>='|'<'|'<='|'!='|'==') exp2=expression{
            $ast = new Comparison(
                $exp1.ast,
                $exp2.ast,
                $OP.text,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            );
        }
    | exp1=expression OP=('&&'|'||') exp2=expression {
            $ast = new And_Or(
                $exp1.ast,
                $exp2.ast,
                $OP.text,
                $exp1.ast.getLine(),
                $exp1.ast.getColumn()
            );
        }
    | ID'(' (exp1=expression {$params.add($exp1.ast);} (','exp2=expression {$params.add($exp2.ast);} )*)?')' {
            $ast = new FunctionInvocation(
                new Variable(
                    $ID.text,
                    $ID.getLine(),
                    $ID.getCharPositionInLine()+1
                ),
                $params,
                $ID.getLine(),
                $ID.getCharPositionInLine()+1
            );
        }
    ;


fragment
NUMBER:  [0-9];
fragment
LETTER: [a-zA-Z];
fragment
DECIMAL: INT_CONSTANT+'.'NUMBER* | INT_CONSTANT*'.'NUMBER+;

INT_CONSTANT: '0'|[1-9]NUMBER*;

REAL_CONSTANT: DECIMAL|(DECIMAL|INT_CONSTANT)[eE][+-]?NUMBER;

CHAR_CONSTANT: '\''.'\'' | '\'\\'(INT_CONSTANT | [ntr])'\'';

BOOL_CONSTANT: 'true'|'false';

ID: ('_'|LETTER)('_'|LETTER|NUMBER)*;

COMMENT: ('#' .*? '\r'?('\n'|EOF)| '"""' .*? '"""') -> skip;
TRASH: (' ' | '\t' | '\n' | '\r') -> skip;