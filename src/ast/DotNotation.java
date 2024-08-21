package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class DotNotation extends Notation {
    ValidName member;

    public DotNotation(ValidName member, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.member = member;
    }
    public DotNotation(ValidName member, boolean optional, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(member).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return (optional ? "?" : "") + "." + member.generate();
    }
}
