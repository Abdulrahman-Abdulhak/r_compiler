package ast;

public class FunctionBody extends Block {
    @Override
    String type() {
        return "Function Body";
    }

    @Override
    public String nodeName() {
        return "Function Body";
    }
}
