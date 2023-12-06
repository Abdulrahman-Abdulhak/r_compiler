parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line: lineStart LINE_END;

lineStart
    :function
    | statement
    | if
    | while
    | for
    | forin
    | forof
    | doWhile
    | return
    ;

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
assignmentsRightHand: (assinmentOp ID)* assinmentOp expression;

arrowFunction: args ARROW (block | expression);

normalFunction: FUNCTION ID? args block;

functionCall: ID param;

expression
    : OPEN_BRACKET expression CLOSE_BRACKE             #parentheses
    | functionCall                                     #funcCall
    | expression incrementsOp                          #postIncre
    | incrementsOp expression                          #preInc
    | LOGIC_NOT_OP expression                          #logicalNOT
    | expression POW_OP expression                     #pow
    | expression multiplicativeOp expression           #mult
    | expression additiveOp expression                 #add
    | expression COMPARE_OP expression                 #compare
    | expression EQUAL_COMPARE_OP expression           #compareWithEqual
    | expression AND expression                        #logicalAND
    | expression (OR | NULL_COALES_OP) expression      #logicalOR_logicalNull
    | returnable                                       #byVal
    ;

scopeBody: block | lineStart;

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

incrementsOp: INCREMENT_OP | DECREMENT_OP; // post: 15, pre: 14

multiplicativeOp: MULT_OP | DIV_OP | REM_OP;

additiveOp: ADD_OP | SUP_OP;

assinmentOp
    : ASSIGNMENT_OP
    | ADD_ASSIGN_OP
    | SUB_ASSIGN_OP
    | MULT_ASSIGN_OP
    | POW_ASSIGN_OP
    | DIV_ASSIGN_OP
    | REM_ASSIGN_OP
    | AND_ASSIGN_OP
    | OR_ASSIGN_OP
    | NULL_ASSIGN_OP
    ;