package ast;

import Util.ToString;

public class Break extends SpecialLine {
    String label;
    public Break() {}
    public Break(String label) { this.label = label; }

    @Override
    String lineContent() {
        return ToString.var("break", label);
    }
}
