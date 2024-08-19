package ast;

public class Method extends Function {
    public Method(ValidName name, Args args, FunctionBody body, int lineDefined) {
        super(name, args, body, lineDefined);
    }

    @Override
    String subType() { return "Method"; }

    @Override
    public String nodeName() {
        return "Method";
    }
}
