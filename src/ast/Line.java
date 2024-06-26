package ast;

import Util.ToString;

public abstract class Line {

    abstract String lineContent();

    @Override
    public String toString() {
        return ToString.subType("line", lineContent());
    }
}
