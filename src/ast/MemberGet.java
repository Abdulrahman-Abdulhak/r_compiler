package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class MemberGet extends Expression {
    Notation notation;
    Expression parent;

    public MemberGet(Expression parent, Notation notation, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(parent.errorCheck()) return parent.errorMessage();
        return notation.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return parent.errorCheck() || notation.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Member Get";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(notation, parent).toList();
    }

    @Override
    public String generate() {
        return parent.generate() + notation.generate();
    }
}
