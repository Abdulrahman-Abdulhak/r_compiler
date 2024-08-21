package ast;

import symbolTable.SymbolTable;

// used as a general type for other classes
public abstract class SpecialLine extends Line {
    public SpecialLine(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }
}
