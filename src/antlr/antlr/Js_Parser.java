// Generated from C:/Files/Java/r_compiler/src/antlr/Js_Parser.g4 by ANTLR 4.13.1
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
public class Js_Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COMMA=2, COLON=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, OPEN_SQUARE_BRACKET=6, 
		CLOSE_SQUARE_BRACKET=7, OPEN_CURLY_BRACES=8, CLOSE_CURLY_BRACES=9, DOT=10, 
		CONTINUE=11, DO=12, FOR=13, FUNCTION=14, IF=15, IN=16, NEW=17, OF=18, 
		RETURN=19, WHILE=20, DECLARERS=21, ID=22, PRIM_TYPE=23, MULTILINE_COMMENT=24, 
		LINE_COMMENT=25, INT=26, FLOAT=27, NUM=28, STRING=29, BOOL=30, NULL=31, 
		UNDEFINED=32, INCREMENT_OP=33, DECREMENT_OP=34, LOGIC_NOT_OP=35, POW_OP=36, 
		MULT_OP=37, DIV_OP=38, REM_OP=39, ADD_OP=40, SUP_OP=41, COMPARE_OP=42, 
		EQUAL_COMPARE_OP=43, AND=44, OR=45, NULL_COALES_OP=46, TERNARY_OP1=47, 
		TERNARY_OP2=48, ASSIGNMENT_OP=49, ADD_ASSIGN_OP=50, SUB_ASSIGN_OP=51, 
		MULT_ASSIGN_OP=52, POW_ASSIGN_OP=53, DIV_ASSIGN_OP=54, REM_ASSIGN_OP=55, 
		AND_ASSIGN_OP=56, OR_ASSIGN_OP=57, NULL_ASSIGN_OP=58, ARROW=59, REST_OP=60, 
		SPREAD_OP=61, NEWLINE=62, WS=63;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_specialLine = 2, RULE_return = 3, 
		RULE_function = 4, RULE_arrowFunction = 5, RULE_normalFunction = 6, RULE_args = 7, 
		RULE_statement = 8, RULE_declare = 9, RULE_assignmentRightHand = 10, RULE_expression = 11, 
		RULE_functionCall = 12, RULE_incrementsOp = 13, RULE_assignment = 14, 
		RULE_multiplicativeOp = 15, RULE_additiveOp = 16, RULE_assinmentOp = 17, 
		RULE_if = 18, RULE_while = 19, RULE_doWhile = 20, RULE_for = 21, RULE_forExpression1 = 22, 
		RULE_expressionList = 23, RULE_forin = 24, RULE_forof = 25, RULE_scopeHead = 26, 
		RULE_scopeBody = 27, RULE_block = 28, RULE_object = 29, RULE_classFunction = 30, 
		RULE_array = 31, RULE_param = 32, RULE_paramSpreadable = 33, RULE_paramInput = 34, 
		RULE_returnable = 35, RULE_noUseStatement = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "specialLine", "return", "function", "arrowFunction", 
			"normalFunction", "args", "statement", "declare", "assignmentRightHand", 
			"expression", "functionCall", "incrementsOp", "assignment", "multiplicativeOp", 
			"additiveOp", "assinmentOp", "if", "while", "doWhile", "for", "forExpression1", 
			"expressionList", "forin", "forof", "scopeHead", "scopeBody", "block", 
			"object", "classFunction", "array", "param", "paramSpreadable", "paramInput", 
			"returnable", "noUseStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'.'", "'continue'", "'do'", "'for'", "'function'", "'if'", "'in'", "'new'", 
			"'of'", "'return'", "'while'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'undefined'", null, null, "'!'", "'**'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", null, null, "'&&'", "'||'", "'??'", 
			"'?'", null, "'='", null, null, null, null, null, null, null, null, null, 
			"'=>'", null, "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "COMMA", "COLON", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", "CLOSE_CURLY_BRACES", 
			"DOT", "CONTINUE", "DO", "FOR", "FUNCTION", "IF", "IN", "NEW", "OF", 
			"RETURN", "WHILE", "DECLARERS", "ID", "PRIM_TYPE", "MULTILINE_COMMENT", 
			"LINE_COMMENT", "INT", "FLOAT", "NUM", "STRING", "BOOL", "NULL", "UNDEFINED", 
			"INCREMENT_OP", "DECREMENT_OP", "LOGIC_NOT_OP", "POW_OP", "MULT_OP", 
			"DIV_OP", "REM_OP", "ADD_OP", "SUP_OP", "COMPARE_OP", "EQUAL_COMPARE_OP", 
			"AND", "OR", "NULL_COALES_OP", "TERNARY_OP1", "TERNARY_OP2", "ASSIGNMENT_OP", 
			"ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", 
			"DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", 
			"ARROW", "REST_OP", "SPREAD_OP", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Js_Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Js_Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Js_Parser.EOF, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60145989970L) != 0)) {
				{
				{
				setState(74);
				line();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				forin();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				forof();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				doWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
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
		public TerminalNode CONTINUE() { return getToken(Js_Parser.CONTINUE, 0); }
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public SpecialLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterSpecialLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitSpecialLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitSpecialLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialLineContext specialLine() throws RecognitionException {
		SpecialLineContext _localctx = new SpecialLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_specialLine);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
		public TerminalNode RETURN() { return getToken(Js_Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(RETURN);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(99);
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				arrowFunction();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(Js_Parser.ARROW, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(106);
				args();
				}
				break;
			case ID:
				{
				setState(107);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			match(ARROW);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111);
				block();
				}
				break;
			case 2:
				{
				setState(112);
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
		public TerminalNode FUNCTION() { return getToken(Js_Parser.FUNCTION, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(FUNCTION);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(116);
				match(ID);
				}
			}

			setState(119);
			args();
			setState(120);
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
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public TerminalNode REST_OP() { return getToken(Js_Parser.REST_OP, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(OPEN_BRACKET);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==REST_OP) {
				{
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						match(ID);
						setState(124);
						match(COMMA);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REST_OP) {
					{
					setState(130);
					match(REST_OP);
					}
				}

				setState(133);
				match(ID);
				}
			}

			setState(136);
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
	public static class NoUseContext extends StatementContext {
		public NoUseStatementContext noUseStatement() {
			return getRuleContext(NoUseStatementContext.class,0);
		}
		public NoUseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNoUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNoUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNoUse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NormalExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNormalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNormalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNormalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends StatementContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public VariableDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				declare();
				}
				break;
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case FUNCTION:
			case NEW:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
				_localctx = new NormalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				expression(0);
				}
				break;
			case SEMICOLON:
				_localctx = new NoUseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
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
	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode DECLARERS() { return getToken(Js_Parser.DECLARERS, 0); }
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public List<AssignmentRightHandContext> assignmentRightHand() {
			return getRuleContexts(AssignmentRightHandContext.class);
		}
		public AssignmentRightHandContext assignmentRightHand(int i) {
			return getRuleContext(AssignmentRightHandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(DECLARERS);
			setState(144);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(145);
				assignmentRightHand();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(148);
				match(COMMA);
				setState(149);
				match(ID);
				setState(150);
				assignmentRightHand();
				}
				}
				setState(155);
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
		public List<TerminalNode> ASSIGNMENT_OP() { return getTokens(Js_Parser.ASSIGNMENT_OP); }
		public TerminalNode ASSIGNMENT_OP(int i) {
			return getToken(Js_Parser.ASSIGNMENT_OP, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public AssignmentRightHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentRightHand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssignmentRightHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssignmentRightHand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssignmentRightHand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentRightHandContext assignmentRightHand() throws RecognitionException {
		AssignmentRightHandContext _localctx = new AssignmentRightHandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignmentRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					match(ASSIGNMENT_OP);
					setState(157);
					match(ID);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(163);
			match(ASSIGNMENT_OP);
			setState(164);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Js_Parser.NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalNOTContext extends ExpressionContext {
		public TerminalNode LOGIC_NOT_OP() { return getToken(Js_Parser.LOGIC_NOT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalNOTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLogicalNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLogicalNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLogicalNOT(this);
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
		public TerminalNode COMPARE_OP() { return getToken(Js_Parser.COMPARE_OP, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitCompare(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberGetSqBContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Js_Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Js_Parser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode NUM() { return getToken(Js_Parser.NUM, 0); }
		public TerminalNode STRING() { return getToken(Js_Parser.STRING, 0); }
		public MemberGetSqBContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterMemberGetSqB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitMemberGetSqB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitMemberGetSqB(this);
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
		public TerminalNode AND() { return getToken(Js_Parser.AND, 0); }
		public LogicalANDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLogicalAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLogicalAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLogicalAND(this);
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
		public TerminalNode OR() { return getToken(Js_Parser.OR, 0); }
		public TerminalNode NULL_COALES_OP() { return getToken(Js_Parser.NULL_COALES_OP, 0); }
		public LogicalOR_logicalNullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLogicalOR_logicalNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLogicalOR_logicalNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLogicalOR_logicalNull(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterPreInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitPreInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitPreInc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewNoParamContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Js_Parser.NEW, 0); }
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public NewNoParamContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNewNoParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNewNoParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNewNoParam(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterByVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitByVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitByVal(this);
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
		public TerminalNode POW_OP() { return getToken(Js_Parser.POW_OP, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitPow(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitFuncCall(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterPostIncre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitPostIncre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitPostIncre(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberGetContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Js_Parser.DOT, 0); }
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public MemberGetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterMemberGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitMemberGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitMemberGet(this);
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
		public TerminalNode TERNARY_OP1() { return getToken(Js_Parser.TERNARY_OP1, 0); }
		public TerminalNode TERNARY_OP2() { return getToken(Js_Parser.TERNARY_OP2, 0); }
		public TernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitTernary(this);
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
		public TerminalNode EQUAL_COMPARE_OP() { return getToken(Js_Parser.EQUAL_COMPARE_OP, 0); }
		public CompareWithEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterCompareWithEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitCompareWithEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitCompareWithEqual(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssign(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				match(OPEN_BRACKET);
				setState(168);
				expression(0);
				setState(169);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(NEW);
				setState(173);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new NewNoParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(NEW);
				setState(175);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				incrementsOp();
				setState(177);
				expression(12);
				}
				break;
			case 6:
				{
				_localctx = new LogicalNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(LOGIC_NOT_OP);
				setState(180);
				expression(11);
				}
				break;
			case 7:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				assignment();
				}
				break;
			case 8:
				{
				_localctx = new ByValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				returnable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						match(POW_OP);
						setState(187);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(189);
						multiplicativeOp();
						setState(190);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(193);
						additiveOp();
						setState(194);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(197);
						match(COMPARE_OP);
						setState(198);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new CompareWithEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						match(EQUAL_COMPARE_OP);
						setState(201);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(203);
						match(AND);
						setState(204);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOR_logicalNullContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==NULL_COALES_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new TernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						match(TERNARY_OP1);
						setState(210);
						expression(0);
						setState(211);
						match(TERNARY_OP2);
						setState(212);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new MemberGetContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(215);
						match(DOT);
						setState(216);
						match(ID);
						}
						break;
					case 10:
						{
						_localctx = new MemberGetSqBContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(218);
						match(OPEN_SQUARE_BRACKET);
						setState(219);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						match(CLOSE_SQUARE_BRACKET);
						}
						break;
					case 11:
						{
						_localctx = new PostIncreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(222);
						incrementsOp();
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ByIIFEContext extends FunctionCallContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ByIIFEContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterByIIFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitByIIFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitByIIFE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByNameContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ByNameContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitByName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ByNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(ID);
				setState(229);
				param();
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ByIIFEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(OPEN_BRACKET);
				setState(231);
				function();
				setState(232);
				match(CLOSE_BRACKET);
				setState(233);
				param();
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
	public static class IncrementsOpContext extends ParserRuleContext {
		public TerminalNode INCREMENT_OP() { return getToken(Js_Parser.INCREMENT_OP, 0); }
		public TerminalNode DECREMENT_OP() { return getToken(Js_Parser.DECREMENT_OP, 0); }
		public IncrementsOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementsOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterIncrementsOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitIncrementsOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitIncrementsOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementsOpContext incrementsOp() throws RecognitionException {
		IncrementsOpContext _localctx = new IncrementsOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incrementsOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(240);
					assinmentOp();
					setState(241);
					match(ID);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(248);
			assinmentOp();
			setState(249);
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
	public static class MultiplicativeOpContext extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(Js_Parser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(Js_Parser.DIV_OP, 0); }
		public TerminalNode REM_OP() { return getToken(Js_Parser.REM_OP, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitMultiplicativeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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
		public TerminalNode ADD_OP() { return getToken(Js_Parser.ADD_OP, 0); }
		public TerminalNode SUP_OP() { return getToken(Js_Parser.SUP_OP, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAdditiveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		public TerminalNode ASSIGNMENT_OP() { return getToken(Js_Parser.ASSIGNMENT_OP, 0); }
		public TerminalNode ADD_ASSIGN_OP() { return getToken(Js_Parser.ADD_ASSIGN_OP, 0); }
		public TerminalNode SUB_ASSIGN_OP() { return getToken(Js_Parser.SUB_ASSIGN_OP, 0); }
		public TerminalNode MULT_ASSIGN_OP() { return getToken(Js_Parser.MULT_ASSIGN_OP, 0); }
		public TerminalNode POW_ASSIGN_OP() { return getToken(Js_Parser.POW_ASSIGN_OP, 0); }
		public TerminalNode DIV_ASSIGN_OP() { return getToken(Js_Parser.DIV_ASSIGN_OP, 0); }
		public TerminalNode REM_ASSIGN_OP() { return getToken(Js_Parser.REM_ASSIGN_OP, 0); }
		public TerminalNode AND_ASSIGN_OP() { return getToken(Js_Parser.AND_ASSIGN_OP, 0); }
		public TerminalNode OR_ASSIGN_OP() { return getToken(Js_Parser.OR_ASSIGN_OP, 0); }
		public TerminalNode NULL_ASSIGN_OP() { return getToken(Js_Parser.NULL_ASSIGN_OP, 0); }
		public AssinmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssinmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssinmentOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssinmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssinmentOpContext assinmentOp() throws RecognitionException {
		AssinmentOpContext _localctx = new AssinmentOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assinmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 575897802350002176L) != 0)) ) {
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
		public TerminalNode IF() { return getToken(Js_Parser.IF, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IF);
			setState(258);
			scopeHead();
			setState(259);
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
		public TerminalNode WHILE() { return getToken(Js_Parser.WHILE, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(WHILE);
			setState(262);
			scopeHead();
			setState(263);
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
		public TerminalNode DO() { return getToken(Js_Parser.DO, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Js_Parser.WHILE, 0); }
		public ScopeHeadContext scopeHead() {
			return getRuleContext(ScopeHeadContext.class,0);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(DO);
			setState(266);
			scopeBody();
			setState(267);
			match(WHILE);
			setState(268);
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
		public TerminalNode FOR() { return getToken(Js_Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(Js_Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Js_Parser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(FOR);
			setState(271);
			match(OPEN_BRACKET);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60144370000L) != 0)) {
				{
				setState(272);
				forExpression1();
				}
			}

			setState(275);
			match(SEMICOLON);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60142272848L) != 0)) {
				{
				setState(276);
				expressionList();
				}
			}

			setState(279);
			match(SEMICOLON);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60142272848L) != 0)) {
				{
				setState(280);
				expressionList();
				}
			}

			setState(283);
			match(CLOSE_BRACKET);
			setState(284);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterForExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitForExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitForExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpression1Context forExpression1() throws RecognitionException {
		ForExpression1Context _localctx = new ForExpression1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_forExpression1);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				declare();
				}
				break;
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case FUNCTION:
			case NEW:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					expression(0);
					setState(291);
					match(COMMA);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(298);
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
		public TerminalNode FOR() { return getToken(Js_Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public TerminalNode IN() { return getToken(Js_Parser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public TerminalNode DECLARERS() { return getToken(Js_Parser.DECLARERS, 0); }
		public ForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterForin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitForin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitForin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinContext forin() throws RecognitionException {
		ForinContext _localctx = new ForinContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(FOR);
			setState(301);
			match(OPEN_BRACKET);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(302);
				match(DECLARERS);
				}
			}

			setState(305);
			match(ID);
			setState(306);
			match(IN);
			setState(307);
			expression(0);
			setState(308);
			match(CLOSE_BRACKET);
			setState(309);
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
		public TerminalNode FOR() { return getToken(Js_Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public TerminalNode OF() { return getToken(Js_Parser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public TerminalNode DECLARERS() { return getToken(Js_Parser.DECLARERS, 0); }
		public ForofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterForof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitForof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitForof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForofContext forof() throws RecognitionException {
		ForofContext _localctx = new ForofContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FOR);
			setState(312);
			match(OPEN_BRACKET);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(313);
				match(DECLARERS);
				}
			}

			setState(316);
			match(ID);
			setState(317);
			match(OF);
			setState(318);
			expression(0);
			setState(319);
			match(CLOSE_BRACKET);
			setState(320);
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
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public ScopeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterScopeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitScopeHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitScopeHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeHeadContext scopeHead() throws RecognitionException {
		ScopeHeadContext _localctx = new ScopeHeadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_scopeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(OPEN_BRACKET);
			setState(323);
			expression(0);
			setState(324);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterScopeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitScopeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitScopeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeBodyContext scopeBody() throws RecognitionException {
		ScopeBodyContext _localctx = new ScopeBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_scopeBody);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Js_Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Js_Parser.CLOSE_CURLY_BRACES, 0); }
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(OPEN_CURLY_BRACES);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60145989970L) != 0)) {
				{
				{
				setState(331);
				line();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
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
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Js_Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Js_Parser.CLOSE_CURLY_BRACES, 0); }
		public List<TerminalNode> STRING() { return getTokens(Js_Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Js_Parser.STRING, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Js_Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Js_Parser.COLON, i);
		}
		public List<ReturnableContext> returnable() {
			return getRuleContexts(ReturnableContext.class);
		}
		public ReturnableContext returnable(int i) {
			return getRuleContext(ReturnableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public List<ClassFunctionContext> classFunction() {
			return getRuleContexts(ClassFunctionContext.class);
		}
		public ClassFunctionContext classFunction(int i) {
			return getRuleContext(ClassFunctionContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_object);
		int _la;
		try {
			int _alt;
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(OPEN_CURLY_BRACES);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(340);
							match(STRING);
							setState(341);
							match(COLON);
							setState(342);
							returnable();
							setState(343);
							match(COMMA);
							}
							} 
						}
						setState(349);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(350);
					match(STRING);
					setState(351);
					match(COLON);
					setState(352);
					returnable();
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(353);
						match(COMMA);
						}
					}

					}
				}

				setState(358);
				match(CLOSE_CURLY_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(OPEN_CURLY_BRACES);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(360);
							match(ID);
							setState(361);
							match(COLON);
							setState(362);
							returnable();
							setState(363);
							match(COMMA);
							}
							} 
						}
						setState(369);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					setState(370);
					match(ID);
					setState(371);
					match(COLON);
					setState(372);
					returnable();
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(373);
						match(COMMA);
						}
					}

					}
				}

				setState(378);
				match(CLOSE_CURLY_BRACES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(OPEN_CURLY_BRACES);
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380);
						match(ID);
						setState(381);
						match(COMMA);
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(387);
				match(ID);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(388);
					match(COMMA);
					}
				}

				setState(391);
				match(CLOSE_CURLY_BRACES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				match(OPEN_CURLY_BRACES);
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						classFunction();
						setState(394);
						match(COMMA);
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(401);
				classFunction();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(402);
					match(COMMA);
					}
				}

				setState(405);
				match(CLOSE_CURLY_BRACES);
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
	public static class ClassFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterClassFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitClassFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitClassFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFunctionContext classFunction() throws RecognitionException {
		ClassFunctionContext _localctx = new ClassFunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(ID);
			setState(410);
			args();
			setState(411);
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
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(Js_Parser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(Js_Parser.CLOSE_SQUARE_BRACKET, 0); }
		public List<ReturnableContext> returnable() {
			return getRuleContexts(ReturnableContext.class);
		}
		public ReturnableContext returnable(int i) {
			return getRuleContext(ReturnableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(OPEN_SQUARE_BRACKET);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12599632L) != 0)) {
				{
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						returnable();
						setState(415);
						match(COMMA);
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(422);
				returnable();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(423);
					match(COMMA);
					}
				}

				}
			}

			setState(428);
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(Js_Parser.CLOSE_BRACKET, 0); }
		public List<ParamInputContext> paramInput() {
			return getRuleContexts(ParamInputContext.class);
		}
		public ParamInputContext paramInput(int i) {
			return getRuleContext(ParamInputContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(OPEN_BRACKET);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009226293584L) != 0)) {
				{
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(431);
						paramInput();
						setState(432);
						match(COMMA);
						}
						} 
					}
					setState(438);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				{
				setState(439);
				paramInput();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(440);
					match(COMMA);
					}
				}

				}
				}
			}

			setState(445);
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
	public static class ParamSpreadableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ParamSpreadableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSpreadable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterParamSpreadable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitParamSpreadable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitParamSpreadable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSpreadableContext paramSpreadable() throws RecognitionException {
		ParamSpreadableContext _localctx = new ParamSpreadableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_paramSpreadable);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(ID);
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				array();
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
	public static class ParamInputContext extends ParserRuleContext {
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public TerminalNode SPREAD_OP() { return getToken(Js_Parser.SPREAD_OP, 0); }
		public ParamSpreadableContext paramSpreadable() {
			return getRuleContext(ParamSpreadableContext.class,0);
		}
		public ParamInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterParamInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitParamInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitParamInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamInputContext paramInput() throws RecognitionException {
		ParamInputContext _localctx = new ParamInputContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_paramInput);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case FUNCTION:
			case ID:
			case PRIM_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				returnable();
				}
				break;
			case SPREAD_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(SPREAD_OP);
				setState(453);
				paramSpreadable();
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterFunctionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitFunctionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitFunctionVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveContext extends ReturnableContext {
		public TerminalNode PRIM_TYPE() { return getToken(Js_Parser.PRIM_TYPE, 0); }
		public PrimitiveContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitPrimitive(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterObjectVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitObjectVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitObjectVal(this);
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
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterArrayVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitArrayVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitArrayVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ReturnableContext {
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public VariableContext(ReturnableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnableContext returnable() throws RecognitionException {
		ReturnableContext _localctx = new ReturnableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_returnable);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new PrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(PRIM_TYPE);
				}
				break;
			case 2:
				_localctx = new ObjectValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				object();
				}
				break;
			case 3:
				_localctx = new ArrayValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				array();
				}
				break;
			case 4:
				_localctx = new FunctionValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				function();
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				match(ID);
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
	public static class NoUseStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Js_Parser.SEMICOLON, 0); }
		public NoUseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noUseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterNoUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitNoUseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitNoUseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoUseStatementContext noUseStatement() throws RecognitionException {
		NoUseStatementContext _localctx = new NoUseStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_noUseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		case 11:
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
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u01d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"a\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005r\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007~\b\u0007\n\u0007\f\u0007"+
		"\u0081\t\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\u0007\u0003"+
		"\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u008e\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0093\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u0098\b\t\n\t\f\t\u009b\t\t\u0001\n\u0001\n\u0005\n\u009f"+
		"\b\n\n\n\f\n\u00a2\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00e0\b\u000b\n\u000b\f\u000b\u00e3\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ec\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f4\b\u000e\n\u000e\f\u000e\u00f7\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0112"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0116\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u011a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0121\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0126\b\u0017\n\u0017\f\u0017\u0129\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0130"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u013b\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0149\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u014d\b\u001c"+
		"\n\u001c\f\u001c\u0150\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u015a"+
		"\b\u001d\n\u001d\f\u001d\u015d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0163\b\u001d\u0003\u001d\u0165\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u016e\b\u001d\n\u001d\f\u001d\u0171\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0177\b\u001d\u0003\u001d"+
		"\u0179\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u017f\b\u001d\n\u001d\f\u001d\u0182\t\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0186\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u018d\b\u001d\n\u001d\f\u001d\u0190\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0194\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0198\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a2\b\u001f\n\u001f"+
		"\f\u001f\u01a5\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a9\b\u001f"+
		"\u0003\u001f\u01ab\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01b3\b \n \f \u01b6\t \u0001 \u0001 \u0003 \u01ba\b "+
		"\u0003 \u01bc\b \u0001 \u0001 \u0001!\u0001!\u0003!\u01c2\b!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01c7\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u01ce\b#\u0001$\u0001$\u0001$\u0000\u0001\u0016%\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFH\u0000\u0006\u0001\u0000-.\u0001\u0000\u001c\u001d\u0001"+
		"\u0000!\"\u0001\u0000%\'\u0001\u0000()\u0001\u00001:\u01fa\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004`\u0001\u0000"+
		"\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000"+
		"\nl\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000ez\u0001\u0000"+
		"\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000"+
		"\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000"+
		"\u0000\u0000\u0018\u00eb\u0001\u0000\u0000\u0000\u001a\u00ed\u0001\u0000"+
		"\u0000\u0000\u001c\u00ef\u0001\u0000\u0000\u0000\u001e\u00fb\u0001\u0000"+
		"\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u00ff\u0001\u0000\u0000"+
		"\u0000$\u0101\u0001\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000("+
		"\u0109\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000\u0000,\u0120\u0001"+
		"\u0000\u0000\u0000.\u0127\u0001\u0000\u0000\u00000\u012c\u0001\u0000\u0000"+
		"\u00002\u0137\u0001\u0000\u0000\u00004\u0142\u0001\u0000\u0000\u00006"+
		"\u0148\u0001\u0000\u0000\u00008\u014a\u0001\u0000\u0000\u0000:\u0197\u0001"+
		"\u0000\u0000\u0000<\u0199\u0001\u0000\u0000\u0000>\u019d\u0001\u0000\u0000"+
		"\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01c1\u0001\u0000\u0000\u0000D"+
		"\u01c6\u0001\u0000\u0000\u0000F\u01cd\u0001\u0000\u0000\u0000H\u01cf\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000"+
		"\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000R]\u0003\b\u0004\u0000S]\u0003"+
		"\u0010\b\u0000T]\u0003$\u0012\u0000U]\u0003&\u0013\u0000V]\u0003*\u0015"+
		"\u0000W]\u00030\u0018\u0000X]\u00032\u0019\u0000Y]\u0003(\u0014\u0000"+
		"Z]\u00038\u001c\u0000[]\u0003\u0004\u0002\u0000\\R\u0001\u0000\u0000\u0000"+
		"\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000\\U\u0001\u0000"+
		"\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\X"+
		"\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^a\u0005"+
		"\u000b\u0000\u0000_a\u0003\u0006\u0003\u0000`^\u0001\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bd\u0005\u0013"+
		"\u0000\u0000ce\u0003\u0016\u000b\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fi\u0003\n\u0005\u0000"+
		"gi\u0003\f\u0006\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"i\t\u0001\u0000\u0000\u0000jm\u0003\u000e\u0007\u0000km\u0005\u0016\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000nq\u0005;\u0000\u0000or\u00038\u001c\u0000pr\u0003\u0016\u000b"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u000b\u0001"+
		"\u0000\u0000\u0000su\u0005\u000e\u0000\u0000tv\u0005\u0016\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0003\u000e\u0007\u0000xy\u00038\u001c\u0000y\r\u0001\u0000\u0000"+
		"\u0000z\u0086\u0005\u0004\u0000\u0000{|\u0005\u0016\u0000\u0000|~\u0005"+
		"\u0002\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0005<\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0005\u0016\u0000\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0005\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a"+
		"\u008e\u0003\u0012\t\u0000\u008b\u008e\u0003\u0016\u000b\u0000\u008c\u008e"+
		"\u0003H$\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0011\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0015\u0000\u0000\u0090\u0092\u0005\u0016"+
		"\u0000\u0000\u0091\u0093\u0003\u0014\n\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0099\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0005\u0016\u0000"+
		"\u0000\u0096\u0098\u0003\u0014\n\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0013\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u00051\u0000\u0000\u009d"+
		"\u009f\u0005\u0016\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u00051\u0000\u0000\u00a4\u00a5"+
		"\u0003\u0016\u000b\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0006\u000b\uffff\uffff\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8"+
		"\u00a9\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ab\u00b8\u0003\u0018\f\u0000\u00ac\u00ad"+
		"\u0005\u0011\u0000\u0000\u00ad\u00b8\u0003\u0018\f\u0000\u00ae\u00af\u0005"+
		"\u0011\u0000\u0000\u00af\u00b8\u0005\u0016\u0000\u0000\u00b0\u00b1\u0003"+
		"\u001a\r\u0000\u00b1\u00b2\u0003\u0016\u000b\f\u00b2\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005#\u0000\u0000\u00b4\u00b8\u0003\u0016\u000b"+
		"\u000b\u00b5\u00b8\u0003\u001c\u000e\u0000\u00b6\u00b8\u0003F#\u0000\u00b7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b7\u00ab\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00e1\u0001\u0000\u0000\u0000\u00b9\u00ba\n\n\u0000\u0000\u00ba\u00bb"+
		"\u0005$\u0000\u0000\u00bb\u00e0\u0003\u0016\u000b\u000b\u00bc\u00bd\n"+
		"\t\u0000\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0003\u0016"+
		"\u000b\n\u00bf\u00e0\u0001\u0000\u0000\u0000\u00c0\u00c1\n\b\u0000\u0000"+
		"\u00c1\u00c2\u0003 \u0010\u0000\u00c2\u00c3\u0003\u0016\u000b\t\u00c3"+
		"\u00e0\u0001\u0000\u0000\u0000\u00c4\u00c5\n\u0007\u0000\u0000\u00c5\u00c6"+
		"\u0005*\u0000\u0000\u00c6\u00e0\u0003\u0016\u000b\b\u00c7\u00c8\n\u0006"+
		"\u0000\u0000\u00c8\u00c9\u0005+\u0000\u0000\u00c9\u00e0\u0003\u0016\u000b"+
		"\u0007\u00ca\u00cb\n\u0005\u0000\u0000\u00cb\u00cc\u0005,\u0000\u0000"+
		"\u00cc\u00e0\u0003\u0016\u000b\u0006\u00cd\u00ce\n\u0004\u0000\u0000\u00ce"+
		"\u00cf\u0007\u0000\u0000\u0000\u00cf\u00e0\u0003\u0016\u000b\u0005\u00d0"+
		"\u00d1\n\u0003\u0000\u0000\u00d1\u00d2\u0005/\u0000\u0000\u00d2\u00d3"+
		"\u0003\u0016\u000b\u0000\u00d3\u00d4\u00050\u0000\u0000\u00d4\u00d5\u0003"+
		"\u0016\u000b\u0004\u00d5\u00e0\u0001\u0000\u0000\u0000\u00d6\u00d7\n\u0012"+
		"\u0000\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00e0\u0005\u0016\u0000"+
		"\u0000\u00d9\u00da\n\u0011\u0000\u0000\u00da\u00db\u0005\u0006\u0000\u0000"+
		"\u00db\u00dc\u0007\u0001\u0000\u0000\u00dc\u00e0\u0005\u0007\u0000\u0000"+
		"\u00dd\u00de\n\r\u0000\u0000\u00de\u00e0\u0003\u001a\r\u0000\u00df\u00b9"+
		"\u0001\u0000\u0000\u0000\u00df\u00bc\u0001\u0000\u0000\u0000\u00df\u00c0"+
		"\u0001\u0000\u0000\u0000\u00df\u00c4\u0001\u0000\u0000\u0000\u00df\u00c7"+
		"\u0001\u0000\u0000\u0000\u00df\u00ca\u0001\u0000\u0000\u0000\u00df\u00cd"+
		"\u0001\u0000\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d6"+
		"\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u0017"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0016\u0000\u0000\u00e5\u00ec\u0003@ \u0000\u00e6\u00e7\u0005\u0004"+
		"\u0000\u0000\u00e7\u00e8\u0003\b\u0004\u0000\u00e8\u00e9\u0005\u0005\u0000"+
		"\u0000\u00e9\u00ea\u0003@ \u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00ec"+
		"\u0019\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0002\u0000\u0000\u00ee"+
		"\u001b\u0001\u0000\u0000\u0000\u00ef\u00f5\u0005\u0016\u0000\u0000\u00f0"+
		"\u00f1\u0003\"\u0011\u0000\u00f1\u00f2\u0005\u0016\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003\"\u0011\u0000\u00f9\u00fa\u0003"+
		"\u0016\u000b\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007"+
		"\u0003\u0000\u0000\u00fc\u001f\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007"+
		"\u0004\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0005"+
		"\u0000\u0000\u0100#\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u000f\u0000"+
		"\u0000\u0102\u0103\u00034\u001a\u0000\u0103\u0104\u00036\u001b\u0000\u0104"+
		"%\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u0107"+
		"\u00034\u001a\u0000\u0107\u0108\u00036\u001b\u0000\u0108\'\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\f\u0000\u0000\u010a\u010b\u00036\u001b"+
		"\u0000\u010b\u010c\u0005\u0014\u0000\u0000\u010c\u010d\u00034\u001a\u0000"+
		"\u010d)\u0001\u0000\u0000\u0000\u010e\u010f\u0005\r\u0000\u0000\u010f"+
		"\u0111\u0005\u0004\u0000\u0000\u0110\u0112\u0003,\u0016\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0005\u0001\u0000\u0000\u0114\u0116"+
		"\u0003.\u0017\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0005"+
		"\u0001\u0000\u0000\u0118\u011a\u0003.\u0017\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\u0005\u0000\u0000\u011c\u011d\u00036\u001b"+
		"\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u0121\u0003\u0012\t\u0000"+
		"\u011f\u0121\u0003.\u0017\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0121-\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0003\u0016\u000b\u0000\u0123\u0124\u0005\u0002\u0000\u0000\u0124\u0126"+
		"\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0126\u0129"+
		"\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0003\u0016\u000b\u0000\u012b/\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\r\u0000\u0000\u012d\u012f\u0005\u0004"+
		"\u0000\u0000\u012e\u0130\u0005\u0015\u0000\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0016\u0000\u0000\u0132\u0133\u0005\u0010"+
		"\u0000\u0000\u0133\u0134\u0003\u0016\u000b\u0000\u0134\u0135\u0005\u0005"+
		"\u0000\u0000\u0135\u0136\u00036\u001b\u0000\u01361\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\r\u0000\u0000\u0138\u013a\u0005\u0004\u0000\u0000\u0139"+
		"\u013b\u0005\u0015\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005\u0016\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000\u013e"+
		"\u013f\u0003\u0016\u000b\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140"+
		"\u0141\u00036\u001b\u0000\u01413\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"\u0004\u0000\u0000\u0143\u0144\u0003\u0016\u000b\u0000\u0144\u0145\u0005"+
		"\u0005\u0000\u0000\u01455\u0001\u0000\u0000\u0000\u0146\u0149\u00038\u001c"+
		"\u0000\u0147\u0149\u0003\u0002\u0001\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u01497\u0001\u0000\u0000\u0000"+
		"\u014a\u014e\u0005\b\u0000\u0000\u014b\u014d\u0003\u0002\u0001\u0000\u014c"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005\t\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153\u0164"+
		"\u0005\b\u0000\u0000\u0154\u0155\u0005\u001d\u0000\u0000\u0155\u0156\u0005"+
		"\u0003\u0000\u0000\u0156\u0157\u0003F#\u0000\u0157\u0158\u0005\u0002\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0154\u0001\u0000\u0000"+
		"\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u001d\u0000"+
		"\u0000\u015f\u0160\u0005\u0003\u0000\u0000\u0160\u0162\u0003F#\u0000\u0161"+
		"\u0163\u0005\u0002\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164"+
		"\u015b\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0198\u0005\t\u0000\u0000\u0167\u0178"+
		"\u0005\b\u0000\u0000\u0168\u0169\u0005\u0016\u0000\u0000\u0169\u016a\u0005"+
		"\u0003\u0000\u0000\u016a\u016b\u0003F#\u0000\u016b\u016c\u0005\u0002\u0000"+
		"\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000"+
		"\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0016\u0000"+
		"\u0000\u0173\u0174\u0005\u0003\u0000\u0000\u0174\u0176\u0003F#\u0000\u0175"+
		"\u0177\u0005\u0002\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178"+
		"\u016f\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u0198\u0005\t\u0000\u0000\u017b\u0180"+
		"\u0005\b\u0000\u0000\u017c\u017d\u0005\u0016\u0000\u0000\u017d\u017f\u0005"+
		"\u0002\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0005\u0016\u0000\u0000\u0184\u0186\u0005"+
		"\u0002\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0198\u0005"+
		"\t\u0000\u0000\u0188\u018e\u0005\b\u0000\u0000\u0189\u018a\u0003<\u001e"+
		"\u0000\u018a\u018b\u0005\u0002\u0000\u0000\u018b\u018d\u0001\u0000\u0000"+
		"\u0000\u018c\u0189\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000"+
		"\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0193\u0003<\u001e\u0000\u0192\u0194\u0005\u0002\u0000\u0000"+
		"\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0005\t\u0000\u0000\u0196"+
		"\u0198\u0001\u0000\u0000\u0000\u0197\u0153\u0001\u0000\u0000\u0000\u0197"+
		"\u0167\u0001\u0000\u0000\u0000\u0197\u017b\u0001\u0000\u0000\u0000\u0197"+
		"\u0188\u0001\u0000\u0000\u0000\u0198;\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\u0016\u0000\u0000\u019a\u019b\u0003\u000e\u0007\u0000\u019b\u019c"+
		"\u00038\u001c\u0000\u019c=\u0001\u0000\u0000\u0000\u019d\u01aa\u0005\u0006"+
		"\u0000\u0000\u019e\u019f\u0003F#\u0000\u019f\u01a0\u0005\u0002\u0000\u0000"+
		"\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003F#\u0000\u01a7\u01a9"+
		"\u0005\u0002\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a3"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u0007\u0000\u0000\u01ad?\u0001"+
		"\u0000\u0000\u0000\u01ae\u01bb\u0005\u0004\u0000\u0000\u01af\u01b0\u0003"+
		"D\"\u0000\u01b0\u01b1\u0005\u0002\u0000\u0000\u01b1\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b2\u01af\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0003D\"\u0000\u01b8\u01ba\u0005\u0002\u0000"+
		"\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b4\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0005\u0005\u0000\u0000\u01beA\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c2\u0005\u0016\u0000\u0000\u01c0\u01c2\u0003>\u001f\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"C\u0001\u0000\u0000\u0000\u01c3\u01c7\u0003F#\u0000\u01c4\u01c5\u0005"+
		"=\u0000\u0000\u01c5\u01c7\u0003B!\u0000\u01c6\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7E\u0001\u0000\u0000\u0000"+
		"\u01c8\u01ce\u0005\u0017\u0000\u0000\u01c9\u01ce\u0003:\u001d\u0000\u01ca"+
		"\u01ce\u0003>\u001f\u0000\u01cb\u01ce\u0003\b\u0004\u0000\u01cc\u01ce"+
		"\u0005\u0016\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01cd\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ceG\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0005\u0001\u0000\u0000\u01d0I\u0001\u0000"+
		"\u0000\u00001M\\`dhlqu\u007f\u0083\u0086\u008d\u0092\u0099\u00a0\u00b7"+
		"\u00df\u00e1\u00eb\u00f5\u0111\u0115\u0119\u0120\u0127\u012f\u013a\u0148"+
		"\u014e\u015b\u0162\u0164\u016f\u0176\u0178\u0180\u0185\u018e\u0193\u0197"+
		"\u01a3\u01a8\u01aa\u01b4\u01b9\u01bb\u01c1\u01c6\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}