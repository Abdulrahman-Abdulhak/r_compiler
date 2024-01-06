package ast;

public abstract class Line {

    abstract String lineContent();

    @Override
    public String toString() {
        return ToString.var("line", lineContent());
    }
}
