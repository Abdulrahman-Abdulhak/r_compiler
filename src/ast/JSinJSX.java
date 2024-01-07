package ast;

public class JSinJSX extends JSX {
    Expression expression;
    public JSinJSX(Expression expression) {
        super((String) null);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "JS in JSX: " + expression;
    }
}
