package ast;

public class AnonymousFunction extends Function {
    public AnonymousFunction(Args args, Block block) { super(args, block); }

    @Override
    String subType() { return "Anonymous"; }
}
