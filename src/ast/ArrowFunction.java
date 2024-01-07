package ast;

public class ArrowFunction extends Function {
    public ArrowFunction(Args args, Block block) { super(args, block); }
    public ArrowFunction(Args args, Expression exp) { super(args, exp); }
    public ArrowFunction(ValidName arg, Block block) { super(new Args(arg), block); }
    public ArrowFunction(ValidName arg, Expression exp) { super(new Args(arg), exp); }

    @Override
    String subType() { return "arrowFunction"; }
}
