package ast;

import Util.ToString;

public abstract class Notation {
    boolean optional = false;

    abstract String getType();
    abstract Object getMember();

    @Override
    public String toString() {
        return ToString.self(
                "Notation",
                ToString.allNotNull("type", getType(), "optional", optional ? true : null, "member", getMember())
        );
    }
}
