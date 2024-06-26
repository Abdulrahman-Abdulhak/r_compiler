package ast;

import Util.ToString;

public class Continue extends SpecialLine {
    String label;
    public Continue() {}
    public Continue(String label) { this.label = label; }

    @Override
    String lineContent() {
        return ToString.var("continue", label);
    }
}
