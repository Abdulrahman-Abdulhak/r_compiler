package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public abstract class Function extends Returnable {
    ValidName name;
    Args args;
    FunctionBody body;
    Expression returnExp;

    public Function(Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        this(null, args, body, lineDefined, symbolTable);
    }
    public Function(ValidName name, Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.name = name;
        this.args = args;
        this.body = body;
    }
    public Function(Args args, Expression expression, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.args = args;
        this.returnExp = expression;
    }

    @Override
    public ErrorMessage errorMessage() {
        return body.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return body.errorCheck();
    }

    abstract String subType();
    @Override
    String type() {
        return ToString.subType("Function", subType());
    }

    @Override
    Object[] members() {
        return new Object[]{"name", name, "args", args, "body", body, "body", returnExp};
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(name, args, body, returnExp).toList();
    }
}
