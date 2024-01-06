package ast;

public class NormalFunction extends Function {
    public NormalFunction(ValidName name, Args args, Block block) {
        super(name, args, block);
    }

    @Override
    String subType() { return null; }
}
