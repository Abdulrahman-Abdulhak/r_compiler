package ast;

import Util.ToString;
import symbolTable.SymbolTable;

public class Else extends If {
    Block body;
    Line line;

    public Else(Block body, int lineDefined, SymbolTable symbolTable) {
        super(null, body, lineDefined, symbolTable);
        elseIfs = null;
    }

    public Else(Line line, int lineDefined, SymbolTable symbolTable) {
        super(null, line, lineDefined, symbolTable);
        elseIfs = null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "else",
            ToString.allNotNull(
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public String nodeName() {
        return "Else";
    }

    @Override
    public String generate() {
        return "else " + (line != null ? line.generate() + new NoUse().generate() : body.generate());
    }
}
