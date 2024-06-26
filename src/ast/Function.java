package ast;

import Util.ToString;

public abstract class Function extends Returnable {
    ValidName name;
    Args args;
    Block block;
    Expression returnExp;

    public Function(ValidName name, Args args, Block block) {
        this.name = name;
        this.args = args;
        this.block = block;
    }
    public Function(Args args, Block block) {
        this.args = args;
        this.block = block;
    }
    public Function(Args args, Expression expression) {
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
        return new Object[]{"name", name, "args", args, "body", block, "body", returnExp};
    }
}
