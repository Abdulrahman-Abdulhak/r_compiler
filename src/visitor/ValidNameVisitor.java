package visitor;

import ast.ValidName;
import symbolTable.SymbolTable;

public class ValidNameVisitor extends GeneralVisitor<ValidName> {
    public ValidNameVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }
}
