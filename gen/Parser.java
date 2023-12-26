// Generated from C:/Files/Java/r_compiler/src/Parser.g4 by ANTLR 4.13.1

package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, COMMA=2, DOT=3, ELLIPSIS=4, SEMICOLON=5, OPEN_BRACKET=6, CLOSE_BRACKET=7, 
		OPEN_SQUARE_BRACKET=8, CLOSE_SQUARE_BRACKET=9, OPEN_CURLY_BRACES=10, CLOSE_CURLY_BRACES=11, 
		OPEN_TEMPLATE_LITERAL=12, AS=13, ASYNC=14, CONTINUE=15, CONST=16, DEFAULT=17, 
		DO=18, EXPORT=19, FOR=20, FROM=21, FUNCTION=22, GET=23, IF=24, IMPORT=25, 
		IN=26, LET=27, NEW=28, OF=29, RETURN=30, SET=31, THIS=32, VAR=33, WHILE=34, 
		YIELD=35, BOOL=36, INT=37, FLOAT=38, STRING=39, NULL=40, UNDEFINED=41, 
		OPTIONAL_CHAINING_OP=42, INCREMENT_OP=43, DECREMENT_OP=44, LOGIC_NOT_OP=45, 
		POW_OP=46, MULT_OP=47, DIV_OP=48, REM_OP=49, ADD_OP=50, SUP_OP=51, COMPARE_OP=52, 
		EQUAL_COMPARE_OP=53, AND=54, OR=55, NULL_COALES_OP=56, TERNARY_OP1=57, 
		TERNARY_OP2=58, ASSIGNMENT_OP=59, ADD_ASSIGN_OP=60, SUB_ASSIGN_OP=61, 
		MULT_ASSIGN_OP=62, POW_ASSIGN_OP=63, DIV_ASSIGN_OP=64, REM_ASSIGN_OP=65, 
		AND_ASSIGN_OP=66, OR_ASSIGN_OP=67, NULL_ASSIGN_OP=68, ARROW=69, ID=70, 
		MULTILINE_COMMENT=71, LINE_COMMENT=72, NEWLINE=73, WS=74, CLOSE_TEMPLATE_LITERAL=75, 
		TEMPLATE_LITERAL_ALLOWED_CHAR=76, TEMPLATE_LITERAL_START_VAR=77, TEMPLATE_LITERAL_VAR_CLOSE=78;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_specialLine = 2, RULE_return = 3, 
		RULE_function = 4, RULE_arrowFunction = 5, RULE_normalFunction = 6, RULE_anonymousFunction = 7, 
		RULE_args = 8, RULE_arg = 9, RULE_rest = 10, RULE_statement = 11, RULE_importStatement = 12, 
		RULE_from = 13, RULE_importForm = 14, RULE_defaultImport = 15, RULE_namedImport = 16, 
		RULE_aliasImporting = 17, RULE_fullImport = 18, RULE_export = 19, RULE_exportDeclaration = 20, 
		RULE_exportList = 21, RULE_aliasExporting = 22, RULE_exportDefault = 23, 
		RULE_exportModule = 24, RULE_declare = 25, RULE_assignmentRightHand = 26, 
		RULE_declarable = 27, RULE_expression = 28, RULE_functionCall = 29, RULE_callables = 30, 
		RULE_incrementsOp = 31, RULE_unarysOp = 32, RULE_memberGetter = 33, RULE_member = 34, 
		RULE_dotNotation = 35, RULE_bracketNotation = 36, RULE_indexers = 37, 
		RULE_objectable = 38, RULE_objectableWithBrackets = 39, RULE_assignment = 40, 
		RULE_assignable = 41, RULE_multiplicativeOp = 42, RULE_additiveOp = 43, 
		RULE_assinmentOp = 44, RULE_if = 45, RULE_while = 46, RULE_doWhile = 47, 
		RULE_for = 48, RULE_forExpression1 = 49, RULE_expressionList = 50, RULE_forin = 51, 
		RULE_forof = 52, RULE_scopeHead = 53, RULE_scopeBody = 54, RULE_block = 55, 
		RULE_object = 56, RULE_objPropDefine = 57, RULE_objPropName = 58, RULE_method = 59, 
		RULE_array = 60, RULE_arrayInput = 61, RULE_arraySpread = 62, RULE_objectDestructuring = 63, 
		RULE_destructuredObjVar = 64, RULE_arrayDestructuring = 65, RULE_destructuredArrVar = 66, 
		RULE_param = 67, RULE_paramInput = 68, RULE_returnable = 69, RULE_primeType = 70, 
		RULE_num = 71, RULE_strings = 72, RULE_templateLiteral = 73, RULE_templateLiteralContent = 74, 
		RULE_ids = 75, RULE_setableKeywords = 76, RULE_validName = 77, RULE_declarers = 78, 
		RULE_noUseStatement = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "specialLine", "return", "function", "arrowFunction", 
			"normalFunction", "anonymousFunction", "args", "arg", "rest", "statement", 
			"importStatement", "from", "importForm", "defaultImport", "namedImport", 
			"aliasImporting", "fullImport", "export", "exportDeclaration", "exportList", 
			"aliasExporting", "exportDefault", "exportModule", "declare", "assignmentRightHand", 
			"declarable", "expression", "functionCall", "callables", "incrementsOp", 
			"unarysOp", "memberGetter", "member", "dotNotation", "bracketNotation", 
			"indexers", "objectable", "objectableWithBrackets", "assignment", "assignable", 
			"multiplicativeOp", "additiveOp", "assinmentOp", "if", "while", "doWhile", 
			"for", "forExpression1", "expressionList", "forin", "forof", "scopeHead", 
			"scopeBody", "block", "object", "objPropDefine", "objPropName", "method", 
			"array", "arrayInput", "arraySpread", "objectDestructuring", "destructuredObjVar", 
			"arrayDestructuring", "destructuredArrVar", "param", "paramInput", "returnable", 
			"primeType", "num", "strings", "templateLiteral", "templateLiteralContent", 
			"ids", "setableKeywords", "validName", "declarers", "noUseStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'.'", "'...'", "';'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", null, "'as'", "'async'", "'continue'", "'const'", "'default'", 
			"'do'", "'export'", "'for'", "'from'", "'function'", "'get'", "'if'", 
			"'import'", "'in'", "'let'", "'new'", "'of'", "'return'", "'set'", "'this'", 
			"'var'", "'while'", "'yield'", null, null, null, null, "'null'", "'undefined'", 
			null, null, null, "'!'", "'**'", "'*'", "'/'", "'%'", "'+'", "'-'", null, 
			null, "'&&'", "'||'", "'??'", "'?'", null, "'='", null, null, null, null, 
			null, null, null, null, null, "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "COMMA", "DOT", "ELLIPSIS", "SEMICOLON", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", 
			"CLOSE_CURLY_BRACES", "OPEN_TEMPLATE_LITERAL", "AS", "ASYNC", "CONTINUE", 
			"CONST", "DEFAULT", "DO", "EXPORT", "FOR", "FROM", "FUNCTION", "GET", 
			"IF", "IMPORT", "IN", "LET", "NEW", "OF", "RETURN", "SET", "THIS", "VAR", 
			"WHILE", "YIELD", "BOOL", "INT", "FLOAT", "STRING", "NULL", "UNDEFINED", 
			"OPTIONAL_CHAINING_OP", "INCREMENT_OP", "DECREMENT_OP", "LOGIC_NOT_OP", 
			"POW_OP", "MULT_OP", "DIV_OP", "REM_OP", "ADD_OP", "SUP_OP", "COMPARE_OP", 
			"EQUAL_COMPARE_OP", "AND", "OR", "NULL_COALES_OP", "TERNARY_OP1", "TERNARY_OP2", 
			"ASSIGNMENT_OP", "ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", 
			"POW_ASSIGN_OP", "DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", 
			"NULL_ASSIGN_OP", "ARROW", "ID", "MULTILINE_COMMENT", "LINE_COMMENT", 
			"NEWLINE", "WS", "CLOSE_TEMPLATE_LITERAL", "TEMPLATE_LITERAL_ALLOWED_CHAR", 
			"TEMPLATE_LITERAL_START_VAR", "TEMPLATE_LITERAL_VAR_CLOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443670350951776L) != 0) || _la==ID) {
				{
				{
				setState(160);
				line();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForinContext forin() {
			return getRuleContext(ForinContext.class,0);
		}
		public ForofContext forof() {
			return getRuleContext(ForofContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SpecialLineContext specialLine() {
			return getRuleContext(SpecialLineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				forin();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				forof();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				doWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				specialLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialLineContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Parser.CONTINUE, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public SpecialLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSpecialLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSpecialLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSpecialLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialLineContext specialLine() throws RecognitionException {
		SpecialLineContext _localctx = new SpecialLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_specialLine);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				return_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RETURN);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(185);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				arrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				normalFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				anonymousFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(Parser.ARROW, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(193);
				args();
				}
				break;
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				{
				setState(194);
				validName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			match(ARROW);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(198);
				block();
				}
				break;
			case 2:
				{
				setState(199);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Parser.FUNCTION, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(FUNCTION);
			setState(203);
			validName();
			setState(204);
			args();
			setState(205);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Parser.FUNCTION, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anonymousFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FUNCTION);
			setState(208);
			args();
			setState(209);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(OPEN_BRACKET);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37054604560L) != 0) || _la==ID) {
				{
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						arg();
						setState(213);
						match(COMMA);
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_SQUARE_BRACKET:
				case OPEN_CURLY_BRACES:
				case AS:
				case ASYNC:
				case FROM:
				case GET:
				case OF:
				case SET:
				case YIELD:
				case ID:
					{
					setState(220);
					arg();
					}
					break;
				case ELLIPSIS:
					{
					setState(221);
					rest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(226);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OP() { return getToken(Parser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectDestructuringContext objectDestructuring() {
			return getRuleContext(ObjectDestructuringContext.class,0);
		}
		public ArrayDestructuringContext arrayDestructuring() {
			return getRuleContext(ArrayDestructuringContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				validName();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT_OP) {
					{
					setState(229);
					match(ASSIGNMENT_OP);
					setState(230);
					expression(0);
					}
				}

				}
				break;
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				objectDestructuring();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				arrayDestructuring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(Parser.ELLIPSIS, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ELLIPSIS);
			setState(238);
			validName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportingContext extends StatementContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ExportingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExporting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExporting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExporting(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoUseContext extends StatementContext {
		public NoUseStatementContext noUseStatement() {
			return getRuleContext(NoUseStatementContext.class,0);
		}
		public NoUseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNoUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNoUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNoUse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends StatementContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public DeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportingContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImporting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImporting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImporting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new ImportingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				importStatement();
				}
				break;
			case EXPORT:
				_localctx = new ExportingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				export();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				declare();
				}
				break;
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case OPEN_TEMPLATE_LITERAL:
			case AS:
			case ASYNC:
			case FROM:
			case FUNCTION:
			case GET:
			case NEW:
			case OF:
			case SET:
			case THIS:
			case YIELD:
			case BOOL:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case UNDEFINED:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case ADD_OP:
			case SUP_OP:
			case ID:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				expression(0);
				}
				break;
			case SEMICOLON:
				_localctx = new NoUseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				noUseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IMPORT);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 1152921642081986585L) != 0)) {
				{
				setState(248);
				from();
				}
			}

			setState(251);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromContext extends ParserRuleContext {
		public ImportFormContext importForm() {
			return getRuleContext(ImportFormContext.class,0);
		}
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			importForm();
			setState(254);
			match(FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFormContext extends ParserRuleContext {
		public DefaultImportContext defaultImport() {
			return getRuleContext(DefaultImportContext.class,0);
		}
		public NamedImportContext namedImport() {
			return getRuleContext(NamedImportContext.class,0);
		}
		public FullImportContext fullImport() {
			return getRuleContext(FullImportContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Parser.COMMA, 0); }
		public ImportFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterImportForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitImportForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitImportForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFormContext importForm() throws RecognitionException {
		ImportFormContext _localctx = new ImportFormContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_importForm);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				defaultImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				namedImport();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				fullImport();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				defaultImport();
				setState(260);
				match(COMMA);
				setState(261);
				namedImport();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				defaultImport();
				setState(264);
				match(COMMA);
				setState(265);
				fullImport();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public DefaultImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDefaultImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDefaultImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDefaultImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultImportContext defaultImport() throws RecognitionException {
		DefaultImportContext _localctx = new DefaultImportContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defaultImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			validName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedImportContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<ValidNameContext> validName() {
			return getRuleContexts(ValidNameContext.class);
		}
		public ValidNameContext validName(int i) {
			return getRuleContext(ValidNameContext.class,i);
		}
		public List<AliasImportingContext> aliasImporting() {
			return getRuleContexts(AliasImportingContext.class);
		}
		public AliasImportingContext aliasImporting(int i) {
			return getRuleContext(AliasImportingContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public NamedImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNamedImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNamedImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNamedImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedImportContext namedImport() throws RecognitionException {
		NamedImportContext _localctx = new NamedImportContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_namedImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(OPEN_CURLY_BRACES);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(272);
				validName();
				}
				break;
			case 2:
				{
				setState(273);
				aliasImporting();
				}
				break;
			case 3:
				{
				setState(274);
				match(DEFAULT);
				setState(275);
				match(AS);
				setState(276);
				validName();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(280);
					validName();
					}
					break;
				case 2:
					{
					setState(281);
					aliasImporting();
					}
					break;
				}
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(CLOSE_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasImportingContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public List<ValidNameContext> validName() {
			return getRuleContexts(ValidNameContext.class);
		}
		public ValidNameContext validName(int i) {
			return getRuleContext(ValidNameContext.class,i);
		}
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public AliasImportingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasImporting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAliasImporting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAliasImporting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAliasImporting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasImportingContext aliasImporting() throws RecognitionException {
		AliasImportingContext _localctx = new AliasImportingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aliasImporting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				{
				setState(291);
				validName();
				}
				break;
			case STRING:
				{
				setState(292);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(295);
			match(AS);
			setState(296);
			validName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullImportContext extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(Parser.MULT_OP, 0); }
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public FullImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFullImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFullImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFullImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullImportContext fullImport() throws RecognitionException {
		FullImportContext _localctx = new FullImportContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fullImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(MULT_OP);
			setState(299);
			match(AS);
			setState(300);
			validName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(Parser.EXPORT, 0); }
		public ExportModuleContext exportModule() {
			return getRuleContext(ExportModuleContext.class,0);
		}
		public ExportDeclarationContext exportDeclaration() {
			return getRuleContext(ExportDeclarationContext.class,0);
		}
		public ExportListContext exportList() {
			return getRuleContext(ExportListContext.class,0);
		}
		public ExportDefaultContext exportDefault() {
			return getRuleContext(ExportDefaultContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(EXPORT);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(303);
				exportModule();
				}
				break;
			case 2:
				{
				setState(304);
				exportDeclaration();
				}
				break;
			case 3:
				{
				setState(305);
				exportList();
				}
				break;
			case 4:
				{
				setState(306);
				exportDefault();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportDeclarationContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public ExportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDeclarationContext exportDeclaration() throws RecognitionException {
		ExportDeclarationContext _localctx = new ExportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exportDeclaration);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				declare();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				normalFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportListContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<ValidNameContext> validName() {
			return getRuleContexts(ValidNameContext.class);
		}
		public ValidNameContext validName(int i) {
			return getRuleContext(ValidNameContext.class,i);
		}
		public List<AliasExportingContext> aliasExporting() {
			return getRuleContexts(AliasExportingContext.class);
		}
		public AliasExportingContext aliasExporting(int i) {
			return getRuleContext(AliasExportingContext.class,i);
		}
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportListContext exportList() throws RecognitionException {
		ExportListContext _localctx = new ExportListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exportList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(OPEN_CURLY_BRACES);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(314);
				validName();
				}
				break;
			case 2:
				{
				setState(315);
				aliasExporting();
				}
				break;
			case 3:
				{
				setState(316);
				validName();
				setState(317);
				match(AS);
				setState(318);
				match(DEFAULT);
				}
				break;
			}
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322);
				match(COMMA);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(323);
					validName();
					}
					break;
				case 2:
					{
					setState(324);
					aliasExporting();
					}
					break;
				}
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(CLOSE_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasExportingContext extends ParserRuleContext {
		public List<ValidNameContext> validName() {
			return getRuleContexts(ValidNameContext.class);
		}
		public ValidNameContext validName(int i) {
			return getRuleContext(ValidNameContext.class,i);
		}
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public AliasExportingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasExporting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAliasExporting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAliasExporting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAliasExporting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasExportingContext aliasExporting() throws RecognitionException {
		AliasExportingContext _localctx = new AliasExportingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_aliasExporting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			validName();
			setState(335);
			match(AS);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				{
				setState(336);
				validName();
				}
				break;
			case STRING:
				{
				setState(337);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDefaultContext exportDefault() throws RecognitionException {
		ExportDefaultContext _localctx = new ExportDefaultContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exportDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(DEFAULT);
			setState(341);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportModuleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode MULT_OP() { return getToken(Parser.MULT_OP, 0); }
		public FullImportContext fullImport() {
			return getRuleContext(FullImportContext.class,0);
		}
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<ValidNameContext> validName() {
			return getRuleContexts(ValidNameContext.class);
		}
		public ValidNameContext validName(int i) {
			return getRuleContext(ValidNameContext.class,i);
		}
		public List<AliasImportingContext> aliasImporting() {
			return getRuleContexts(AliasImportingContext.class);
		}
		public AliasImportingContext aliasImporting(int i) {
			return getRuleContext(AliasImportingContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(Parser.DEFAULT, 0); }
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExportModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExportModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExportModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExportModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportModuleContext exportModule() throws RecognitionException {
		ExportModuleContext _localctx = new ExportModuleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exportModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(343);
				match(MULT_OP);
				}
				break;
			case 2:
				{
				setState(344);
				fullImport();
				}
				break;
			case 3:
				{
				setState(345);
				match(OPEN_CURLY_BRACES);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(346);
					validName();
					}
					break;
				case 2:
					{
					setState(347);
					aliasImporting();
					}
					break;
				case 3:
					{
					setState(348);
					match(DEFAULT);
					}
					break;
				case 4:
					{
					setState(349);
					match(DEFAULT);
					setState(350);
					match(AS);
					setState(351);
					validName();
					}
					break;
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354);
					match(COMMA);
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(355);
						validName();
						}
						break;
					case 2:
						{
						setState(356);
						aliasImporting();
						}
						break;
					}
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(CLOSE_CURLY_BRACES);
				}
				break;
			}
			setState(367);
			match(FROM);
			setState(368);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends ParserRuleContext {
		public DeclarersContext declarers() {
			return getRuleContext(DeclarersContext.class,0);
		}
		public List<DeclarableContext> declarable() {
			return getRuleContexts(DeclarableContext.class);
		}
		public DeclarableContext declarable(int i) {
			return getRuleContext(DeclarableContext.class,i);
		}
		public List<AssignmentRightHandContext> assignmentRightHand() {
			return getRuleContexts(AssignmentRightHandContext.class);
		}
		public AssignmentRightHandContext assignmentRightHand(int i) {
			return getRuleContext(AssignmentRightHandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			declarers();
			setState(371);
			declarable();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(372);
				assignmentRightHand();
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(375);
				match(COMMA);
				setState(376);
				declarable();
				setState(377);
				assignmentRightHand();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentRightHandContext extends ParserRuleContext {
		public List<TerminalNode> ASSIGNMENT_OP() { return getTokens(Parser.ASSIGNMENT_OP); }
		public TerminalNode ASSIGNMENT_OP(int i) {
			return getToken(Parser.ASSIGNMENT_OP, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DeclarableContext> declarable() {
			return getRuleContexts(DeclarableContext.class);
		}
		public DeclarableContext declarable(int i) {
			return getRuleContext(DeclarableContext.class,i);
		}
		public AssignmentRightHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentRightHand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignmentRightHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignmentRightHand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignmentRightHand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentRightHandContext assignmentRightHand() throws RecognitionException {
		AssignmentRightHandContext _localctx = new AssignmentRightHandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignmentRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(ASSIGNMENT_OP);
					setState(385);
					declarable();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(391);
			match(ASSIGNMENT_OP);
			setState(392);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarableContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public ObjectDestructuringContext objectDestructuring() {
			return getRuleContext(ObjectDestructuringContext.class,0);
		}
		public ArrayDestructuringContext arrayDestructuring() {
			return getRuleContext(ArrayDestructuringContext.class,0);
		}
		public DeclarableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDeclarable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDeclarable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclarable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarableContext declarable() throws RecognitionException {
		DeclarableContext _localctx = new DeclarableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarable);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				validName();
				}
				break;
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				objectDestructuring();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				arrayDestructuring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditiveOpContext additiveOp() {
			return getRuleContext(AdditiveOpContext.class,0);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNOTContext extends ExpressionContext {
		public TerminalNode LOGIC_NOT_OP() { return getToken(Parser.LOGIC_NOT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalNOTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLogicalNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLogicalNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLogicalNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(Parser.COMPARE_OP, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicativeOpContext multiplicativeOp() {
			return getRuleContext(MultiplicativeOpContext.class,0);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalANDContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public LogicalANDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLogicalAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLogicalAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLogicalAND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ExpressionContext {
		public UnarysOpContext unarysOp() {
			return getRuleContext(UnarysOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOR_logicalNullContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode NULL_COALES_OP() { return getToken(Parser.NULL_COALES_OP, 0); }
		public LogicalOR_logicalNullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterLogicalOR_logicalNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitLogicalOR_logicalNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLogicalOR_logicalNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncContext extends ExpressionContext {
		public IncrementsOpContext incrementsOp() {
			return getRuleContext(IncrementsOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPreInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPreInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPreInc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewNoParamContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public NewNoParamContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNewNoParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNewNoParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNewNoParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByValContext extends ExpressionContext {
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public ByValContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterByVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitByVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitByVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW_OP() { return getToken(Parser.POW_OP, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncreContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementsOpContext incrementsOp() {
			return getRuleContext(IncrementsOpContext.class,0);
		}
		public PostIncreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPostIncre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPostIncre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPostIncre(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberGetContext extends ExpressionContext {
		public MemberGetterContext memberGetter() {
			return getRuleContext(MemberGetterContext.class,0);
		}
		public MemberGetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMemberGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMemberGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMemberGet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TERNARY_OP1() { return getToken(Parser.TERNARY_OP1, 0); }
		public TerminalNode TERNARY_OP2() { return getToken(Parser.TERNARY_OP2, 0); }
		public TernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareWithEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL_COMPARE_OP() { return getToken(Parser.EQUAL_COMPARE_OP, 0); }
		public CompareWithEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCompareWithEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCompareWithEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCompareWithEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(400);
				match(OPEN_BRACKET);
				setState(401);
				expression(0);
				setState(402);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(404);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new MemberGetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				memberGetter();
				}
				break;
			case 4:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				match(NEW);
				setState(407);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new NewNoParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(NEW);
				setState(409);
				validName();
				}
				break;
			case 6:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				incrementsOp();
				setState(411);
				expression(13);
				}
				break;
			case 7:
				{
				_localctx = new LogicalNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				match(LOGIC_NOT_OP);
				setState(414);
				expression(12);
				}
				break;
			case 8:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
				unarysOp();
				setState(416);
				expression(11);
				}
				break;
			case 9:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(418);
				assignment();
				}
				break;
			case 10:
				{
				_localctx = new ByValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(419);
				returnable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(422);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(423);
						match(POW_OP);
						setState(424);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(425);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(426);
						multiplicativeOp();
						setState(427);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(430);
						additiveOp();
						setState(431);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(434);
						match(COMPARE_OP);
						setState(435);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new CompareWithEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(436);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(437);
						match(EQUAL_COMPARE_OP);
						setState(438);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(439);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(440);
						match(AND);
						setState(441);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOR_logicalNullContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(443);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==NULL_COALES_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(444);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new TernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(446);
						match(TERNARY_OP1);
						setState(447);
						expression(0);
						setState(448);
						match(TERNARY_OP2);
						setState(449);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new PostIncreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(452);
						incrementsOp();
						}
						break;
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromMemoryContext extends FunctionCallContext {
		public CallablesContext callables() {
			return getRuleContext(CallablesContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FromMemoryContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFromMemory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFromMemory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFromMemory(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TaggedTemplateContext extends FunctionCallContext {
		public CallablesContext callables() {
			return getRuleContext(CallablesContext.class,0);
		}
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public TaggedTemplateContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTaggedTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTaggedTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTaggedTemplate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsIIFEContext extends FunctionCallContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public AsIIFEContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAsIIFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAsIIFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAsIIFE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCall);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new FromMemoryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				callables();
				setState(459);
				param();
				}
				break;
			case 2:
				_localctx = new AsIIFEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(OPEN_BRACKET);
				setState(462);
				function();
				setState(463);
				match(CLOSE_BRACKET);
				setState(464);
				param();
				}
				break;
			case 3:
				_localctx = new TaggedTemplateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				callables();
				setState(467);
				templateLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallablesContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public MemberGetterContext memberGetter() {
			return getRuleContext(MemberGetterContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public CallablesContext callables() {
			return getRuleContext(CallablesContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public CallablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterCallables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitCallables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCallables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallablesContext callables() throws RecognitionException {
		CallablesContext _localctx = new CallablesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_callables);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				validName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				memberGetter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(OPEN_BRACKET);
				setState(474);
				callables();
				setState(475);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementsOpContext extends ParserRuleContext {
		public TerminalNode INCREMENT_OP() { return getToken(Parser.INCREMENT_OP, 0); }
		public TerminalNode DECREMENT_OP() { return getToken(Parser.DECREMENT_OP, 0); }
		public IncrementsOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementsOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIncrementsOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIncrementsOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIncrementsOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementsOpContext incrementsOp() throws RecognitionException {
		IncrementsOpContext _localctx = new IncrementsOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_incrementsOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT_OP || _la==DECREMENT_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnarysOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(Parser.ADD_OP, 0); }
		public TerminalNode SUP_OP() { return getToken(Parser.SUP_OP, 0); }
		public UnarysOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarysOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterUnarysOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitUnarysOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitUnarysOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarysOpContext unarysOp() throws RecognitionException {
		UnarysOpContext _localctx = new UnarysOpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unarysOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUP_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberGetterContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public List<DotNotationContext> dotNotation() {
			return getRuleContexts(DotNotationContext.class);
		}
		public DotNotationContext dotNotation(int i) {
			return getRuleContext(DotNotationContext.class,i);
		}
		public List<BracketNotationContext> bracketNotation() {
			return getRuleContexts(BracketNotationContext.class);
		}
		public BracketNotationContext bracketNotation(int i) {
			return getRuleContext(BracketNotationContext.class,i);
		}
		public MemberGetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberGetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMemberGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMemberGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMemberGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberGetterContext memberGetter() throws RecognitionException {
		MemberGetterContext _localctx = new MemberGetterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_memberGetter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			member();
			setState(486); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(486);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(484);
						dotNotation();
						}
						break;
					case 2:
						{
						setState(485);
						bracketNotation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberContext extends ParserRuleContext {
		public ObjectableContext objectable() {
			return getRuleContext(ObjectableContext.class,0);
		}
		public ObjectableWithBracketsContext objectableWithBrackets() {
			return getRuleContext(ObjectableWithBracketsContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_member);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(490);
					objectable();
					}
					break;
				case 2:
					{
					setState(491);
					objectableWithBrackets();
					}
					break;
				case 3:
					{
					setState(492);
					match(OPEN_BRACKET);
					setState(493);
					member();
					setState(494);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(498);
					objectable();
					}
					break;
				case 2:
					{
					setState(499);
					objectableWithBrackets();
					}
					break;
				case 3:
					{
					setState(500);
					match(OPEN_BRACKET);
					setState(501);
					member();
					setState(502);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotNotationContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Parser.DOT, 0); }
		public TerminalNode OPTIONAL_CHAINING_OP() { return getToken(Parser.OPTIONAL_CHAINING_OP, 0); }
		public DotNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDotNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDotNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDotNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationContext dotNotation() throws RecognitionException {
		DotNotationContext _localctx = new DotNotationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dotNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==OPTIONAL_CHAINING_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(509);
			validName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketNotationContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public IndexersContext indexers() {
			return getRuleContext(IndexersContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode OPTIONAL_CHAINING_OP() { return getToken(Parser.OPTIONAL_CHAINING_OP, 0); }
		public BracketNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBracketNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBracketNotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBracketNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketNotationContext bracketNotation() throws RecognitionException {
		BracketNotationContext _localctx = new BracketNotationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bracketNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_CHAINING_OP) {
				{
				setState(511);
				match(OPTIONAL_CHAINING_OP);
				}
			}

			setState(514);
			match(OPEN_SQUARE_BRACKET);
			setState(515);
			indexers();
			setState(516);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexersContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode INT() { return getToken(Parser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIndexers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIndexers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIndexers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexersContext indexers() throws RecognitionException {
		IndexersContext _localctx = new IndexersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexers);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				validName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectableContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Parser.NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public IncrementsOpContext incrementsOp() {
			return getRuleContext(IncrementsOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOGIC_NOT_OP() { return getToken(Parser.LOGIC_NOT_OP, 0); }
		public PrimeTypeContext primeType() {
			return getRuleContext(PrimeTypeContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public ObjectableContext objectable() {
			return getRuleContext(ObjectableContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ObjectableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectableContext objectable() throws RecognitionException {
		ObjectableContext _localctx = new ObjectableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_objectable);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(NEW);
				setState(525);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(NEW);
				setState(527);
				validName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				incrementsOp();
				setState(529);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(LOGIC_NOT_OP);
				setState(532);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				primeType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				object();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(536);
				ids();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(537);
				match(OPEN_BRACKET);
				setState(538);
				objectable();
				setState(539);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectableWithBracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IncrementsOpContext incrementsOp() {
			return getRuleContext(IncrementsOpContext.class,0);
		}
		public TerminalNode POW_OP() { return getToken(Parser.POW_OP, 0); }
		public MultiplicativeOpContext multiplicativeOp() {
			return getRuleContext(MultiplicativeOpContext.class,0);
		}
		public AdditiveOpContext additiveOp() {
			return getRuleContext(AdditiveOpContext.class,0);
		}
		public TerminalNode COMPARE_OP() { return getToken(Parser.COMPARE_OP, 0); }
		public TerminalNode EQUAL_COMPARE_OP() { return getToken(Parser.EQUAL_COMPARE_OP, 0); }
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public TerminalNode TERNARY_OP1() { return getToken(Parser.TERNARY_OP1, 0); }
		public TerminalNode TERNARY_OP2() { return getToken(Parser.TERNARY_OP2, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode NULL_COALES_OP() { return getToken(Parser.NULL_COALES_OP, 0); }
		public ObjectableWithBracketsContext objectableWithBrackets() {
			return getRuleContext(ObjectableWithBracketsContext.class,0);
		}
		public ObjectableWithBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectableWithBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectableWithBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectableWithBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectableWithBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectableWithBracketsContext objectableWithBrackets() throws RecognitionException {
		ObjectableWithBracketsContext _localctx = new ObjectableWithBracketsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objectableWithBrackets);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(OPEN_BRACKET);
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(544);
					expression(0);
					setState(545);
					incrementsOp();
					}
					break;
				case 2:
					{
					setState(547);
					expression(0);
					setState(548);
					match(POW_OP);
					setState(549);
					expression(0);
					}
					break;
				case 3:
					{
					setState(551);
					expression(0);
					setState(552);
					multiplicativeOp();
					setState(553);
					expression(0);
					}
					break;
				case 4:
					{
					setState(555);
					expression(0);
					setState(556);
					additiveOp();
					setState(557);
					expression(0);
					}
					break;
				case 5:
					{
					setState(559);
					expression(0);
					setState(560);
					match(COMPARE_OP);
					setState(561);
					expression(0);
					}
					break;
				case 6:
					{
					setState(563);
					expression(0);
					setState(564);
					match(EQUAL_COMPARE_OP);
					setState(565);
					expression(0);
					}
					break;
				case 7:
					{
					setState(567);
					expression(0);
					setState(568);
					match(AND);
					setState(569);
					expression(0);
					}
					break;
				case 8:
					{
					setState(571);
					expression(0);
					setState(572);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==NULL_COALES_OP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(573);
					expression(0);
					}
					break;
				case 9:
					{
					setState(575);
					expression(0);
					setState(576);
					match(TERNARY_OP1);
					setState(577);
					expression(0);
					setState(578);
					match(TERNARY_OP2);
					setState(579);
					expression(0);
					}
					break;
				case 10:
					{
					setState(581);
					assignment();
					}
					break;
				case 11:
					{
					setState(582);
					function();
					}
					break;
				}
				setState(585);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(OPEN_BRACKET);
				setState(588);
				objectableWithBrackets();
				setState(589);
				match(CLOSE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<AssignableContext> assignable() {
			return getRuleContexts(AssignableContext.class);
		}
		public AssignableContext assignable(int i) {
			return getRuleContext(AssignableContext.class,i);
		}
		public List<AssinmentOpContext> assinmentOp() {
			return getRuleContexts(AssinmentOpContext.class);
		}
		public AssinmentOpContext assinmentOp(int i) {
			return getRuleContext(AssinmentOpContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			assignable();
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					assinmentOp();
					setState(595);
					assignable();
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(602);
			assinmentOp();
			setState(603);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public MemberGetterContext memberGetter() {
			return getRuleContext(MemberGetterContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignable);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				validName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				memberGetter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeOpContext extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(Parser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(Parser.DIV_OP, 0); }
		public TerminalNode REM_OP() { return getToken(Parser.REM_OP, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMultiplicativeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(Parser.ADD_OP, 0); }
		public TerminalNode SUP_OP() { return getToken(Parser.SUP_OP, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAdditiveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUP_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssinmentOpContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_OP() { return getToken(Parser.ASSIGNMENT_OP, 0); }
		public TerminalNode ADD_ASSIGN_OP() { return getToken(Parser.ADD_ASSIGN_OP, 0); }
		public TerminalNode SUB_ASSIGN_OP() { return getToken(Parser.SUB_ASSIGN_OP, 0); }
		public TerminalNode MULT_ASSIGN_OP() { return getToken(Parser.MULT_ASSIGN_OP, 0); }
		public TerminalNode POW_ASSIGN_OP() { return getToken(Parser.POW_ASSIGN_OP, 0); }
		public TerminalNode DIV_ASSIGN_OP() { return getToken(Parser.DIV_ASSIGN_OP, 0); }
		public TerminalNode REM_ASSIGN_OP() { return getToken(Parser.REM_ASSIGN_OP, 0); }
		public TerminalNode AND_ASSIGN_OP() { return getToken(Parser.AND_ASSIGN_OP, 0); }
		public TerminalNode OR_ASSIGN_OP() { return getToken(Parser.OR_ASSIGN_OP, 0); }
		public TerminalNode NULL_ASSIGN_OP() { return getToken(Parser.NULL_ASSIGN_OP, 0); }
		public AssinmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterAssinmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitAssinmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAssinmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssinmentOpContext assinmentOp() throws RecognitionException {
		AssinmentOpContext _localctx = new AssinmentOpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assinmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Parser.IF, 0); }
		public ScopeHeadContext scopeHead() {
			return getRuleContext(ScopeHeadContext.class,0);
		}
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(IF);
			setState(616);
			scopeHead();
			setState(617);
			scopeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public ScopeHeadContext scopeHead() {
			return getRuleContext(ScopeHeadContext.class,0);
		}
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(WHILE);
			setState(620);
			scopeHead();
			setState(621);
			scopeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Parser.DO, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public ScopeHeadContext scopeHead() {
			return getRuleContext(ScopeHeadContext.class,0);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(DO);
			setState(624);
			scopeBody();
			setState(625);
			match(WHILE);
			setState(626);
			scopeHead();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public ForExpression1Context forExpression1() {
			return getRuleContext(ForExpression1Context.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(FOR);
			setState(629);
			match(OPEN_BRACKET);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443652045141312L) != 0) || _la==ID) {
				{
				setState(630);
				forExpression1();
				}
			}

			setState(633);
			match(SEMICOLON);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443643320923456L) != 0) || _la==ID) {
				{
				setState(634);
				expressionList();
				}
			}

			setState(637);
			match(SEMICOLON);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443643320923456L) != 0) || _la==ID) {
				{
				setState(638);
				expressionList();
				}
			}

			setState(641);
			match(CLOSE_BRACKET);
			setState(642);
			scopeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpression1Context extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpression1Context forExpression1() throws RecognitionException {
		ForExpression1Context _localctx = new ForExpression1Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_forExpression1);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				declare();
				}
				break;
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case OPEN_TEMPLATE_LITERAL:
			case AS:
			case ASYNC:
			case FROM:
			case FUNCTION:
			case GET:
			case NEW:
			case OF:
			case SET:
			case THIS:
			case YIELD:
			case BOOL:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case UNDEFINED:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case ADD_OP:
			case SUP_OP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(648);
					expression(0);
					setState(649);
					match(COMMA);
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(656);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForinContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(Parser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public DeclarersContext declarers() {
			return getRuleContext(DeclarersContext.class,0);
		}
		public ForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinContext forin() throws RecognitionException {
		ForinContext _localctx = new ForinContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(FOR);
			setState(659);
			match(OPEN_BRACKET);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8724217856L) != 0)) {
				{
				setState(660);
				declarers();
				}
			}

			setState(663);
			validName();
			setState(664);
			match(IN);
			setState(665);
			expression(0);
			setState(666);
			match(CLOSE_BRACKET);
			setState(667);
			scopeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForofContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(Parser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public DeclarersContext declarers() {
			return getRuleContext(DeclarersContext.class,0);
		}
		public ForofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterForof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitForof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitForof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForofContext forof() throws RecognitionException {
		ForofContext _localctx = new ForofContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(FOR);
			setState(670);
			match(OPEN_BRACKET);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8724217856L) != 0)) {
				{
				setState(671);
				declarers();
				}
			}

			setState(674);
			validName();
			setState(675);
			match(OF);
			setState(676);
			expression(0);
			setState(677);
			match(CLOSE_BRACKET);
			setState(678);
			scopeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeHeadContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public ScopeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterScopeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitScopeHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitScopeHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeHeadContext scopeHead() throws RecognitionException {
		ScopeHeadContext _localctx = new ScopeHeadContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_scopeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(OPEN_BRACKET);
			setState(681);
			expression(0);
			setState(682);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ScopeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterScopeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitScopeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitScopeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeBodyContext scopeBody() throws RecognitionException {
		ScopeBodyContext _localctx = new ScopeBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_scopeBody);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				line();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(OPEN_CURLY_BRACES);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443670350951776L) != 0) || _la==ID) {
				{
				{
				setState(689);
				line();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(CLOSE_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<ObjPropDefineContext> objPropDefine() {
			return getRuleContexts(ObjPropDefineContext.class);
		}
		public ObjPropDefineContext objPropDefine(int i) {
			return getRuleContext(ObjPropDefineContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(OPEN_CURLY_BRACES);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 999127277840L) != 0) || _la==ID) {
				{
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(698);
						objPropDefine();
						setState(699);
						match(COMMA);
						}
						} 
					}
					setState(705);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(706);
				objPropDefine();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(707);
					match(COMMA);
					}
				}

				}
			}

			setState(712);
			match(CLOSE_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjPropDefineContext extends ParserRuleContext {
		public ObjPropNameContext objPropName() {
			return getRuleContext(ObjPropNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode ELLIPSIS() { return getToken(Parser.ELLIPSIS, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjPropDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objPropDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjPropDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjPropDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjPropDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjPropDefineContext objPropDefine() throws RecognitionException {
		ObjPropDefineContext _localctx = new ObjPropDefineContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_objPropDefine);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				objPropName();
				setState(715);
				match(COLON);
				setState(716);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				validName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				method();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				match(OPEN_SQUARE_BRACKET);
				setState(721);
				expression(0);
				setState(722);
				match(CLOSE_SQUARE_BRACKET);
				setState(723);
				match(COLON);
				setState(724);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				match(ELLIPSIS);
				setState(729);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(727);
					match(ID);
					}
					break;
				case OPEN_CURLY_BRACES:
					{
					setState(728);
					object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjPropNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ObjPropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objPropName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjPropName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjPropName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjPropName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjPropNameContext objPropName() throws RecognitionException {
		ObjPropNameContext _localctx = new ObjPropNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_objPropName);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				match(STRING);
				}
				break;
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				validName();
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			validName();
			setState(739);
			args();
			setState(740);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<ArrayInputContext> arrayInput() {
			return getRuleContexts(ArrayInputContext.class);
		}
		public ArrayInputContext arrayInput(int i) {
			return getRuleContext(ArrayInputContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(OPEN_SQUARE_BRACKET);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443643320923472L) != 0) || _la==ID) {
				{
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(743);
						arrayInput();
						setState(745); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(744);
							match(COMMA);
							}
							}
							setState(747); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA );
						}
						} 
					}
					setState(753);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(754);
				arrayInput();
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(755);
					match(COMMA);
					}
					}
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(763);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySpreadContext arraySpread() {
			return getRuleContext(ArraySpreadContext.class,0);
		}
		public ArrayInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInputContext arrayInput() throws RecognitionException {
		ArrayInputContext _localctx = new ArrayInputContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrayInput);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case OPEN_TEMPLATE_LITERAL:
			case AS:
			case ASYNC:
			case FROM:
			case FUNCTION:
			case GET:
			case NEW:
			case OF:
			case SET:
			case THIS:
			case YIELD:
			case BOOL:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case UNDEFINED:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case ADD_OP:
			case SUP_OP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				expression(0);
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				arraySpread();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySpreadContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(Parser.ELLIPSIS, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArraySpreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArraySpread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArraySpread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArraySpread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySpreadContext arraySpread() throws RecognitionException {
		ArraySpreadContext _localctx = new ArraySpreadContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arraySpread);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(ELLIPSIS);
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(770);
				match(ID);
				}
				break;
			case OPEN_SQUARE_BRACKET:
				{
				setState(771);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDestructuringContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Parser.OPEN_CURLY_BRACES, 0); }
		public List<DestructuredObjVarContext> destructuredObjVar() {
			return getRuleContexts(DestructuredObjVarContext.class);
		}
		public DestructuredObjVarContext destructuredObjVar(int i) {
			return getRuleContext(DestructuredObjVarContext.class,i);
		}
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Parser.CLOSE_CURLY_BRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ObjectDestructuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDestructuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDestructuringContext objectDestructuring() throws RecognitionException {
		ObjectDestructuringContext _localctx = new ObjectDestructuringContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_objectDestructuring);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(OPEN_CURLY_BRACES);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(775);
					destructuredObjVar();
					setState(776);
					match(COMMA);
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(783);
			destructuredObjVar();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(784);
				match(COMMA);
				}
			}

			setState(787);
			match(CLOSE_CURLY_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredObjVarContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public ObjPropNameContext objPropName() {
			return getRuleContext(ObjPropNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser.COLON, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(Parser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DestructuredObjVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuredObjVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDestructuredObjVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDestructuredObjVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDestructuredObjVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuredObjVarContext destructuredObjVar() throws RecognitionException {
		DestructuredObjVarContext _localctx = new DestructuredObjVarContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_destructuredObjVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(789);
				objPropName();
				setState(790);
				match(COLON);
				}
				break;
			}
			setState(794);
			validName();
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(795);
				match(ASSIGNMENT_OP);
				setState(796);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDestructuringContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Parser.OPEN_SQUARE_BRACKET, 0); }
		public List<DestructuredArrVarContext> destructuredArrVar() {
			return getRuleContexts(DestructuredArrVarContext.class);
		}
		public DestructuredArrVarContext destructuredArrVar(int i) {
			return getRuleContext(DestructuredArrVarContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ArrayDestructuringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDestructuring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDestructuringContext arrayDestructuring() throws RecognitionException {
		ArrayDestructuringContext _localctx = new ArrayDestructuringContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrayDestructuring);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(OPEN_SQUARE_BRACKET);
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(800);
					destructuredArrVar();
					setState(801);
					match(COMMA);
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(808);
			destructuredArrVar();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(809);
				match(COMMA);
				}
			}

			setState(812);
			match(CLOSE_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuredArrVarContext extends ParserRuleContext {
		public ValidNameContext validName() {
			return getRuleContext(ValidNameContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OP() { return getToken(Parser.ASSIGNMENT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DestructuredArrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuredArrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDestructuredArrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDestructuredArrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDestructuredArrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuredArrVarContext destructuredArrVar() throws RecognitionException {
		DestructuredArrVarContext _localctx = new DestructuredArrVarContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_destructuredArrVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			validName();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(815);
				match(ASSIGNMENT_OP);
				setState(816);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Parser.CLOSE_BRACKET, 0); }
		public List<ParamInputContext> paramInput() {
			return getRuleContexts(ParamInputContext.class);
		}
		public ParamInputContext paramInput(int i) {
			return getRuleContext(ParamInputContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(OPEN_BRACKET);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3443643320923472L) != 0) || _la==ID) {
				{
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(820);
						paramInput();
						setState(821);
						match(COMMA);
						}
						} 
					}
					setState(827);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				{
				setState(828);
				paramInput();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(829);
					match(COMMA);
					}
				}

				}
				}
			}

			setState(834);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamInputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySpreadContext arraySpread() {
			return getRuleContext(ArraySpreadContext.class,0);
		}
		public ParamInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterParamInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitParamInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitParamInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamInputContext paramInput() throws RecognitionException {
		ParamInputContext _localctx = new ParamInputContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_paramInput);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case OPEN_TEMPLATE_LITERAL:
			case AS:
			case ASYNC:
			case FROM:
			case FUNCTION:
			case GET:
			case NEW:
			case OF:
			case SET:
			case THIS:
			case YIELD:
			case BOOL:
			case INT:
			case FLOAT:
			case STRING:
			case NULL:
			case UNDEFINED:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case ADD_OP:
			case SUP_OP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				expression(0);
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				arraySpread();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnableContext extends ParserRuleContext {
		public ReturnableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnable; }
	 
		public ReturnableContext() { }
		public void copyFrom(ReturnableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionValContext extends ReturnableContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionValContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterFunctionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitFunctionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFunctionVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveContext extends ReturnableContext {
		public PrimeTypeContext primeType() {
			return getRuleContext(PrimeTypeContext.class,0);
		}
		public PrimitiveContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValContext extends ReturnableContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectValContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterObjectVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitObjectVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitObjectVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValContext extends ReturnableContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterArrayVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitArrayVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitArrayVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ReturnableContext {
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public VariableContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnableContext returnable() throws RecognitionException {
		ReturnableContext _localctx = new ReturnableContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_returnable);
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new PrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				primeType();
				}
				break;
			case 2:
				_localctx = new ObjectValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				object();
				}
				break;
			case 3:
				_localctx = new ArrayValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				array();
				}
				break;
			case 4:
				_localctx = new FunctionValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				function();
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(844);
				ids();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimeTypeContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(Parser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(Parser.NULL, 0); }
		public TerminalNode UNDEFINED() { return getToken(Parser.UNDEFINED, 0); }
		public PrimeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterPrimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitPrimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrimeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeTypeContext primeType() throws RecognitionException {
		PrimeTypeContext _localctx = new PrimeTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_primeType);
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				num();
				}
				break;
			case OPEN_TEMPLATE_LITERAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				strings();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(BOOL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				match(NULL);
				}
				break;
			case UNDEFINED:
				enterOuterAlt(_localctx, 5);
				{
				setState(851);
				match(UNDEFINED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Parser.FLOAT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_strings);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(STRING);
				}
				break;
			case OPEN_TEMPLATE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				templateLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_TEMPLATE_LITERAL() { return getToken(Parser.OPEN_TEMPLATE_LITERAL, 0); }
		public TerminalNode CLOSE_TEMPLATE_LITERAL() { return getToken(Parser.CLOSE_TEMPLATE_LITERAL, 0); }
		public List<TemplateLiteralContentContext> templateLiteralContent() {
			return getRuleContexts(TemplateLiteralContentContext.class);
		}
		public TemplateLiteralContentContext templateLiteralContent(int i) {
			return getRuleContext(TemplateLiteralContentContext.class,i);
		}
		public TemplateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTemplateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLiteralContext templateLiteral() throws RecognitionException {
		TemplateLiteralContext _localctx = new TemplateLiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_templateLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(OPEN_TEMPLATE_LITERAL);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_LITERAL_ALLOWED_CHAR || _la==TEMPLATE_LITERAL_START_VAR) {
				{
				{
				setState(861);
				templateLiteralContent();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(CLOSE_TEMPLATE_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContentContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_LITERAL_ALLOWED_CHAR() { return getToken(Parser.TEMPLATE_LITERAL_ALLOWED_CHAR, 0); }
		public TerminalNode TEMPLATE_LITERAL_START_VAR() { return getToken(Parser.TEMPLATE_LITERAL_START_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_LITERAL_VAR_CLOSE() { return getToken(Parser.TEMPLATE_LITERAL_VAR_CLOSE, 0); }
		public TemplateLiteralContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteralContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterTemplateLiteralContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitTemplateLiteralContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitTemplateLiteralContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLiteralContentContext templateLiteralContent() throws RecognitionException {
		TemplateLiteralContentContext _localctx = new TemplateLiteralContentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_templateLiteralContent);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_LITERAL_ALLOWED_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(TEMPLATE_LITERAL_ALLOWED_CHAR);
				}
				break;
			case TEMPLATE_LITERAL_START_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(TEMPLATE_LITERAL_START_VAR);
				setState(871);
				expression(0);
				setState(872);
				match(TEMPLATE_LITERAL_VAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode THIS() { return getToken(Parser.THIS, 0); }
		public SetableKeywordsContext setableKeywords() {
			return getRuleContext(SetableKeywordsContext.class,0);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ids);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(ID);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(THIS);
				}
				break;
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				setableKeywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetableKeywordsContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(Parser.AS, 0); }
		public TerminalNode ASYNC() { return getToken(Parser.ASYNC, 0); }
		public TerminalNode FROM() { return getToken(Parser.FROM, 0); }
		public TerminalNode GET() { return getToken(Parser.GET, 0); }
		public TerminalNode OF() { return getToken(Parser.OF, 0); }
		public TerminalNode SET() { return getToken(Parser.SET, 0); }
		public TerminalNode YIELD() { return getToken(Parser.YIELD, 0); }
		public SetableKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setableKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterSetableKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitSetableKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSetableKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetableKeywordsContext setableKeywords() throws RecognitionException {
		SetableKeywordsContext _localctx = new SetableKeywordsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_setableKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 37054603264L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValidNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public SetableKeywordsContext setableKeywords() {
			return getRuleContext(SetableKeywordsContext.class,0);
		}
		public ValidNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterValidName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitValidName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitValidName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidNameContext validName() throws RecognitionException {
		ValidNameContext _localctx = new ValidNameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_validName);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(ID);
				}
				break;
			case AS:
			case ASYNC:
			case FROM:
			case GET:
			case OF:
			case SET:
			case YIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				setableKeywords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarersContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Parser.VAR, 0); }
		public TerminalNode LET() { return getToken(Parser.LET, 0); }
		public TerminalNode CONST() { return getToken(Parser.CONST, 0); }
		public DeclarersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterDeclarers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitDeclarers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclarers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarersContext declarers() throws RecognitionException {
		DeclarersContext _localctx = new DeclarersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declarers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8724217856L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoUseStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Parser.SEMICOLON, 0); }
		public NoUseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noUseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).enterNoUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserListener ) ((ParserListener)listener).exitNoUseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitNoUseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoUseStatementContext noUseStatement() throws RecognitionException {
		NoUseStatementContext _localctx = new NoUseStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_noUseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001N\u037c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0005\u0000\u00a2\b\u0000\n\u0000\f\u0000\u00a5\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00b3\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00b7\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c0\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00c4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c9\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00d8\b\b\n\b\f\b\u00db\t\b\u0001\b\u0001\b\u0003\b\u00df\b\b\u0003"+
		"\b\u00e1\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00e8\b\t"+
		"\u0001\t\u0001\t\u0003\t\u00ec\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f6\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010c\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0116\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u011b\b\u0010\u0005\u0010\u011d\b"+
		"\u0010\n\u0010\f\u0010\u0120\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0126\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0134\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0138\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0141\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0146\b\u0015\u0005\u0015"+
		"\u0148\b\u0015\n\u0015\f\u0015\u014b\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0153\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0161\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0166"+
		"\b\u0018\u0005\u0018\u0168\b\u0018\n\u0018\f\u0018\u016b\t\u0018\u0001"+
		"\u0018\u0003\u0018\u016e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0176\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u017c\b\u0019\n\u0019\f\u0019"+
		"\u017f\t\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0183\b\u001a\n\u001a"+
		"\f\u001a\u0186\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u018e\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01a5\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01c6\b\u001c"+
		"\n\u001c\f\u001c\u01c9\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01d6\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01de\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0004!\u01e7\b!"+
		"\u000b!\f!\u01e8\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01f1\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f9"+
		"\b\"\u0003\"\u01fb\b\"\u0001#\u0001#\u0001#\u0001$\u0003$\u0201\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003%\u020b\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u021e\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u0248\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0250\b\'\u0001(\u0001(\u0001(\u0001(\u0005(\u0256"+
		"\b(\n(\f(\u0259\t(\u0001(\u0001(\u0001(\u0001)\u0001)\u0003)\u0260\b)"+
		"\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00030\u0278\b0\u00010\u00010\u00030\u027c\b0\u00010\u0001"+
		"0\u00030\u0280\b0\u00010\u00010\u00010\u00011\u00011\u00031\u0287\b1\u0001"+
		"2\u00012\u00012\u00052\u028c\b2\n2\f2\u028f\t2\u00012\u00012\u00013\u0001"+
		"3\u00013\u00033\u0296\b3\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00034\u02a1\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00016\u00016\u00036\u02af\b6\u00017\u0001"+
		"7\u00057\u02b3\b7\n7\f7\u02b6\t7\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00058\u02be\b8\n8\f8\u02c1\t8\u00018\u00018\u00038\u02c5\b8\u00038"+
		"\u02c7\b8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u02da"+
		"\b9\u00039\u02dc\b9\u0001:\u0001:\u0001:\u0003:\u02e1\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0004<\u02ea\b<\u000b<\f<\u02eb\u0005"+
		"<\u02ee\b<\n<\f<\u02f1\t<\u0001<\u0001<\u0005<\u02f5\b<\n<\f<\u02f8\t"+
		"<\u0003<\u02fa\b<\u0001<\u0001<\u0001=\u0001=\u0003=\u0300\b=\u0001>\u0001"+
		">\u0001>\u0003>\u0305\b>\u0001?\u0001?\u0001?\u0001?\u0005?\u030b\b?\n"+
		"?\f?\u030e\t?\u0001?\u0001?\u0003?\u0312\b?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0003@\u0319\b@\u0001@\u0001@\u0001@\u0003@\u031e\b@\u0001A\u0001"+
		"A\u0001A\u0001A\u0005A\u0324\bA\nA\fA\u0327\tA\u0001A\u0001A\u0003A\u032b"+
		"\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u0332\bB\u0001C\u0001C\u0001"+
		"C\u0001C\u0005C\u0338\bC\nC\fC\u033b\tC\u0001C\u0001C\u0003C\u033f\bC"+
		"\u0003C\u0341\bC\u0001C\u0001C\u0001D\u0001D\u0003D\u0347\bD\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u034e\bE\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u0355\bF\u0001G\u0001G\u0001H\u0001H\u0003H\u035b\bH\u0001I\u0001"+
		"I\u0005I\u035f\bI\nI\fI\u0362\tI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0003J\u036b\bJ\u0001K\u0001K\u0001K\u0003K\u0370\bK\u0001L\u0001"+
		"L\u0001M\u0001M\u0003M\u0376\bM\u0001N\u0001N\u0001O\u0001O\u0001O\u0000"+
		"\u00018P\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u0000\t\u0001\u000078\u0001\u0000+,\u0001\u000023\u0002"+
		"\u0000\u0003\u0003**\u0001\u0000/1\u0001\u0000;D\u0001\u0000%&\u0006\u0000"+
		"\r\u000e\u0015\u0015\u0017\u0017\u001d\u001d\u001f\u001f##\u0003\u0000"+
		"\u0010\u0010\u001b\u001b!!\u03cc\u0000\u00a3\u0001\u0000\u0000\u0000\u0002"+
		"\u00b2\u0001\u0000\u0000\u0000\u0004\u00b6\u0001\u0000\u0000\u0000\u0006"+
		"\u00b8\u0001\u0000\u0000\u0000\b\u00bf\u0001\u0000\u0000\u0000\n\u00c3"+
		"\u0001\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000\u0000\u000e\u00cf\u0001"+
		"\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000\u0000\u0012\u00eb\u0001"+
		"\u0000\u0000\u0000\u0014\u00ed\u0001\u0000\u0000\u0000\u0016\u00f5\u0001"+
		"\u0000\u0000\u0000\u0018\u00f7\u0001\u0000\u0000\u0000\u001a\u00fd\u0001"+
		"\u0000\u0000\u0000\u001c\u010b\u0001\u0000\u0000\u0000\u001e\u010d\u0001"+
		"\u0000\u0000\u0000 \u010f\u0001\u0000\u0000\u0000\"\u0125\u0001\u0000"+
		"\u0000\u0000$\u012a\u0001\u0000\u0000\u0000&\u012e\u0001\u0000\u0000\u0000"+
		"(\u0137\u0001\u0000\u0000\u0000*\u0139\u0001\u0000\u0000\u0000,\u014e"+
		"\u0001\u0000\u0000\u0000.\u0154\u0001\u0000\u0000\u00000\u016d\u0001\u0000"+
		"\u0000\u00002\u0172\u0001\u0000\u0000\u00004\u0184\u0001\u0000\u0000\u0000"+
		"6\u018d\u0001\u0000\u0000\u00008\u01a4\u0001\u0000\u0000\u0000:\u01d5"+
		"\u0001\u0000\u0000\u0000<\u01dd\u0001\u0000\u0000\u0000>\u01df\u0001\u0000"+
		"\u0000\u0000@\u01e1\u0001\u0000\u0000\u0000B\u01e3\u0001\u0000\u0000\u0000"+
		"D\u01fa\u0001\u0000\u0000\u0000F\u01fc\u0001\u0000\u0000\u0000H\u0200"+
		"\u0001\u0000\u0000\u0000J\u020a\u0001\u0000\u0000\u0000L\u021d\u0001\u0000"+
		"\u0000\u0000N\u024f\u0001\u0000\u0000\u0000P\u0251\u0001\u0000\u0000\u0000"+
		"R\u025f\u0001\u0000\u0000\u0000T\u0261\u0001\u0000\u0000\u0000V\u0263"+
		"\u0001\u0000\u0000\u0000X\u0265\u0001\u0000\u0000\u0000Z\u0267\u0001\u0000"+
		"\u0000\u0000\\\u026b\u0001\u0000\u0000\u0000^\u026f\u0001\u0000\u0000"+
		"\u0000`\u0274\u0001\u0000\u0000\u0000b\u0286\u0001\u0000\u0000\u0000d"+
		"\u028d\u0001\u0000\u0000\u0000f\u0292\u0001\u0000\u0000\u0000h\u029d\u0001"+
		"\u0000\u0000\u0000j\u02a8\u0001\u0000\u0000\u0000l\u02ae\u0001\u0000\u0000"+
		"\u0000n\u02b0\u0001\u0000\u0000\u0000p\u02b9\u0001\u0000\u0000\u0000r"+
		"\u02db\u0001\u0000\u0000\u0000t\u02e0\u0001\u0000\u0000\u0000v\u02e2\u0001"+
		"\u0000\u0000\u0000x\u02e6\u0001\u0000\u0000\u0000z\u02ff\u0001\u0000\u0000"+
		"\u0000|\u0301\u0001\u0000\u0000\u0000~\u0306\u0001\u0000\u0000\u0000\u0080"+
		"\u0318\u0001\u0000\u0000\u0000\u0082\u031f\u0001\u0000\u0000\u0000\u0084"+
		"\u032e\u0001\u0000\u0000\u0000\u0086\u0333\u0001\u0000\u0000\u0000\u0088"+
		"\u0346\u0001\u0000\u0000\u0000\u008a\u034d\u0001\u0000\u0000\u0000\u008c"+
		"\u0354\u0001\u0000\u0000\u0000\u008e\u0356\u0001\u0000\u0000\u0000\u0090"+
		"\u035a\u0001\u0000\u0000\u0000\u0092\u035c\u0001\u0000\u0000\u0000\u0094"+
		"\u036a\u0001\u0000\u0000\u0000\u0096\u036f\u0001\u0000\u0000\u0000\u0098"+
		"\u0371\u0001\u0000\u0000\u0000\u009a\u0375\u0001\u0000\u0000\u0000\u009c"+
		"\u0377\u0001\u0000\u0000\u0000\u009e\u0379\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0000\u0000\u0001\u00a7"+
		"\u0001\u0001\u0000\u0000\u0000\u00a8\u00b3\u0003\b\u0004\u0000\u00a9\u00b3"+
		"\u0003\u0016\u000b\u0000\u00aa\u00b3\u0003Z-\u0000\u00ab\u00b3\u0003\\"+
		".\u0000\u00ac\u00b3\u0003`0\u0000\u00ad\u00b3\u0003f3\u0000\u00ae\u00b3"+
		"\u0003h4\u0000\u00af\u00b3\u0003^/\u0000\u00b0\u00b3\u0003n7\u0000\u00b1"+
		"\u00b3\u0003\u0004\u0002\u0000\u00b2\u00a8\u0001\u0000\u0000\u0000\u00b2"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u0003\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0005\u000f\u0000\u0000\u00b5\u00b7\u0003\u0006\u0003\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u0005\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005\u001e\u0000\u0000\u00b9"+
		"\u00bb\u00038\u001c\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u0007\u0001\u0000\u0000\u0000\u00bc\u00c0"+
		"\u0003\n\u0005\u0000\u00bd\u00c0\u0003\f\u0006\u0000\u00be\u00c0\u0003"+
		"\u000e\u0007\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\t\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0003\u0010\b\u0000\u00c2\u00c4\u0003\u009aM"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0005E\u0000\u0000"+
		"\u00c6\u00c9\u0003n7\u0000\u00c7\u00c9\u00038\u001c\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u000b"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0016\u0000\u0000\u00cb\u00cc"+
		"\u0003\u009aM\u0000\u00cc\u00cd\u0003\u0010\b\u0000\u00cd\u00ce\u0003"+
		"n7\u0000\u00ce\r\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000"+
		"\u0000\u00d0\u00d1\u0003\u0010\b\u0000\u00d1\u00d2\u0003n7\u0000\u00d2"+
		"\u000f\u0001\u0000\u0000\u0000\u00d3\u00e0\u0005\u0006\u0000\u0000\u00d4"+
		"\u00d5\u0003\u0012\t\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0003\u0012\t\u0000\u00dd\u00df\u0003"+
		"\u0014\n\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d9\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0007\u0000\u0000\u00e3\u0011\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0003\u009aM\u0000\u00e5\u00e6\u0005;\u0000\u0000"+
		"\u00e6\u00e8\u00038\u001c\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ec\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0003~?\u0000\u00ea\u00ec\u0003\u0082A\u0000\u00eb\u00e4\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u0013\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"\u0004\u0000\u0000\u00ee\u00ef\u0003\u009aM\u0000\u00ef\u0015\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f6\u0003\u0018\f\u0000\u00f1\u00f6\u0003&\u0013"+
		"\u0000\u00f2\u00f6\u00032\u0019\u0000\u00f3\u00f6\u00038\u001c\u0000\u00f4"+
		"\u00f6\u0003\u009eO\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f5\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u0017"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005\u0019\u0000\u0000\u00f8\u00fa"+
		"\u0003\u001a\r\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		"\'\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u001c"+
		"\u000e\u0000\u00fe\u00ff\u0005\u0015\u0000\u0000\u00ff\u001b\u0001\u0000"+
		"\u0000\u0000\u0100\u010c\u0003\u001e\u000f\u0000\u0101\u010c\u0003 \u0010"+
		"\u0000\u0102\u010c\u0003$\u0012\u0000\u0103\u0104\u0003\u001e\u000f\u0000"+
		"\u0104\u0105\u0005\u0002\u0000\u0000\u0105\u0106\u0003 \u0010\u0000\u0106"+
		"\u010c\u0001\u0000\u0000\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108"+
		"\u0109\u0005\u0002\u0000\u0000\u0109\u010a\u0003$\u0012\u0000\u010a\u010c"+
		"\u0001\u0000\u0000\u0000\u010b\u0100\u0001\u0000\u0000\u0000\u010b\u0101"+
		"\u0001\u0000\u0000\u0000\u010b\u0102\u0001\u0000\u0000\u0000\u010b\u0103"+
		"\u0001\u0000\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010c\u001d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0003\u009aM\u0000\u010e\u001f\u0001"+
		"\u0000\u0000\u0000\u010f\u0115\u0005\n\u0000\u0000\u0110\u0116\u0003\u009a"+
		"M\u0000\u0111\u0116\u0003\"\u0011\u0000\u0112\u0113\u0005\u0011\u0000"+
		"\u0000\u0113\u0114\u0005\r\u0000\u0000\u0114\u0116\u0003\u009aM\u0000"+
		"\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000"+
		"\u0115\u0112\u0001\u0000\u0000\u0000\u0116\u011e\u0001\u0000\u0000\u0000"+
		"\u0117\u011a\u0005\u0002\u0000\u0000\u0118\u011b\u0003\u009aM\u0000\u0119"+
		"\u011b\u0003\"\u0011\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0117"+
		"\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u000b\u0000\u0000\u0122!\u0001\u0000\u0000\u0000\u0123\u0126\u0003"+
		"\u009aM\u0000\u0124\u0126\u0005\'\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\r\u0000\u0000\u0128\u0129\u0003\u009aM"+
		"\u0000\u0129#\u0001\u0000\u0000\u0000\u012a\u012b\u0005/\u0000\u0000\u012b"+
		"\u012c\u0005\r\u0000\u0000\u012c\u012d\u0003\u009aM\u0000\u012d%\u0001"+
		"\u0000\u0000\u0000\u012e\u0133\u0005\u0013\u0000\u0000\u012f\u0134\u0003"+
		"0\u0018\u0000\u0130\u0134\u0003(\u0014\u0000\u0131\u0134\u0003*\u0015"+
		"\u0000\u0132\u0134\u0003.\u0017\u0000\u0133\u012f\u0001\u0000\u0000\u0000"+
		"\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\'\u0001\u0000\u0000\u0000\u0135"+
		"\u0138\u00032\u0019\u0000\u0136\u0138\u0003\f\u0006\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138)\u0001"+
		"\u0000\u0000\u0000\u0139\u0140\u0005\n\u0000\u0000\u013a\u0141\u0003\u009a"+
		"M\u0000\u013b\u0141\u0003,\u0016\u0000\u013c\u013d\u0003\u009aM\u0000"+
		"\u013d\u013e\u0005\r\u0000\u0000\u013e\u013f\u0005\u0011\u0000\u0000\u013f"+
		"\u0141\u0001\u0000\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140"+
		"\u013b\u0001\u0000\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0141"+
		"\u0149\u0001\u0000\u0000\u0000\u0142\u0145\u0005\u0002\u0000\u0000\u0143"+
		"\u0146\u0003\u009aM\u0000\u0144\u0146\u0003,\u0016\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0148\u0001"+
		"\u0000\u0000\u0000\u0147\u0142\u0001\u0000\u0000\u0000\u0148\u014b\u0001"+
		"\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005\u000b\u0000\u0000\u014d+\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0003\u009aM\u0000\u014f\u0152\u0005\r\u0000"+
		"\u0000\u0150\u0153\u0003\u009aM\u0000\u0151\u0153\u0005\'\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000"+
		"\u0153-\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0011\u0000\u0000\u0155"+
		"\u0156\u00038\u001c\u0000\u0156/\u0001\u0000\u0000\u0000\u0157\u016e\u0005"+
		"/\u0000\u0000\u0158\u016e\u0003$\u0012\u0000\u0159\u0160\u0005\n\u0000"+
		"\u0000\u015a\u0161\u0003\u009aM\u0000\u015b\u0161\u0003\"\u0011\u0000"+
		"\u015c\u0161\u0005\u0011\u0000\u0000\u015d\u015e\u0005\u0011\u0000\u0000"+
		"\u015e\u015f\u0005\r\u0000\u0000\u015f\u0161\u0003\u009aM\u0000\u0160"+
		"\u015a\u0001\u0000\u0000\u0000\u0160\u015b\u0001\u0000\u0000\u0000\u0160"+
		"\u015c\u0001\u0000\u0000\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0161"+
		"\u0169\u0001\u0000\u0000\u0000\u0162\u0165\u0005\u0002\u0000\u0000\u0163"+
		"\u0166\u0003\u009aM\u0000\u0164\u0166\u0003\"\u0011\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0168\u016b"+
		"\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0005\u000b\u0000\u0000\u016d\u0157"+
		"\u0001\u0000\u0000\u0000\u016d\u0158\u0001\u0000\u0000\u0000\u016d\u0159"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005\u0015\u0000\u0000\u0170\u0171\u0005\'\u0000\u0000\u01711\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0003\u009cN\u0000\u0173\u0175\u00036\u001b"+
		"\u0000\u0174\u0176\u00034\u001a\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u017d\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005\u0002\u0000\u0000\u0178\u0179\u00036\u001b\u0000\u0179"+
		"\u017a\u00034\u001a\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0177"+
		"\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e3\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		";\u0000\u0000\u0181\u0183\u00036\u001b\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005;\u0000\u0000"+
		"\u0188\u0189\u00038\u001c\u0000\u01895\u0001\u0000\u0000\u0000\u018a\u018e"+
		"\u0003\u009aM\u0000\u018b\u018e\u0003~?\u0000\u018c\u018e\u0003\u0082"+
		"A\u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e7\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0006\u001c\uffff\uffff\u0000\u0190\u0191\u0005\u0006\u0000"+
		"\u0000\u0191\u0192\u00038\u001c\u0000\u0192\u0193\u0005\u0007\u0000\u0000"+
		"\u0193\u01a5\u0001\u0000\u0000\u0000\u0194\u01a5\u0003:\u001d\u0000\u0195"+
		"\u01a5\u0003B!\u0000\u0196\u0197\u0005\u001c\u0000\u0000\u0197\u01a5\u0003"+
		":\u001d\u0000\u0198\u0199\u0005\u001c\u0000\u0000\u0199\u01a5\u0003\u009a"+
		"M\u0000\u019a\u019b\u0003>\u001f\u0000\u019b\u019c\u00038\u001c\r\u019c"+
		"\u01a5\u0001\u0000\u0000\u0000\u019d\u019e\u0005-\u0000\u0000\u019e\u01a5"+
		"\u00038\u001c\f\u019f\u01a0\u0003@ \u0000\u01a0\u01a1\u00038\u001c\u000b"+
		"\u01a1\u01a5\u0001\u0000\u0000\u0000\u01a2\u01a5\u0003P(\u0000\u01a3\u01a5"+
		"\u0003\u008aE\u0000\u01a4\u018f\u0001\u0000\u0000\u0000\u01a4\u0194\u0001"+
		"\u0000\u0000\u0000\u01a4\u0195\u0001\u0000\u0000\u0000\u01a4\u0196\u0001"+
		"\u0000\u0000\u0000\u01a4\u0198\u0001\u0000\u0000\u0000\u01a4\u019a\u0001"+
		"\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000\u01a4\u019f\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a5\u01c7\u0001\u0000\u0000\u0000\u01a6\u01a7\n\n"+
		"\u0000\u0000\u01a7\u01a8\u0005.\u0000\u0000\u01a8\u01c6\u00038\u001c\u000b"+
		"\u01a9\u01aa\n\t\u0000\u0000\u01aa\u01ab\u0003T*\u0000\u01ab\u01ac\u0003"+
		"8\u001c\n\u01ac\u01c6\u0001\u0000\u0000\u0000\u01ad\u01ae\n\b\u0000\u0000"+
		"\u01ae\u01af\u0003V+\u0000\u01af\u01b0\u00038\u001c\t\u01b0\u01c6\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\n\u0007\u0000\u0000\u01b2\u01b3\u00054"+
		"\u0000\u0000\u01b3\u01c6\u00038\u001c\b\u01b4\u01b5\n\u0006\u0000\u0000"+
		"\u01b5\u01b6\u00055\u0000\u0000\u01b6\u01c6\u00038\u001c\u0007\u01b7\u01b8"+
		"\n\u0005\u0000\u0000\u01b8\u01b9\u00056\u0000\u0000\u01b9\u01c6\u0003"+
		"8\u001c\u0006\u01ba\u01bb\n\u0004\u0000\u0000\u01bb\u01bc\u0007\u0000"+
		"\u0000\u0000\u01bc\u01c6\u00038\u001c\u0005\u01bd\u01be\n\u0003\u0000"+
		"\u0000\u01be\u01bf\u00059\u0000\u0000\u01bf\u01c0\u00038\u001c\u0000\u01c0"+
		"\u01c1\u0005:\u0000\u0000\u01c1\u01c2\u00038\u001c\u0004\u01c2\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\n\u000e\u0000\u0000\u01c4\u01c6\u0003>"+
		"\u001f\u0000\u01c5\u01a6\u0001\u0000\u0000\u0000\u01c5\u01a9\u0001\u0000"+
		"\u0000\u0000\u01c5\u01ad\u0001\u0000\u0000\u0000\u01c5\u01b1\u0001\u0000"+
		"\u0000\u0000\u01c5\u01b4\u0001\u0000\u0000\u0000\u01c5\u01b7\u0001\u0000"+
		"\u0000\u0000\u01c5\u01ba\u0001\u0000\u0000\u0000\u01c5\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c89\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0003<\u001e\u0000\u01cb\u01cc\u0003\u0086C\u0000\u01cc"+
		"\u01d6\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0006\u0000\u0000\u01ce"+
		"\u01cf\u0003\b\u0004\u0000\u01cf\u01d0\u0005\u0007\u0000\u0000\u01d0\u01d1"+
		"\u0003\u0086C\u0000\u01d1\u01d6\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003"+
		"<\u001e\u0000\u01d3\u01d4\u0003\u0092I\u0000\u01d4\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d5\u01ca\u0001\u0000\u0000\u0000\u01d5\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d6;\u0001\u0000\u0000\u0000"+
		"\u01d7\u01de\u0003\u009aM\u0000\u01d8\u01de\u0003B!\u0000\u01d9\u01da"+
		"\u0005\u0006\u0000\u0000\u01da\u01db\u0003<\u001e\u0000\u01db\u01dc\u0005"+
		"\u0007\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01d7\u0001"+
		"\u0000\u0000\u0000\u01dd\u01d8\u0001\u0000\u0000\u0000\u01dd\u01d9\u0001"+
		"\u0000\u0000\u0000\u01de=\u0001\u0000\u0000\u0000\u01df\u01e0\u0007\u0001"+
		"\u0000\u0000\u01e0?\u0001\u0000\u0000\u0000\u01e1\u01e2\u0007\u0002\u0000"+
		"\u0000\u01e2A\u0001\u0000\u0000\u0000\u01e3\u01e6\u0003D\"\u0000\u01e4"+
		"\u01e7\u0003F#\u0000\u01e5\u01e7\u0003H$\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9C\u0001\u0000\u0000\u0000\u01ea\u01f1\u0003L&\u0000"+
		"\u01eb\u01f1\u0003N\'\u0000\u01ec\u01ed\u0005\u0006\u0000\u0000\u01ed"+
		"\u01ee\u0003D\"\u0000\u01ee\u01ef\u0005\u0007\u0000\u0000\u01ef\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000\u0000\u01f0\u01eb"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f1\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f9\u0003L&\u0000\u01f3\u01f9\u0003N"+
		"\'\u0000\u01f4\u01f5\u0005\u0006\u0000\u0000\u01f5\u01f6\u0003D\"\u0000"+
		"\u01f6\u01f7\u0005\u0007\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f2\u0001\u0000\u0000\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f0\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fbE\u0001\u0000\u0000\u0000\u01fc\u01fd\u0007\u0003\u0000\u0000\u01fd"+
		"\u01fe\u0003\u009aM\u0000\u01feG\u0001\u0000\u0000\u0000\u01ff\u0201\u0005"+
		"*\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005\b\u0000"+
		"\u0000\u0203\u0204\u0003J%\u0000\u0204\u0205\u0005\t\u0000\u0000\u0205"+
		"I\u0001\u0000\u0000\u0000\u0206\u020b\u0003\u009aM\u0000\u0207\u020b\u0005"+
		"\'\u0000\u0000\u0208\u020b\u0005%\u0000\u0000\u0209\u020b\u00038\u001c"+
		"\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000"+
		"\u0000\u020bK\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u001c\u0000\u0000"+
		"\u020d\u021e\u0003:\u001d\u0000\u020e\u020f\u0005\u001c\u0000\u0000\u020f"+
		"\u021e\u0003\u009aM\u0000\u0210\u0211\u0003>\u001f\u0000\u0211\u0212\u0003"+
		"8\u001c\u0000\u0212\u021e\u0001\u0000\u0000\u0000\u0213\u0214\u0005-\u0000"+
		"\u0000\u0214\u021e\u00038\u001c\u0000\u0215\u021e\u0003\u008cF\u0000\u0216"+
		"\u021e\u0003p8\u0000\u0217\u021e\u0003x<\u0000\u0218\u021e\u0003\u0096"+
		"K\u0000\u0219\u021a\u0005\u0006\u0000\u0000\u021a\u021b\u0003L&\u0000"+
		"\u021b\u021c\u0005\u0007\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000"+
		"\u021d\u020c\u0001\u0000\u0000\u0000\u021d\u020e\u0001\u0000\u0000\u0000"+
		"\u021d\u0210\u0001\u0000\u0000\u0000\u021d\u0213\u0001\u0000\u0000\u0000"+
		"\u021d\u0215\u0001\u0000\u0000\u0000\u021d\u0216\u0001\u0000\u0000\u0000"+
		"\u021d\u0217\u0001\u0000\u0000\u0000\u021d\u0218\u0001\u0000\u0000\u0000"+
		"\u021d\u0219\u0001\u0000\u0000\u0000\u021eM\u0001\u0000\u0000\u0000\u021f"+
		"\u0247\u0005\u0006\u0000\u0000\u0220\u0221\u00038\u001c\u0000\u0221\u0222"+
		"\u0003>\u001f\u0000\u0222\u0248\u0001\u0000\u0000\u0000\u0223\u0224\u0003"+
		"8\u001c\u0000\u0224\u0225\u0005.\u0000\u0000\u0225\u0226\u00038\u001c"+
		"\u0000\u0226\u0248\u0001\u0000\u0000\u0000\u0227\u0228\u00038\u001c\u0000"+
		"\u0228\u0229\u0003T*\u0000\u0229\u022a\u00038\u001c\u0000\u022a\u0248"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u00038\u001c\u0000\u022c\u022d\u0003"+
		"V+\u0000\u022d\u022e\u00038\u001c\u0000\u022e\u0248\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u00038\u001c\u0000\u0230\u0231\u00054\u0000\u0000\u0231"+
		"\u0232\u00038\u001c\u0000\u0232\u0248\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u00038\u001c\u0000\u0234\u0235\u00055\u0000\u0000\u0235\u0236\u00038"+
		"\u001c\u0000\u0236\u0248\u0001\u0000\u0000\u0000\u0237\u0238\u00038\u001c"+
		"\u0000\u0238\u0239\u00056\u0000\u0000\u0239\u023a\u00038\u001c\u0000\u023a"+
		"\u0248\u0001\u0000\u0000\u0000\u023b\u023c\u00038\u001c\u0000\u023c\u023d"+
		"\u0007\u0000\u0000\u0000\u023d\u023e\u00038\u001c\u0000\u023e\u0248\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u00038\u001c\u0000\u0240\u0241\u00059\u0000"+
		"\u0000\u0241\u0242\u00038\u001c\u0000\u0242\u0243\u0005:\u0000\u0000\u0243"+
		"\u0244\u00038\u001c\u0000\u0244\u0248\u0001\u0000\u0000\u0000\u0245\u0248"+
		"\u0003P(\u0000\u0246\u0248\u0003\b\u0004\u0000\u0247\u0220\u0001\u0000"+
		"\u0000\u0000\u0247\u0223\u0001\u0000\u0000\u0000\u0247\u0227\u0001\u0000"+
		"\u0000\u0000\u0247\u022b\u0001\u0000\u0000\u0000\u0247\u022f\u0001\u0000"+
		"\u0000\u0000\u0247\u0233\u0001\u0000\u0000\u0000\u0247\u0237\u0001\u0000"+
		"\u0000\u0000\u0247\u023b\u0001\u0000\u0000\u0000\u0247\u023f\u0001\u0000"+
		"\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0005\u0007"+
		"\u0000\u0000\u024a\u0250\u0001\u0000\u0000\u0000\u024b\u024c\u0005\u0006"+
		"\u0000\u0000\u024c\u024d\u0003N\'\u0000\u024d\u024e\u0005\u0007\u0000"+
		"\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u021f\u0001\u0000\u0000"+
		"\u0000\u024f\u024b\u0001\u0000\u0000\u0000\u0250O\u0001\u0000\u0000\u0000"+
		"\u0251\u0257\u0003R)\u0000\u0252\u0253\u0003X,\u0000\u0253\u0254\u0003"+
		"R)\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255\u0252\u0001\u0000\u0000"+
		"\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000"+
		"\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025b\u0003X,\u0000\u025b"+
		"\u025c\u00038\u001c\u0000\u025cQ\u0001\u0000\u0000\u0000\u025d\u0260\u0003"+
		"\u009aM\u0000\u025e\u0260\u0003B!\u0000\u025f\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260S\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0007\u0004\u0000\u0000\u0262U\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0007\u0002\u0000\u0000\u0264W\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0007\u0005\u0000\u0000\u0266Y\u0001\u0000\u0000\u0000\u0267\u0268\u0005"+
		"\u0018\u0000\u0000\u0268\u0269\u0003j5\u0000\u0269\u026a\u0003l6\u0000"+
		"\u026a[\u0001\u0000\u0000\u0000\u026b\u026c\u0005\"\u0000\u0000\u026c"+
		"\u026d\u0003j5\u0000\u026d\u026e\u0003l6\u0000\u026e]\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0005\u0012\u0000\u0000\u0270\u0271\u0003l6\u0000\u0271"+
		"\u0272\u0005\"\u0000\u0000\u0272\u0273\u0003j5\u0000\u0273_\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0005\u0014\u0000\u0000\u0275\u0277\u0005\u0006"+
		"\u0000\u0000\u0276\u0278\u0003b1\u0000\u0277\u0276\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027b\u0005\u0005\u0000\u0000\u027a\u027c\u0003d2\u0000\u027b\u027a"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027f\u0005\u0005\u0000\u0000\u027e\u0280"+
		"\u0003d2\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0005\u0007"+
		"\u0000\u0000\u0282\u0283\u0003l6\u0000\u0283a\u0001\u0000\u0000\u0000"+
		"\u0284\u0287\u00032\u0019\u0000\u0285\u0287\u0003d2\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0287c\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u00038\u001c\u0000\u0289\u028a\u0005\u0002"+
		"\u0000\u0000\u028a\u028c\u0001\u0000\u0000\u0000\u028b\u0288\u0001\u0000"+
		"\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0291\u00038\u001c"+
		"\u0000\u0291e\u0001\u0000\u0000\u0000\u0292\u0293\u0005\u0014\u0000\u0000"+
		"\u0293\u0295\u0005\u0006\u0000\u0000\u0294\u0296\u0003\u009cN\u0000\u0295"+
		"\u0294\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296"+
		"\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0003\u009aM\u0000\u0298\u0299"+
		"\u0005\u001a\u0000\u0000\u0299\u029a\u00038\u001c\u0000\u029a\u029b\u0005"+
		"\u0007\u0000\u0000\u029b\u029c\u0003l6\u0000\u029cg\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0005\u0014\u0000\u0000\u029e\u02a0\u0005\u0006\u0000"+
		"\u0000\u029f\u02a1\u0003\u009cN\u0000\u02a0\u029f\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0003\u009aM\u0000\u02a3\u02a4\u0005\u001d\u0000\u0000\u02a4"+
		"\u02a5\u00038\u001c\u0000\u02a5\u02a6\u0005\u0007\u0000\u0000\u02a6\u02a7"+
		"\u0003l6\u0000\u02a7i\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\u0006"+
		"\u0000\u0000\u02a9\u02aa\u00038\u001c\u0000\u02aa\u02ab\u0005\u0007\u0000"+
		"\u0000\u02abk\u0001\u0000\u0000\u0000\u02ac\u02af\u0003n7\u0000\u02ad"+
		"\u02af\u0003\u0002\u0001\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae"+
		"\u02ad\u0001\u0000\u0000\u0000\u02afm\u0001\u0000\u0000\u0000\u02b0\u02b4"+
		"\u0005\n\u0000\u0000\u02b1\u02b3\u0003\u0002\u0001\u0000\u02b2\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005"+
		"\u000b\u0000\u0000\u02b8o\u0001\u0000\u0000\u0000\u02b9\u02c6\u0005\n"+
		"\u0000\u0000\u02ba\u02bb\u0003r9\u0000\u02bb\u02bc\u0005\u0002\u0000\u0000"+
		"\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02ba\u0001\u0000\u0000\u0000"+
		"\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003r9\u0000\u02c3\u02c5"+
		"\u0005\u0002\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c7\u0001\u0000\u0000\u0000\u02c6\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005\u000b\u0000\u0000\u02c9q\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0003t:\u0000\u02cb\u02cc\u0005\u0001\u0000"+
		"\u0000\u02cc\u02cd\u00038\u001c\u0000\u02cd\u02dc\u0001\u0000\u0000\u0000"+
		"\u02ce\u02dc\u0003\u009aM\u0000\u02cf\u02dc\u0003v;\u0000\u02d0\u02d1"+
		"\u0005\b\u0000\u0000\u02d1\u02d2\u00038\u001c\u0000\u02d2\u02d3\u0005"+
		"\t\u0000\u0000\u02d3\u02d4\u0005\u0001\u0000\u0000\u02d4\u02d5\u00038"+
		"\u001c\u0000\u02d5\u02dc\u0001\u0000\u0000\u0000\u02d6\u02d9\u0005\u0004"+
		"\u0000\u0000\u02d7\u02da\u0005F\u0000\u0000\u02d8\u02da\u0003p8\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000"+
		"\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02ca\u0001\u0000\u0000\u0000"+
		"\u02db\u02ce\u0001\u0000\u0000\u0000\u02db\u02cf\u0001\u0000\u0000\u0000"+
		"\u02db\u02d0\u0001\u0000\u0000\u0000\u02db\u02d6\u0001\u0000\u0000\u0000"+
		"\u02dcs\u0001\u0000\u0000\u0000\u02dd\u02e1\u0005\'\u0000\u0000\u02de"+
		"\u02e1\u0003\u009aM\u0000\u02df\u02e1\u0003\u008eG\u0000\u02e0\u02dd\u0001"+
		"\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1u\u0001\u0000\u0000\u0000\u02e2\u02e3\u0003\u009a"+
		"M\u0000\u02e3\u02e4\u0003\u0010\b\u0000\u02e4\u02e5\u0003n7\u0000\u02e5"+
		"w\u0001\u0000\u0000\u0000\u02e6\u02f9\u0005\b\u0000\u0000\u02e7\u02e9"+
		"\u0003z=\u0000\u02e8\u02ea\u0005\u0002\u0000\u0000\u02e9\u02e8\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ed\u02e7\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f6\u0003z=\u0000\u02f3\u02f5\u0005\u0002\u0000\u0000"+
		"\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f8\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f9\u02ef\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005\t\u0000\u0000\u02fc"+
		"y\u0001\u0000\u0000\u0000\u02fd\u0300\u00038\u001c\u0000\u02fe\u0300\u0003"+
		"|>\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300{\u0001\u0000\u0000\u0000\u0301\u0304\u0005\u0004\u0000\u0000"+
		"\u0302\u0305\u0005F\u0000\u0000\u0303\u0305\u0003x<\u0000\u0304\u0302"+
		"\u0001\u0000\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305}\u0001"+
		"\u0000\u0000\u0000\u0306\u030c\u0005\n\u0000\u0000\u0307\u0308\u0003\u0080"+
		"@\u0000\u0308\u0309\u0005\u0002\u0000\u0000\u0309\u030b\u0001\u0000\u0000"+
		"\u0000\u030a\u0307\u0001\u0000\u0000\u0000\u030b\u030e\u0001\u0000\u0000"+
		"\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u030f\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000"+
		"\u0000\u030f\u0311\u0003\u0080@\u0000\u0310\u0312\u0005\u0002\u0000\u0000"+
		"\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0005\u000b\u0000\u0000"+
		"\u0314\u007f\u0001\u0000\u0000\u0000\u0315\u0316\u0003t:\u0000\u0316\u0317"+
		"\u0005\u0001\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u0315"+
		"\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0001\u0000\u0000\u0000\u031a\u031d\u0003\u009aM\u0000\u031b\u031c\u0005"+
		";\u0000\u0000\u031c\u031e\u00038\u001c\u0000\u031d\u031b\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0081\u0001\u0000\u0000"+
		"\u0000\u031f\u0325\u0005\b\u0000\u0000\u0320\u0321\u0003\u0084B\u0000"+
		"\u0321\u0322\u0005\u0002\u0000\u0000\u0322\u0324\u0001\u0000\u0000\u0000"+
		"\u0323\u0320\u0001\u0000\u0000\u0000\u0324\u0327\u0001\u0000\u0000\u0000"+
		"\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000"+
		"\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000"+
		"\u0328\u032a\u0003\u0084B\u0000\u0329\u032b\u0005\u0002\u0000\u0000\u032a"+
		"\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0001\u0000\u0000\u0000\u032c\u032d\u0005\t\u0000\u0000\u032d\u0083"+
		"\u0001\u0000\u0000\u0000\u032e\u0331\u0003\u009aM\u0000\u032f\u0330\u0005"+
		";\u0000\u0000\u0330\u0332\u00038\u001c\u0000\u0331\u032f\u0001\u0000\u0000"+
		"\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0085\u0001\u0000\u0000"+
		"\u0000\u0333\u0340\u0005\u0006\u0000\u0000\u0334\u0335\u0003\u0088D\u0000"+
		"\u0335\u0336\u0005\u0002\u0000\u0000\u0336\u0338\u0001\u0000\u0000\u0000"+
		"\u0337\u0334\u0001\u0000\u0000\u0000\u0338\u033b\u0001\u0000\u0000\u0000"+
		"\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000"+
		"\u033a\u033c\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000"+
		"\u033c\u033e\u0003\u0088D\u0000\u033d\u033f\u0005\u0002\u0000\u0000\u033e"+
		"\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f"+
		"\u0341\u0001\u0000\u0000\u0000\u0340\u0339\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0005\u0007\u0000\u0000\u0343\u0087\u0001\u0000\u0000\u0000\u0344"+
		"\u0347\u00038\u001c\u0000\u0345\u0347\u0003|>\u0000\u0346\u0344\u0001"+
		"\u0000\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347\u0089\u0001"+
		"\u0000\u0000\u0000\u0348\u034e\u0003\u008cF\u0000\u0349\u034e\u0003p8"+
		"\u0000\u034a\u034e\u0003x<\u0000\u034b\u034e\u0003\b\u0004\u0000\u034c"+
		"\u034e\u0003\u0096K\u0000\u034d\u0348\u0001\u0000\u0000\u0000\u034d\u0349"+
		"\u0001\u0000\u0000\u0000\u034d\u034a\u0001\u0000\u0000\u0000\u034d\u034b"+
		"\u0001\u0000\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034e\u008b"+
		"\u0001\u0000\u0000\u0000\u034f\u0355\u0003\u008eG\u0000\u0350\u0355\u0003"+
		"\u0090H\u0000\u0351\u0355\u0005$\u0000\u0000\u0352\u0355\u0005(\u0000"+
		"\u0000\u0353\u0355\u0005)\u0000\u0000\u0354\u034f\u0001\u0000\u0000\u0000"+
		"\u0354\u0350\u0001\u0000\u0000\u0000\u0354\u0351\u0001\u0000\u0000\u0000"+
		"\u0354\u0352\u0001\u0000\u0000\u0000\u0354\u0353\u0001\u0000\u0000\u0000"+
		"\u0355\u008d\u0001\u0000\u0000\u0000\u0356\u0357\u0007\u0006\u0000\u0000"+
		"\u0357\u008f\u0001\u0000\u0000\u0000\u0358\u035b\u0005\'\u0000\u0000\u0359"+
		"\u035b\u0003\u0092I\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u0359"+
		"\u0001\u0000\u0000\u0000\u035b\u0091\u0001\u0000\u0000\u0000\u035c\u0360"+
		"\u0005\f\u0000\u0000\u035d\u035f\u0003\u0094J\u0000\u035e\u035d\u0001"+
		"\u0000\u0000\u0000\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001"+
		"\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0363\u0001"+
		"\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0364\u0005"+
		"K\u0000\u0000\u0364\u0093\u0001\u0000\u0000\u0000\u0365\u036b\u0005L\u0000"+
		"\u0000\u0366\u0367\u0005M\u0000\u0000\u0367\u0368\u00038\u001c\u0000\u0368"+
		"\u0369\u0005N\u0000\u0000\u0369\u036b\u0001\u0000\u0000\u0000\u036a\u0365"+
		"\u0001\u0000\u0000\u0000\u036a\u0366\u0001\u0000\u0000\u0000\u036b\u0095"+
		"\u0001\u0000\u0000\u0000\u036c\u0370\u0005F\u0000\u0000\u036d\u0370\u0005"+
		" \u0000\u0000\u036e\u0370\u0003\u0098L\u0000\u036f\u036c\u0001\u0000\u0000"+
		"\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0097\u0001\u0000\u0000\u0000\u0371\u0372\u0007\u0007\u0000"+
		"\u0000\u0372\u0099\u0001\u0000\u0000\u0000\u0373\u0376\u0005F\u0000\u0000"+
		"\u0374\u0376\u0003\u0098L\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375"+
		"\u0374\u0001\u0000\u0000\u0000\u0376\u009b\u0001\u0000\u0000\u0000\u0377"+
		"\u0378\u0007\b\u0000\u0000\u0378\u009d\u0001\u0000\u0000\u0000\u0379\u037a"+
		"\u0005\u0005\u0000\u0000\u037a\u009f\u0001\u0000\u0000\u0000Y\u00a3\u00b2"+
		"\u00b6\u00ba\u00bf\u00c3\u00c8\u00d9\u00de\u00e0\u00e7\u00eb\u00f5\u00f9"+
		"\u010b\u0115\u011a\u011e\u0125\u0133\u0137\u0140\u0145\u0149\u0152\u0160"+
		"\u0165\u0169\u016d\u0175\u017d\u0184\u018d\u01a4\u01c5\u01c7\u01d5\u01dd"+
		"\u01e6\u01e8\u01f0\u01f8\u01fa\u0200\u020a\u021d\u0247\u024f\u0257\u025f"+
		"\u0277\u027b\u027f\u0286\u028d\u0295\u02a0\u02ae\u02b4\u02bf\u02c4\u02c6"+
		"\u02d9\u02db\u02e0\u02eb\u02ef\u02f6\u02f9\u02ff\u0304\u030c\u0311\u0318"+
		"\u031d\u0325\u032a\u0331\u0339\u033e\u0340\u0346\u034d\u0354\u035a\u0360"+
		"\u036a\u036f\u0375";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}