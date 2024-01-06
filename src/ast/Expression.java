package ast;

public abstract class Expression {
    abstract String type();
    abstract Object[] members();

    @Override
    public String toString() {
        var strPart1 = ToString.var("type", type());
        var strPart2 = ToString.allNotNull(members());

        var inside = strPart1 + (strPart2.isEmpty() ? ",\n": "") + strPart2;

        return ToString.self(
                "Expression",
                inside
        );
    }
}
