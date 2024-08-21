package ast;

import Util.ToString;
import symbolTable.SymbolTable;

public abstract class Notation extends Node {
    boolean optional = false;

    public Notation(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }

    abstract String getType();
    abstract Object getMember();

    @Override
    public String toString() {
        return ToString.self(
            "Notation",
            ToString.allNotNull("type", getType(), "optional", optional ? true : null, "member", getMember())
        );
    }

    @Override
    public String nodeName() {
        return (optional ? "Optional " : "") + subNodeName();
    }

    public abstract String subNodeName();
}
