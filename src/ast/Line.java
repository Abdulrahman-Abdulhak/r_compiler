package ast;

import Util.ToString;

public abstract class Line extends Node {
    public Line(int lineDefined) {
        super(lineDefined);
    }

    abstract String lineContent();

    @Override
    public String toString() {
        return ToString.subType("line", lineContent());
    }
}
