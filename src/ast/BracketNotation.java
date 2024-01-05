package ast;

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
}
