package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class BracketNotation extends Notation {
    Expression member;

    public BracketNotation(Expression member, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.member = member;
    }

    public BracketNotation(Expression member, boolean optional, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        return member.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return member.errorCheck();
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(member).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return (optional ? "?" : "") + "[" + member.generate() + "]";
    }
}
