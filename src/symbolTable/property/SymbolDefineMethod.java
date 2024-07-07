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

    public SymbolDefineMethod(VariableDefineMethod value) {
        super("Defined-With", value);
    }
}
