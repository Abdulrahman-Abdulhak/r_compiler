package visitor;

import ast.ValidName;
import errors.Error;
import symbolTable.SymbolTable;

public class ValidNameVisitor extends GeneralVisitor<ValidName> {
    public ValidNameVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }
}
