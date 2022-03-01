grammar Pmm;

@header{
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
}

//program returns[Program ast]: definition+ EOF
//       ;
program returns[List<Expression> ast = new ArrayList<Expression>()]:
    exps=expressions { $ast.addAll($exps.ast); } EOF
    ;

definition: varDefinition | funcDefinition;

varDefinition: ID (','ID)* ':' type';'; // DEVUELVE UNA LISTA

funcDefinition: 'def' ('main():' | (ID '(' (ID ':' type (',' ID ':' type)*)? '):' type?) ) '{' varDefinition* statement* '}';

type: 'int'
    | 'double'
    | 'char'
    | '['INT_CONSTANT']' type
    | 'struct {' varDefinition+ '}'
    ;

statement: 'if' expression ':' body ('else' body)?
    | 'while' expression ':' body
    | (ID '('(expression(','expression)*)?')'
    | expression '=' expression
    | ('print'|'input') expression(','expression)*
    |'return' expression)';'
    ;
body: statement |'{' statement+ '}';

expressions returns [ArrayList<Expression> ast = new ArrayList<Expression>()] /*locals [Type t]*/:
    exp=expression+{
        $ast.add($exp.ast);
        System.out.println($exp.ast.toString());
    };

expression returns[Expression ast]:
    /*ID'(' (expression(','expression)*)?')' {
            $ast = new FunctionInvocation(
                $ID.text,
                ,
                $ID.getLine(),
                $ID.getCharInLinePosition()+1
            );
        }
    |*/ exp1=expression'[' exp2=expression ']'{
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
    | '('type')' exp=expression
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
    | INT_CONSTANT {
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
    | ID {
            $ast = new Variable(
                $ID.text,
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

    ID: ('_'|LETTER)('_'|LETTER|NUMBER)*;

COMMENT: ('#' .*? '\r'?('\n'|EOF)| '"""' .*? '"""') -> skip;
TRASH: (' ' | '\t' | '\n' | '\r') -> skip;