package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Case extends Node {
    List<Expression> values;
    List<Line> body;
    boolean haveDefault;

    public Case(Expression value) {
        this(Collections.singletonList(value));
    }
    public Case(List<Expression> values) {
        this(values, new ArrayList<>());
    }
    public Case(Expression value, boolean haveDefault) {
        this(Collections.singletonList(value), haveDefault);
    }
    public Case(List<Expression> values, boolean haveDefault) {
        this(values, new ArrayList<>(), haveDefault);
    }
    public Case(Expression value, List<Line> body) {
        this(Collections.singletonList(value), body);
    }
    public Case(List<Expression> values, List<Line> body) {
        this(values, body, false);
    }
    public Case(Expression value, List<Line> body, boolean haveDefault) {
        this(Collections.singletonList(value), body, haveDefault);
    }
    public Case(List<Expression> values, List<Line> body, boolean haveDefault) {
        this.values = values;
        this.body = body;
        this.haveDefault = haveDefault;
    }

    public List<Expression> getValues() {
        return values;
    }
    public void setValues(List<Expression> values) {
        this.values = values;
    }

    public List<Line> getBody() {
        return body;
    }
    public void setBody(List<Line> body) {
        this.body = body;
    }
    public void addLine(Line line) {
        body.add(line);
    }

    public boolean haveDefault() {
        return haveDefault;
    }
    public void setHaveDefault(boolean aDefault) {
        haveDefault = aDefault;
    }

    @Override
    public String toString() {
        return ToString.self(
            "cases",
            ToString.allNotNull(
            "have default", haveDefault,
                "with value", values.size() == 1 ? values.get(0) : null,
                "with values", values.size() > 1 ? values : null,
                "body", body
            )
        );
    }

    @Override
    public String nodeName() {
        return "Case";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>(values);
        children.addAll(body);

        return children;
    }
}
