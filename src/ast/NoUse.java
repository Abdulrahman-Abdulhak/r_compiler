package ast;

public class NoUse extends Statement {
    public NoUse(){}

    @Override
    String lineContent() { return null; }

    @Override
    public String toString() { return ""; }
}
