package ast;

import symbolTable.SymbolTable;

public class FunctionBody extends Block {
    public FunctionBody(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }

    @Override
    String type() {
        return "Function Body";
    }

    @Override
    public String nodeName() {
        return "Function Body";
    }
}
