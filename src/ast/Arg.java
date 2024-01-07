package ast;

public class Arg {
    ValidName name;
    ObjectDestructuring obj;
    ArrayDestructuring arr;

    public Arg(ValidName name) { this.name = name; }
    public Arg(ObjectDestructuring obj) { this.obj = obj; }
    public Arg(ArrayDestructuring arr) { this.arr = arr; }

    @Override
    public String toString() {
        return ToString.self(
                "arg",
                ToString.allNotNull("var", name, "vars", obj, "vars", arr)
        );
    }
}
