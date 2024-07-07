package ast;

import Util.ToString;
import symbolTable.VariableDefineMethod;

import java.util.ArrayList;
import java.util.List;

public class Declare extends Statement {
    VariableDefineMethod declarer;
    List<Declarement> declarements;

    public Declare(String declarer) {
        this(VariableDefineMethod.fromString(declarer));
    }
    public Declare(VariableDefineMethod declarer) {
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
}
