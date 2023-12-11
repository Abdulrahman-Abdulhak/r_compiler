package js;

import antlr.Js_Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;

// this class should be used to manipulating the lexer rules and tokens
public class JsLexerBase extends Lexer {
    public JsLexerBase(CharStream input) {
        super(input);
    }

    public boolean falser() {return false;}

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }
}
