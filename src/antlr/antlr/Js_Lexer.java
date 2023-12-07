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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONTINUE", "DO", "FOR", "FUNCTION", "IF", "IN", "NEW", "OF", "RETURN", 
			"WHILE", "DECLARERS", "ID", "PRIM_TYPE", "MULTILINE_COMMENT", "LINE_COMMENT", 
			"INT", "FLOAT", "NUM", "STRING_ALLOWED_CHARS", "STRING", "BOOL", "NULL", 
			"UNDEFINED", "INCREMENT_OP", "DECREMENT_OP", "LOGIC_NOT_OP", "POW_OP", 
			"MULT_OP", "DIV_OP", "REM_OP", "ADD_OP", "SUP_OP", "COMPARE_OP", "EQUAL_COMPARE_OP", 
			"AND", "OR", "NULL_COALES_OP", "TERNARY_OP1", "TERNARY_OP2", "ASSIGNMENT_OP", 
			"COLON", "ADD_ASSIGN_OP", "SUB_ASSIGN_OP", "MULT_ASSIGN_OP", "POW_ASSIGN_OP", 
			"DIV_ASSIGN_OP", "REM_ASSIGN_OP", "AND_ASSIGN_OP", "OR_ASSIGN_OP", "NULL_ASSIGN_OP", 
			"ARROW", "REST_OP", "SPREAD_OP", "SEMICOLON", "COMMA", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACES", 
			"CLOSE_CURLY_BRACES", "NEWLINE", "WS"
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
		"\u0004\u0000>\u01ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00be"+
		"\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u00c2\b\u000b\n\u000b\f\u000b"+
		"\u00c5\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d2\b\r\n\r\f\r\u00d5\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00e0\b\u000e\n\u000e\f\u000e\u00e3\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u00e8\b\u000f\u0001\u000f"+
		"\u0004\u000f\u00eb\b\u000f\u000b\u000f\f\u000f\u00ec\u0001\u0010\u0003"+
		"\u0010\u00f0\b\u0010\u0001\u0010\u0005\u0010\u00f3\b\u0010\n\u0010\f\u0010"+
		"\u00f6\t\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00fa\b\u0010\u000b"+
		"\u0010\f\u0010\u00fb\u0001\u0011\u0001\u0011\u0003\u0011\u0100\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0108\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u010d\b\u0013\n\u0013\f\u0013\u0110\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0116\b\u0013\n\u0013\f\u0013\u0119\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u011f\b\u0013"+
		"\n\u0013\f\u0013\u0122\t\u0013\u0001\u0013\u0003\u0013\u0125\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0130\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u015c\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0168\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00012\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0004=\u01b0\b=\u000b"+
		"=\f=\u01b1\u0001>\u0004>\u01b5\b>\u000b>\f>\u01b6\u0001>\u0001>\u0001"+
		"\u00d3\u0000?\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000\'\u0013)\u0014"+
		"+\u0015-\u0016/\u00171\u00183\u00195\u001a7\u001b9\u001c;\u001d=\u001e"+
		"?\u001fA C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a0c1e2g3i4k5m6o7q8s9u:w;y<{="+
		"}>\u0001\u0000\b\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\n\n"+
		"\r\r\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0001"+
		"\u0000``\u0003\u0000\t\n\r\r  \u01da\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000"+
		"\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000"+
		"/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001"+
		"\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000"+
		"\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000"+
		"=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001"+
		"\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000"+
		"\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000"+
		"K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001"+
		"\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000"+
		"\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000"+
		"Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001"+
		"\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000"+
		"\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000"+
		"g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001"+
		"\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000"+
		"\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000"+
		"u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001"+
		"\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000"+
		"\u0000\u0001\u007f\u0001\u0000\u0000\u0000\u0003\u0088\u0001\u0000\u0000"+
		"\u0000\u0005\u008b\u0001\u0000\u0000\u0000\u0007\u008f\u0001\u0000\u0000"+
		"\u0000\t\u0098\u0001\u0000\u0000\u0000\u000b\u009b\u0001\u0000\u0000\u0000"+
		"\r\u009e\u0001\u0000\u0000\u0000\u000f\u00a2\u0001\u0000\u0000\u0000\u0011"+
		"\u00a5\u0001\u0000\u0000\u0000\u0013\u00ac\u0001\u0000\u0000\u0000\u0015"+
		"\u00bd\u0001\u0000\u0000\u0000\u0017\u00bf\u0001\u0000\u0000\u0000\u0019"+
		"\u00cb\u0001\u0000\u0000\u0000\u001b\u00cd\u0001\u0000\u0000\u0000\u001d"+
		"\u00db\u0001\u0000\u0000\u0000\u001f\u00e7\u0001\u0000\u0000\u0000!\u00ef"+
		"\u0001\u0000\u0000\u0000#\u00ff\u0001\u0000\u0000\u0000%\u0107\u0001\u0000"+
		"\u0000\u0000\'\u0124\u0001\u0000\u0000\u0000)\u012f\u0001\u0000\u0000"+
		"\u0000+\u0131\u0001\u0000\u0000\u0000-\u0136\u0001\u0000\u0000\u0000/"+
		"\u0140\u0001\u0000\u0000\u00001\u0143\u0001\u0000\u0000\u00003\u0146\u0001"+
		"\u0000\u0000\u00005\u0148\u0001\u0000\u0000\u00007\u014b\u0001\u0000\u0000"+
		"\u00009\u014d\u0001\u0000\u0000\u0000;\u014f\u0001\u0000\u0000\u0000="+
		"\u0151\u0001\u0000\u0000\u0000?\u0153\u0001\u0000\u0000\u0000A\u015b\u0001"+
		"\u0000\u0000\u0000C\u0167\u0001\u0000\u0000\u0000E\u0169\u0001\u0000\u0000"+
		"\u0000G\u016c\u0001\u0000\u0000\u0000I\u016f\u0001\u0000\u0000\u0000K"+
		"\u0172\u0001\u0000\u0000\u0000M\u0174\u0001\u0000\u0000\u0000O\u0176\u0001"+
		"\u0000\u0000\u0000Q\u0178\u0001\u0000\u0000\u0000S\u017a\u0001\u0000\u0000"+
		"\u0000U\u017d\u0001\u0000\u0000\u0000W\u0180\u0001\u0000\u0000\u0000Y"+
		"\u0183\u0001\u0000\u0000\u0000[\u0186\u0001\u0000\u0000\u0000]\u0189\u0001"+
		"\u0000\u0000\u0000_\u018c\u0001\u0000\u0000\u0000a\u018f\u0001\u0000\u0000"+
		"\u0000c\u0192\u0001\u0000\u0000\u0000e\u0195\u0001\u0000\u0000\u0000g"+
		"\u0198\u0001\u0000\u0000\u0000i\u019a\u0001\u0000\u0000\u0000k\u019e\u0001"+
		"\u0000\u0000\u0000m\u01a0\u0001\u0000\u0000\u0000o\u01a2\u0001\u0000\u0000"+
		"\u0000q\u01a4\u0001\u0000\u0000\u0000s\u01a6\u0001\u0000\u0000\u0000u"+
		"\u01a8\u0001\u0000\u0000\u0000w\u01aa\u0001\u0000\u0000\u0000y\u01ac\u0001"+
		"\u0000\u0000\u0000{\u01af\u0001\u0000\u0000\u0000}\u01b4\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005c\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081"+
		"\u0082\u0005n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005"+
		"i\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005u\u0000"+
		"\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0002\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005d\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a\u0004"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005f\u0000\u0000\u008c\u008d\u0005"+
		"o\u0000\u0000\u008d\u008e\u0005r\u0000\u0000\u008e\u0006\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005f\u0000\u0000\u0090\u0091\u0005u\u0000\u0000\u0091"+
		"\u0092\u0005n\u0000\u0000\u0092\u0093\u0005c\u0000\u0000\u0093\u0094\u0005"+
		"t\u0000\u0000\u0094\u0095\u0005i\u0000\u0000\u0095\u0096\u0005o\u0000"+
		"\u0000\u0096\u0097\u0005n\u0000\u0000\u0097\b\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005f\u0000\u0000\u009a\n"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c\u009d\u0005"+
		"n\u0000\u0000\u009d\f\u0001\u0000\u0000\u0000\u009e\u009f\u0005n\u0000"+
		"\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0\u00a1\u0005w\u0000\u0000\u00a1"+
		"\u000e\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4"+
		"\u0005f\u0000\u0000\u00a4\u0010\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"r\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005t\u0000"+
		"\u0000\u00a8\u00a9\u0005u\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa"+
		"\u00ab\u0005n\u0000\u0000\u00ab\u0012\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005w\u0000\u0000\u00ad\u00ae\u0005h\u0000\u0000\u00ae\u00af\u0005i"+
		"\u0000\u0000\u00af\u00b0\u0005l\u0000\u0000\u00b0\u00b1\u0005e\u0000\u0000"+
		"\u00b1\u0014\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005v\u0000\u0000\u00b3"+
		"\u00b4\u0005a\u0000\u0000\u00b4\u00be\u0005r\u0000\u0000\u00b5\u00b6\u0005"+
		"l\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7\u00be\u0005t\u0000"+
		"\u0000\u00b8\u00b9\u0005c\u0000\u0000\u00b9\u00ba\u0005o\u0000\u0000\u00ba"+
		"\u00bb\u0005n\u0000\u0000\u00bb\u00bc\u0005s\u0000\u0000\u00bc\u00be\u0005"+
		"t\u0000\u0000\u00bd\u00b2\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00be\u0016\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c3\u0007\u0000\u0000\u0000\u00c0\u00c2\u0007\u0001"+
		"\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u0018\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00cc\u0003#\u0011\u0000\u00c7\u00cc\u0003\'\u0013"+
		"\u0000\u00c8\u00cc\u0003)\u0014\u0000\u00c9\u00cc\u0003+\u0015\u0000\u00ca"+
		"\u00cc\u0003-\u0016\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u001a"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005/\u0000\u0000\u00ce\u00cf\u0005"+
		"*\u0000\u0000\u00cf\u00d3\u0001\u0000\u0000\u0000\u00d0\u00d2\t\u0000"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005*\u0000\u0000\u00d7\u00d8\u0005/\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0006\r\u0000\u0000\u00da"+
		"\u001c\u0001\u0000\u0000\u0000\u00db\u00dc\u0005/\u0000\u0000\u00dc\u00dd"+
		"\u0005/\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00e0\b"+
		"\u0002\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0006\u000e\u0000\u0000\u00e5\u001e\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0005-\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0007\u0003\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed \u0001\u0000\u0000"+
		"\u0000\u00ee\u00f0\u0005-\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0007\u0003\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005.\u0000\u0000\u00f8"+
		"\u00fa\u0007\u0003\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\"\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0003\u001f\u000f\u0000\u00fe\u0100\u0003!\u0010\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100$\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\\\u0000\u0000\u0102\u0108\u0005\"\u0000"+
		"\u0000\u0103\u0104\u0005\\\u0000\u0000\u0104\u0108\u0005\'\u0000\u0000"+
		"\u0105\u0106\u0005\\\u0000\u0000\u0106\u0108\u0005`\u0000\u0000\u0107"+
		"\u0101\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108&\u0001\u0000\u0000\u0000\u0109\u010e"+
		"\u0005\"\u0000\u0000\u010a\u010d\b\u0004\u0000\u0000\u010b\u010d\u0003"+
		"%\u0012\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0125\u0005\"\u0000"+
		"\u0000\u0112\u0117\u0005\'\u0000\u0000\u0113\u0116\b\u0005\u0000\u0000"+
		"\u0114\u0116\u0003%\u0012\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a"+
		"\u0125\u0005\'\u0000\u0000\u011b\u0120\u0005`\u0000\u0000\u011c\u011f"+
		"\b\u0006\u0000\u0000\u011d\u011f\u0003%\u0012\u0000\u011e\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0005`\u0000\u0000\u0124\u0109\u0001\u0000"+
		"\u0000\u0000\u0124\u0112\u0001\u0000\u0000\u0000\u0124\u011b\u0001\u0000"+
		"\u0000\u0000\u0125(\u0001\u0000\u0000\u0000\u0126\u0127\u0005t\u0000\u0000"+
		"\u0127\u0128\u0005r\u0000\u0000\u0128\u0129\u0005u\u0000\u0000\u0129\u0130"+
		"\u0005e\u0000\u0000\u012a\u012b\u0005f\u0000\u0000\u012b\u012c\u0005a"+
		"\u0000\u0000\u012c\u012d\u0005l\u0000\u0000\u012d\u012e\u0005s\u0000\u0000"+
		"\u012e\u0130\u0005e\u0000\u0000\u012f\u0126\u0001\u0000\u0000\u0000\u012f"+
		"\u012a\u0001\u0000\u0000\u0000\u0130*\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005n\u0000\u0000\u0132\u0133\u0005u\u0000\u0000\u0133\u0134\u0005l"+
		"\u0000\u0000\u0134\u0135\u0005l\u0000\u0000\u0135,\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005u\u0000\u0000\u0137\u0138\u0005n\u0000\u0000\u0138\u0139"+
		"\u0005d\u0000\u0000\u0139\u013a\u0005e\u0000\u0000\u013a\u013b\u0005f"+
		"\u0000\u0000\u013b\u013c\u0005i\u0000\u0000\u013c\u013d\u0005n\u0000\u0000"+
		"\u013d\u013e\u0005e\u0000\u0000\u013e\u013f\u0005d\u0000\u0000\u013f."+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0003=\u001e\u0000\u0141\u0142\u0003"+
		"=\u001e\u0000\u01420\u0001\u0000\u0000\u0000\u0143\u0144\u0003?\u001f"+
		"\u0000\u0144\u0145\u0003?\u001f\u0000\u01452\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005!\u0000\u0000\u01474\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"*\u0000\u0000\u0149\u014a\u0005*\u0000\u0000\u014a6\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005*\u0000\u0000\u014c8\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005/\u0000\u0000\u014e:\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"%\u0000\u0000\u0150<\u0001\u0000\u0000\u0000\u0151\u0152\u0005+\u0000"+
		"\u0000\u0152>\u0001\u0000\u0000\u0000\u0153\u0154\u0005-\u0000\u0000\u0154"+
		"@\u0001\u0000\u0000\u0000\u0155\u015c\u0005<\u0000\u0000\u0156\u0157\u0005"+
		"<\u0000\u0000\u0157\u015c\u0005=\u0000\u0000\u0158\u015c\u0005>\u0000"+
		"\u0000\u0159\u015a\u0005>\u0000\u0000\u015a\u015c\u0005=\u0000\u0000\u015b"+
		"\u0155\u0001\u0000\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015b"+
		"\u0158\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"+
		"B\u0001\u0000\u0000\u0000\u015d\u015e\u0005=\u0000\u0000\u015e\u0168\u0005"+
		"=\u0000\u0000\u015f\u0160\u0005=\u0000\u0000\u0160\u0161\u0005=\u0000"+
		"\u0000\u0161\u0168\u0005=\u0000\u0000\u0162\u0163\u0005!\u0000\u0000\u0163"+
		"\u0168\u0005=\u0000\u0000\u0164\u0165\u0005!\u0000\u0000\u0165\u0166\u0005"+
		"=\u0000\u0000\u0166\u0168\u0005=\u0000\u0000\u0167\u015d\u0001\u0000\u0000"+
		"\u0000\u0167\u015f\u0001\u0000\u0000\u0000\u0167\u0162\u0001\u0000\u0000"+
		"\u0000\u0167\u0164\u0001\u0000\u0000\u0000\u0168D\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0005&\u0000\u0000\u016a\u016b\u0005&\u0000\u0000\u016bF"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0005|\u0000\u0000\u016d\u016e\u0005"+
		"|\u0000\u0000\u016eH\u0001\u0000\u0000\u0000\u016f\u0170\u0005?\u0000"+
		"\u0000\u0170\u0171\u0005?\u0000\u0000\u0171J\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0005?\u0000\u0000\u0173L\u0001\u0000\u0000\u0000\u0174\u0175\u0003"+
		"Q(\u0000\u0175N\u0001\u0000\u0000\u0000\u0176\u0177\u0005=\u0000\u0000"+
		"\u0177P\u0001\u0000\u0000\u0000\u0178\u0179\u0005:\u0000\u0000\u0179R"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0003=\u001e\u0000\u017b\u017c\u0003"+
		"O\'\u0000\u017cT\u0001\u0000\u0000\u0000\u017d\u017e\u0003?\u001f\u0000"+
		"\u017e\u017f\u0003O\'\u0000\u017fV\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u00037\u001b\u0000\u0181\u0182\u0003O\'\u0000\u0182X\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u00035\u001a\u0000\u0184\u0185\u0003O\'\u0000\u0185"+
		"Z\u0001\u0000\u0000\u0000\u0186\u0187\u00039\u001c\u0000\u0187\u0188\u0003"+
		"O\'\u0000\u0188\\\u0001\u0000\u0000\u0000\u0189\u018a\u0003;\u001d\u0000"+
		"\u018a\u018b\u0003O\'\u0000\u018b^\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0003E\"\u0000\u018d\u018e\u0003O\'\u0000\u018e`\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0003G#\u0000\u0190\u0191\u0003O\'\u0000\u0191b\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0003I$\u0000\u0193\u0194\u0003O\'\u0000\u0194"+
		"d\u0001\u0000\u0000\u0000\u0195\u0196\u0005=\u0000\u0000\u0196\u0197\u0005"+
		">\u0000\u0000\u0197f\u0001\u0000\u0000\u0000\u0198\u0199\u0003i4\u0000"+
		"\u0199h\u0001\u0000\u0000\u0000\u019a\u019b\u0005.\u0000\u0000\u019b\u019c"+
		"\u0005.\u0000\u0000\u019c\u019d\u0005.\u0000\u0000\u019dj\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005;\u0000\u0000\u019fl\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005,\u0000\u0000\u01a1n\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005(\u0000\u0000\u01a3p\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005)"+
		"\u0000\u0000\u01a5r\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005[\u0000\u0000"+
		"\u01a7t\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005]\u0000\u0000\u01a9v"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005{\u0000\u0000\u01abx\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0005}\u0000\u0000\u01adz\u0001\u0000\u0000\u0000"+
		"\u01ae\u01b0\u0007\u0002\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2|\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0007\u0007\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0006>\u0000\u0000\u01b9~\u0001\u0000\u0000\u0000\u0019\u0000\u00bd"+
		"\u00c3\u00cb\u00d3\u00e1\u00e7\u00ec\u00ef\u00f4\u00fb\u00ff\u0107\u010c"+
		"\u010e\u0115\u0117\u011e\u0120\u0124\u012f\u015b\u0167\u01b1\u01b6\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}