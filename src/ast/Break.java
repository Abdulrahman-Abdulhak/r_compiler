package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import errors.messages.IllegalBreak;
import symbolTable.SymbolTable;

import java.util.List;

public class Break extends SpecialLine {
    String label;
    public Break(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }

    @Override
    public ErrorMessage errorMessage() {
        return new IllegalBreak(lineDefined);
    }

    @Override
    public boolean errorCheck() {
        return symbolTable.anyUntilAncestor(
                table -> table.getName().contains("while") ||
                        table.getName().contains("for") ||
                        table.getName().contains("switch")
        );
    }

    public Break(String label, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.label = label;
    }

    @Override
    String lineContent() {
        return ToString.var("break", label);
    }

    @Override
    public String nodeName() {
        return "Line:Break " + label;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return "break " + (label == null ? "" : label);
    }
}
