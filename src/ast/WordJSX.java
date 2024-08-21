package ast;

import symbolTable.SymbolTable;

public class WordJSX extends JSX {
    public WordJSX(String word, int lineDefined) {
        super(word, lineDefined, null);
    }

    @Override
    String type() { return "JSX_Word"; }

    @Override
    public String generate() {
        return "\"" + identifier.toString() + "\"";
    }
}
