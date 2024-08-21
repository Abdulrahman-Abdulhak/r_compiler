package ast;

import Util.ToString;
import symbolTable.SymbolTable;

public abstract class Expression extends Statement {
    public Expression(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
    }

    abstract String type();
    abstract Object[] members();

    @Override
    String lineContent() {
        var strPart1 = ToString.var("type", type());
        var strPart2 = ToString.allNotNull(members());

        var inside = strPart1 + (strPart2.isEmpty() ? "": ",\n") + strPart2;

        return ToString.self(
            "Expression",
            inside
        );
    }
}
