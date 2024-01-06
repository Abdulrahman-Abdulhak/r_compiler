package ast;

public class ArrowFunction extends Function {
    public ArrowFunction(Args args, Block block) { super(args, block); }
    public ArrowFunction(Args args, Expression exp) { super(args, exp); }
    public ArrowFunction(ValidName arg, Block block) { super(Args.fromValidName(arg), block); }
    public ArrowFunction(ValidName arg, Expression exp) { super(Args.fromValidName(arg), exp); }

    @Override
    String subType() { return "arrowFunction"; }
}
