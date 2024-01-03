parser grammar ReactParser;

@header {
package antlr;
}

options {
    tokenVocab = ReactLexer;
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
function: arrowFunction | normalFunction | anonymousFunction;
arrowFunction: (args | validName) ARROW (block | expression);
normalFunction: FUNCTION validName args block;
anonymousFunction: FUNCTION args block;

args: OPEN_BRACKET ((arg COMMA)*(arg | rest))? CLOSE_BRACKET;
arg
    : validName (ASSIGNMENT_OP expression)?
    | objectDestructuring
    | arrayDestructuring
    ;
rest: ELLIPSIS validName;
// end of _functions representations_


// JS Statements
statement
    : importStatement   #importing
    | export            #exporting
    | declare           #declaration
    | expression        #exp
    | noUseStatement    #noUse
    ;

importStatement: IMPORT from? STRING;
from: importForm FROM;
importForm
    : defaultImport
    | namedImport
    | fullImport
    | defaultImport COMMA namedImport
    | defaultImport COMMA fullImport
    ;
defaultImport: validName;
namedImport: OPEN_CURLY_BRACES (validName | aliasImporting | DEFAULT AS validName) (COMMA (validName | aliasImporting))* CLOSE_CURLY_BRACES;
aliasImporting: (validName | STRING) AS validName;
fullImport: MULT_OP AS validName;

export
    : EXPORT
    ( exportModule
    | exportDeclaration
    | exportList
    | exportDefault
    );
exportDeclaration: declare | normalFunction;
exportList: OPEN_CURLY_BRACES (validName | aliasExporting | validName AS DEFAULT) (COMMA (validName | aliasExporting))* CLOSE_CURLY_BRACES;
aliasExporting: validName AS (validName | STRING);
exportDefault: DEFAULT expression;
exportModule: (
        MULT_OP |
        fullImport |
        OPEN_CURLY_BRACES (validName | aliasImporting | DEFAULT | DEFAULT AS validName) (COMMA (validName | aliasImporting))* CLOSE_CURLY_BRACES
    ) FROM STRING;

declare: declarers declarable assignmentRightHand? (COMMA declarable assignmentRightHand)*;
assignmentRightHand: (ASSIGNMENT_OP declarable)* ASSIGNMENT_OP expression;
declarable: validName | objectDestructuring | arrayDestructuring;

expression
    : OPEN_BRACKET expression CLOSE_BRACKET                                    #parentheses
    | functionCall                                                             #funcCall
    | memberGetter                                                             #memberGet
    | NEW functionCall                                                         #new
    | NEW validName                                                            #newNoParam
    | expression incrementsOp                                                  #postIncre
    | incrementsOp expression                                                  #preInc
    | LOGIC_NOT_OP expression                                                  #logicalNOT
    | unarysOp expression                                                      #unary
    | expression POW_OP expression                                             #pow
    | expression multiplicativeOp expression                                   #mult
    | expression additiveOp expression                                         #add
    | expression compareOP expression                                          #compare
    | expression equalCompareOP expression                                     #compareWithEqual
    | expression AND expression                                                #logicalAND
    | expression (OR | NULL_COALES_OP) expression                              #logicalOR_logicalNull
    | expression TERNARY_OP1 expression COLON expression                       #ternary
    | assignment                                                               #assign
    | returnable                                                               #byVal
    ;
functionCall
    : callables param                                   #fromMemory
    | OPEN_BRACKET function CLOSE_BRACKET param         #asIIFE
    | callables templateLiteral                         #taggedTemplate
    ;
callables: validName | memberGetter | OPEN_BRACKET callables CLOSE_BRACKET;

incrementsOp: INCREMENT_OP | DECREMENT_OP;
unarysOp: ADD_OP | SUP_OP;

memberGetter: member (dotNotation | bracketNotation)+;
member: (objectable | objectableWithBrackets | OPEN_BRACKET member CLOSE_BRACKET);
dotNotation: (DOT | OPTIONAL_CHAINING_OP) validName;
bracketNotation: OPTIONAL_CHAINING_OP? OPEN_SQUARE_BRACKET indexers CLOSE_SQUARE_BRACKET;
indexers
    : validName
    | STRING
    | INT
    | expression
    ;
objectable
    : NEW functionCall
    | NEW validName
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
    | expression compareOP expression
    | expression equalCompareOP expression
    | expression AND expression
    | expression (OR | NULL_COALES_OP) expression
    | expression TERNARY_OP1 expression TERNARY_OP2 expression
    | assignment
    | function
    ) CLOSE_BRACKET
    | OPEN_BRACKET objectableWithBrackets CLOSE_BRACKET
    ;

