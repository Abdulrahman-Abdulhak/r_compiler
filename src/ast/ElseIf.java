package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

public class ElseIf extends If {
    public ElseIf(Expression test, Block body, int lineDefined, SymbolTable symbolTable) {
        super(test, body, lineDefined, symbolTable);
        elseIfs = null;
    }

    public ElseIf(Expression test, Line line, int lineDefined, SymbolTable symbolTable) {
        super(test, line, lineDefined, symbolTable);
        elseIfs = null;
    }

    @Override
    public ErrorMessage errorMessage() {
        return test.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return test.errorCheck();
    }

    @Override
    String lineContent() {
        return ToString.self(
            "elseIf",
            ToString.allNotNull(
                "condition", test,
                "body", body,
                "body", line
            )
        );
    }

    @Override
    public String nodeName() {
        return "Else If";
    }

    @Override
    public String generate() {
        return "else if (" + test.generate() + ")" + (line != null ? line.generate() + new NoUse().generate() : body.generate());
    }
}
