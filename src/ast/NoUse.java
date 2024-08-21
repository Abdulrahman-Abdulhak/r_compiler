package ast;

import errors.messages.ErrorMessage;

import java.util.List;

public class NoUse extends Statement {
    public NoUse(){
        super(0, null);
    }
    public NoUse(int lineDefined){
        super(lineDefined, null);
    }

    @Override
    String lineContent() { return null; }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return null;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }

    @Override
    public String generate() {
        return ";";
    }
}
