package ast;

public abstract class ImportForm extends Statement {
    ValidName theDefault, fullImportAlias;
    NamedImport namedImport;

    public ImportForm(ValidName theDefault, ValidName fullImportAlias, NamedImport namedImport) {
        this.theDefault = theDefault;
        this.fullImportAlias = fullImportAlias;
        this.namedImport = namedImport;
    }

    @Override
    public String toString() {
        var inside = ToString.allNotNull(
                "default", theDefault.identifier,
                "Named_Import", namedImport,
                "Full Import", ToString.nameAlias("*", fullImportAlias)
        );

        return ToString.self(
                "Import",
                inside
        );
    }
}
