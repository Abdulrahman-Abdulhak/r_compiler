package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JSX extends Returnable {
    Object identifier;
    List<JSX> children;
    Map<String, Object> props;

    public JSX(String name) {
        this.identifier = name;
        props = new HashMap<>();
        children = new ArrayList<>();
    }
    public JSX(Expression identifier) {
        this.identifier = identifier;
        props = new HashMap<>();
        children = new ArrayList<>();
    }

    public void addProp(String name) {
        props.put(name, null);
    }
    public void addProp(String name, String value) {
        props.put(name, value);
    }
    public void addProp(String name, Expression value) {
        props.put(name, value);
    }

    public void addChild(JSX child) {
        children.add(child);
    }

    @Override
    String type() { return "JSX"; }

    @Override
    Object[] members() {
        return new Object[]{"identifier", identifier, "props", props, "children", children};
    }

    @Override
    public String nodeName() {
        return "JSX";
    }

    @Override
    public List<Node> childNodes() {
        var identifier = this.identifier instanceof Expression ? (Expression) this.identifier : null;
        return Stream.of(identifier).map(item -> (Node) item).toList();
    }
}
