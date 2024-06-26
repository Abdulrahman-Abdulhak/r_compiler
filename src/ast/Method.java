package ast;

public class Method extends Function {
    public Method(ValidName name, Args args, Block block) {
        super(name, args, block);
    }

    @Override
    String subType() { return "Method"; }
}
