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
		ID=10, PRIM_TYPE=11, MULTILINE_COMMENT=12, LINE_COMMENT=13, INT=14, FLOAT=15, 
		NUM=16, STRING=17, BOOL=18, NULL=19, UNDEFINED=20, INCREMENT_OP=21, DECREMENT_OP=22, 
		LOGIC_NOT_OP=23, POW_OP=24, MULT_OP=25, DIV_OP=26, REM_OP=27, ADD_OP=28, 
		SUP_OP=29, COMPARE_OP=30, EQUAL_COMPARE_OP=31, AND=32, OR=33, NULL_COALES_OP=34, 
		ASSIGNMENT_OP=35, COLON=36, ADD_ASSIGN_OP=37, SUB_ASSIGN_OP=38, MULT_ASSIGN_OP=39, 
		POW_ASSIGN_OP=40, DIV_ASSIGN_OP=41, REM_ASSIGN_OP=42, AND_ASSIGN_OP=43, 
		OR_ASSIGN_OP=44, NULL_ASSIGN_OP=45, ARROW=46, LINE_END=47, NEWLINE=48, 
		SEMICOLON=49, COMMA=50, OPEN_BRACKET=51, CLOSE_BRACKET=52, OPEN_SQUARE_BRACKET=53, 
		CLOSE_SQUARE_BRACKET=54, OPEN_CURLY_BRACES=55, CLOSE_CURLY_BRACES=56, 
		WS=57;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_lineStart = 2, RULE_function = 3, 
		RULE_statement = 4, RULE_if = 5, RULE_while = 6, RULE_for = 7, RULE_forExpression1 = 8, 
		RULE_expressionList = 9, RULE_forin = 10, RULE_forof = 11, RULE_doWhile = 12, 
		RULE_return = 13, RULE_declare = 14, RULE_assignmentRightHand = 15, RULE_arrowFunction = 16, 
		RULE_normalFunction = 17, RULE_functionCall = 18, RULE_expression = 19, 
		RULE_assignment = 20, RULE_scopeHead = 21, RULE_scopeBody = 22, RULE_block = 23, 
		RULE_object = 24, RULE_array = 25, RULE_args = 26, RULE_param = 27, RULE_returnable = 28, 
		RULE_incrementsOp = 29, RULE_multiplicativeOp = 30, RULE_additiveOp = 31, 
		RULE_assinmentOp = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "lineStart", "function", "statement", "if", "while", 
			"for", "forExpression1", "expressionList", "forin", "forof", "doWhile", 
			"return", "declare", "assignmentRightHand", "arrowFunction", "normalFunction", 
			"functionCall", "expression", "assignment", "scopeHead", "scopeBody", 
			"block", "object", "array", "args", "param", "returnable", "incrementsOp", 
			"multiplicativeOp", "additiveOp", "assinmentOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "'for'", "'function'", "'if'", "'in'", "'of'", "'return'", 
			"'while'", null, null, null, null, null, null, null, null, null, null, 
			"'null'", "'undefined'", null, null, "'!'", "'**'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", null, null, "'&&'", "'||'", "'??'", "'='", "':'", null, 
			null, null, null, null, null, null, null, null, "'=>'", null, null, "';'", 
			"','", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DO", "FOR", "FUNCTION", "IF", "IN", "OF", "RETURN", "WHILE", "DECLARERS", 
			"ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", "INT", "FLOAT", 
			"NUM", "STRING", "BOOL", "NULL", "UNDEFINED", "INCREMENT_OP", "DECREMENT_OP", 
			"LOGIC_NOT_OP", "POW_OP", "MULT_OP", "DIV_OP", "REM_OP", "ADD_OP", "SUP_OP", 
			"COMPARE_OP", "EQUAL_COMPARE_OP", "AND", "OR", "NULL_COALES_OP", "ASSIGNMENT_OP", 
			"COLON", "ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", 
			"DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", 
			"ARROW", "LINE_END", "NEWLINE", "SEMICOLON", "COMMA", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", 
			"CLOSE_CURLY_BRACES", "WS"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796102074270L) != 0)) {
				{
				{
				setState(66);
				line();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
		public LineStartContext lineStart() {
			return getRuleContext(LineStartContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(Js_Parser.LINE_END, 0); }
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
			setState(74);
			lineStart();
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				forin();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				forof();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				doWhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				arrowFunction();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				declare();
				}
				break;
			case FUNCTION:
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
				setState(93);
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
		enterRule(_localctx, 10, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			scopeHead();
			setState(98);
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
		enterRule(_localctx, 12, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(WHILE);
			setState(101);
			scopeHead();
			setState(102);
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
		enterRule(_localctx, 14, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FOR);
			setState(105);
			match(OPEN_BRACKET);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796102073864L) != 0)) {
				{
				setState(106);
				forExpression1();
				}
			}

			setState(109);
			match(SEMICOLON);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796102073352L) != 0)) {
				{
				setState(110);
				expressionList();
				}
			}

			setState(113);
			match(SEMICOLON);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796102073352L) != 0)) {
				{
				setState(114);
				expressionList();
				}
			}

			setState(117);
			match(CLOSE_BRACKET);
			setState(118);
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
		enterRule(_localctx, 16, RULE_forExpression1);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				declare();
				}
				break;
			case FUNCTION:
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
				setState(121);
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
		enterRule(_localctx, 18, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					expression(0);
					setState(125);
					match(COMMA);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(132);
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
		enterRule(_localctx, 20, RULE_forin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FOR);
			setState(135);
			match(OPEN_BRACKET);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(136);
				match(DECLARERS);
				}
			}

			setState(139);
			match(ID);
			setState(140);
			match(IN);
			setState(141);
			expression(0);
			setState(142);
			match(CLOSE_BRACKET);
			setState(143);
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
		enterRule(_localctx, 22, RULE_forof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FOR);
			setState(146);
			match(OPEN_BRACKET);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARERS) {
				{
				setState(147);
				match(DECLARERS);
				}
			}

			setState(150);
			match(ID);
			setState(151);
			match(OF);
			setState(152);
			expression(0);
			setState(153);
			match(CLOSE_BRACKET);
			setState(154);
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
		enterRule(_localctx, 24, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DO);
			setState(157);
			scopeBody();
			setState(158);
			match(WHILE);
			setState(159);
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
		enterRule(_localctx, 26, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(RETURN);
			setState(162);
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
		enterRule(_localctx, 28, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DECLARERS);
			setState(165);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT_OP) {
				{
				setState(166);
				assignmentRightHand();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				match(ID);
				setState(171);
				assignmentRightHand();
				}
				}
				setState(176);
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
		enterRule(_localctx, 30, RULE_assignmentRightHand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(ASSIGNMENT_OP);
					setState(178);
					match(ID);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(184);
			match(ASSIGNMENT_OP);
			setState(185);
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
		enterRule(_localctx, 32, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			args();
			setState(188);
			match(ARROW);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(189);
				block();
				}
				break;
			case 2:
				{
				setState(190);
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
		enterRule(_localctx, 34, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FUNCTION);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(194);
				match(ID);
				}
			}

			setState(197);
			args();
			setState(198);
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
		enterRule(_localctx, 36, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				match(OPEN_BRACKET);
				setState(205);
				expression(0);
				setState(206);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				incrementsOp();
				setState(210);
				expression(11);
				}
				break;
			case 4:
				{
				_localctx = new LogicalNOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(LOGIC_NOT_OP);
				setState(213);
				expression(10);
				}
				break;
			case 5:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				assignment();
				}
				break;
			case 6:
				{
				_localctx = new ByValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				returnable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(219);
						match(POW_OP);
						setState(220);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(222);
						multiplicativeOp();
						setState(223);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(226);
						additiveOp();
						setState(227);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230);
						match(COMPARE_OP);
						setState(231);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new CompareWithEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233);
						match(EQUAL_COMPARE_OP);
						setState(234);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new LogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(236);
						match(AND);
						setState(237);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOR_logicalNullContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==NULL_COALES_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new PostIncreContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(242);
						incrementsOp();
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					assinmentOp();
					setState(250);
					match(ID);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(257);
			assinmentOp();
			setState(258);
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
		enterRule(_localctx, 42, RULE_scopeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(OPEN_BRACKET);
			setState(261);
			expression(0);
			setState(262);
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
		enterRule(_localctx, 44, RULE_scopeBody);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(OPEN_CURLY_BRACES);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796102074270L) != 0)) {
				{
				{
				setState(269);
				line();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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
		enterRule(_localctx, 48, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(OPEN_CURLY_BRACES);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						match(ID);
						setState(279);
						match(COLON);
						setState(280);
						returnable();
						setState(281);
						match(COMMA);
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(288);
				match(ID);
				setState(289);
				match(COLON);
				setState(290);
				returnable();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(291);
					match(COMMA);
					}
				}

				}
			}

			setState(296);
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
		enterRule(_localctx, 50, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(OPEN_SQUARE_BRACKET);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796087393288L) != 0)) {
				{
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						returnable();
						setState(300);
						match(COMMA);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(307);
				returnable();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(308);
					match(COMMA);
					}
				}

				}
			}

			setState(313);
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
		enterRule(_localctx, 52, RULE_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OPEN_BRACKET);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						match(ID);
						setState(317);
						match(COMMA);
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				{
				setState(323);
				match(ID);
				}
				}
			}

			setState(326);
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
		enterRule(_localctx, 54, RULE_param);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(OPEN_BRACKET);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 47287796087393288L) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(329);
						returnable();
						setState(330);
						match(COMMA);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				{
				setState(337);
				returnable();
				}
				}
			}

			setState(340);
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
		enterRule(_localctx, 56, RULE_returnable);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIM_TYPE:
				_localctx = new PrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(PRIM_TYPE);
				}
				break;
			case OPEN_CURLY_BRACES:
				_localctx = new ObjectValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				_localctx = new ArrayValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				array();
				}
				break;
			case FUNCTION:
			case OPEN_BRACKET:
				_localctx = new FunctionValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				function();
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
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
		enterRule(_localctx, 58, RULE_incrementsOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 60, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 64, RULE_assinmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70265664962560L) != 0)) ) {
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0166\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"p\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b{\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0080\b\t\n\t\f\t\u0083\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u008a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00ad\b\u000e\n\u000e\f\u000e\u00b0\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00b4\b\u000f\n\u000f\f\u000f\u00b7\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00c0\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00d9\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00f4\b\u0013\n\u0013\f\u0013\u00f7\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00fd\b\u0014\n\u0014\f\u0014\u0100\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u010b\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u010f\b\u0017\n\u0017\f\u0017\u0112\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u011c\b\u0018\n\u0018\f\u0018\u011f\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0125\b\u0018"+
		"\u0003\u0018\u0127\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u012f\b\u0019\n\u0019\f\u0019\u0132"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0136\b\u0019\u0003\u0019"+
		"\u0138\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u013f\b\u001a\n\u001a\f\u001a\u0142\t\u001a\u0001\u001a\u0003"+
		"\u001a\u0145\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u014d\b\u001b\n\u001b\f\u001b\u0150\t\u001b"+
		"\u0001\u001b\u0003\u001b\u0153\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u015c\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0000\u0001&!\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000"+
		"\u0005\u0001\u0000!\"\u0001\u0000\u0015\u0016\u0001\u0000\u0019\u001b"+
		"\u0001\u0000\u001c\u001d\u0002\u0000##%-\u0179\u0000E\u0001\u0000\u0000"+
		"\u0000\u0002J\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006"+
		"Z\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000"+
		"\u0000\fd\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010"+
		"z\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0086"+
		"\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u009c"+
		"\u0001\u0000\u0000\u0000\u001a\u00a1\u0001\u0000\u0000\u0000\u001c\u00a4"+
		"\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00bb\u0001"+
		"\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000$\u00c8\u0001\u0000"+
		"\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000(\u00f8\u0001\u0000\u0000\u0000"+
		"*\u0104\u0001\u0000\u0000\u0000,\u010a\u0001\u0000\u0000\u0000.\u010c"+
		"\u0001\u0000\u0000\u00000\u0115\u0001\u0000\u0000\u00002\u012a\u0001\u0000"+
		"\u0000\u00004\u013b\u0001\u0000\u0000\u00006\u0148\u0001\u0000\u0000\u0000"+
		"8\u015b\u0001\u0000\u0000\u0000:\u015d\u0001\u0000\u0000\u0000<\u015f"+
		"\u0001\u0000\u0000\u0000>\u0161\u0001\u0000\u0000\u0000@\u0163\u0001\u0000"+
		"\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000\u0000"+
		"\u0001I\u0001\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002\u0000KL\u0005"+
		"/\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MW\u0003\u0006\u0003\u0000"+
		"NW\u0003\b\u0004\u0000OW\u0003\n\u0005\u0000PW\u0003\f\u0006\u0000QW\u0003"+
		"\u000e\u0007\u0000RW\u0003\u0014\n\u0000SW\u0003\u0016\u000b\u0000TW\u0003"+
		"\u0018\f\u0000UW\u0003\u001a\r\u0000VM\u0001\u0000\u0000\u0000VN\u0001"+
		"\u0000\u0000\u0000VO\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000"+
		"VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0005\u0001"+
		"\u0000\u0000\u0000X[\u0003 \u0010\u0000Y[\u0003\"\u0011\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0007\u0001\u0000\u0000"+
		"\u0000\\_\u0003\u001c\u000e\u0000]_\u0003&\u0013\u0000^\\\u0001\u0000"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0004\u0000\u0000ab\u0003*\u0015\u0000bc\u0003,\u0016\u0000c\u000b\u0001"+
		"\u0000\u0000\u0000de\u0005\b\u0000\u0000ef\u0003*\u0015\u0000fg\u0003"+
		",\u0016\u0000g\r\u0001\u0000\u0000\u0000hi\u0005\u0002\u0000\u0000ik\u0005"+
		"3\u0000\u0000jl\u0003\u0010\b\u0000kj\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u00051\u0000\u0000np\u0003"+
		"\u0012\t\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u00051\u0000\u0000rt\u0003\u0012\t\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u00054\u0000\u0000vw\u0003,\u0016\u0000w\u000f\u0001\u0000\u0000\u0000"+
		"x{\u0003\u001c\u000e\u0000y{\u0003\u0012\t\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0003&\u0013"+
		"\u0000}~\u00052\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f|\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"&\u0013\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0002"+
		"\u0000\u0000\u0087\u0089\u00053\u0000\u0000\u0088\u008a\u0005\t\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000"+
		"\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008e\u0003&\u0013\u0000\u008e"+
		"\u008f\u00054\u0000\u0000\u008f\u0090\u0003,\u0016\u0000\u0090\u0015\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0094\u0005"+
		"3\u0000\u0000\u0093\u0095\u0005\t\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0005\u0006\u0000"+
		"\u0000\u0098\u0099\u0003&\u0013\u0000\u0099\u009a\u00054\u0000\u0000\u009a"+
		"\u009b\u0003,\u0016\u0000\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0001\u0000\u0000\u009d\u009e\u0003,\u0016\u0000\u009e\u009f\u0005"+
		"\b\u0000\u0000\u009f\u00a0\u0003*\u0015\u0000\u00a0\u0019\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0007\u0000\u0000\u00a2\u00a3\u0003&\u0013"+
		"\u0000\u00a3\u001b\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\t\u0000\u0000"+
		"\u00a5\u00a7\u0005\n\u0000\u0000\u00a6\u00a8\u0003\u001e\u000f\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ae\u0001\u0000\u0000\u0000\u00a9\u00aa\u00052\u0000\u0000\u00aa\u00ab"+
		"\u0005\n\u0000\u0000\u00ab\u00ad\u0003\u001e\u000f\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"#\u0000\u0000\u00b2\u00b4\u0005\n\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005#\u0000"+
		"\u0000\u00b9\u00ba\u0003&\u0013\u0000\u00ba\u001f\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u00034\u001a\u0000\u00bc\u00bf\u0005.\u0000\u0000\u00bd\u00c0"+
		"\u0003.\u0017\u0000\u00be\u00c0\u0003&\u0013\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0!\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0005\u0003\u0000\u0000\u00c2\u00c4\u0005\n\u0000\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u00034\u001a\u0000\u00c6"+
		"\u00c7\u0003.\u0017\u0000\u00c7#\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\n\u0000\u0000\u00c9\u00ca\u00036\u001b\u0000\u00ca%\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0006\u0013\uffff\uffff\u0000\u00cc\u00cd\u00053\u0000"+
		"\u0000\u00cd\u00ce\u0003&\u0013\u0000\u00ce\u00cf\u00054\u0000\u0000\u00cf"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d0\u00d9\u0003$\u0012\u0000\u00d1\u00d2"+
		"\u0003:\u001d\u0000\u00d2\u00d3\u0003&\u0013\u000b\u00d3\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0017\u0000\u0000\u00d5\u00d9\u0003&\u0013"+
		"\n\u00d6\u00d9\u0003(\u0014\u0000\u00d7\u00d9\u00038\u001c\u0000\u00d8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00f5\u0001\u0000\u0000\u0000\u00da\u00db\n\t\u0000\u0000\u00db\u00dc"+
		"\u0005\u0018\u0000\u0000\u00dc\u00f4\u0003&\u0013\n\u00dd\u00de\n\b\u0000"+
		"\u0000\u00de\u00df\u0003<\u001e\u0000\u00df\u00e0\u0003&\u0013\t\u00e0"+
		"\u00f4\u0001\u0000\u0000\u0000\u00e1\u00e2\n\u0007\u0000\u0000\u00e2\u00e3"+
		"\u0003>\u001f\u0000\u00e3\u00e4\u0003&\u0013\b\u00e4\u00f4\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\n\u0006\u0000\u0000\u00e6\u00e7\u0005\u001e\u0000"+
		"\u0000\u00e7\u00f4\u0003&\u0013\u0007\u00e8\u00e9\n\u0005\u0000\u0000"+
		"\u00e9\u00ea\u0005\u001f\u0000\u0000\u00ea\u00f4\u0003&\u0013\u0006\u00eb"+
		"\u00ec\n\u0004\u0000\u0000\u00ec\u00ed\u0005 \u0000\u0000\u00ed\u00f4"+
		"\u0003&\u0013\u0005\u00ee\u00ef\n\u0003\u0000\u0000\u00ef\u00f0\u0007"+
		"\u0000\u0000\u0000\u00f0\u00f4\u0003&\u0013\u0004\u00f1\u00f2\n\f\u0000"+
		"\u0000\u00f2\u00f4\u0003:\u001d\u0000\u00f3\u00da\u0001\u0000\u0000\u0000"+
		"\u00f3\u00dd\u0001\u0000\u0000\u0000\u00f3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fe\u0005\n\u0000\u0000\u00f9\u00fa\u0003@ \u0000\u00fa\u00fb\u0005"+
		"\n\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0003@ \u0000"+
		"\u0102\u0103\u0003&\u0013\u0000\u0103)\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u00053\u0000\u0000\u0105\u0106\u0003&\u0013\u0000\u0106\u0107\u00054"+
		"\u0000\u0000\u0107+\u0001\u0000\u0000\u0000\u0108\u010b\u0003.\u0017\u0000"+
		"\u0109\u010b\u0003\u0004\u0002\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010b-\u0001\u0000\u0000\u0000\u010c"+
		"\u0110\u00057\u0000\u0000\u010d\u010f\u0003\u0002\u0001\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u00058\u0000\u0000\u0114/\u0001\u0000\u0000\u0000\u0115\u0126\u00057"+
		"\u0000\u0000\u0116\u0117\u0005\n\u0000\u0000\u0117\u0118\u0005$\u0000"+
		"\u0000\u0118\u0119\u00038\u001c\u0000\u0119\u011a\u00052\u0000\u0000\u011a"+
		"\u011c\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122"+
		"\u0005$\u0000\u0000\u0122\u0124\u00038\u001c\u0000\u0123\u0125\u00052"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u011d\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u00058\u0000\u0000\u01291\u0001\u0000\u0000\u0000"+
		"\u012a\u0137\u00055\u0000\u0000\u012b\u012c\u00038\u001c\u0000\u012c\u012d"+
		"\u00052\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012b\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0003"+
		"8\u001c\u0000\u0134\u0136\u00052\u0000\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000"+
		"\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u00056\u0000\u0000"+
		"\u013a3\u0001\u0000\u0000\u0000\u013b\u0144\u00053\u0000\u0000\u013c\u013d"+
		"\u0005\n\u0000\u0000\u013d\u013f\u00052\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0145\u0005"+
		"\n\u0000\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u00054\u0000"+
		"\u0000\u01475\u0001\u0000\u0000\u0000\u0148\u0152\u00053\u0000\u0000\u0149"+
		"\u014a\u00038\u001c\u0000\u014a\u014b\u00052\u0000\u0000\u014b\u014d\u0001"+
		"\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0153\u00038\u001c\u0000\u0152\u014e\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u00054\u0000\u0000\u01557\u0001\u0000\u0000\u0000"+
		"\u0156\u015c\u0005\u000b\u0000\u0000\u0157\u015c\u00030\u0018\u0000\u0158"+
		"\u015c\u00032\u0019\u0000\u0159\u015c\u0003\u0006\u0003\u0000\u015a\u015c"+
		"\u0005\n\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015b\u0157\u0001"+
		"\u0000\u0000\u0000\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c9\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0007\u0001\u0000\u0000\u015e;\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0007\u0002\u0000\u0000\u0160=\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0007\u0003\u0000\u0000\u0162?\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0007\u0004\u0000\u0000\u0164A\u0001\u0000\u0000\u0000!EVZ^kos"+
		"z\u0081\u0089\u0094\u00a7\u00ae\u00b5\u00bf\u00c3\u00d8\u00f3\u00f5\u00fe"+
		"\u010a\u0110\u011d\u0124\u0126\u0130\u0135\u0137\u0140\u0144\u014e\u0152"+
		"\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}