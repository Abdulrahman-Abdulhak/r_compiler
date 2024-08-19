package ast;

public class NormalFunction extends Function {
    public NormalFunction(ValidName name, Args args, FunctionBody body, int lineDefined) {
        super(name, args, body, lineDefined);
    }

    @Override
    String subType() { return null; }

    @Override
    public String nodeName() {
        return "Function";
    }
}
