package ast;

public abstract class Notation {
    boolean optional = false;

    abstract String getType();
    abstract Object getMember();

    @Override
    public String toString() {
        return ToString.self(
                "Notation",
                ToString.all("type", getType(), "optional", optional, "member", getMember())
        );
    }
}
