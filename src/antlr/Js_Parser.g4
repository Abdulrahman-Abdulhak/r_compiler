parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line:
    ( statement
    | function
    | if
    | while
    | for
    | forin
    | forof
    | doWhile
    | NEWLINE
    | returnable
    ) LINE_END;

statement: declare | assignment | functionCall | expression;

function: arrowFunction | normalFunction;

if: IF expression scopeBody;

while: WHILE expression scopeBody;

for: FOR OPEN_BRACKET forExpression1? SEMICOLON statement? SEMICOLON statement? CLOSE_BRACKE scopeBody;

forin: FOR OPEN_BRACKET DECLARERS? ID IN expression CLOSE_BRACKE scopeBody;

forof: FOR OPEN_BRACKET DECLARERS? ID OF expression CLOSE_BRACKE scopeBody;

doWhile: DO scopeBody WHILE expression;

returnable: PRIM_TYPE | object | array | function | ID;

declare: DECLARERS ID ((ASSIGNMENT_OP ID)* ASSIGNMENT_OP returnable)?;

assignment: ID (ASSIGNMENT_OP ID)* ASSIGNMENT_OP returnable;

functionCall: ID param block;

arrowFunction: param ARROW (block | returnable);

normalFunction: FUNCTION ID? param block;

expression
    : OPEN_BRACKET expression CLOSE_BRACKE
    | functionCall
    | expression INCREMENTS_OP
    | INCREMENTS_OP expression
    | LOGIC_NOT_OP expression
    | expression POW_OP expression
    | expression MULTIPLICATIVE_OP expression
    | expression ADDITIVE_OP expression
    | expression COMPARE_OP expression
    | expression EQUAL_COMPARE_OP expression
    | expression AND expression
    | expression (OR || NULL_COALES_OP) expression
    | ID
    | returnable
    ;

scopeBody: block | line;

block: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;

forExpression1: (statement COMMA)* statement;

object: OPEN_CURLY_BRACES ((ID COLON returnable COMMA)*ID COLON returnable COMMA?)? CLOSE_CURLY_BRACES;

array: OPEN_SQUARE_BRACKET ((returnable COMMA)*returnable COMMA?)? CLOSE_SQUARE_BRACKET;

param: OPEN_BRACKET ((returnable COMMA)*(returnable))? CLOSE_BRACKE;