package ast;

import java.util.ArrayList;
import java.util.List;

public class Declare extends Statement {
    String declarer;
    List<Declarement> declarements;

    public Declare(String declarer) {
        this.declarer = declarer;
        this.declarements = new ArrayList<>();
    }

    public void addDeclarement(Declarement declarement) {
        declarements.add(declarement);
    }

    public String getDeclarer() {
        return declarer;
    }

    public List<Declarement> getDeclarements() {
        return declarements;
    }

    @Override
    String lineContent() {
        return ToString.self(
                "Declare",
                ToString.all("declarer", declarer, "declarement list", declarements)
        );
    }
}
