package ast;

import java.util.List;
import java.util.stream.Stream;

public class DotNotation extends Notation {
    ValidName member;

    public DotNotation(ValidName member, int lineDefined) {
        super(lineDefined);
        this.member = member;
    }
    public DotNotation(ValidName member, boolean optional, int lineDefined) {
        super(lineDefined);
        this.member = member;
        this.optional = optional;
    }

    @Override
    String getType() { return "DotNotation"; }

    @Override
    Object getMember() { return member; }

    @Override
    public String subNodeName() {
        return "Dot Notation";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(member).map(item -> (Node) item).toList();
    }
}
