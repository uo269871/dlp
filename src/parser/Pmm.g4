grammar Pmm;	

program: definition+ EOF
       ;

definition: varDefinition | funcDefinition;

varDefinition: ID (','ID)* ':' type';';

funcDefinition: 'def' ('main():' | (ID '(' (ID ':' type (',' ID ':' type)*)? '):' type?) ) '{' varDefinition* sentence* '}';

type: 'int'
    | 'double'
    | 'char'
    | '['INT_CONSTANT']' type
    | 'struct {' varDefinition+ '}';

sentence: 'if' expression ':' body ('else' body)?
        | 'while' expression ':' body
        | (ID '('(expression(','expression)*)?')'
        | expression '=' expression
        | ('print'|'input') expression(','expression)*
        |'return' expression)';'
        ;
body: sentence |'{' sentence+ '}';

expression: ID'(' (expression(','expression)*)?')'
            | expression'[' expression ']'
            | expression'.'ID
            | '('type')' expression
            | '-' expression
            | '!' expression
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
            | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
            | expression ('&&'|'||') expression
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID;


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