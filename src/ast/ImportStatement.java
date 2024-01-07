package ast;

public class ImportStatement extends Statement {
    String from;
    ImportForm form;

    public ImportStatement(String from) {
        this.from = from;
    }
    public ImportStatement(ImportForm form, String from) {
        this.from = from;
        this.form = form;
    }

    @Override
    String lineContent() {
        var inside = ToString.allNotNull("From", from, "Form", form);

        return ToString.self(
                "Import",
                inside
        );
    }
}
