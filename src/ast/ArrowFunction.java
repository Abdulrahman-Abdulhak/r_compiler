package ast;

public class ArrowFunction extends Function {
    public ArrowFunction(Args args, FunctionBody body, int lineDefined) {
        super(args, body, lineDefined);
    }
    public ArrowFunction(Args args, Expression exp, int lineDefined) {
        super(args, exp, lineDefined);
    }
    public ArrowFunction(ValidName arg, FunctionBody body, int lineDefined) {
        super(new Args(arg, lineDefined), body, lineDefined);
    }
    public ArrowFunction(ValidName arg, Expression exp, int lineDefined) {
        super(new Args(arg, lineDefined), exp, lineDefined);
    }

    @Override
    String subType() { return "ArrowFunction"; }

    @Override
    public String nodeName() {
        return "Arrow Function";
    }
}
