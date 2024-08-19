package ast;

import java.util.List;
import java.util.stream.Stream;

public class BracketNotation extends Notation {
    Expression member;

    public BracketNotation(Expression member) { this.member = member; }

    public BracketNotation(Expression member, boolean optional) {
        this.member = member;
        this.optional = optional;
    }

    @Override
    String getType() { return "BracketNotation"; }

    @Override
    Object getMember() { return member; }

    @Override
    public String subNodeName() {
        return "Bracket Notation";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(member).map(item -> (Node) item).toList();
    }
}
