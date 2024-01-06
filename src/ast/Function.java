package ast;

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
        var sub = subType();
        if(sub == null || sub.isEmpty()) return "function";
        return "function:" + sub;
    }

    @Override
    Object[] members() {
        return new Object[]{"name", name, "args", args, "body", block, "body", returnExp};
    }
}
