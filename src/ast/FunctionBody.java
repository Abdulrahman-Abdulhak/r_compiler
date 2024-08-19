package ast;

public class FunctionBody extends Block {
    public FunctionBody(int lineDefined) {
        super(lineDefined);
    }

    @Override
    String type() {
        return "Function Body";
    }

    @Override
    public String nodeName() {
        return "Function Body";
    }
}
