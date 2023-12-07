parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line: lineStart lineEnd;

lineStart
    : function
    | statement
    | if
    | while
    | for
    | forin
    | forof
    | doWhile
    | return
    ;

lineEnd: SEMICOLON | NEWLINE | NEWLINE SEMICOLON NEWLINE;

function: arrowFunction | normalFunction;

statement
    : declare           #variableDeclaration
    | expression        #normalExpression
    ;

if: IF scopeHead scopeBody;

while: WHILE scopeHead scopeBody;

// for syntax: for(expression 1; expression 2; expression 3) bodyScobe
// expression 1:
for: FOR OPEN_BRACKET forExpression1? SEMICOLON expressionList? SEMICOLON expressionList? CLOSE_BRACKET scopeBody;
forExpression1: declare | expressionList;
expressionList: (expression COMMA)* expression;

forin: FOR OPEN_BRACKET DECLARERS? ID IN expression CLOSE_BRACKET scopeBody;

forof: FOR OPEN_BRACKET DECLARERS? ID OF expression CLOSE_BRACKET scopeBody;

doWhile: DO scopeBody WHILE scopeHead;

return: RETURN expression;

declare: DECLARERS ID assignmentRightHand? (COMMA ID assignmentRightHand)*;
assignmentRightHand: (ASSIGNMENT_OP ID)* ASSIGNMENT_OP expression;

arrowFunction: args ARROW (block | expression);

normalFunction: FUNCTION ID? args block;

functionCall: ID param;

expression
    : OPEN_BRACKET expression CLOSE_BRACKET                             #parentheses
    | functionCall                                                      #funcCall
    | expression incrementsOp                                           #postIncre
    | incrementsOp expression                                           #preInc
    | LOGIC_NOT_OP expression                                           #logicalNOT
    | expression POW_OP expression                                      #pow
    | expression multiplicativeOp expression                            #mult
    | expression additiveOp expression                                  #add
    | expression COMPARE_OP expression                                  #compare
    | expression EQUAL_COMPARE_OP expression                            #compareWithEqual
    | expression AND expression                                         #logicalAND
    | expression (OR | NULL_COALES_OP) expression                       #logicalOR_logicalNull
    | expression TERNARY_OP1 expression TERNARY_OP2 expression          #ternary
    | assignment                                                        #assign
    | returnable                                                        #byVal
    ;

assignment: ID (assinmentOp ID)* assinmentOp expression;

scopeHead: OPEN_BRACKET expression CLOSE_BRACKET;
scopeBody: block | lineStart;

block: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;

object: OPEN_CURLY_BRACES ((ID COLON returnable COMMA)*ID COLON returnable COMMA?)? CLOSE_CURLY_BRACES;

array: OPEN_SQUARE_BRACKET ((returnable COMMA)*returnable COMMA?)? CLOSE_SQUARE_BRACKET;

args: OPEN_BRACKET ((ID COMMA)*(ID))? CLOSE_BRACKET;

param: OPEN_BRACKET ((returnable COMMA)*(returnable))? CLOSE_BRACKET;

returnable
    : PRIM_TYPE       #primitive
    | object          #objectVal
    | array           #arrayVal
    | function        #functionVal
    | ID              #variable
    ;

incrementsOp: INCREMENT_OP | DECREMENT_OP;

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