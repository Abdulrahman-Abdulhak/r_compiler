package ast;

public class DotNotation extends Notation {
    ValidName member;

    public DotNotation(ValidName member) { this.member = member; }
    public DotNotation(ValidName member, boolean optional) {
        this.member = member;
        this.optional = optional;
    }

    @Override
    String getType() { return "DotNotation"; }

    @Override
    Object getMember() { return member; }
}
