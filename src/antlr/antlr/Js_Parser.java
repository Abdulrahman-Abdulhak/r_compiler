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
		CONTINUE=1, DO=2, FOR=3, FUNCTION=4, IF=5, IN=6, NEW=7, OF=8, RETURN=9, 
		WHILE=10, DECLARERS=11, ID=12, PRIM_TYPE=13, MULTILINE_COMMENT=14, LINE_COMMENT=15, 
		INT=16, FLOAT=17, NUM=18, STRING=19, BOOL=20, NULL=21, UNDEFINED=22, INCREMENT_OP=23, 
		DECREMENT_OP=24, LOGIC_NOT_OP=25, POW_OP=26, MULT_OP=27, DIV_OP=28, REM_OP=29, 
		ADD_OP=30, SUP_OP=31, COMPARE_OP=32, EQUAL_COMPARE_OP=33, AND=34, OR=35, 
		NULL_COALES_OP=36, TERNARY_OP1=37, TERNARY_OP2=38, ASSIGNMENT_OP=39, COLON=40, 
		ADD_ASSIGN_OP=41, SUB_ASSIGN_OP=42, MULT_ASSIGN_OP=43, POW_ASSIGN_OP=44, 
		DIV_ASSIGN_OP=45, REM_ASSIGN_OP=46, AND_ASSIGN_OP=47, OR_ASSIGN_OP=48, 
		NULL_ASSIGN_OP=49, ARROW=50, REST_OP=51, SPREAD_OP=52, SEMICOLON=53, COMMA=54, 
		OPEN_BRACKET=55, CLOSE_BRACKET=56, OPEN_SQUARE_BRACKET=57, CLOSE_SQUARE_BRACKET=58, 
		OPEN_CURLY_BRACES=59, CLOSE_CURLY_BRACES=60, NEWLINE=61, WS=62;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_lineStart = 2, RULE_lineEnd = 3, 
		RULE_function = 4, RULE_statement = 5, RULE_if = 6, RULE_while = 7, RULE_for = 8, 
		RULE_forExpression1 = 9, RULE_expressionList = 10, RULE_forin = 11, RULE_forof = 12, 
		RULE_doWhile = 13, RULE_loopScopeBody = 14, RULE_loopLine = 15, RULE_return = 16, 
		RULE_declare = 17, RULE_assignmentRightHand = 18, RULE_arrowFunction = 19, 
		RULE_normalFunction = 20, RULE_functionCall = 21, RULE_expression = 22, 
		RULE_assignment = 23, RULE_scopeHead = 24, RULE_scopeBody = 25, RULE_block = 26, 
		RULE_object = 27, RULE_array = 28, RULE_args = 29, RULE_param = 30, RULE_paramSpreadable = 31, 
		RULE_paramInput = 32, RULE_returnable = 33, RULE_incrementsOp = 34, RULE_multiplicativeOp = 35, 
		RULE_additiveOp = 36, RULE_assinmentOp = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "lineStart", "lineEnd", "function", "statement", "if", 
			"while", "for", "forExpression1", "expressionList", "forin", "forof", 
			"doWhile", "loopScopeBody", "loopLine", "return", "declare", "assignmentRightHand", 
			"arrowFunction", "normalFunction", "functionCall", "expression", "assignment", 
			"scopeHead", "scopeBody", "block", "object", "array", "args", "param", 
			"paramSpreadable", "paramInput", "returnable", "incrementsOp", "multiplicativeOp", 
			"additiveOp", "assinmentOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'continue'", "'do'", "'for'", "'function'", "'if'", "'in'", "'new'", 
			"'of'", "'return'", "'while'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'undefined'", null, null, "'!'", "'**'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", null, null, "'&&'", "'||'", "'??'", 
			"'?'", null, "'='", "':'", null, null, null, null, null, null, null, 
			null, null, "'=>'", null, "'...'", "';'", "','", "'('", "')'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTINUE", "DO", "FOR", "FUNCTION", "IF", "IN", "NEW", "OF", "RETURN", 
			"WHILE", "DECLARERS", "ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", 
			"INT", "FLOAT", "NUM", "STRING", "BOOL", "NULL", "UNDEFINED", "INCREMENT_OP", 
			"DECREMENT_OP", "LOGIC_NOT_OP", "POW_OP", "MULT_OP", "DIV_OP", "REM_OP", 
			"ADD_OP", "SUP_OP", "COMPARE_OP", "EQUAL_COMPARE_OP", "AND", "OR", "NULL_COALES_OP", 
			"TERNARY_OP1", "TERNARY_OP2", "ASSIGNMENT_OP", "COLON", "ADD_ASSIGN_OP", 
			"SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", "DIV_ASSIGN_OP", 
			"REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", "ARROW", 
			"REST_OP", "SPREAD_OP", "SEMICOLON", "COMMA", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", "CLOSE_CURLY_BRACES", 
			"NEWLINE", "WS"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3062447746670673596L) != 0)) {
				{
				{
				setState(76);
				line();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public TerminalNode NEWLINE() { return getToken(Js_Parser.NEWLINE, 0); }
		public LineStartContext lineStart() {
			return getRuleContext(LineStartContext.class,0);
		}
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(NEWLINE);
				}
				break;
			case DO:
			case FOR:
			case FUNCTION:
			case IF:
			case NEW:
			case RETURN:
			case WHILE:
			case DECLARERS:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				lineStart();
				setState(86);
				lineEnd();
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
	public static class LineStartContext extends ParserRuleContext {
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
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public LineStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLineStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLineStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLineStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineStartContext lineStart() throws RecognitionException {
		LineStartContext _localctx = new LineStartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lineStart);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				forin();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				forof();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				doWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				return_();
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
	public static class LineEndContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(Js_Parser.SEMICOLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Js_Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Js_Parser.NEWLINE, i);
		}
		public LineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLineEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLineEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLineEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineEndContext lineEnd() throws RecognitionException {
		LineEndContext _localctx = new LineEndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lineEnd);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(NEWLINE);
				setState(105);
				match(SEMICOLON);
				setState(106);
				match(NEWLINE);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				arrowFunction();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				declare();
				}
				break;
			case FUNCTION:
			case NEW:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
				_localctx = new NormalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				expression(0);
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
		enterRule(_localctx, 12, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			scopeHead();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Js_Parser.WHILE, 0); }
		public ScopeHeadContext scopeHead() {
			return getRuleContext(ScopeHeadContext.class,0);
		}
		public LoopScopeBodyContext loopScopeBody() {
			return getRuleContext(LoopScopeBodyContext.class,0);
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
		enterRule(_localctx, 14, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHILE);
			setState(122);
			scopeHead();
			setState(123);
			loopScopeBody();
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
		public LoopScopeBodyContext loopScopeBody() {
			return getRuleContext(LoopScopeBodyContext.class,0);
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
		enterRule(_localctx, 16, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR);
			setState(126);
			match(OPEN_BRACKET);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737456978064L) != 0)) {
				{
				setState(127);
				forExpression1();
				}
			}

			setState(130);
			match(SEMICOLON);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737456976016L) != 0)) {
				{
				setState(131);
				expressionList();
				}
			}

			setState(134);
			match(SEMICOLON);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737456976016L) != 0)) {
				{
				setState(135);
				expressionList();
				}
			}

			setState(138);
			match(CLOSE_BRACKET);
			setState(139);
			loopScopeBody();
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
		enterRule(_localctx, 18, RULE_forExpression1);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				declare();
				}
				break;
			case FUNCTION:
			case NEW:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		enterRule(_localctx, 20, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					expression(0);
					setState(146);
					match(COMMA);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(153);
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
		public LoopScopeBodyContext loopScopeBody() {
			return getRuleContext(LoopScopeBodyContext.class,0);
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
		enterRule(_localctx, 22, RULE_forin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FOR);
			setState(156);
			match(OPEN_BRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(157);
				match(DECLARERS);
				}
			}

			setState(160);
			match(ID);
			setState(161);
			match(IN);
			setState(162);
			expression(0);
			setState(163);
			match(CLOSE_BRACKET);
			setState(164);
			loopScopeBody();
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
		public LoopScopeBodyContext loopScopeBody() {
			return getRuleContext(LoopScopeBodyContext.class,0);
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
		enterRule(_localctx, 24, RULE_forof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(FOR);
			setState(167);
			match(OPEN_BRACKET);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(168);
				match(DECLARERS);
				}
			}

			setState(171);
			match(ID);
			setState(172);
			match(OF);
			setState(173);
			expression(0);
			setState(174);
			match(CLOSE_BRACKET);
			setState(175);
			loopScopeBody();
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
		public LoopScopeBodyContext loopScopeBody() {
			return getRuleContext(LoopScopeBodyContext.class,0);
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
		enterRule(_localctx, 26, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DO);
			setState(178);
			loopScopeBody();
			setState(179);
			match(WHILE);
			setState(180);
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
	public static class LoopScopeBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACES() { return getToken(Js_Parser.OPEN_CURLY_BRACES, 0); }
		public TerminalNode CLOSE_CURLY_BRACES() { return getToken(Js_Parser.CLOSE_CURLY_BRACES, 0); }
		public List<LoopLineContext> loopLine() {
			return getRuleContexts(LoopLineContext.class);
		}
		public LoopLineContext loopLine(int i) {
			return getRuleContext(LoopLineContext.class,i);
		}
		public LoopScopeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopScopeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLoopScopeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLoopScopeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLoopScopeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopScopeBodyContext loopScopeBody() throws RecognitionException {
		LoopScopeBodyContext _localctx = new LoopScopeBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopScopeBody);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(OPEN_CURLY_BRACES);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3062447746670673598L) != 0)) {
					{
					{
					setState(183);
					loopLine();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(CLOSE_CURLY_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				loopLine();
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
	public static class LoopLineContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(Js_Parser.CONTINUE, 0); }
		public LineEndContext lineEnd() {
			return getRuleContext(LineEndContext.class,0);
		}
		public LoopLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).enterLoopLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Js_ParserListener ) ((Js_ParserListener)listener).exitLoopLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Js_ParserVisitor ) return ((Js_ParserVisitor<? extends T>)visitor).visitLoopLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLineContext loopLine() throws RecognitionException {
		LoopLineContext _localctx = new LoopLineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopLine);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
			case FOR:
			case FUNCTION:
			case IF:
			case NEW:
			case RETURN:
			case WHILE:
			case DECLARERS:
			case ID:
			case PRIM_TYPE:
			case INCREMENT_OP:
			case DECREMENT_OP:
			case LOGIC_NOT_OP:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				line();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(CONTINUE);
				setState(195);
				lineEnd();
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
		enterRule(_localctx, 32, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(RETURN);
			setState(199);
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
		enterRule(_localctx, 34, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DECLARERS);
			setState(202);
			match(ID);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(203);
				assignmentRightHand();
				}
			}

			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				match(ID);
				setState(208);
				assignmentRightHand();
				}
				}
				setState(213);
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
		enterRule(_localctx, 36, RULE_assignmentRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(ASSIGNMENT_OP);
					setState(215);
					match(ID);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(221);
			match(ASSIGNMENT_OP);
			setState(222);
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
		enterRule(_localctx, 38, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(224);
				args();
				}
				break;
			case ID:
				{
				setState(225);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			match(ARROW);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(229);
				block();
				}
				break;
			case 2:
				{
				setState(230);
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
		enterRule(_localctx, 40, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(FUNCTION);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(234);
				match(ID);
				}
			}

			setState(237);
			args();
			setState(238);
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
		enterRule(_localctx, 42, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
			setState(241);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(244);
				match(OPEN_BRACKET);
				setState(245);
				expression(0);
				setState(246);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(NEW);
				setState(250);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				incrementsOp();
				setState(252);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new LogicalNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(LOGIC_NOT_OP);
				setState(255);
				expression(11);
				}
				break;
			case 6:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				assignment();
				}
				break;
			case 7:
				{
				_localctx = new ByValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				returnable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261);
						match(POW_OP);
						setState(262);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(264);
						multiplicativeOp();
						setState(265);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(268);
						additiveOp();
						setState(269);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(272);
						match(COMPARE_OP);
						setState(273);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new CompareWithEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(275);
						match(EQUAL_COMPARE_OP);
						setState(276);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(278);
						match(AND);
						setState(279);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOR_logicalNullContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(281);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==NULL_COALES_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new TernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(284);
						match(TERNARY_OP1);
						setState(285);
						expression(0);
						setState(286);
						match(TERNARY_OP2);
						setState(287);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new PostIncreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(290);
						incrementsOp();
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 46, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					assinmentOp();
					setState(298);
					match(ID);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(305);
			assinmentOp();
			setState(306);
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
		enterRule(_localctx, 48, RULE_scopeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(OPEN_BRACKET);
			setState(309);
			expression(0);
			setState(310);
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
		public LineStartContext lineStart() {
			return getRuleContext(LineStartContext.class,0);
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
		enterRule(_localctx, 50, RULE_scopeBody);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				lineStart();
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
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(OPEN_CURLY_BRACES);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3062447746670673596L) != 0)) {
				{
				{
				setState(317);
				line();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
		enterRule(_localctx, 54, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(OPEN_CURLY_BRACES);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						match(ID);
						setState(327);
						match(COLON);
						setState(328);
						returnable();
						setState(329);
						match(COMMA);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(336);
				match(ID);
				setState(337);
				match(COLON);
				setState(338);
				returnable();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(339);
					match(COMMA);
					}
				}

				}
			}

			setState(344);
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
		enterRule(_localctx, 56, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OPEN_SQUARE_BRACKET);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398255632L) != 0)) {
				{
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(347);
						returnable();
						setState(348);
						match(COMMA);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(355);
				returnable();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(356);
					match(COMMA);
					}
				}

				}
			}

			setState(361);
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
		enterRule(_localctx, 58, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(OPEN_BRACKET);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==REST_OP) {
				{
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						match(ID);
						setState(365);
						match(COMMA);
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REST_OP) {
					{
					setState(371);
					match(REST_OP);
					}
				}

				setState(374);
				match(ID);
				}
			}

			setState(377);
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
		enterRule(_localctx, 60, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OPEN_BRACKET);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 761108337025626128L) != 0)) {
				{
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380);
						paramInput();
						setState(381);
						match(COMMA);
						}
						} 
					}
					setState(387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				{
				setState(388);
				paramInput();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					}
				}

				}
				}
			}

			setState(394);
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
		enterRule(_localctx, 62, RULE_paramSpreadable);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(ID);
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
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
		enterRule(_localctx, 64, RULE_paramInput);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case ID:
			case PRIM_TYPE:
			case OPEN_BRACKET:
			case OPEN_SQUARE_BRACKET:
			case OPEN_CURLY_BRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				returnable();
				}
				break;
			case SPREAD_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(SPREAD_OP);
				setState(402);
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
		enterRule(_localctx, 66, RULE_returnable);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new PrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(PRIM_TYPE);
				}
				break;
			case 2:
				_localctx = new ObjectValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				object();
				}
				break;
			case 3:
				_localctx = new ArrayValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				array();
				}
				break;
			case 4:
				_localctx = new FunctionValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				function();
				}
				break;
			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
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
		enterRule(_localctx, 68, RULE_incrementsOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 70, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		enterRule(_localctx, 74, RULE_assinmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1124250639400960L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
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
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u01a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003l\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0081"+
		"\b\b\u0001\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0001\b\u0003\b\u0089\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0090\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0095\b\n\n\n\f\n\u0098\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00aa\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00b9\b\u000e\n\u000e\f\u000e\u00bc\t\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c5"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00cd\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00d2\b\u0011\n\u0011\f\u0011\u00d5\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00d9\b\u0012\n\u0012\f\u0012\u00dc\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00e3\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e8\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00ec\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0103\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0124\b\u0016\n\u0016\f\u0016"+
		"\u0127\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u012d\b\u0017\n\u0017\f\u0017\u0130\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013b\b\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u013f"+
		"\b\u001a\n\u001a\f\u001a\u0142\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u014c\b\u001b\n\u001b\f\u001b\u014f\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0155\b\u001b\u0003\u001b\u0157\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u015f\b\u001c\n\u001c\f\u001c\u0162\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0166\b\u001c\u0003\u001c\u0168\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u016f\b\u001d"+
		"\n\u001d\f\u001d\u0172\t\u001d\u0001\u001d\u0003\u001d\u0175\b\u001d\u0001"+
		"\u001d\u0003\u001d\u0178\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0180\b\u001e\n\u001e\f\u001e"+
		"\u0183\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0187\b\u001e\u0003"+
		"\u001e\u0189\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u018f\b\u001f\u0001 \u0001 \u0001 \u0003 \u0194\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u019b\b!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0000\u0001,&\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJ\u0000\u0005\u0001\u0000#$\u0001\u0000\u0017\u0018\u0001\u0000"+
		"\u001b\u001d\u0001\u0000\u001e\u001f\u0002\u0000\'\')1\u01c1\u0000O\u0001"+
		"\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000"+
		"\u0000\u0006k\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\ns\u0001"+
		"\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000"+
		"\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000"+
		"\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u009b\u0001\u0000\u0000\u0000"+
		"\u0018\u00a6\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000"+
		"\u001c\u00bf\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000"+
		" \u00c6\u0001\u0000\u0000\u0000\"\u00c9\u0001\u0000\u0000\u0000$\u00da"+
		"\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00e9\u0001\u0000"+
		"\u0000\u0000*\u00f0\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000"+
		".\u0128\u0001\u0000\u0000\u00000\u0134\u0001\u0000\u0000\u00002\u013a"+
		"\u0001\u0000\u0000\u00004\u013c\u0001\u0000\u0000\u00006\u0145\u0001\u0000"+
		"\u0000\u00008\u015a\u0001\u0000\u0000\u0000:\u016b\u0001\u0000\u0000\u0000"+
		"<\u017b\u0001\u0000\u0000\u0000>\u018e\u0001\u0000\u0000\u0000@\u0193"+
		"\u0001\u0000\u0000\u0000B\u019a\u0001\u0000\u0000\u0000D\u019c\u0001\u0000"+
		"\u0000\u0000F\u019e\u0001\u0000\u0000\u0000H\u01a0\u0001\u0000\u0000\u0000"+
		"J\u01a2\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000TY\u0005=\u0000"+
		"\u0000UV\u0003\u0004\u0002\u0000VW\u0003\u0006\u0003\u0000WY\u0001\u0000"+
		"\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\u0003"+
		"\u0001\u0000\u0000\u0000Ze\u0003\b\u0004\u0000[e\u0003\n\u0005\u0000\\"+
		"e\u0003\f\u0006\u0000]e\u0003\u000e\u0007\u0000^e\u0003\u0010\b\u0000"+
		"_e\u0003\u0016\u000b\u0000`e\u0003\u0018\f\u0000ae\u0003\u001a\r\u0000"+
		"be\u00034\u001a\u0000ce\u0003 \u0010\u0000dZ\u0001\u0000\u0000\u0000d"+
		"[\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000"+
		"\u0000d^\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000"+
		"\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fl\u00055\u0000\u0000"+
		"gl\u0005=\u0000\u0000hi\u0005=\u0000\u0000ij\u00055\u0000\u0000jl\u0005"+
		"=\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000l\u0007\u0001\u0000\u0000\u0000mp\u0003&\u0013\u0000"+
		"np\u0003(\u0014\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"p\t\u0001\u0000\u0000\u0000qt\u0003\"\u0011\u0000rt\u0003,\u0016\u0000"+
		"sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u000b\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u00030\u0018\u0000wx\u00032\u0019"+
		"\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\n\u0000\u0000z{\u00030\u0018"+
		"\u0000{|\u0003\u001c\u000e\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0003\u0000\u0000~\u0080\u00057\u0000\u0000\u007f\u0081\u0003\u0012\t"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u00055\u0000\u0000"+
		"\u0083\u0085\u0003\u0014\n\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u00055\u0000\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u00058\u0000\u0000\u008b\u008c\u0003"+
		"\u001c\u000e\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u0090\u0003"+
		"\"\u0011\u0000\u008e\u0090\u0003\u0014\n\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0013\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0003,\u0016\u0000\u0092\u0093\u00056\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0003,\u0016\u0000\u009a"+
		"\u0015\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c"+
		"\u009e\u00057\u0000\u0000\u009d\u009f\u0005\u000b\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0006\u0000\u0000\u00a2\u00a3\u0003,\u0016\u0000\u00a3\u00a4\u00058\u0000"+
		"\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u0017\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a9\u00057\u0000\u0000"+
		"\u00a8\u00aa\u0005\u000b\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad"+
		"\u00ae\u0003,\u0016\u0000\u00ae\u00af\u00058\u0000\u0000\u00af\u00b0\u0003"+
		"\u001c\u000e\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0002\u0000\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u00b4\u0005"+
		"\n\u0000\u0000\u00b4\u00b5\u00030\u0018\u0000\u00b5\u001b\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ba\u0005;\u0000\u0000\u00b7\u00b9\u0003\u001e\u000f"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0005<\u0000\u0000\u00be\u00c0\u0003\u001e\u000f\u0000"+
		"\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c5\u0003\u0002\u0001\u0000"+
		"\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c5\u0003\u0006\u0003\u0000"+
		"\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\t\u0000\u0000\u00c7"+
		"\u00c8\u0003,\u0016\u0000\u00c8!\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\u000b\u0000\u0000\u00ca\u00cc\u0005\f\u0000\u0000\u00cb\u00cd\u0003$"+
		"\u0012\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000\u00ce\u00cf\u00056\u0000"+
		"\u0000\u00cf\u00d0\u0005\f\u0000\u0000\u00d0\u00d2\u0003$\u0012\u0000"+
		"\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\'\u0000\u0000\u00d7\u00d9\u0005\f\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\'\u0000\u0000\u00de\u00df\u0003,\u0016\u0000\u00df%\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0003:\u001d\u0000\u00e1\u00e3\u0005\f\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u00052\u0000\u0000"+
		"\u00e5\u00e8\u00034\u001a\u0000\u00e6\u00e8\u0003,\u0016\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\'\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0005\u0004\u0000\u0000\u00ea\u00ec\u0005"+
		"\f\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003:\u001d"+
		"\u0000\u00ee\u00ef\u00034\u001a\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\f\u0000\u0000\u00f1\u00f2\u0003<\u001e\u0000\u00f2+\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0006\u0016\uffff\uffff\u0000\u00f4\u00f5"+
		"\u00057\u0000\u0000\u00f5\u00f6\u0003,\u0016\u0000\u00f6\u00f7\u00058"+
		"\u0000\u0000\u00f7\u0103\u0001\u0000\u0000\u0000\u00f8\u0103\u0003*\u0015"+
		"\u0000\u00f9\u00fa\u0005\u0007\u0000\u0000\u00fa\u0103\u0003*\u0015\u0000"+
		"\u00fb\u00fc\u0003D\"\u0000\u00fc\u00fd\u0003,\u0016\f\u00fd\u0103\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005\u0019\u0000\u0000\u00ff\u0103\u0003"+
		",\u0016\u000b\u0100\u0103\u0003.\u0017\u0000\u0101\u0103\u0003B!\u0000"+
		"\u0102\u00f3\u0001\u0000\u0000\u0000\u0102\u00f8\u0001\u0000\u0000\u0000"+
		"\u0102\u00f9\u0001\u0000\u0000\u0000\u0102\u00fb\u0001\u0000\u0000\u0000"+
		"\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0125\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\n\n\u0000\u0000\u0105\u0106\u0005\u001a\u0000\u0000\u0106"+
		"\u0124\u0003,\u0016\u000b\u0107\u0108\n\t\u0000\u0000\u0108\u0109\u0003"+
		"F#\u0000\u0109\u010a\u0003,\u0016\n\u010a\u0124\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\n\b\u0000\u0000\u010c\u010d\u0003H$\u0000\u010d\u010e\u0003"+
		",\u0016\t\u010e\u0124\u0001\u0000\u0000\u0000\u010f\u0110\n\u0007\u0000"+
		"\u0000\u0110\u0111\u0005 \u0000\u0000\u0111\u0124\u0003,\u0016\b\u0112"+
		"\u0113\n\u0006\u0000\u0000\u0113\u0114\u0005!\u0000\u0000\u0114\u0124"+
		"\u0003,\u0016\u0007\u0115\u0116\n\u0005\u0000\u0000\u0116\u0117\u0005"+
		"\"\u0000\u0000\u0117\u0124\u0003,\u0016\u0006\u0118\u0119\n\u0004\u0000"+
		"\u0000\u0119\u011a\u0007\u0000\u0000\u0000\u011a\u0124\u0003,\u0016\u0005"+
		"\u011b\u011c\n\u0003\u0000\u0000\u011c\u011d\u0005%\u0000\u0000\u011d"+
		"\u011e\u0003,\u0016\u0000\u011e\u011f\u0005&\u0000\u0000\u011f\u0120\u0003"+
		",\u0016\u0004\u0120\u0124\u0001\u0000\u0000\u0000\u0121\u0122\n\r\u0000"+
		"\u0000\u0122\u0124\u0003D\"\u0000\u0123\u0104\u0001\u0000\u0000\u0000"+
		"\u0123\u0107\u0001\u0000\u0000\u0000\u0123\u010b\u0001\u0000\u0000\u0000"+
		"\u0123\u010f\u0001\u0000\u0000\u0000\u0123\u0112\u0001\u0000\u0000\u0000"+
		"\u0123\u0115\u0001\u0000\u0000\u0000\u0123\u0118\u0001\u0000\u0000\u0000"+
		"\u0123\u011b\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126-\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0128\u012e\u0005\f\u0000\u0000\u0129\u012a"+
		"\u0003J%\u0000\u012a\u012b\u0005\f\u0000\u0000\u012b\u012d\u0001\u0000"+
		"\u0000\u0000\u012c\u0129\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0003J%\u0000\u0132\u0133\u0003,\u0016\u0000"+
		"\u0133/\u0001\u0000\u0000\u0000\u0134\u0135\u00057\u0000\u0000\u0135\u0136"+
		"\u0003,\u0016\u0000\u0136\u0137\u00058\u0000\u0000\u01371\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u00034\u001a\u0000\u0139\u013b\u0003\u0004\u0002"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000"+
		"\u0000\u013b3\u0001\u0000\u0000\u0000\u013c\u0140\u0005;\u0000\u0000\u013d"+
		"\u013f\u0003\u0002\u0001\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0005<\u0000\u0000\u01445\u0001"+
		"\u0000\u0000\u0000\u0145\u0156\u0005;\u0000\u0000\u0146\u0147\u0005\f"+
		"\u0000\u0000\u0147\u0148\u0005(\u0000\u0000\u0148\u0149\u0003B!\u0000"+
		"\u0149\u014a\u00056\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b"+
		"\u0146\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0005\f\u0000\u0000\u0151\u0152\u0005(\u0000\u0000\u0152\u0154"+
		"\u0003B!\u0000\u0153\u0155\u00056\u0000\u0000\u0154\u0153\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u014d\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005<\u0000"+
		"\u0000\u01597\u0001\u0000\u0000\u0000\u015a\u0167\u00059\u0000\u0000\u015b"+
		"\u015c\u0003B!\u0000\u015c\u015d\u00056\u0000\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0165\u0003B!\u0000\u0164\u0166\u00056\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167\u0160\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0005:\u0000\u0000\u016a9\u0001\u0000\u0000\u0000\u016b"+
		"\u0177\u00057\u0000\u0000\u016c\u016d\u0005\f\u0000\u0000\u016d\u016f"+
		"\u00056\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0172\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0173\u0175\u00053\u0000\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0005\f\u0000\u0000\u0177\u0170\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u00058\u0000\u0000\u017a;\u0001\u0000\u0000\u0000\u017b"+
		"\u0188\u00057\u0000\u0000\u017c\u017d\u0003@ \u0000\u017d\u017e\u0005"+
		"6\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u0003@ \u0000"+
		"\u0185\u0187\u00056\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188"+
		"\u0181\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u00058\u0000\u0000\u018b=\u0001"+
		"\u0000\u0000\u0000\u018c\u018f\u0005\f\u0000\u0000\u018d\u018f\u00038"+
		"\u001c\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018f?\u0001\u0000\u0000\u0000\u0190\u0194\u0003B!\u0000"+
		"\u0191\u0192\u00054\u0000\u0000\u0192\u0194\u0003>\u001f\u0000\u0193\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194A\u0001"+
		"\u0000\u0000\u0000\u0195\u019b\u0005\r\u0000\u0000\u0196\u019b\u00036"+
		"\u001b\u0000\u0197\u019b\u00038\u001c\u0000\u0198\u019b\u0003\b\u0004"+
		"\u0000\u0199\u019b\u0005\f\u0000\u0000\u019a\u0195\u0001\u0000\u0000\u0000"+
		"\u019a\u0196\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019bC\u0001\u0000\u0000\u0000\u019c\u019d\u0007\u0001\u0000\u0000\u019d"+
		"E\u0001\u0000\u0000\u0000\u019e\u019f\u0007\u0002\u0000\u0000\u019fG\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0007\u0003\u0000\u0000\u01a1I\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0007\u0004\u0000\u0000\u01a3K\u0001\u0000\u0000"+
		"\u0000+OXdkos\u0080\u0084\u0088\u008f\u0096\u009e\u00a9\u00ba\u00bf\u00c4"+
		"\u00cc\u00d3\u00da\u00e2\u00e7\u00eb\u0102\u0123\u0125\u012e\u013a\u0140"+
		"\u014d\u0154\u0156\u0160\u0165\u0167\u0170\u0174\u0177\u0181\u0186\u0188"+
		"\u018e\u0193\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}