lexer grammar Lexer;

@header {
package antlr;
}

//options {
//superClass = js.JsLexerBase;
//}

// general tokens
COLON: ':';
COMMA: ',';
DOT: '.';
ELLIPSIS: '...';
SEMICOLON: ';';
// brackets
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
OPEN_SQUARE_BRACKET: '[';
CLOSE_SQUARE_BRACKET: ']';
OPEN_CURLY_BRACES: '{';
// keep this comment until we solve the problem of how to how to use {action} in antlr
//TEMPLATE_LITERAL_VAR_CLOSE: {this.falser()}? '}' -> popMode;
CLOSE_CURLY_BRACES: '}';
// for strings
OPEN_TEMPLATE_LITERAL: '`' -> pushMode(TEMPLATE_LITERAL);

// keywords tokens
AS: 'as';
ASYNC: 'async';
CONTINUE: 'continue';
CONST: 'const';
DEFAULT: 'default';
DO: 'do';
EXPORT: 'export';
FOR: 'for';
FROM: 'from';
FUNCTION: 'function';
GET: 'get';
IF: 'if';
IMPORT: 'import';
IN: 'in';
LET: 'let';
NEW: 'new';
OF: 'of';
RETURN: 'return';
SET: 'set';
THIS: 'this';
VAR: 'var';
WHILE: 'while';
YIELD: 'yield';

// type tokens
BOOL: 'true' | 'false';
INT: [-+]?[0-9]+;
FLOAT: [-+]?[0-9]*'.'[0-9]+;
fragment STRING_ALLOWED_CHARS: '\\\n' | '\\\r' | '\\"' | '\\\'' | '\\`';
STRING
    : '"' (~('"' | [\n\r]) | STRING_ALLOWED_CHARS)* '"'
    | '\'' (~('\'' | [\n\r]) | STRING_ALLOWED_CHARS)* '\''
    ;
NULL: 'null';
UNDEFINED: 'undefined';

// operator tokens, and their priority valu. (the heigher the more priority it has).
OPTIONAL_CHAINING_OP: '?' DOT;
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

// syntax tokens
ID: [a-zA-Z_$][a-zA-Z0-9_$]*;

// skipabale tokens
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~([\n\r])* -> skip;
NEWLINE: [\r\n\u2028\u2029]+ -> skip;
WS: [\t\u000B\u000C\u0020\u00A0]+ -> skip;

// this came up to me after seeing [this]{https://stackoverflow.com/a/68687324/19117184} answer on stackoverflow
mode TEMPLATE_LITERAL;
CLOSE_TEMPLATE_LITERAL: '`' -> popMode;
//TEMPLATE_LITERAL_START_VAR: '${' -> pushMode(DEFAULT_MODE);
TEMPLATE_LITERAL_ALLOWED_CHAR: (~[`] | STRING_ALLOWED_CHARS)*;