package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;

import java.util.ArrayList;
import java.util.List;

public class Declare extends Statement {
    VariableDefineMethod declarer;
    List<Declarement> declarements;

    public Declare(String declarer, int lineDefined, SymbolTable symbolTable) {
        this(VariableDefineMethod.fromString(declarer), lineDefined, symbolTable);
    }
    public Declare(VariableDefineMethod declarer, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.declarer = declarer;
        this.declarements = new ArrayList<>();
    }

    public void addDeclarement(Declarement declarement) {
        declarements.add(declarement);
    }

    public VariableDefineMethod getDeclarer() {
        return declarer;
    }

    public List<Declarement> getDeclarements() {
        return declarements;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "Declare",
            ToString.all("declarer", declarer, "declare list", declarements)
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorDeclarements = declarements.stream().filter(Node::errorCheck).toList();
        var errorDelarement = errorDeclarements.isEmpty() ? null : errorDeclarements.getFirst();

        if(errorDelarement == null) return null;
        return errorDelarement.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return declarements.stream().anyMatch(Node::errorCheck);
    }

    @Override
    public String nodeName() {
        return "Declare " + declarer;
    }

    @Override
    public List<Node> childNodes() {
        return declarements.stream().map(declare -> (Node) declare).toList();
    }

    private String declarementsGenerate() {
        var str = new StringBuilder();

        for (var decalrement : declarements) {
            str.append(decalrement.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }

    @Override
    public String generate() {
        return declarer + " " + declarementsGenerate();
    }
}
