package ast;

import java.util.List;
import java.util.stream.Stream;

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

    @Override
    public String nodeName() {
        return "Member Get";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(notation, parent).toList();
    }
}
