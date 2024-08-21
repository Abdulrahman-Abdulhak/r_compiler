package ast;

import Util.ToString;
import symbolTable.SymbolTable;

import java.util.Objects;

public abstract class Line extends Node {
    public Line(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }

    abstract String lineContent();

    @Override
    public String toString() {
        return ToString.subType("line", lineContent());
    }
}
