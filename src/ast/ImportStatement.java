package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class ImportStatement extends Statement {
    String from;
    ImportForm form;

    public ImportStatement(String from, int lineDefined) {
        super(lineDefined);
        this.from = from;
    }
    public ImportStatement(ImportForm form, String from, int lineDefined) {
        super(lineDefined);
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
    public String nodeName() {
        return "Import " + from;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(form).map(item -> (Node) item).toList();
    }
}
