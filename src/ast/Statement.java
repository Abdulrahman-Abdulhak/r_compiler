package ast;

import symbolTable.SymbolTable;

// used as a general type for other classes.
public abstract class Statement extends Line {
    public Statement(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }
}
