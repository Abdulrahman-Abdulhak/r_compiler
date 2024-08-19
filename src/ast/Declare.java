package ast;

import Util.ToString;
import symbolTable.VariableDefineMethod;

import java.util.ArrayList;
import java.util.List;

public class Declare extends Statement {
    VariableDefineMethod declarer;
    List<Declarement> declarements;

    public Declare(String declarer, int lineDefined) {
        this(VariableDefineMethod.fromString(declarer), lineDefined);
    }
    public Declare(VariableDefineMethod declarer, int lineDefined) {
        super(lineDefined);
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
    public String nodeName() {
        return "Declare " + declarer;
    }

    @Override
    public List<Node> childNodes() {
        return declarements.stream().map(declare -> (Node) declare).toList();
    }
}
