package ast;

import Util.ToString;
import errors.messages.ContinueOutsideLoop;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;

public class Continue extends SpecialLine {
    String label;
    public Continue(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }
    public Continue(String label, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.label = label;
    }

    @Override
    public ErrorMessage errorMessage() {
        return new ContinueOutsideLoop(lineDefined);
    }

    @Override
    public boolean errorCheck() {
        return symbolTable.anyUntilAncestor(
                table -> table.getName().contains("while") ||
                        table.getName().contains("for")
        );
    }

    @Override
    String lineContent() {
        return ToString.var("continue", label);
    }

    @Override
    public String nodeName() {
        return "Line:Continue " + label;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return "continue " + (label == null ? "" : label);
    }
}
