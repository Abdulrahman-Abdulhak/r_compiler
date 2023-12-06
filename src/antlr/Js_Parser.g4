parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line:
    ( function
    | statement
    | if
    | while
    | for
    | forin
    | forof
    | doWhile
    | return
    ) LINE_END;

function: arrowFunction | normalFunction;

statement
    : declare           #variableDeclaration
    | assignment        #assigning
    | expression        #normalExpression
    ;

if: IF expression scopeBody;

while: WHILE expression scopeBody;

for: FOR OPEN_BRACKET forExpression1? SEMICOLON statement? SEMICOLON statement? CLOSE_BRACKE scopeBody;

forin: FOR OPEN_BRACKET DECLARERS? ID IN expression CLOSE_BRACKE scopeBody;

forof: FOR OPEN_BRACKET DECLARERS? ID OF expression CLOSE_BRACKE scopeBody;

doWhile: DO scopeBody WHILE expression;

return: RETURN expression;

declare: DECLARERS ID assignmentRightHand? (COMMA ID assignmentRightHand)*;

assignment: ID assignmentsRightHand;

assignmentRightHand: (ASSIGNMENT_OP ID)* ASSIGNMENT_OP expression;
assignmentsRightHand: (ASSIGNMENTS_OP ID)* ASSIGNMENTS_OP expression;

arrowFunction: args ARROW (block | expression);

normalFunction: FUNCTION ID? args block;

functionCall: ID param;

expression
    : OPEN_BRACKET expression CLOSE_BRACKE             #parentheses
    | functionCall                                     #funcCall
    | expression INCREMENTS_OP                         #postIncre
    | INCREMENTS_OP expression                         #preInc
    | LOGIC_NOT_OP expression                          #logicalNOT
    | expression POW_OP expression                     #pow
    | expression MULTIPLICATIVE_OP expression          #mult
    | expression ADDITIVE_OP expression                #add
    | expression COMPARE_OP expression                 #compare
    | expression EQUAL_COMPARE_OP expression           #compareWithEqual
    | expression AND expression                        #logicalAND
    | expression (OR | NULL_COALES_OP) expression      #logicalOR_logicalNull
    | returnable                                       #byVal
    ;

scopeBody: block | line;

block: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;

forExpression1: (statement COMMA)* statement;

object: OPEN_CURLY_BRACES ((ID COLON returnable COMMA)*ID COLON returnable COMMA?)? CLOSE_CURLY_BRACES;

array: OPEN_SQUARE_BRACKET ((returnable COMMA)*returnable COMMA?)? CLOSE_SQUARE_BRACKET;

args: OPEN_BRACKET ((ID COMMA)*(ID))? CLOSE_BRACKE;

param: OPEN_BRACKET ((returnable COMMA)*(returnable))? CLOSE_BRACKE;

returnable
    : PRIM_TYPE       #primitive
    | object          #objectVal
    | array           #arrayVal
    | function        #functionVal
    | ID              #variable
    ;