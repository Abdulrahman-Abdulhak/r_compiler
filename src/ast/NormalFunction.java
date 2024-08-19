package ast;

public class NormalFunction extends Function {
    public NormalFunction(ValidName name, Args args, FunctionBody body) {
        super(name, args, body);
    }

    @Override
    String subType() { return null; }

    @Override
    public String nodeName() {
        return "Function";
    }
}
