package symbolTable.property;

import symbolTable.VariableDefineMethod;

public class SymbolDefineMethod extends SymbolProperty {
    public static SymbolDefineMethod function() {
        return new SymbolDefineMethod(VariableDefineMethod.function);
    }

    public static SymbolDefineMethod argument() {
        return new SymbolDefineMethod(VariableDefineMethod.argument);
    }

    public static SymbolDefineMethod imported() {
        return new SymbolDefineMethod(VariableDefineMethod.imported);
    }

    public static SymbolDefineMethod constant() {
        return new SymbolDefineMethod(VariableDefineMethod.constant);
    }

    public static SymbolDefineMethod var() {
        return new SymbolDefineMethod(VariableDefineMethod.var);
    }

    public static SymbolDefineMethod let() {
        return new SymbolDefineMethod(VariableDefineMethod.let);
    }

    public SymbolDefineMethod(VariableDefineMethod value) {
        super("Defined-With", value);
    }

    public SymbolDefineMethod(String declarer) {
        super("Defined-With", VariableDefineMethod.fromString(declarer));
    }
}
