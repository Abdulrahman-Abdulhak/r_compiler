package ast;

public class AnonymousFunction extends Function {
    public AnonymousFunction(Args args, FunctionBody body) { super(args, body); }

    @Override
    String subType() { return "Anonymous"; }
}
