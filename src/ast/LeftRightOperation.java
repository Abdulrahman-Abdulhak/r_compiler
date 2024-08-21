package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

public abstract class LeftRightOperation extends Expression {
    Expression left, right;
    String sign;

    LeftRightOperation(Expression left, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.left = left;
        this.right = right;
    }
    LeftRightOperation(Expression left, String sign, Expression right, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.left = left;
        this.right = right;
        this.sign = sign;
    }

    @Override
    public ErrorMessage errorMessage() {
        if(left.errorCheck()) return left.errorMessage();
        return right.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return left.errorCheck() || right.errorCheck();
    }

    @Override
    Object[] members() {
        return new Object[]{"left", left, "sign", sign, "right", right};
    }

    @Override
    public String generate() {
        return left.generate() + " " + sign + " " + right.generate();
    }
}
