package ast;

public class ValidName extends Expression {
    String identifier;

    public ValidName(String id) { identifier = id; }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    String type() { return "ValidName"; }

    @Override
    Object[] members() {
        return new Object[]{"identifier", identifier};
    }
}
