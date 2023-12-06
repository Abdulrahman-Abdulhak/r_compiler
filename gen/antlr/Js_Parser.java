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
		DO=1, FOR=2, FUNCTION=3, IF=4, IN=5, OF=6, RETURN=7, WHILE=8, DECLARERS=9, 
		ID=10, PRIM_TYPE=11, MULTILINE_COMMENT=12, LINE_COMMENT=13, COMMENT=14, 
		INT=15, FLOAT=16, NUM=17, STRING=18, BOOL=19, NULL=20, UNDEFINED=21, INCREMENT_OP=22, 
		DECREMENT_OP=23, INCREMENTS_OP=24, LOGIC_NOT_OP=25, POW_OP=26, MULT_OP=27, 
		DIV_OP=28, REM_OP=29, MULTIPLICATIVE_OP=30, ADD_OP=31, SUP_OP=32, ADDITIVE_OP=33, 
		COMPARE_OP=34, EQUAL_COMPARE_OP=35, AND=36, OR=37, NULL_COALES_OP=38, 
		ASSIGNMENT_OP=39, COLON=40, ADD_ASSIGN_OP=41, SUB_ASSIGN_OP=42, MULT_ASSIGN_OP=43, 
		POW_ASSIGN_OP=44, DIV_ASSIGN_OP=45, REM_ASSIGN_OP=46, AND_ASSIGN_OP=47, 
		OR_ASSIGN_OP=48, NULL_ASSIGN_OP=49, ASSIGNMENTS_OP=50, ARROW=51, LINE_END=52, 
		NEWLINE=53, SEMICOLON=54, COMMA=55, OPEN_BRACKET=56, CLOSE_BRACKE=57, 
		OPEN_SQUARE_BRACKET=58, CLOSE_SQUARE_BRACKET=59, OPEN_CURLY_BRACES=60, 
		CLOSE_CURLY_BRACES=61, WS=62;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_function = 3, 
		RULE_if = 4, RULE_while = 5, RULE_for = 6, RULE_forin = 7, RULE_forof = 8, 
		RULE_doWhile = 9, RULE_return = 10, RULE_declare = 11, RULE_assignment = 12, 
		RULE_assignmentRightHand = 13, RULE_assignmentsRightHand = 14, RULE_arrowFunction = 15, 
		RULE_normalFunction = 16, RULE_functionCall = 17, RULE_expression = 18, 
		RULE_scopeBody = 19, RULE_postInc = 20, RULE_block = 21, RULE_forExpression1 = 22, 
		RULE_object = 23, RULE_array = 24, RULE_args = 25, RULE_param = 26, RULE_returnable = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "function", "if", "while", "for", "forin", 
			"forof", "doWhile", "return", "declare", "assignment", "assignmentRightHand", 
			"assignmentsRightHand", "arrowFunction", "normalFunction", "functionCall", 
			"expression", "scopeBody", "postInc", "block", "forExpression1", "object", 
			"array", "args", "param", "returnable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "'for'", "'function'", "'if'", "'in'", "'of'", "'return'", 
			"'while'", null, null, null, null, null, null, null, null, null, null, 
			null, "'null'", "'undefined'", null, null, null, "'!'", "'**'", "'*'", 
			"'/'", "'%'", null, "'+'", "'-'", null, null, null, "'&&'", "'||'", "'??'", 
			"'='", "':'", null, null, null, null, null, null, null, null, null, null, 
			"'=>'", null, null, "';'", "','", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DO", "FOR", "FUNCTION", "IF", "IN", "OF", "RETURN", "WHILE", "DECLARERS", 
			"ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", "COMMENT", "INT", 
			"FLOAT", "NUM", "STRING", "BOOL", "NULL", "UNDEFINED", "INCREMENT_OP", 
			"DECREMENT_OP", "INCREMENTS_OP", "LOGIC_NOT_OP", "POW_OP", "MULT_OP", 
			"DIV_OP", "REM_OP", "MULTIPLICATIVE_OP", "ADD_OP", "SUP_OP", "ADDITIVE_OP", 
			"COMPARE_OP", "EQUAL_COMPARE_OP", "AND", "OR", "NULL_COALES_OP", "ASSIGNMENT_OP", 
			"COLON", "ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", 
			"DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", 
			"ASSIGNMENTS_OP", "ARROW", "LINE_END", "NEWLINE", "SEMICOLON", "COMMA", 
			"OPEN_BRACKET", "CLOSE_BRACKE", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
			"OPEN_CURLY_BRACES", "CLOSE_CURLY_BRACES", "WS"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594038060958L) != 0)) {
				{
				{
				setState(56);
				line();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public TerminalNode LINE_END() { return getToken(Js_Parser.LINE_END, 0); }
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
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(64);
				function();
				}
				break;
			case 2:
				{
				setState(65);
				statement();
				}
				break;
			case 3:
				{
				setState(66);
				if_();
				}
				break;
			case 4:
				{
				setState(67);
				while_();
				}
				break;
			case 5:
				{
				setState(68);
				for_();
				}
				break;
			case 6:
				{
				setState(69);
				forin();
				}
				break;
			case 7:
				{
				setState(70);
				forof();
				}
				break;
			case 8:
				{
				setState(71);
				doWhile();
				}
				break;
			case 9:
				{
				setState(72);
				return_();
				}
				break;
			}
			setState(75);
			match(LINE_END);
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
	public static class PContext extends StatementContext {
		public PostIncContext postInc() {
			return getRuleContext(PostIncContext.class,0);
		}
		public PContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssigningContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssigningContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssigning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssigning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssigning(this);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				declare();
				}
				break;
			case ID:
				_localctx = new AssigningContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				assignment();
				}
				break;
			case NUM:
				_localctx = new PContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				postInc();
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
		enterRule(_localctx, 6, RULE_function);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				arrowFunction();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Js_Parser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 8, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			expression(0);
			setState(88);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(WHILE);
			setState(91);
			expression(0);
			setState(92);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Js_Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(Js_Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Js_Parser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
		public ScopeBodyContext scopeBody() {
			return getRuleContext(ScopeBodyContext.class,0);
		}
		public ForExpression1Context forExpression1() {
			return getRuleContext(ForExpression1Context.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 12, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(FOR);
			setState(95);
			match(OPEN_BRACKET);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132608L) != 0)) {
				{
				setState(96);
				forExpression1();
				}
			}

			setState(99);
			match(SEMICOLON);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132608L) != 0)) {
				{
				setState(100);
				statement();
				}
			}

			setState(103);
			match(SEMICOLON);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132608L) != 0)) {
				{
				setState(104);
				statement();
				}
			}

			setState(107);
			match(CLOSE_BRACKE);
			setState(108);
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
	public static class ForinContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Js_Parser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public TerminalNode IN() { return getToken(Js_Parser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
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
		enterRule(_localctx, 14, RULE_forin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FOR);
			setState(111);
			match(OPEN_BRACKET);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(112);
				match(DECLARERS);
				}
			}

			setState(115);
			match(ID);
			setState(116);
			match(IN);
			setState(117);
			expression(0);
			setState(118);
			match(CLOSE_BRACKE);
			setState(119);
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
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
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
		enterRule(_localctx, 16, RULE_forof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(OPEN_BRACKET);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(123);
				match(DECLARERS);
				}
			}

			setState(126);
			match(ID);
			setState(127);
			match(OF);
			setState(128);
			expression(0);
			setState(129);
			match(CLOSE_BRACKE);
			setState(130);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 18, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DO);
			setState(133);
			scopeBody();
			setState(134);
			match(WHILE);
			setState(135);
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
		enterRule(_localctx, 20, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RETURN);
			setState(138);
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
		enterRule(_localctx, 22, RULE_declare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(DECLARERS);
			setState(141);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(142);
				assignmentRightHand();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					match(ID);
					setState(147);
					assignmentRightHand();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public AssignmentsRightHandContext assignmentsRightHand() {
			return getRuleContext(AssignmentsRightHandContext.class,0);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			assignmentsRightHand();
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
		enterRule(_localctx, 26, RULE_assignmentRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class AssignmentsRightHandContext extends ParserRuleContext {
		public List<TerminalNode> ASSIGNMENTS_OP() { return getTokens(Js_Parser.ASSIGNMENTS_OP); }
		public TerminalNode ASSIGNMENTS_OP(int i) {
			return getToken(Js_Parser.ASSIGNMENTS_OP, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public AssignmentsRightHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentsRightHand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterAssignmentsRightHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitAssignmentsRightHand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitAssignmentsRightHand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsRightHandContext assignmentsRightHand() throws RecognitionException {
		AssignmentsRightHandContext _localctx = new AssignmentsRightHandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentsRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(ASSIGNMENTS_OP);
					setState(167);
					match(ID);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(173);
			match(ASSIGNMENTS_OP);
			setState(174);
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
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(Js_Parser.ARROW, 0); }
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
		enterRule(_localctx, 30, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			args();
			setState(177);
			match(ARROW);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(178);
				block();
				}
				break;
			case 2:
				{
				setState(179);
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
		enterRule(_localctx, 32, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(FUNCTION);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(183);
				match(ID);
				}
			}

			setState(186);
			args();
			setState(187);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Js_Parser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			param();
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
		public TerminalNode ADDITIVE_OP() { return getToken(Js_Parser.ADDITIVE_OP, 0); }
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
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
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
		public TerminalNode MULTIPLICATIVE_OP() { return getToken(Js_Parser.MULTIPLICATIVE_OP, 0); }
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
		public TerminalNode INCREMENTS_OP() { return getToken(Js_Parser.INCREMENTS_OP, 0); }
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
		public PostIncContext postInc() {
			return getRuleContext(PostIncContext.class,0);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193);
				match(OPEN_BRACKET);
				setState(194);
				expression(0);
				setState(195);
				match(CLOSE_BRACKE);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new PostIncreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				postInc();
				}
				break;
			case 4:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(INCREMENTS_OP);
				setState(200);
				expression(10);
				}
				break;
			case 5:
				{
				_localctx = new LogicalNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(LOGIC_NOT_OP);
				setState(202);
				expression(9);
				}
				break;
			case 6:
				{
				_localctx = new ByValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				returnable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(207);
						match(POW_OP);
						setState(208);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(210);
						match(MULTIPLICATIVE_OP);
						setState(211);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(213);
						match(ADDITIVE_OP);
						setState(214);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(216);
						match(COMPARE_OP);
						setState(217);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new CompareWithEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(219);
						match(EQUAL_COMPARE_OP);
						setState(220);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(222);
						match(AND);
						setState(223);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOR_logicalNullContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==NULL_COALES_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(231);
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
		enterRule(_localctx, 38, RULE_scopeBody);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				block();
				}
				break;
			case DO:
			case FOR:
			case FUNCTION:
			case IF:
			case RETURN:
			case WHILE:
			case DECLARERS:
			case ID:
			case NUM:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				line();
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
	public static class PostIncContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Js_Parser.NUM, 0); }
		public List<TerminalNode> ADD_OP() { return getTokens(Js_Parser.ADD_OP); }
		public TerminalNode ADD_OP(int i) {
			return getToken(Js_Parser.ADD_OP, i);
		}
		public PostIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterPostInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitPostInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitPostInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncContext postInc() throws RecognitionException {
		PostIncContext _localctx = new PostIncContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_postInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NUM);
			setState(237);
			match(ADD_OP);
			setState(238);
			match(ADD_OP);
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
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OPEN_CURLY_BRACES);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594038060958L) != 0)) {
				{
				{
				setState(241);
				line();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
	public static class ForExpression1Context extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					statement();
					setState(250);
					match(COMMA);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(257);
			statement();
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
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
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
		enterRule(_localctx, 46, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OPEN_CURLY_BRACES);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(ID);
						setState(261);
						match(COLON);
						setState(262);
						returnable();
						setState(263);
						match(COMMA);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(270);
				match(ID);
				setState(271);
				match(COLON);
				setState(272);
				returnable();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(273);
					match(COMMA);
					}
				}

				}
			}

			setState(278);
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
		enterRule(_localctx, 48, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(OPEN_SQUARE_BRACKET);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1513209474796489736L) != 0)) {
				{
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						returnable();
						setState(282);
						match(COMMA);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(289);
				returnable();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(290);
					match(COMMA);
					}
				}

				}
			}

			setState(295);
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
	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(Js_Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
		public List<TerminalNode> ID() { return getTokens(Js_Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Js_Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Js_Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Js_Parser.COMMA, i);
		}
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
		enterRule(_localctx, 50, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OPEN_BRACKET);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(ID);
						setState(299);
						match(COMMA);
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				{
				setState(305);
				match(ID);
				}
				}
			}

			setState(308);
			match(CLOSE_BRACKE);
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
		public TerminalNode CLOSE_BRACKE() { return getToken(Js_Parser.CLOSE_BRACKE, 0); }
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
		enterRule(_localctx, 52, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(OPEN_BRACKET);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1513209474796489736L) != 0)) {
				{
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						returnable();
						setState(312);
						match(COMMA);
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				{
				setState(319);
				returnable();
				}
				}
			}

			setState(322);
			match(CLOSE_BRACKE);
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
		enterRule(_localctx, 54, RULE_returnable);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIM_TYPE:
				_localctx = new PrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(PRIM_TYPE);
				}
				break;
			case OPEN_CURLY_BRACES:
				_localctx = new ObjectValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				_localctx = new ArrayValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				array();
				}
				break;
			case FUNCTION:
			case OPEN_BRACKET:
				_localctx = new FunctionValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				function();
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\b}\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0095\b\u000b\n\u000b\f\u000b\u0098\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\r\u009f\b\r\n\r\f\r\u00a2\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u00a9\b\u000e\n\u000e"+
		"\f\u000e\u00ac\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b5\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b9\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00cd\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00e4\b\u0012\n\u0012\f\u0012\u00e7"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00eb\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00f3\b\u0015\n\u0015\f\u0015\u00f6\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00fd\b\u0016\n\u0016\f\u0016"+
		"\u0100\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u010a\b\u0017\n\u0017"+
		"\f\u0017\u010d\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0113\b\u0017\u0003\u0017\u0115\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u011d"+
		"\b\u0018\n\u0018\f\u0018\u0120\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0124\b\u0018\u0003\u0018\u0126\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u012d\b\u0019\n\u0019\f\u0019"+
		"\u0130\t\u0019\u0001\u0019\u0003\u0019\u0133\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u013b"+
		"\b\u001a\n\u001a\f\u001a\u013e\t\u001a\u0001\u001a\u0003\u001a\u0141\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u014a\b\u001b\u0001\u001b\u0000\u0001$"+
		"\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0001\u0001\u0000%&\u0163\u0000"+
		";\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000"+
		"\u0000\nZ\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000\u0000\u000en\u0001"+
		"\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000"+
		"\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000"+
		"\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000"+
		"\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000"+
		"\u0000\u0000 \u00b6\u0001\u0000\u0000\u0000\"\u00bd\u0001\u0000\u0000"+
		"\u0000$\u00cc\u0001\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000("+
		"\u00ec\u0001\u0000\u0000\u0000*\u00f0\u0001\u0000\u0000\u0000,\u00fe\u0001"+
		"\u0000\u0000\u0000.\u0103\u0001\u0000\u0000\u00000\u0118\u0001\u0000\u0000"+
		"\u00002\u0129\u0001\u0000\u0000\u00004\u0136\u0001\u0000\u0000\u00006"+
		"\u0149\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">?\u0005\u0000\u0000\u0001?\u0001\u0001\u0000\u0000\u0000@J\u0003\u0006"+
		"\u0003\u0000AJ\u0003\u0004\u0002\u0000BJ\u0003\b\u0004\u0000CJ\u0003\n"+
		"\u0005\u0000DJ\u0003\f\u0006\u0000EJ\u0003\u000e\u0007\u0000FJ\u0003\u0010"+
		"\b\u0000GJ\u0003\u0012\t\u0000HJ\u0003\u0014\n\u0000I@\u0001\u0000\u0000"+
		"\u0000IA\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001\u0000"+
		"\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u00054\u0000\u0000L\u0003\u0001\u0000\u0000"+
		"\u0000MQ\u0003\u0016\u000b\u0000NQ\u0003\u0018\f\u0000OQ\u0003(\u0014"+
		"\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RU\u0003\u001e\u000f\u0000"+
		"SU\u0003 \u0010\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0004\u0000\u0000WX\u0003$\u0012"+
		"\u0000XY\u0003&\u0013\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0005\b\u0000"+
		"\u0000[\\\u0003$\u0012\u0000\\]\u0003&\u0013\u0000]\u000b\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0002\u0000\u0000_a\u00058\u0000\u0000`b\u0003,\u0016"+
		"\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u00056\u0000\u0000df\u0003\u0004\u0002\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0005"+
		"6\u0000\u0000hj\u0003\u0004\u0002\u0000ih\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u00059\u0000\u0000lm\u0003"+
		"&\u0013\u0000m\r\u0001\u0000\u0000\u0000no\u0005\u0002\u0000\u0000oq\u0005"+
		"8\u0000\u0000pr\u0005\t\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\n\u0000\u0000tu\u0005"+
		"\u0005\u0000\u0000uv\u0003$\u0012\u0000vw\u00059\u0000\u0000wx\u0003&"+
		"\u0013\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000"+
		"z|\u00058\u0000\u0000{}\u0005\t\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0005\n\u0000"+
		"\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0081\u0003$\u0012\u0000"+
		"\u0081\u0082\u00059\u0000\u0000\u0082\u0083\u0003&\u0013\u0000\u0083\u0011"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086"+
		"\u0003&\u0013\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0088\u0003"+
		"$\u0012\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0007"+
		"\u0000\u0000\u008a\u008b\u0003$\u0012\u0000\u008b\u0015\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\t\u0000\u0000\u008d\u008f\u0005\n\u0000\u0000"+
		"\u008e\u0090\u0003\u001a\r\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0096\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u00057\u0000\u0000\u0092\u0093\u0005\n\u0000\u0000\u0093\u0095"+
		"\u0003\u001a\r\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\n\u0000\u0000\u009a\u009b\u0003\u001c"+
		"\u000e\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005\'\u0000"+
		"\u0000\u009d\u009f\u0005\n\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\'\u0000\u0000\u00a4"+
		"\u00a5\u0003$\u0012\u0000\u00a5\u001b\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u00052\u0000\u0000\u00a7\u00a9\u0005\n\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"2\u0000\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af\u001d\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u00032\u0019\u0000\u00b1\u00b4\u00053\u0000\u0000\u00b2"+
		"\u00b5\u0003*\u0015\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0005\u0003\u0000\u0000\u00b7\u00b9\u0005"+
		"\n\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u00032\u0019"+
		"\u0000\u00bb\u00bc\u0003*\u0015\u0000\u00bc!\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\n\u0000\u0000\u00be\u00bf\u00034\u001a\u0000\u00bf#\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0006\u0012\uffff\uffff\u0000\u00c1\u00c2"+
		"\u00058\u0000\u0000\u00c2\u00c3\u0003$\u0012\u0000\u00c3\u00c4\u00059"+
		"\u0000\u0000\u00c4\u00cd\u0001\u0000\u0000\u0000\u00c5\u00cd\u0003\"\u0011"+
		"\u0000\u00c6\u00cd\u0003(\u0014\u0000\u00c7\u00c8\u0005\u0018\u0000\u0000"+
		"\u00c8\u00cd\u0003$\u0012\n\u00c9\u00ca\u0005\u0019\u0000\u0000\u00ca"+
		"\u00cd\u0003$\u0012\t\u00cb\u00cd\u00036\u001b\u0000\u00cc\u00c0\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\n\b\u0000\u0000\u00cf\u00d0\u0005\u001a"+
		"\u0000\u0000\u00d0\u00e4\u0003$\u0012\t\u00d1\u00d2\n\u0007\u0000\u0000"+
		"\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3\u00e4\u0003$\u0012\b\u00d4"+
		"\u00d5\n\u0006\u0000\u0000\u00d5\u00d6\u0005!\u0000\u0000\u00d6\u00e4"+
		"\u0003$\u0012\u0007\u00d7\u00d8\n\u0005\u0000\u0000\u00d8\u00d9\u0005"+
		"\"\u0000\u0000\u00d9\u00e4\u0003$\u0012\u0006\u00da\u00db\n\u0004\u0000"+
		"\u0000\u00db\u00dc\u0005#\u0000\u0000\u00dc\u00e4\u0003$\u0012\u0005\u00dd"+
		"\u00de\n\u0003\u0000\u0000\u00de\u00df\u0005$\u0000\u0000\u00df\u00e4"+
		"\u0003$\u0012\u0004\u00e0\u00e1\n\u0002\u0000\u0000\u00e1\u00e2\u0007"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0003$\u0012\u0003\u00e3\u00ce\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d1\u0001\u0000\u0000\u0000\u00e3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00d7\u0001\u0000\u0000\u0000\u00e3\u00da\u0001\u0000"+
		"\u0000\u0000\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6%\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0003*\u0015\u0000"+
		"\u00e9\u00eb\u0003\u0002\u0001\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0011\u0000\u0000\u00ed\u00ee\u0005\u001f\u0000\u0000\u00ee"+
		"\u00ef\u0005\u001f\u0000\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0\u00f4"+
		"\u0005<\u0000\u0000\u00f1\u00f3\u0003\u0002\u0001\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"=\u0000\u0000\u00f8+\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0004\u0002"+
		"\u0000\u00fa\u00fb\u00057\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0003\u0004\u0002\u0000\u0102-\u0001\u0000\u0000\u0000\u0103"+
		"\u0114\u0005<\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105\u0106"+
		"\u0005(\u0000\u0000\u0106\u0107\u00036\u001b\u0000\u0107\u0108\u00057"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\n\u0000"+
		"\u0000\u010f\u0110\u0005(\u0000\u0000\u0110\u0112\u00036\u001b\u0000\u0111"+
		"\u0113\u00057\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010b"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005=\u0000\u0000\u0117/\u0001\u0000"+
		"\u0000\u0000\u0118\u0125\u0005:\u0000\u0000\u0119\u011a\u00036\u001b\u0000"+
		"\u011a\u011b\u00057\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u0119\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u00036\u001b\u0000\u0122\u0124\u00057\u0000\u0000\u0123\u0122\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001"+
		"\u0000\u0000\u0000\u0125\u011e\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		";\u0000\u0000\u01281\u0001\u0000\u0000\u0000\u0129\u0132\u00058\u0000"+
		"\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b\u012d\u00057\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0133\u0005\n\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u00059\u0000\u0000\u01353\u0001\u0000\u0000\u0000\u0136\u0140\u0005"+
		"8\u0000\u0000\u0137\u0138\u00036\u001b\u0000\u0138\u0139\u00057\u0000"+
		"\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0137\u0001\u0000\u0000"+
		"\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0141\u00036\u001b\u0000"+
		"\u0140\u013c\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u00059\u0000\u0000\u0143"+
		"5\u0001\u0000\u0000\u0000\u0144\u014a\u0005\u000b\u0000\u0000\u0145\u014a"+
		"\u0003.\u0017\u0000\u0146\u014a\u00030\u0018\u0000\u0147\u014a\u0003\u0006"+
		"\u0003\u0000\u0148\u014a\u0005\n\u0000\u0000\u0149\u0144\u0001\u0000\u0000"+
		"\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a7\u0001\u0000\u0000\u0000 ;IPTaeiq|\u008f\u0096\u00a0\u00aa"+
		"\u00b4\u00b8\u00cc\u00e3\u00e5\u00ea\u00f4\u00fe\u010b\u0112\u0114\u011e"+
		"\u0123\u0125\u012e\u0132\u013c\u0140\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}