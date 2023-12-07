// Generated from C:/Files/Java/r_compiler/src/antlr/Js_Lexer.g4 by ANTLR 4.13.1
package antlr;

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Js_Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COMMA=2, COLON=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, OPEN_SQUARE_BRACKET=6, 
		CLOSE_SQUARE_BRACKET=7, OPEN_CURLY_BRACES=8, CLOSE_CURLY_BRACES=9, CONTINUE=10, 
		DO=11, FOR=12, FUNCTION=13, IF=14, IN=15, NEW=16, OF=17, RETURN=18, WHILE=19, 
		DECLARERS=20, ID=21, PRIM_TYPE=22, MULTILINE_COMMENT=23, LINE_COMMENT=24, 
		INT=25, FLOAT=26, NUM=27, STRING=28, BOOL=29, NULL=30, UNDEFINED=31, INCREMENT_OP=32, 
		DECREMENT_OP=33, LOGIC_NOT_OP=34, POW_OP=35, MULT_OP=36, DIV_OP=37, REM_OP=38, 
		ADD_OP=39, SUP_OP=40, COMPARE_OP=41, EQUAL_COMPARE_OP=42, AND=43, OR=44, 
		NULL_COALES_OP=45, TERNARY_OP1=46, TERNARY_OP2=47, ASSIGNMENT_OP=48, ADD_ASSIGN_OP=49, 
		SUB_ASSIGN_OP=50, MULT_ASSIGN_OP=51, POW_ASSIGN_OP=52, DIV_ASSIGN_OP=53, 
		REM_ASSIGN_OP=54, AND_ASSIGN_OP=55, OR_ASSIGN_OP=56, NULL_ASSIGN_OP=57, 
		ARROW=58, REST_OP=59, SPREAD_OP=60, NEWLINE=61, WS=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "COMMA", "COLON", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", 
			"CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", "CLOSE_CURLY_BRACES", "CONTINUE", 
			"DO", "FOR", "FUNCTION", "IF", "IN", "NEW", "OF", "RETURN", "WHILE", 
			"DECLARERS", "ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", 
			"INT", "FLOAT", "NUM", "STRING_ALLOWED_CHARS", "STRING", "BOOL", "NULL", 
			"UNDEFINED", "INCREMENT_OP", "DECREMENT_OP", "LOGIC_NOT_OP", "POW_OP", 
			"MULT_OP", "DIV_OP", "REM_OP", "ADD_OP", "SUP_OP", "COMPARE_OP", "EQUAL_COMPARE_OP", 
			"AND", "OR", "NULL_COALES_OP", "TERNARY_OP1", "TERNARY_OP2", "ASSIGNMENT_OP", 
			"ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", 
			"DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", 
			"ARROW", "REST_OP", "SPREAD_OP", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'continue'", "'do'", "'for'", "'function'", "'if'", "'in'", "'new'", 
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
			"CONTINUE", "DO", "FOR", "FUNCTION", "IF", "IN", "NEW", "OF", "RETURN", 
			"WHILE", "DECLARERS", "ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", 
			"INT", "FLOAT", "NUM", "STRING", "BOOL", "NULL", "UNDEFINED", "INCREMENT_OP", 
			"DECREMENT_OP", "LOGIC_NOT_OP", "POW_OP", "MULT_OP", "DIV_OP", "REM_OP", 
			"ADD_OP", "SUP_OP", "COMPARE_OP", "EQUAL_COMPARE_OP", "AND", "OR", "NULL_COALES_OP", 
			"TERNARY_OP1", "TERNARY_OP2", "ASSIGNMENT_OP", "ADD_ASSIGN_OP", "SUB_ASSIGN_OP", 
			"MULT_ASSIGN_OP", "POW_ASSIGN_OP", "DIV_ASSIGN_OP", "REM_ASSIGN_OP", 
			"AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", "ARROW", "REST_OP", 
			"SPREAD_OP", "NEWLINE", "WS"
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


	public Js_Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Js_Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000>\u01bc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d0\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00d4\b\u0014\n\u0014\f\u0014\u00d7"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00de\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00e4\b\u0016\n\u0016\f\u0016\u00e7\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00f2\b\u0017\n\u0017\f\u0017\u00f5\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u00fa\b\u0018\u0001\u0018\u0004"+
		"\u0018\u00fd\b\u0018\u000b\u0018\f\u0018\u00fe\u0001\u0019\u0003\u0019"+
		"\u0102\b\u0019\u0001\u0019\u0005\u0019\u0105\b\u0019\n\u0019\f\u0019\u0108"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u010c\b\u0019\u000b\u0019"+
		"\f\u0019\u010d\u0001\u001a\u0001\u001a\u0003\u001a\u0112\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u011a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u011f"+
		"\b\u001c\n\u001c\f\u001c\u0122\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0128\b\u001c\n\u001c\f\u001c\u012b\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0131\b\u001c\n"+
		"\u001c\f\u001c\u0134\t\u001c\u0001\u001c\u0003\u001c\u0137\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0142\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u016e\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u017a\b*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001=\u0004=\u01b0\b=\u000b=\f=\u01b1\u0001"+
		"=\u0001=\u0001>\u0004>\u01b7\b>\u000b>\f>\u01b8\u0001>\u0001>\u0001\u00e5"+
		"\u0000?\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u00009\u001c;\u001d=\u001e?\u001f"+
		"A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a0c1e2g3i4k5m6o7q8s9u:w;y<{=}>\u0001"+
		"\u0000\t\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0001"+
		"\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0001\u0000`"+
		"`\u0003\u0000\n\n\r\r\u2028\u2029\u0004\u0000\t\t\u000b\f  \u00a0\u00a0"+
		"\u01dc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0001\u007f\u0001"+
		"\u0000\u0000\u0000\u0003\u0081\u0001\u0000\u0000\u0000\u0005\u0083\u0001"+
		"\u0000\u0000\u0000\u0007\u0085\u0001\u0000\u0000\u0000\t\u0087\u0001\u0000"+
		"\u0000\u0000\u000b\u0089\u0001\u0000\u0000\u0000\r\u008b\u0001\u0000\u0000"+
		"\u0000\u000f\u008d\u0001\u0000\u0000\u0000\u0011\u008f\u0001\u0000\u0000"+
		"\u0000\u0013\u0091\u0001\u0000\u0000\u0000\u0015\u009a\u0001\u0000\u0000"+
		"\u0000\u0017\u009d\u0001\u0000\u0000\u0000\u0019\u00a1\u0001\u0000\u0000"+
		"\u0000\u001b\u00aa\u0001\u0000\u0000\u0000\u001d\u00ad\u0001\u0000\u0000"+
		"\u0000\u001f\u00b0\u0001\u0000\u0000\u0000!\u00b4\u0001\u0000\u0000\u0000"+
		"#\u00b7\u0001\u0000\u0000\u0000%\u00be\u0001\u0000\u0000\u0000\'\u00cf"+
		"\u0001\u0000\u0000\u0000)\u00d1\u0001\u0000\u0000\u0000+\u00dd\u0001\u0000"+
		"\u0000\u0000-\u00df\u0001\u0000\u0000\u0000/\u00ed\u0001\u0000\u0000\u0000"+
		"1\u00f9\u0001\u0000\u0000\u00003\u0101\u0001\u0000\u0000\u00005\u0111"+
		"\u0001\u0000\u0000\u00007\u0119\u0001\u0000\u0000\u00009\u0136\u0001\u0000"+
		"\u0000\u0000;\u0141\u0001\u0000\u0000\u0000=\u0143\u0001\u0000\u0000\u0000"+
		"?\u0148\u0001\u0000\u0000\u0000A\u0152\u0001\u0000\u0000\u0000C\u0155"+
		"\u0001\u0000\u0000\u0000E\u0158\u0001\u0000\u0000\u0000G\u015a\u0001\u0000"+
		"\u0000\u0000I\u015d\u0001\u0000\u0000\u0000K\u015f\u0001\u0000\u0000\u0000"+
		"M\u0161\u0001\u0000\u0000\u0000O\u0163\u0001\u0000\u0000\u0000Q\u0165"+
		"\u0001\u0000\u0000\u0000S\u016d\u0001\u0000\u0000\u0000U\u0179\u0001\u0000"+
		"\u0000\u0000W\u017b\u0001\u0000\u0000\u0000Y\u017e\u0001\u0000\u0000\u0000"+
		"[\u0181\u0001\u0000\u0000\u0000]\u0184\u0001\u0000\u0000\u0000_\u0186"+
		"\u0001\u0000\u0000\u0000a\u0188\u0001\u0000\u0000\u0000c\u018a\u0001\u0000"+
		"\u0000\u0000e\u018d\u0001\u0000\u0000\u0000g\u0190\u0001\u0000\u0000\u0000"+
		"i\u0193\u0001\u0000\u0000\u0000k\u0196\u0001\u0000\u0000\u0000m\u0199"+
		"\u0001\u0000\u0000\u0000o\u019c\u0001\u0000\u0000\u0000q\u019f\u0001\u0000"+
		"\u0000\u0000s\u01a2\u0001\u0000\u0000\u0000u\u01a5\u0001\u0000\u0000\u0000"+
		"w\u01a8\u0001\u0000\u0000\u0000y\u01aa\u0001\u0000\u0000\u0000{\u01af"+
		"\u0001\u0000\u0000\u0000}\u01b6\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		";\u0000\u0000\u0080\u0002\u0001\u0000\u0000\u0000\u0081\u0082\u0005,\u0000"+
		"\u0000\u0082\u0004\u0001\u0000\u0000\u0000\u0083\u0084\u0005:\u0000\u0000"+
		"\u0084\u0006\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086"+
		"\b\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\n\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005[\u0000\u0000\u008a\f\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005]\u0000\u0000\u008c\u000e\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005{\u0000\u0000\u008e\u0010\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005}\u0000\u0000\u0090\u0012\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005c\u0000\u0000\u0092\u0093\u0005o\u0000\u0000\u0093\u0094\u0005"+
		"n\u0000\u0000\u0094\u0095\u0005t\u0000\u0000\u0095\u0096\u0005i\u0000"+
		"\u0000\u0096\u0097\u0005n\u0000\u0000\u0097\u0098\u0005u\u0000\u0000\u0098"+
		"\u0099\u0005e\u0000\u0000\u0099\u0014\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005d\u0000\u0000\u009b\u009c\u0005o\u0000\u0000\u009c\u0016\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005f\u0000\u0000\u009e\u009f\u0005o\u0000\u0000"+
		"\u009f\u00a0\u0005r\u0000\u0000\u00a0\u0018\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005f\u0000\u0000\u00a2\u00a3\u0005u\u0000\u0000\u00a3\u00a4\u0005"+
		"n\u0000\u0000\u00a4\u00a5\u0005c\u0000\u0000\u00a5\u00a6\u0005t\u0000"+
		"\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8"+
		"\u00a9\u0005n\u0000\u0000\u00a9\u001a\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005i\u0000\u0000\u00ab\u00ac\u0005f\u0000\u0000\u00ac\u001c\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005i\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000"+
		"\u00af\u001e\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005n\u0000\u0000\u00b1"+
		"\u00b2\u0005e\u0000\u0000\u00b2\u00b3\u0005w\u0000\u0000\u00b3 \u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005o\u0000\u0000\u00b5\u00b6\u0005f\u0000"+
		"\u0000\u00b6\"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005r\u0000\u0000"+
		"\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u00ba\u0005t\u0000\u0000\u00ba\u00bb"+
		"\u0005u\u0000\u0000\u00bb\u00bc\u0005r\u0000\u0000\u00bc\u00bd\u0005n"+
		"\u0000\u0000\u00bd$\u0001\u0000\u0000\u0000\u00be\u00bf\u0005w\u0000\u0000"+
		"\u00bf\u00c0\u0005h\u0000\u0000\u00c0\u00c1\u0005i\u0000\u0000\u00c1\u00c2"+
		"\u0005l\u0000\u0000\u00c2\u00c3\u0005e\u0000\u0000\u00c3&\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005v\u0000\u0000\u00c5\u00c6\u0005a\u0000\u0000"+
		"\u00c6\u00d0\u0005r\u0000\u0000\u00c7\u00c8\u0005l\u0000\u0000\u00c8\u00c9"+
		"\u0005e\u0000\u0000\u00c9\u00d0\u0005t\u0000\u0000\u00ca\u00cb\u0005c"+
		"\u0000\u0000\u00cb\u00cc\u0005o\u0000\u0000\u00cc\u00cd\u0005n\u0000\u0000"+
		"\u00cd\u00ce\u0005s\u0000\u0000\u00ce\u00d0\u0005t\u0000\u0000\u00cf\u00c4"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000\u00cf\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d0(\u0001\u0000\u0000\u0000\u00d1\u00d5\u0007"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0007\u0001\u0000\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6*\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00de\u00035\u001a"+
		"\u0000\u00d9\u00de\u00039\u001c\u0000\u00da\u00de\u0003;\u001d\u0000\u00db"+
		"\u00de\u0003=\u001e\u0000\u00dc\u00de\u0003?\u001f\u0000\u00dd\u00d8\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de,\u0001\u0000\u0000\u0000\u00df\u00e0\u0005/\u0000"+
		"\u0000\u00e0\u00e1\u0005*\u0000\u0000\u00e1\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\t\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005*\u0000\u0000\u00e9\u00ea"+
		"\u0005/\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006"+
		"\u0016\u0000\u0000\u00ec.\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005/\u0000"+
		"\u0000\u00ee\u00ef\u0005/\u0000\u0000\u00ef\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\b\u0002\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0006\u0017\u0000\u0000\u00f7"+
		"0\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005-\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0007\u0003\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff2\u0001\u0000"+
		"\u0000\u0000\u0100\u0102\u0005-\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0007\u0003\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000"+
		"\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b\u0005.\u0000\u0000"+
		"\u010a\u010c\u0007\u0003\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e4\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u00031\u0018\u0000\u0110\u0112\u00033\u0019\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u01126\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005\\\u0000\u0000\u0114\u011a\u0005\"\u0000"+
		"\u0000\u0115\u0116\u0005\\\u0000\u0000\u0116\u011a\u0005\'\u0000\u0000"+
		"\u0117\u0118\u0005\\\u0000\u0000\u0118\u011a\u0005`\u0000\u0000\u0119"+
		"\u0113\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u011a8\u0001\u0000\u0000\u0000\u011b\u0120"+
		"\u0005\"\u0000\u0000\u011c\u011f\b\u0004\u0000\u0000\u011d\u011f\u0003"+
		"7\u001b\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0137\u0005\"\u0000"+
		"\u0000\u0124\u0129\u0005\'\u0000\u0000\u0125\u0128\b\u0005\u0000\u0000"+
		"\u0126\u0128\u00037\u001b\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c"+
		"\u0137\u0005\'\u0000\u0000\u012d\u0132\u0005`\u0000\u0000\u012e\u0131"+
		"\b\u0006\u0000\u0000\u012f\u0131\u00037\u001b\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0005`\u0000\u0000\u0136\u011b\u0001\u0000"+
		"\u0000\u0000\u0136\u0124\u0001\u0000\u0000\u0000\u0136\u012d\u0001\u0000"+
		"\u0000\u0000\u0137:\u0001\u0000\u0000\u0000\u0138\u0139\u0005t\u0000\u0000"+
		"\u0139\u013a\u0005r\u0000\u0000\u013a\u013b\u0005u\u0000\u0000\u013b\u0142"+
		"\u0005e\u0000\u0000\u013c\u013d\u0005f\u0000\u0000\u013d\u013e\u0005a"+
		"\u0000\u0000\u013e\u013f\u0005l\u0000\u0000\u013f\u0140\u0005s\u0000\u0000"+
		"\u0140\u0142\u0005e\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141"+
		"\u013c\u0001\u0000\u0000\u0000\u0142<\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005n\u0000\u0000\u0144\u0145\u0005u\u0000\u0000\u0145\u0146\u0005l"+
		"\u0000\u0000\u0146\u0147\u0005l\u0000\u0000\u0147>\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0005u\u0000\u0000\u0149\u014a\u0005n\u0000\u0000\u014a\u014b"+
		"\u0005d\u0000\u0000\u014b\u014c\u0005e\u0000\u0000\u014c\u014d\u0005f"+
		"\u0000\u0000\u014d\u014e\u0005i\u0000\u0000\u014e\u014f\u0005n\u0000\u0000"+
		"\u014f\u0150\u0005e\u0000\u0000\u0150\u0151\u0005d\u0000\u0000\u0151@"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0003O\'\u0000\u0153\u0154\u0003"+
		"O\'\u0000\u0154B\u0001\u0000\u0000\u0000\u0155\u0156\u0003Q(\u0000\u0156"+
		"\u0157\u0003Q(\u0000\u0157D\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"!\u0000\u0000\u0159F\u0001\u0000\u0000\u0000\u015a\u015b\u0005*\u0000"+
		"\u0000\u015b\u015c\u0005*\u0000\u0000\u015cH\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0005*\u0000\u0000\u015eJ\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"/\u0000\u0000\u0160L\u0001\u0000\u0000\u0000\u0161\u0162\u0005%\u0000"+
		"\u0000\u0162N\u0001\u0000\u0000\u0000\u0163\u0164\u0005+\u0000\u0000\u0164"+
		"P\u0001\u0000\u0000\u0000\u0165\u0166\u0005-\u0000\u0000\u0166R\u0001"+
		"\u0000\u0000\u0000\u0167\u016e\u0005<\u0000\u0000\u0168\u0169\u0005<\u0000"+
		"\u0000\u0169\u016e\u0005=\u0000\u0000\u016a\u016e\u0005>\u0000\u0000\u016b"+
		"\u016c\u0005>\u0000\u0000\u016c\u016e\u0005=\u0000\u0000\u016d\u0167\u0001"+
		"\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016d\u016a\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016eT\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005=\u0000\u0000\u0170\u017a\u0005=\u0000\u0000"+
		"\u0171\u0172\u0005=\u0000\u0000\u0172\u0173\u0005=\u0000\u0000\u0173\u017a"+
		"\u0005=\u0000\u0000\u0174\u0175\u0005!\u0000\u0000\u0175\u017a\u0005="+
		"\u0000\u0000\u0176\u0177\u0005!\u0000\u0000\u0177\u0178\u0005=\u0000\u0000"+
		"\u0178\u017a\u0005=\u0000\u0000\u0179\u016f\u0001\u0000\u0000\u0000\u0179"+
		"\u0171\u0001\u0000\u0000\u0000\u0179\u0174\u0001\u0000\u0000\u0000\u0179"+
		"\u0176\u0001\u0000\u0000\u0000\u017aV\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0005&\u0000\u0000\u017c\u017d\u0005&\u0000\u0000\u017dX\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0005|\u0000\u0000\u017f\u0180\u0005|\u0000\u0000"+
		"\u0180Z\u0001\u0000\u0000\u0000\u0181\u0182\u0005?\u0000\u0000\u0182\u0183"+
		"\u0005?\u0000\u0000\u0183\\\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"?\u0000\u0000\u0185^\u0001\u0000\u0000\u0000\u0186\u0187\u0003\u0005\u0002"+
		"\u0000\u0187`\u0001\u0000\u0000\u0000\u0188\u0189\u0005=\u0000\u0000\u0189"+
		"b\u0001\u0000\u0000\u0000\u018a\u018b\u0003O\'\u0000\u018b\u018c\u0003"+
		"a0\u0000\u018cd\u0001\u0000\u0000\u0000\u018d\u018e\u0003Q(\u0000\u018e"+
		"\u018f\u0003a0\u0000\u018ff\u0001\u0000\u0000\u0000\u0190\u0191\u0003"+
		"I$\u0000\u0191\u0192\u0003a0\u0000\u0192h\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0003G#\u0000\u0194\u0195\u0003a0\u0000\u0195j\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0003K%\u0000\u0197\u0198\u0003a0\u0000\u0198l\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0003M&\u0000\u019a\u019b\u0003a0\u0000"+
		"\u019bn\u0001\u0000\u0000\u0000\u019c\u019d\u0003W+\u0000\u019d\u019e"+
		"\u0003a0\u0000\u019ep\u0001\u0000\u0000\u0000\u019f\u01a0\u0003Y,\u0000"+
		"\u01a0\u01a1\u0003a0\u0000\u01a1r\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0003[-\u0000\u01a3\u01a4\u0003a0\u0000\u01a4t\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005=\u0000\u0000\u01a6\u01a7\u0005>\u0000\u0000\u01a7v"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003y<\u0000\u01a9x\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005.\u0000\u0000\u01ab\u01ac\u0005.\u0000\u0000"+
		"\u01ac\u01ad\u0005.\u0000\u0000\u01adz\u0001\u0000\u0000\u0000\u01ae\u01b0"+
		"\u0007\u0007\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0006=\u0000\u0000\u01b4|\u0001\u0000\u0000\u0000\u01b5\u01b7\u0007\b"+
		"\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0006>\u0000"+
		"\u0000\u01bb~\u0001\u0000\u0000\u0000\u0019\u0000\u00cf\u00d5\u00dd\u00e5"+
		"\u00f3\u00f9\u00fe\u0101\u0106\u010d\u0111\u0119\u011e\u0120\u0127\u0129"+
		"\u0130\u0132\u0136\u0141\u016d\u0179\u01b1\u01b8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}