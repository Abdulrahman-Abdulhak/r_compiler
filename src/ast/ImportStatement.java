package ast;

public class ImportStatement extends Statement {
    String from;
    ImportForm form;

    public ImportStatement(ImportForm form, String from) {
        this.from = from;
        this.form = form;
    }

    @Override
    String lineContent() {
        var inside = ToString.all(
                "From", from,
                "Form", form
        );

        return ToString.self(
                "Import",
                inside
        );
    }
}
