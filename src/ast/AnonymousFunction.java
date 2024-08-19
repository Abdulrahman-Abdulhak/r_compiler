package ast;

public class AnonymousFunction extends Function {
    public AnonymousFunction(Args args, FunctionBody body, int lineDefined) {
        super(args, body, lineDefined);
    }

    @Override
    String subType() { return "Anonymous"; }

    @Override
    public String nodeName() {
        return "Anonymous Function";
    }
}
