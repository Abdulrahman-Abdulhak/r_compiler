lexer grammar ReactLexer;

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
//OPEN_TAG: '<' -> pushMode(JSX);

// keywords tokens
AS: 'as';
ASYNC: 'async';
BREAK: 'break';
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

// html tags
A: 'a';
ABBR: 'abbr';
ACRONYM: 'acronym';
ADDRESS: 'address';
APPLET: 'applet';
AREA: 'area';
ARTICLE: 'article';
ASIDE: 'aside';
AUDIO: 'audio';
B: 'b';
BASE: 'base';
BASEFONT: 'basefont';
BDI: 'bdi';
BDO: 'bdo';
BIG: 'big';
BLOCKQUOTE: 'blockquote';
BODY: 'body';
BR: 'br';
BUTTON: 'button';
CANVAS: 'canvas';
CAPTION: 'caption';
CENTER: 'center';
CITE: 'cite';
CODE: 'code';
COL: 'col';
COLGROUP: 'colgroup';
DATA: 'data';
DATALIST: 'datalist';
DD: 'dd';
DEL: 'del';
DETAILS: 'details';
DFN: 'dfn';
DIALOG: 'dialog';
DIR: 'dir';
DIV: 'div';
DL: 'dl';
DT: 'dt';
EM: 'em';
EMBED: 'embed';
FIELDSET: 'fieldset';
FIGCAPTION: 'figcaption';
FIGURE: 'figure';
FONT: 'font';
FOOTER: 'footer';
FORM: 'form';
FRAME: 'frame';
FRAMESET: 'frameset';
H1: 'h1';
H2: 'h2';
H3: 'h3';
H4: 'h4';
H5: 'h5';
H6: 'h6';
HEAD: 'head';
HEADER: 'header';
HGROUP: 'hgroup';
HR: 'hr';
HTML: 'html';
I: 'i';
IFRAME: 'iframe';
IMG: 'img';
INPUT: 'input';
INS: 'ins';
KBD: 'kbd';
LABEL: 'label';
LEGEND: 'legend';
LI: 'li';
LINK: 'link';
MAIN: 'main';
MAP: 'map';
MARK: 'mark';
MENU: 'menu';
META: 'meta';
METER: 'meter';
NAV: 'nav';
NOFRAMES: 'noframes';
NOSCRIPT: 'noscript';
OBJECT: 'object';
OL: 'ol';
OPTGROUP: 'optgroup';
OPTION: 'option';
OUTPUT: 'output';
P: 'p';
PARAM: 'param';
PICTURE: 'picture';
PRE: 'pre';
PROGRESS: 'progress';
Q: 'q';
RP: 'rp';
RT: 'rt';
RUBY: 'ruby';
S: 's';
SAMP: 'samp';
SCRIPT: 'script';
SEARCH: 'search';
SECTION: 'section';
SELECT: 'select';
SMALL: 'small';
SOURCE: 'source';
SPAN: 'span';
STRIKE: 'strike';
STRONG: 'strong';
STYLE: 'style';
SUB: 'sub';
SUMMARY: 'summary';
SUP: 'sup';
SVG: 'svg';
TABLE: 'table';
TBODY: 'tbody';
TD: 'td';
TEMPLATE: 'template';
TEXTAREA: 'textarea';
TFOOT: 'tfoot';
TH: 'th';
THEAD: 'thead';
TIME: 'time';
TITLE: 'title';
TR: 'tr';
TRACK: 'track';
TT: 'tt';
U: 'u';
UL: 'ul';
VAR_ELE: VAR;
VIDEO: 'video';
WBR: 'wbr';