assignment: assignable (assinmentOp assignable)* assinmentOp expression;
assignable: validName | memberGetter;

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
compareOP: LESS_THAN_OP | LESS_THAN_EQ_OP | GREATER_THAN_OP | GREATER_THAN_EQ_OP;
equalCompareOP: EQ_COMPARE_OP | STRICT_EQ_COMPARE_OP | NEQ_COMPARE_OP | STRICT_NEQ_COMPARE_OP;
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

forin: FOR OPEN_BRACKET declarers? validName IN expression CLOSE_BRACKET scopeBody;
forof: FOR OPEN_BRACKET declarers? validName OF expression CLOSE_BRACKET scopeBody;

scopeHead: OPEN_BRACKET expression CLOSE_BRACKET;
scopeBody: block | line;
// end of _conditions & loops_


block: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;

object: OPEN_CURLY_BRACES ((objPropDefine COMMA)*objPropDefine COMMA?)? CLOSE_CURLY_BRACES;
objPropDefine
    : objPropName COLON expression
    | validName
    | method
    | OPEN_SQUARE_BRACKET expression CLOSE_SQUARE_BRACKET COLON expression
    | ELLIPSIS (validName | object)
    ;
objPropName: STRING | validName | num;
method: validName args block;

array: OPEN_SQUARE_BRACKET ((arrayInput COMMA+)*arrayInput COMMA*)? CLOSE_SQUARE_BRACKET;
arrayInput: expression | arraySpread;
arraySpread: ELLIPSIS (validName | array);

objectDestructuring: OPEN_CURLY_BRACES (destructuredObjVar COMMA)* destructuredObjVar COMMA? CLOSE_CURLY_BRACES;
destructuredObjVar: (objPropName COLON)? validName (ASSIGNMENT_OP expression)?;
arrayDestructuring: OPEN_SQUARE_BRACKET (destructuredArrVar COMMA)* destructuredArrVar COMMA? CLOSE_SQUARE_BRACKET;
destructuredArrVar: validName (ASSIGNMENT_OP expression)?;

param: OPEN_BRACKET ((paramInput COMMA)*(paramInput COMMA?))? CLOSE_BRACKET;
paramInput: expression | arraySpread;

returnable
    : primeType       #primitive
    | object          #objectVal
    | array           #arrayVal
    | function        #functionVal
    | ids             #variable
    | jsx             #jsxTags
    ;
primeType: num | strings | BOOL | NULL | UNDEFINED;
num: INT | FLOAT;
strings: STRING | templateLiteral;
templateLiteral: OPEN_TEMPLATE_LITERAL templateLiteralContent* CLOSE_TEMPLATE_LITERAL;
templateLiteralContent
    : TEMPLATE_LITERAL_ALLOWED_CHAR
    | TEMPLATE_LITERAL_START_VAR expression TEMPLATE_LITERAL_VAR_CLOSE
    ;
ids: THIS | validName;
validName: ID | setableKeywords | htmlElement | voidElement | attributeOriginalName;
setableKeywords: AS | ASYNC | FROM | GET | OF | SET | YIELD;

declarers: VAR | LET | CONST;

noUseStatement: SEMICOLON;

// from here is the start of the JSX parser
jsx
    : voidTag
    | fullTag
    ;
voidTag: LESS_THAN_OP jsxName attibuteValue* DIV_OP GREATER_THAN_OP;
fullTag
    : LESS_THAN_OP jsxName attibuteValue* GREATER_THAN_OP
        (jsx | jsInJsx)*
      LESS_THAN_OP DIV_OP jsxName GREATER_THAN_OP
    ;
jsxName: voidElement | htmlElement | validName | expression;

htmlElement: A | ABBR | ACRONYM | ADDRESS | APPLET | ARTICLE | ASIDE | AUDIO | B | BASEFONT | BDI | BDO | BIG | BLOCKQUOTE | BODY | BUTTON | CANVAS | CAPTION | CENTER | CITE | CODE | COLGROUP | DATA | DATALIST | DD | DEL | DETAILS | DFN | DIALOG | DIR | DIV | DL | DT | EM | FIELDSET | FIGCAPTION | FIGURE | FONT | FOOTER | FORM | FRAME | FRAMESET | H1 | H2 | H3 | H4 | H5 | H6 | HEAD | HEADER | HGROUP | HTML | I | IFRAME | INS | KBD | LABEL | LEGEND | LI | MAIN | MAP | MARK | MENU | METER | NAV | NOFRAMES | NOSCRIPT | OBJECT | OL | OPTGROUP | OPTION | OUTPUT | P | PICTURE | PRE | PROGRESS | Q | RP | RT | RUBY | S | SAMP | SCRIPT | SEARCH | SECTION | SELECT | SMALL | SPAN | STRIKE | STRONG | STYLE | SUB | SUMMARY | SUP | SVG | TABLE | TBODY | TD | TEMPLATE | TEXTAREA | TFOOT | TH | THEAD | TIME | TITLE | TR | TT | U | UL | VAR | VIDEO;
voidElement: AREA | BASE | BR | COL | EMBED | HR | IMG | INPUT | LINK | META | PARAM | SOURCE | TRACK | WBR;

