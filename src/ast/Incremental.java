package ast;

public class Incremental extends Expression {
    boolean increase, post;
    Expression expression;

    public Incremental(Expression exp) { expression = exp; }

    public void setIncrease(boolean increase) { this.increase = increase; }

    public void setPost(boolean post) { this.post = post; }

    private String subType() {
        var str = "";

        str += increase ? "inc" : "dec";
        str += post ? "post" : "pre";

        return str;
    }

    @Override
    String type() { return "Incremental" + subType(); }

    @Override
    Object[] members() {
        return new Object[]{"expression", expression};
    }
}
