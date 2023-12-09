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

args: OPEN_BRACKET ((arg COMMA)*(arg | rest))? CLOSE_BRACKET;
arg: ID (ASSIGNMENT_OP returnable)?;
rest: REST_OP ID;
// end of _functions representations_


// JS Statements
statement
    : declare           #declaration
    | expression        #exp
    | noUseStatement    #noUse
    ;

declare: DECLARERS ID assignmentRightHand? (COMMA ID assignmentRightHand)*;
assignmentRightHand: (ASSIGNMENT_OP ID)* ASSIGNMENT_OP expression;

expression
    : OPEN_BRACKET expression CLOSE_BRACKET                                    #parentheses
    | functionCall                                                             #funcCall
    | memberGetter                                                             #memberGet
    | NEW functionCall                                                         #new
    | NEW ID                                                                   #newNoParam
    | expression incrementsOp                                                  #postIncre
    | incrementsOp expression                                                  #preInc
    | LOGIC_NOT_OP expression                                                  #logicalNOT
    | expression POW_OP expression                                             #pow
    | expression multiplicativeOp expression                                   #mult
    | expression additiveOp expression                                         #add
    | expression COMPARE_OP expression                                         #compare
    | expression EQUAL_COMPARE_OP expression                                   #compareWithEqual
    | expression AND expression                                                #logicalAND
    | expression (OR | NULL_COALES_OP) expression                              #logicalOR_logicalNull
    | expression TERNARY_OP1 expression TERNARY_OP2 expression                 #ternary
    | assignment                                                               #assign
    | returnable                                                               #byVal
    ;
functionCall
    : callables param                                   #fromMemory
    | OPEN_BRACKET function CLOSE_BRACKET param         #asIIFE
    ;
callables: ID | memberGetter | OPEN_BRACKET callables CLOSE_BRACKET;

incrementsOp: INCREMENT_OP | DECREMENT_OP;

memberGetter: member (dotNotation | bracketNotation)+;
member
    : (objectable | objectableWithBrackets | OPEN_BRACKET member CLOSE_BRACKET)
    | (objectable | objectableWithBrackets | OPEN_BRACKET member CLOSE_BRACKET)
    ;
dotNotation: DOT ID;
bracketNotation: OPEN_SQUARE_BRACKET indexers CLOSE_SQUARE_BRACKET;
indexers
    : ID
    | STRING
    | INT
    | expression
    ;
objectable
    : NEW functionCall
    | NEW ID
    | incrementsOp expression
    | LOGIC_NOT_OP expression
    | primeType
    | object
    | array
    | ids
    | OPEN_BRACKET objectable CLOSE_BRACKET
    ;
// these represent only the operations that can have
// the member get operations after putting them inside of brackets
objectableWithBrackets
    : OPEN_BRACKET
    ( expression incrementsOp
    | expression POW_OP expression
    | expression multiplicativeOp expression
    | expression additiveOp expression
    | expression COMPARE_OP expression
    | expression EQUAL_COMPARE_OP expression
    | expression AND expression
    | expression (OR | NULL_COALES_OP) expression
    | expression TERNARY_OP1 expression TERNARY_OP2 expression
    | assignment
    | function
    ) CLOSE_BRACKET
    | OPEN_BRACKET objectableWithBrackets CLOSE_BRACKET
    ;

assignment: assignable (assinmentOp assignable)* assinmentOp expression;
assignable: ID | memberGetter;

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

object: OPEN_CURLY_BRACES ((objPropDefine COMMA)*objPropDefine COMMA?)? CLOSE_CURLY_BRACES;
objPropDefine
    : STRING COLON expression
    | ID COLON expression
    | ID
    | method
    | OPEN_SQUARE_BRACKET expression CLOSE_SQUARE_BRACKET COLON expression
    ;
method: ID args block;

array: OPEN_SQUARE_BRACKET ((expression COMMA)*expression COMMA?)? CLOSE_SQUARE_BRACKET;

param: OPEN_BRACKET ((paramInput COMMA)*(paramInput COMMA?))? CLOSE_BRACKET;
paramInput: expression | SPREAD_OP paramSpreadable;
paramSpreadable: ids | array;

returnable
    : primeType       #primitive
    | object          #objectVal
    | array           #arrayVal
    | function        #functionVal
    | ids             #variable
    ;
primeType: num | STRING | BOOL | NULL | UNDEFINED;
num: INT | FLOAT;
ids: ID | THIS;

noUseStatement: SEMICOLON;