package ast;

import Util.ToString;

public abstract class Line extends Node {

    abstract String lineContent();

    @Override
    public String toString() {
        return ToString.subType("line", lineContent());
    }
}
