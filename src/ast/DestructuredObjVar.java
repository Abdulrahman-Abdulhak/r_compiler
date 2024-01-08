package ast;

public class DestructuredObjVar {
    Object key;
    ValidName var;
    Expression defaultValue;

    public DestructuredObjVar(ValidName var) { this.var = var; }
    public DestructuredObjVar(Object key, ValidName var) {
        this.key = key;
        this.var = var;
    }
    public DestructuredObjVar(ValidName var, Expression defaultValue) {
        this.defaultValue = defaultValue;
        this.var = var;
    }
    public DestructuredObjVar(Object key, ValidName var, Expression defaultValue) {
        this.key = key;
        this.var = var;
        this.defaultValue = defaultValue;
    }

    public ValidName getVar() {
        return var;
    }

    @Override
    public String toString() {
        return ToString.self(
                "Destructured-Object Var",
                ToString.allNotNull("original-key", key, "variable", var, "default-val", defaultValue)
        );
    }
}
