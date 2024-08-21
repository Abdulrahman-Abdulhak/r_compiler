package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JSX extends Returnable {
    Object identifier;
    List<JSX> children;
    Map<String, Object> props;

    public JSX(String name, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.identifier = name;
        props = new HashMap<>();
        children = new ArrayList<>();
    }
    public JSX(Expression identifier, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(identifier instanceof Expression) {
            if(((Expression) identifier).errorCheck()) {
                return ((Expression) identifier).errorMessage();
            }
        }


        var errorChildren = children.stream().filter(Node::errorCheck).toList();
        var errorChild = errorChildren.isEmpty() ? null : errorChildren.getFirst();

        if(errorChild != null) return errorChild.errorMessage();

        var errorProps = props.values().stream().filter(val -> val instanceof Expression && ((Expression) val).errorCheck()).toList();
        var errorProp = errorProps.isEmpty() ? null : (Expression) errorProps.getFirst();

        if(errorProp != null) return errorProp.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return identifier instanceof Expression && ((Expression) identifier).errorCheck() ||
                children.stream().anyMatch(Node::errorCheck) ||
                props.values().stream().anyMatch(val -> val instanceof Expression && ((Expression) val).errorCheck());
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

    private String propsGenerate() {
        if(props == null || props.isEmpty()) return "";

        var str = new StringBuilder("{");

        for (var prop : props.entrySet()) {
            str.append(prop.getKey());
            str.append(": ");

            if(prop.getValue() == null) str.append("true");
            else if(prop.getValue() instanceof String) str.append(prop.getValue());
            else str.append(((Expression) prop.getValue()).generate());

            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("}");

        return str.toString();
    }

    private String childrenGenerate() {
        if(children == null || children.isEmpty()) return "";

        var str = new StringBuilder();

        for (var child : children) {
            str.append(child.generate());
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }

    @Override
    public String generate() {
        var children = childrenGenerate();
        var props = propsGenerate();

        var inBetweenPropsChildren = !children.isEmpty() && !props.isEmpty() ? "," : "";

        var tag = identifier instanceof Expression ? ((Expression) identifier).generate() : "\"" + identifier.toString() + "\"";
        var afterTag = children.length() + props.length() > 0 ? "," : "";

        return "React.createElement(" + tag + afterTag + props + inBetweenPropsChildren + children + ")";
    }
}
