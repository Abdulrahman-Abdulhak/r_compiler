lexer grammar Js_Lexer;

@header {
    package antlr;
}

// keywords tokens
DO: 'do';
FOR: 'for';
FUNCTION: 'function';
IF: 'if';
IN: 'in';
OF: 'of';
RETURN: 'return';
WHILE: 'while';
DECLARERS: 'var' | 'let' | 'const';

// syntax tokens
ID: [a-zA-Z_][a-zA-Z0-9_]*;
PRIM_TYPE: NUM | STRING | BOOL | NULL | UNDEFINED;
MULTILINE_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' ~([\n\r])* -> channel(HIDDEN);

// type tokens
INT: '-'?[0-9]+;
FLOAT: '-'?[0-9]*'.'[0-9]+;
NUM: INT | FLOAT;
fragment STRING_ALLOWED_CHARS: '\\"' | '\\\'' | '\\`';
STRING
    : '"' (~('"' | [\n\r]) | STRING_ALLOWED_CHARS)* '"'
    | '\'' (~('\'' | [\n\r]) | STRING_ALLOWED_CHARS)* '\''
    | '`' (~('`') | STRING_ALLOWED_CHARS)* '`'
    ;
BOOL: 'true' | 'false';
NULL: 'null';
UNDEFINED: 'undefined';

// operator tokens, and their priority valu. (the heigher the more priority it has).
// Increment Operators
INCREMENT_OP: ADD_OP ADD_OP; // post: 15, pre: 14
DECREMENT_OP: SUP_OP SUP_OP; // post: 15, pre: 14
// NOT Operators
LOGIC_NOT_OP: '!'; // 14
// Arithmetic Operators
POW_OP: '**'; // 13
MULT_OP: '*'; // 12
DIV_OP: '/'; // 12
REM_OP: '%'; // 12
ADD_OP: '+'; // 11
SUP_OP: '-'; // 11
// Comparison Operators
COMPARE_OP: '<' | '<=' | '>' | '>='; // 9
EQUAL_COMPARE_OP: '==' | '===' | '!=' | '!=='; // 8
// Logical Operators
AND: '&&'; // 4
OR: '||'; // 3
NULL_COALES_OP: '??'; // 3
// Ternary Operator
TERNARY_OP1: '?';
TERNARY_OP2: COLON; // presedence of 2 compined with above
// Assignment Operators
// they're all with the priority value of 2.
ASSIGNMENT_OP: '=';
COLON: ':';
ADD_ASSIGN_OP: ADD_OP ASSIGNMENT_OP;
SUB_ASSIGN_OP: SUP_OP ASSIGNMENT_OP;
MULT_ASSIGN_OP: MULT_OP ASSIGNMENT_OP;
POW_ASSIGN_OP: POW_OP ASSIGNMENT_OP;
DIV_ASSIGN_OP: DIV_OP ASSIGNMENT_OP;
REM_ASSIGN_OP: REM_OP ASSIGNMENT_OP;
AND_ASSIGN_OP: AND ASSIGNMENT_OP;
OR_ASSIGN_OP: OR ASSIGNMENT_OP;
NULL_ASSIGN_OP: NULL_COALES_OP ASSIGNMENT_OP;
ARROW: '=>';

// general tokens
SEMICOLON: ';';
COMMA: ',';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
OPEN_SQUARE_BRACKET: '[';
CLOSE_SQUARE_BRACKET: ']';
OPEN_CURLY_BRACES: '{';
CLOSE_CURLY_BRACES: '}';
NEWLINE: [\n\r]+;
WS: [ \n\t\r]+ -> skip;