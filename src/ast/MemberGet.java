package ast;

public class MemberGet extends Expression {
    Notation notation;
    Expression parent;

    public MemberGet(Expression parent, Notation notation) {
        this.parent = parent;
        this.notation = notation;
    }

    @Override
    String type() { return "MemberGet"; }

    @Override
    Object[] members() {
        return new Object[]{"parent", parent, "notation", notation};
    }
}