// JSX attributes
CHILDREN: 'children';
DANGEROUSLY_SET_INNER_HTML: 'dangerouslySetInnerHTML';
REF: 'ref';
SUPPRESS_CONTENT_EDITABLE_WARNING: 'suppressContentEditableWarning';
SUPPRESS_HYDRATION_WARNING: 'suppressHydrationWarning';
STYLE_ATTR: STYLE;
// global html attributes but in JSX format
ACCESS_KEY: 'accessKey';
ARIA_AUTOCOMPLETE: 'aria-autocomplete';
ARIA_CHECKED: 'aria-checked';
ARIA_DISABLED: 'aria-disabled';
ARIA_ERRORMESSAGE: 'aria-errormessage';
ARIA_EXPANDED: 'aria-expanded';
ARIA_HASPOPUP: 'aria-haspopup';
ARIA_HIDDEN: 'aria-hidden';
ARIA_INVALID: 'aria-invalid';
ARIA_LABEL: 'aria-label';
ARIA_LEVEL: 'aria-level';
ARIA_MODAL: 'aria-modal';
ARIA_MULTILINE: 'aria-multiline';
ARIA_MULTISELECTABLE: 'aria-multiselectable';
ARIA_ORIENTATION: 'aria-orientation';
ARIA_PLACEHOLDER: 'aria-placeholder';
ARIA_PRESSED: 'aria-pressed';
ARIA_READONLY: 'aria-readonly';
ARIA_REQUIRED: 'aria-required';
ARIA_SELECTED: 'aria-selected';
ARIA_SORT: 'aria-sort';
ARIA_VALUEMAX: 'aria-valuemax';
ARIA_VALUEMIN: 'aria-valuemin';
ARIA_VALUENOW: 'aria-valuenow';
ARIA_VALUETEXT: 'aria-valuetext';
ARIA_BUSY: 'aria-busy';
ARIA_LIVE: 'aria-live';
ARIA_RELEVANT: 'aria-relevant';
ARIA_ATOMIC: 'aria-atomic';
ARIA_DROPEFFECT: 'aria-dropeffect';
ARIA_GRABBED: 'aria-grabbed';
ARIA_ACTIVEDESCENDANT: 'aria-activedescendant';
ARIA_COLCOUNT: 'aria-colcount';
ARIA_COLINDEX: 'aria-colindex';
ARIA_COLSPAN: 'aria-colspan';
ARIA_CONTROLS: 'aria-controls';
ARIA_DESCRIBEDBY: 'aria-describedby';
ARIA_DESCRIPTION: 'aria-description';
ARIA_DETAILS: 'aria-details';
ARIA_FLOWTO: 'aria-flowto';
ARIA_LABELLEDBY: 'aria-labelledby';
ARIA_OWNS: 'aria-owns';
ARIA_POSINSET: 'aria-posinset';
ARIA_ROWCOUNT: 'aria-rowcount';
ARIA_ROWINDEX: 'aria-rowindex';
ARIA_ROWSPAN: 'aria-rowspan';
ARIA_SETSIZE: 'aria-setsize';
// global aria in html
ARIA_CURRENT: 'aria-current';
ARIA_KEYSHORTCUTS: 'aria-keyshortcuts';
ARIA_ROLEDESCRIPTION: 'aria-roledescription';
//
AUTO_CAPITALIZE: 'autoCapitalize';
CLASS_NAME: 'className';
CONTENT_EDITABLE: 'contentEditable';
DATA_: 'data-' ID;
DIR_ATTR: DIR;
DRAGGABLE: 'draggable';
ENTER_KEY_HINT: 'enterKeyHint';
HTML_FOR: 'htmlFor';
HIDDEN_ATTR: 'hidden';
ID_ATTR: 'id';
IS: 'is';
INPUT_MODE: 'inputMode';
ITEM_PROP: 'itemProp';
LANG: 'lang';
ON_ANIMATION_END: 'onAnimationEnd';
ON_ANIMATION_END_CAPTURE: 'onAnimationEndCapture';
ON_ANIMATION_ITERATION: 'onAnimationIteration';
ON_ANIMATION_ITERATION_CAPTURE: 'onAnimationIterationCapture';
ON_ANIMATION_START: 'onAnimationStart';
ON_ANIMATION_START_CAPTURE: 'onAnimationStartCapture';
ON_AUX_CLICK: 'onAuxClick';
ON_AUX_CLICK_CAPTURE: 'onAuxClickCapture';
ON_BEFORE_INPUT: 'onBeforeInput';
ON_BEFORE_INPUT_CAPTURE: 'onBeforeInputCapture';
ON_BLURE: 'onBlur';
ON_BLURE_CAPTURE: 'onBlurCapture';
ON_CLICK: 'onClick';
ON_CLICK_CAPTURE: 'onClickCapture';
ON_COMPOSITION_START: 'onCompositionStart';
ON_COMPOSITION_START_CAPTURE: 'onCompositionStartCapture';
ON_COMPOSITION_END: 'onCompositionEnd';
ON_COMPOSITION_END_CAPTURE: 'onCompositionEndCapture';
ON_COMPOSITION_UPDATE: 'onCompositionUpdate';
ON_COMPOSITION_UPDATE_CAPTURE: 'onCompositionUpdateCapture';
ON_CONTEXT_MENU: 'onContextMenu';
ON_CONTEXT_MENU_CAPTURE: 'onContextMenuCapture';
ON_COPY: 'onCopy';
ON_COPY_CAPTURE: 'onCopyCapture';
ON_CUT: 'onCut';
ON_CUT_CAPTURE: 'onCutCapture';
ON_DOUBLE_CLICK: 'onDoubleClick';
ON_DOUBLE_CLICK_CAPTURE: 'onDoubleClickCapture';
ON_DRAG: 'onDrag';
ON_DRAG_CAPTURE: 'onDragCapture';
ON_DRAG_END: 'onDragEnd';
ON_DRAG_END_CAPTURE: 'onDragEndCapture';
ON_DRAG_ENTER: 'onDragEnter';
ON_DRAG_ENTER_CAPTURE: 'onDragEnterCapture';
ON_DRAG_OVER: 'onDragOver';
ON_DRAG_OVER_CAPTURE: 'onDragOverCapture';
ON_DRAG_START: 'onDragStart';
ON_DRAG_START_CAPTURE: 'onDragStartCapture';
ON_DROP: 'onDrop';
ON_DROP_CAPTURE: 'onDropCapture';
ON_FOCUS: 'onFocus';
ON_GOT_POINTER_CAPTURE: 'onGotPointerCapture';
ON_GOT_POINTER_CAPTURE_CAPTURE: 'onGotPointerCaptureCapture';
ON_KEY_DOWN: 'onKeyDown';
ON_KEY_DOWN_CAPTURE: 'onKeyDownCapture';
ON_KEY_PRESS: 'onKeyPress';
ON_KEY_PRESS_CAPTURE: 'onKeyPressCapture';
ON_KEY_UP: 'onKeyUp';
ON_KEY_UP_CAPTURE: 'onKeyUpCapture';
ON_LOST_POINTER_CAPTURE: 'onLostPointerCapture';
ON_LOST_POINTER_CAPTURE_CAPTURE: 'onLostPointerCaptureCapture';
ON_MOUSE_DOWN: 'onMouseDown';
ON_MOUSE_DOWN_CAPTURE: 'onMouseDownCapture';
ON_MOUSE_ENTER: 'onMouseEnter';
ON_MOUSE_LEAVE: 'onMouseLeave';
ON_MOUSE_MOVE: 'onMouseMove';
ON_MOUSE_MOVE_CAPTURE: 'onMouseMoveCapture';
ON_MOUSE_OUT: 'onMouseOut';
ON_MOUSE_OUT_CAPTURE: 'onMouseOutCapture';
ON_MOUSE_UP: 'onMouseUp';
ON_MOUSE_UP_CAPTURE: 'onMouseUpCapture';
ON_POINTER_CANCEL: 'onPointerCancel';
ON_POINTER_CANCEL_CAPTURE: 'onPointerCancelCapture';
ON_POINTER_DOWN: 'onPointerDown';
ON_POINTER_DOWN_CAPTURE: 'onPointerDownCapture';
ON_POINTER_ENTER: 'onPointerEnter';
ON_POINTER_LEAVE: 'onPointerLeave';
ON_POINTER_MOVE: 'onPointerMove';
ON_POINTER_MOVE_CAPTURE: 'onPointerMoveCapture';
ON_POINTER_OUT: 'onPointerOut';
ON_POINTER_OUT_CAPTURE: 'onPointerOutCapture';
ON_POINTER_UP: 'onPointerUp';
ON_POINTER_UP_CAPTURE: 'onPointerUpCapture';
ON_PASTE: 'onPaste';
ON_PASTE_CAPTURE: 'onPasteCapture';
ON_SCROLL: 'onScroll';
ON_SCROLL_CAPTURE: 'onScrollCapture';
ON_SELECT: 'onSelect';
ON_SELECT_CAPTURE: 'onSelectCapture';
ON_TOUCH_CANCEL: 'onTouchCancel';
ON_TOUCH_CANCEL_CAPTURE: 'onTouchCancelCapture';
ON_TOUCH_END: 'onTouchEnd';
ON_TOUCH_END_CAPTURE: 'onTouchEndCapture';
ON_TOUCH_MOVE: 'onTouchMove';
ON_TOUCH_MOVE_CAPTURE: 'onTouchMoveCapture';
ON_TOUCH_START: 'onTouchStart';
ON_TOUCH_START_CAPTURE: 'onTouchStartCapture';
ON_TRANSITION_END: 'onTransitionEnd';
ON_TRANSITION_END_CAPTURE: 'onTransitionEndCapture';
ON_WHEEL: 'onWheel';
ON_WHEEL_CAPTURE: 'onWheelCapture';
ROLE: 'role';
SLOT: 'slot';
SPELL_CHECK: 'spellCheck';
TAB_INDEX: 'tabIndex';
TITLE_ATTR: TITLE;
TRANSLATE: 'translate';
// html form attributes but in JSX syntax
ON_RESET: 'onReset';
ON_RESET_CAPTURE: 'onResetCapture';
ON_SUBMIT: 'onSubmit';
ON_SUBMIT_CAPTURE: 'onSubmitCapture';
// html dialog attributes but in JSX syntax
ON_CANCEL: 'onCancel';
ON_CANCEL_CAPTURE: 'onCancelCapture';
ON_CLOSE: 'onClose';
ON_CLOSE_CAPTURE: 'onCloseCapture';
// html loading elements not (audio, video) but in JSX syntax
ALT: 'alt';
ON_LOAD: 'onLoad';
ON_LOAD_CAPTURE: 'onLoadCapture';
ON_ERROR: 'onError';
ON_ERROR_CAPTURE: 'onErrorCapture';
SRC: 'src';
// html audio, video element but in JSX syntax
ON_ABORT: 'onAbort';
ON_ABORT_CAPTURE: 'onAbortCapture';
ON_CAN_PLAY: 'onCanPlay';
ON_CAN_PLAY_CAPTURE: 'onCanPlayCapture';
ON_CAN_PLAY_THROUGH: 'onCanPlayThrough';
ON_CAN_PLAY_THROUGH_CAPTURE: 'onCanPlayThroughCapture';
ON_DURATION_CHANGE: 'onDurationChange';
ON_DURATION_CHANGE_CAPTURE: 'onDurationChangeCapture';
ON_EMPTIED: 'onEmptied';
ON_EMPTIED_CAPTURE: 'onEmptiedCapture';
ON_ENCRYPTED: 'onEncrypted';
ON_ENCRYPTED_CAPTURE: 'onEncryptedCapture';
ON_ENDED: 'onEnded';
ON_ENDED_CAPTURE: 'onEndedCapture';
ON_LOADED_DATA: 'onLoadedData';
ON_LOADED_DATA_CAPTURE: 'onLoadedDataCapture';
ON_LOADED_METADATA: 'onLoadedMetadata';
ON_LOADED_METADATA_CAPTURE: 'onLoadedMetadataCapture';
ON_LOAD_START: 'onLoadStart';
ON_LOAD_START_CAPTURE: 'onLoadStartCapture';
ON_PAUSE: 'onPause';
ON_PAUSE_CAPTURE: 'onPauseCapture';
ON_PLAY: 'onPlay';
ON_PLAY_CAPTURE: 'onPlayCapture';
ON_PLAYING: 'onPlaying';
ON_PLAYING_CAPTURE: 'onPlayingCapture';
ON_PROGRESS: 'onProgress';
ON_PROGRESS_CAPTURE: 'onProgressCapture';
ON_RATE_CHANGE: 'onRateChange';
ON_RATE_CHANGE_CAPTURE: 'onRateChangeCapture';
ON_RESIZE: 'onResize';
ON_RESIZE_CAPTURE: 'onResizeCapture';
ON_SEEKED: 'onSeeked';
ON_SEEKED_CAPTURE: 'onSeekedCapture';
ON_SEEKING: 'onSeeking';
ON_SEEKING_CAPTURE: 'onSeekingCapture';
ON_STALLED: 'onStalled';
ON_STALLED_CAPTURE: 'onStalledCapture';
ON_SUSPEND: 'onSuspend';
ON_SUSPEND_CAPTURE: 'onSuspendCapture';
ON_TIME_UPDATE: 'onTimeUpdate';
ON_TIME_UPDATE_CAPTURE: 'onTimeUpdateCapture';
ON_VOLUME_CHANGE: 'onVolumeChange';
ON_VOLUME_CHANGE_CAPTURE: 'onVolumeChangeCapture';
ON_WAITING: 'onWaiting';
ON_WAITING_CAPTURE: 'onWaitingCapture';

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
LESS_THAN_OP: '<'; // 9
LESS_THAN_EQ_OP: '<='; // 9
GREATER_THAN_OP: '>'; // 9
GREATER_THAN_EQ_OP: '>='; // 9
EQ_COMPARE_OP: '=='; // 8
STRICT_EQ_COMPARE_OP: '==='; // 8
NEQ_COMPARE_OP: '!='; // 8
STRICT_NEQ_COMPARE_OP: '!=='; // 8
// Logical Operators
AND: '&&'; // 4
OR: '||'; // 3
NULL_COALES_OP: '??'; // 3
// Ternary Operator
TERNARY_OP1: '?';
TERNARY_OP2: COLON; // presedence of 2 compined with above
// Assignment Operators
ASSIGNMENT_OP: '='; // 2
ADD_ASSIGN_OP: ADD_OP ASSIGNMENT_OP; // 2
SUB_ASSIGN_OP: SUP_OP ASSIGNMENT_OP; // 2
MULT_ASSIGN_OP: MULT_OP ASSIGNMENT_OP; // 2
POW_ASSIGN_OP: POW_OP ASSIGNMENT_OP; // 2
DIV_ASSIGN_OP: DIV_OP ASSIGNMENT_OP; // 2
REM_ASSIGN_OP: REM_OP ASSIGNMENT_OP; // 2
AND_ASSIGN_OP: AND ASSIGNMENT_OP; // 2
OR_ASSIGN_OP: OR ASSIGNMENT_OP; // 2
NULL_ASSIGN_OP: NULL_COALES_OP ASSIGNMENT_OP; // 2
ARROW: '=>'; // 2

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

mode JSX;

CLOSE_TAG: '>' -> popMode;