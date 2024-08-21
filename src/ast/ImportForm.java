package ast;

import Util.ToString;
import errors.messages.AlreadyDefined;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class ImportForm extends Node {
    ValidName theDefault, fullImportAlias;
    NamedImport namedImport;

    public ImportForm(ValidName theDefault, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.theDefault = theDefault;
    }
    public ImportForm(NamedImport namedImport, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.namedImport = namedImport;
    }
    public ImportForm(ValidName fullImportAlias, boolean isFullImport, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, NamedImport namedImport, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.theDefault = theDefault;
        this.namedImport = namedImport;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.theDefault = theDefault;
        this.fullImportAlias = fullImportAlias;
    }
    public ImportForm(ValidName theDefault, ValidName fullImportAlias, NamedImport namedImport, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(symbolTable.has(theDefault.getIdentifier(), true) || symbolTable.has(fullImportAlias.getIdentifier())) {
            return new AlreadyDefined(lineDefined);
        }

        return namedImport.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return symbolTable.has(theDefault.getIdentifier(), true) || symbolTable.has(fullImportAlias.getIdentifier()) || namedImport.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Import Form";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(theDefault, fullImportAlias, namedImport).toList();
    }

    @Override
    public String generate() {
        var theDefault = this.theDefault != null ? this.theDefault.generate() : "";
        var namedAlias = namedImport != null ? namedImport.generate() : "";
        var full = fullImportAlias != null ? "* as " + fullImportAlias.generate() : "";

        var afterDefault = theDefault.isEmpty() ? "" : namedAlias.isEmpty() && full.isEmpty() ? "" : ",";
        var betweenNamedFull = namedAlias.isEmpty() ? "" : full.isEmpty() ? "" : ",";

        return theDefault + afterDefault + namedAlias + betweenNamedFull + full;
    }
}
