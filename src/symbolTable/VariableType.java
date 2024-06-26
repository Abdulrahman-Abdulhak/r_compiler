package symbolTable;

public enum VariableType {
    num("num"),
    string("string"),
    bool("bool"),
    jsNull("null"),
    undefined("undefined");

    final String name;
    VariableType(String str) { name = str; }
}