attibuteValue
    : tagAttribute ASSIGNMENT_OP STRING
    | tagAttribute ASSIGNMENT_OP jsInJsx
    | tagAttribute
    ;
tagAttribute: attributeOriginalName | validName;
attributeOriginalName: jsxAtrribute | globalAttribute | formAttribute | dialogAttribute | imageAttribute | videoAttibute;
// attributes
jsxAtrribute: CHILDREN | DANGEROUSLY_SET_INNER_HTML | REF | SUPPRESS_CONTENT_EDITABLE_WARNING | SUPPRESS_HYDRATION_WARNING | STYLE;
globalAttribute: ACCESS_KEY | ARIA_AUTOCOMPLETE | ARIA_CHECKED | ARIA_DISABLED | ARIA_ERRORMESSAGE | ARIA_EXPANDED | ARIA_HASPOPUP | ARIA_HIDDEN | ARIA_INVALID | ARIA_LABEL | ARIA_LEVEL | ARIA_MODAL | ARIA_MULTILINE | ARIA_MULTISELECTABLE | ARIA_ORIENTATION | ARIA_PLACEHOLDER | ARIA_PRESSED | ARIA_READONLY | ARIA_REQUIRED | ARIA_SELECTED | ARIA_SORT | ARIA_VALUEMAX | ARIA_VALUEMIN | ARIA_VALUENOW | ARIA_VALUETEXT | ARIA_BUSY | ARIA_LIVE | ARIA_RELEVANT | ARIA_ATOMIC | ARIA_DROPEFFECT | ARIA_GRABBED | ARIA_ACTIVEDESCENDANT | ARIA_COLCOUNT | ARIA_COLINDEX | ARIA_COLSPAN | ARIA_CONTROLS | ARIA_DESCRIBEDBY | ARIA_DESCRIPTION | ARIA_DETAILS | ARIA_FLOWTO | ARIA_LABELLEDBY | ARIA_OWNS | ARIA_POSINSET | ARIA_ROWCOUNT | ARIA_ROWINDEX | ARIA_ROWSPAN | ARIA_SETSIZE | ARIA_CURRENT | ARIA_KEYSHORTCUTS | ARIA_ROLEDESCRIPTION | AUTO_CAPITALIZE | CLASS_NAME | CONTENT_EDITABLE | DATA_ | DIR | DRAGGABLE | ENTER_KEY_HINT | HTML_FOR | HIDDEN_ATTR | ID_ATTR | IS | INPUT_MODE | ITEM_PROP | LANG | ON_ANIMATION_END | ON_ANIMATION_END_CAPTURE | ON_ANIMATION_ITERATION | ON_ANIMATION_ITERATION_CAPTURE | ON_ANIMATION_START | ON_ANIMATION_START_CAPTURE | ON_AUX_CLICK | ON_AUX_CLICK_CAPTURE | ON_BEFORE_INPUT | ON_BEFORE_INPUT_CAPTURE | ON_BLURE | ON_BLURE_CAPTURE | ON_CLICK | ON_CLICK_CAPTURE | ON_COMPOSITION_START | ON_COMPOSITION_START_CAPTURE | ON_COMPOSITION_END | ON_COMPOSITION_END_CAPTURE | ON_COMPOSITION_UPDATE | ON_COMPOSITION_UPDATE_CAPTURE | ON_CONTEXT_MENU | ON_CONTEXT_MENU_CAPTURE | ON_COPY | ON_COPY_CAPTURE | ON_CUT | ON_CUT_CAPTURE | ON_DOUBLE_CLICK | ON_DOUBLE_CLICK_CAPTURE | ON_DRAG | ON_DRAG_CAPTURE | ON_DRAG_END | ON_DRAG_END_CAPTURE | ON_DRAG_ENTER | ON_DRAG_ENTER_CAPTURE | ON_DRAG_OVER | ON_DRAG_OVER_CAPTURE | ON_DRAG_START | ON_DRAG_START_CAPTURE | ON_DROP | ON_DROP_CAPTURE | ON_FOCUS | ON_GOT_POINTER_CAPTURE | ON_GOT_POINTER_CAPTURE_CAPTURE | ON_KEY_DOWN | ON_KEY_DOWN_CAPTURE | ON_KEY_PRESS | ON_KEY_PRESS_CAPTURE | ON_KEY_UP | ON_KEY_UP_CAPTURE | ON_LOST_POINTER_CAPTURE | ON_LOST_POINTER_CAPTURE_CAPTURE | ON_MOUSE_DOWN | ON_MOUSE_DOWN_CAPTURE | ON_MOUSE_ENTER | ON_MOUSE_LEAVE | ON_MOUSE_MOVE | ON_MOUSE_MOVE_CAPTURE | ON_MOUSE_OUT | ON_MOUSE_OUT_CAPTURE | ON_MOUSE_UP | ON_MOUSE_UP_CAPTURE | ON_POINTER_CANCEL | ON_POINTER_CANCEL_CAPTURE | ON_POINTER_DOWN | ON_POINTER_DOWN_CAPTURE | ON_POINTER_ENTER | ON_POINTER_LEAVE | ON_POINTER_MOVE | ON_POINTER_MOVE_CAPTURE | ON_POINTER_OUT | ON_POINTER_OUT_CAPTURE | ON_POINTER_UP | ON_POINTER_UP_CAPTURE | ON_PASTE | ON_PASTE_CAPTURE | ON_SCROLL | ON_SCROLL_CAPTURE | ON_SELECT | ON_SELECT_CAPTURE | ON_TOUCH_CANCEL | ON_TOUCH_CANCEL_CAPTURE | ON_TOUCH_END | ON_TOUCH_END_CAPTURE | ON_TOUCH_MOVE | ON_TOUCH_MOVE_CAPTURE | ON_TOUCH_START | ON_TOUCH_START_CAPTURE | ON_TRANSITION_END | ON_TRANSITION_END_CAPTURE | ON_WHEEL | ON_WHEEL_CAPTURE | ROLE | SLOT | SPELL_CHECK | TAB_INDEX | TITLE | TRANSLATE;
formAttribute: ON_RESET | ON_RESET_CAPTURE | ON_SUBMIT | ON_SUBMIT_CAPTURE;
dialogAttribute: ON_CANCEL | ON_CANCEL_CAPTURE | ON_CLOSE | ON_CLOSE_CAPTURE;
imageAttribute: ALT | ON_LOAD | ON_LOAD_CAPTURE | ON_ERROR | ON_ERROR_CAPTURE | SRC;
videoAttibute: ON_ABORT | ON_ABORT_CAPTURE | ON_CAN_PLAY | ON_CAN_PLAY_CAPTURE | ON_CAN_PLAY_THROUGH | ON_CAN_PLAY_THROUGH_CAPTURE | ON_DURATION_CHANGE | ON_DURATION_CHANGE_CAPTURE | ON_EMPTIED | ON_EMPTIED_CAPTURE | ON_ENCRYPTED | ON_ENCRYPTED_CAPTURE | ON_ENDED | ON_ENDED_CAPTURE | ON_LOADED_DATA | ON_LOADED_DATA_CAPTURE | ON_LOADED_METADATA | ON_LOADED_METADATA_CAPTURE | ON_LOAD_START | ON_LOAD_START_CAPTURE | ON_PAUSE | ON_PAUSE_CAPTURE | ON_PLAY | ON_PLAY_CAPTURE | ON_PLAYING | ON_PLAYING_CAPTURE | ON_PROGRESS | ON_PROGRESS_CAPTURE | ON_RATE_CHANGE | ON_RATE_CHANGE_CAPTURE | ON_RESIZE | ON_RESIZE_CAPTURE | ON_SEEKED | ON_SEEKED_CAPTURE | ON_SEEKING | ON_SEEKING_CAPTURE | ON_STALLED | ON_STALLED_CAPTURE | ON_SUSPEND | ON_SUSPEND_CAPTURE | ON_TIME_UPDATE | ON_TIME_UPDATE_CAPTURE | ON_VOLUME_CHANGE | ON_VOLUME_CHANGE_CAPTURE | ON_WAITING | ON_WAITING_CAPTURE;

jsInJsx: OPEN_CURLY_BRACES line* CLOSE_CURLY_BRACES;
