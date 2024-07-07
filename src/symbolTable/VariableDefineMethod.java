package symbolTable;

public enum VariableDefineMethod {
    var("var", true),
    let("let", false, true),
    constant("const", false),
    imported("import", false),
    function("function", true),
    argument("function-argument", true)
    ;

    public static VariableDefineMethod fromString(String str) {
        for (var defMethod : VariableDefineMethod.values()) {
            if(str.equals(defMethod.name)) return defMethod;
        }

        throw new Error("Error: not a VariableDefineMethod string.");
    }

    final String name;
    public final boolean redeclarable, reassignable;

    VariableDefineMethod(String name, boolean reusable) { this(name, reusable, reusable); }
    VariableDefineMethod(String name, boolean redeclarable, boolean reassignable) {
        this.name = name;
        this.redeclarable = redeclarable;
        this.reassignable = reassignable;
    }

    @Override
    public String toString() {
        return name;
    }
}
