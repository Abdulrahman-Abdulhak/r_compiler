package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class ImportForm extends Node {
    ValidName theDefault, fullImportAlias;
    NamedImport namedImport;

    public ImportForm(ValidName theDefault, int lineDefined) {
        super(lineDefined);
        this.theDefault = theDefault;
    }
    public ImportForm(NamedImport namedImport, int lineDefined) {
        super(lineDefined);
        this.namedImport = namedImport;
    }
    public ImportForm(ValidName fullImportAlias, boolean isFullImport, int lineDefined) {
        super(lineDefined);
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, NamedImport namedImport, int lineDefined) {
        super(lineDefined);
        this.theDefault = theDefault;
        this.namedImport = namedImport;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias, int lineDefined) {
        super(lineDefined);
        this.theDefault = theDefault;
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias, NamedImport namedImport, int lineDefined) {
        super(lineDefined);
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

        return ToString.self("", inside );
    }

    @Override
    public String nodeName() {
        return "Import Form";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(theDefault, fullImportAlias, namedImport).toList();
    }
}
