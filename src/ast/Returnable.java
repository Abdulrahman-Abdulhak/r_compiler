package ast;

import symbolTable.SymbolTable;

// used as a general type for other classes.
public abstract class Returnable extends Expression {
    public Returnable(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }
}
