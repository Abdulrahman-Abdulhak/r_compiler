lexer grammar Js_Lexer;

@header {
    package antlr;
}

// syntax tokens
ID: [a-zA-Z][a-zA-Z0-9_]*;
PRIM_TYPE: NUM | STRING | BOOL | NULL | UNDEFINED;

// keywords tokens
DO: 'do';
FOR: 'for';
FUNCTION: 'function';
IF: 'if';
IN: 'in';
OF: 'of';
WHILE: 'while';
DECLARERS: 'var' | 'let' | 'const';

// type tokens
INT: [0-9]+;
FLOAT: [0-9]*'.'[0-9]+;
NUM: INT | FLOAT;
fragment STRING_ALLOWED_CHARS: ' '|'\\b'|'\\f'|'\\r'|'\\n'|'\\t'|'\\"'|'\\\''|'\\`'|'\\';
STRING
    : '"' (~('"' | [\n\r]) | STRING_ALLOWED_CHARS | '\'')* '"'
    | '\'' (~('\'' | [\n\r]) | STRING_ALLOWED_CHARS | '"')* '\''
    | '`' (~('`') | STRING_ALLOWED_CHARS | '\'' | '"' | [\n\r])* '`'
    ;
BOOL: 'true' | 'false';
NULL: 'null';
UNDEFINED: 'undefined';

// operator tokens, and their priority valu. (the heigher the more priority it has).
// Increment Operators
INCREMENT_OP: ADD_OP ADD_OP;
DECREMENT_OP: SUP_OP SUP_OP;
INCREMENTS_OP: INCREMENT_OP | DECREMENT_OP; // post: 15, pre: 14
// NOT Operators
LOGIC_NOT_OP: '!'; // 14
// Arithmetic Operators
POW_OP: '**'; // 13
MULT_OP: '*';
DIV_OP: '/';
REM_OP: '%';
MULTIPLICATIVE_OP: MULT_OP | DIV_OP | REM_OP; // 12
ADD_OP: '+';
SUP_OP: '-';
ADDITIVE_OP: ADD_OP | SUP_OP; // 11
// Comparison Operators
COMPARE_OP: '<' | '<=' | '>' | '>='; // 9
EQUAL_COMPARE_OP: '==' | '===' | '!=' | '!=='; // 8
// Logical Operators
AND: '&&'; // 4
OR: '||'; // 3
NULL_COALES_OP: '??'; // 3
// Assignment Operators
ASSIGNMENT_OP: '=';
COLON: ':'; // 2
ADD_ASSIGN_OP: ADD_OP ASSIGNMENT_OP;
SUB_ASSIGN_OP: SUP_OP ASSIGNMENT_OP;
MULT_ASSIGN_OP: MULT_OP ASSIGNMENT_OP;
POW_ASSIGN_OP: POW_OP ASSIGNMENT_OP;
DIV_ASSIGN_OP: DIV_OP ASSIGNMENT_OP;
REM_ASSIGN_OP: REM_OP ASSIGNMENT_OP;
AND_ASSIGN_OP: AND ASSIGNMENT_OP;
OR_ASSIGN_OP: OR ASSIGNMENT_OP;
ASSIGNMENTS_OP
    : ASSIGNMENT_OP
    | ADD_ASSIGN_OP
    | SUB_ASSIGN_OP
    | MULT_ASSIGN_OP
    | POW_ASSIGN_OP
    | DIV_ASSIGN_OP
    | REM_ASSIGN_OP
    | AND_ASSIGN_OP
    | OR_ASSIGN_OP
    ; // 2
ARROW: '=>'; // 2

// general tokens
WS: [ \n\t\r]+ -> skip;
NEWLINE: [\n\r]+;
SEMICOLON: ';';
LINE_END: SEMICOLON | NEWLINE;
COMMA: ',';
OPEN_BRACKET: '(';
CLOSE_BRACKE: ')';
OPEN_SQUARE_BRACKET: '[';
CLOSE_SQUARE_BRACKET: ']';
OPEN_CURLY_BRACES: '{';
CLOSE_CURLY_BRACES: '}';
MULTILINE_COMMENT: '/*' .*? '*/';
LINE_COMMENT: '////' ~([\n\r])*;
COMMENT: (MULTILINE_COMMENT | LINE_COMMENT) -> skip;