package ast;

public class ArrowFunction extends Function {
    public ArrowFunction(Args args, FunctionBody body) { super(args, body); }
    public ArrowFunction(Args args, Expression exp) { super(args, exp); }
    public ArrowFunction(ValidName arg, FunctionBody body) { super(new Args(arg), body); }
    public ArrowFunction(ValidName arg, Expression exp) { super(new Args(arg), exp); }

    @Override
    String subType() { return "ArrowFunction"; }
}
