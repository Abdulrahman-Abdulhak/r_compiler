package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public abstract class Function extends Returnable {
    ValidName name;
    Args args;
    FunctionBody body;
    Expression returnExp;

    public Function(Args args, FunctionBody body, int lineDefined) {
        this(null, args, body, lineDefined);
    }
    public Function(ValidName name, Args args, FunctionBody body, int lineDefined) {
        super(lineDefined);
        this.name = name;
        this.args = args;
        this.body = body;
    }
    public Function(Args args, Expression expression, int lineDefined) {
        super(lineDefined);
        this.args = args;
        this.returnExp = expression;
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
        return Stream.of(name, args, body, returnExp).map(item -> (Node) item).toList();
    }
}
