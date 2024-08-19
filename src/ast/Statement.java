package ast;

// used as a general type for other classes.
public abstract class Statement extends Line {
    public Statement(int lineDefined) {
        super(lineDefined);
    }
}
