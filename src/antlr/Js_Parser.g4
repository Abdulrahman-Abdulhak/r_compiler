parser grammar Js_Parser;

options {
    tokenVocab = Js_Lexer;
}

program: line* EOF;

line
    : function
    | statement
    | if
    | while
    | for
    | forin
    | forof
    | doWhile
    | block
    | specialLine
    ;

specialLine: CONTINUE | return;
return: RETURN expression?;


// function representaions
function: arrowFunction | normalFunction;
arrowFunction: (args | ID) ARROW (block | expression);
normalFunction: FUNCTION ID? args block;

args: OPEN_BRACKET ((ID COMMA)*REST_OP? ID)? CLOSE_BRACKET;
// end of _functions representations_


// JS Statements
statement
    : declare           #variableDeclaration
    | expression        #normalExpression
    | noUseStatement    #noUse
    ;

declare: DECLARERS ID assignmentRightHand? (COMMA ID assignmentRightHand)*;
assignmentRightHand: (ASSIGNMENT_OP ID)* ASSIGNMENT_OP expression;

expression
    : OPEN_BRACKET expression CLOSE_BRACKET                             #parentheses
    | functionCall                                                      #funcCall
    | NEW functionCall                                                  #new
    | NEW ID                                                            #newNoParam
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
functionCall
    : ID param                                          #byName
    | OPEN_BRACKET function CLOSE_BRACKET param         #byIIFE
    ;
incrementsOp: INCREMENT_OP | DECREMENT_OP;
assignment: ID (assinmentOp ID)* assinmentOp expression;
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
// end of _JS Statements_


// conditions & loops
if: IF scopeHead scopeBody;
while: WHILE scopeHead scopeBody;
doWhile: DO scopeBody WHILE scopeHead;

// for syntax: for(expression 1; expression 2; expression 3) bodyScobe
// expression 1:
for: FOR OPEN_BRACKET forExpression1? SEMICOLON expressionList? SEMICOLON expressionList? CLOSE_BRACKET scopeBody;
forExpression1: declare | expressionList;
expressionList: (expression COMMA)* expression;

forin: FOR OPEN_BRACKET DECLARERS? ID IN expression CLOSE_BRACKET scopeBody;
forof: FOR OPEN_BRACKET DECLARERS? ID OF expression CLOSE_BRACKET scopeBody;

scopeHead: OPEN_BRACKET expression CLOSE_BRACKET;
scopeBody: block | line;
// end of _conditions & loops_


block: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;

object
    : OPEN_CURLY_BRACES ((STRING COLON returnable COMMA)*STRING COLON returnable COMMA?)? CLOSE_CURLY_BRACES
    | OPEN_CURLY_BRACES ((ID COLON returnable COMMA)*ID COLON returnable COMMA?)? CLOSE_CURLY_BRACES
    | OPEN_CURLY_BRACES (ID COMMA)*ID COMMA?CLOSE_CURLY_BRACES
    | OPEN_CURLY_BRACES (classFunction COMMA)*classFunction COMMA?CLOSE_CURLY_BRACES
    ;
classFunction: ID args block;

array: OPEN_SQUARE_BRACKET ((returnable COMMA)*returnable COMMA?)? CLOSE_SQUARE_BRACKET;

param: OPEN_BRACKET ((paramInput COMMA)*(paramInput COMMA?))? CLOSE_BRACKET;
paramSpreadable: ID | array;
paramInput: returnable | SPREAD_OP paramSpreadable;

returnable
    : PRIM_TYPE       #primitive
    | object          #objectVal
    | array           #arrayVal
    | function        #functionVal
    | ID              #variable
    ;

noUseStatement: SEMICOLON;