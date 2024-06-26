package ast;

import Util.ToString;

public abstract class Expression extends Statement {
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
