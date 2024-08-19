package ast;

public class Method extends Function {
    public Method(ValidName name, Args args, FunctionBody body) {
        super(name, args, body);
    }

    @Override
    String subType() { return "Method"; }
}
