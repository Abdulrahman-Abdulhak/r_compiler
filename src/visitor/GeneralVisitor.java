package visitor;

import antlr.ReactParserBaseVisitor;
import errors.Error;
import symbolTable.SymbolTable;

public class GeneralVisitor<T> extends ReactParserBaseVisitor<T> {
    public SymbolTable symbolTable;
    public Error errors;

    public GeneralVisitor(SymbolTable symbolTable, Error errors) {
        this.symbolTable = symbolTable;
        this.errors = errors;
    }
}
