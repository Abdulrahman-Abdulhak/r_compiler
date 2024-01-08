package ast;

import java.util.ArrayList;
import java.util.List;

public class ObjectDestructuring {
    List<DestructuredObjVar> vars;

    public ObjectDestructuring() { vars = new ArrayList<>(); }

    public void addVar(DestructuredObjVar var) { vars.add(var); }

    public List<DestructuredObjVar> getVars() {
        return vars;
    }

    @Override
    public String toString() {
        return ToString.self(
                "Object Destructuring",
                ToString.var("vars", vars)
        );
    }
}
