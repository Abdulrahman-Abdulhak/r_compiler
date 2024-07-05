package visitor;

import antlr.ReactParserBaseVisitor;
import symbolTable.SymbolTable;

public class GeneralVisitor<T> extends ReactParserBaseVisitor<T> {
    public SymbolTable symbolTable;
    public GeneralVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
