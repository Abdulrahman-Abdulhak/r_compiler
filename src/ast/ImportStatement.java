package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class ImportStatement extends Statement {
    String from;
    ImportForm form;

    public ImportStatement(String from, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.from = from;
    }
    public ImportStatement(ImportForm form, String from, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.from = from;
        this.form = form;
    }

    @Override
    String lineContent() {
        var inside = ToString.allNotNull("Source", from, "Form", form);

        return ToString.self(
            "Import",
            inside
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        return form.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return form.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Import " + from;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(form).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "import " + form.generate() + " from " + from;
    }
}
