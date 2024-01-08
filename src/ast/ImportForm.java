package ast;

public class ImportForm {
    ValidName theDefault, fullImportAlias;
    NamedImport namedImport;

    public ImportForm(ValidName theDefault) { this.theDefault = theDefault; }
    public ImportForm(NamedImport namedImport) { this.namedImport = namedImport; }
    public ImportForm(ValidName fullImportAlias, boolean isFullImport) {
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, NamedImport namedImport) {
        this.theDefault = theDefault;
        this.namedImport = namedImport;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias) {
        this.theDefault = theDefault;
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias, NamedImport namedImport) {
        this.theDefault = theDefault;
        this.fullImportAlias = fullImportAlias;
        this.namedImport = namedImport;
    }

    public ValidName getTheDefault() {
        return theDefault;
    }

    public ValidName getFullImportAlias() {
        return fullImportAlias;
    }

    public NamedImport getNamedImport() {
        return namedImport;
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
