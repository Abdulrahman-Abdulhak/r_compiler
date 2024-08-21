package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class JsObject extends Returnable {
    List<ObjectPropDefine> props;

    public JsObject(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        props = new ArrayList<>();
    }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    public void addProperty(ObjectPropDefine prop) { props.add(prop); }

    public List<ObjectPropDefine> getProps() { return props; }

    @Override
    String type() { return "Object"; }

    @Override
    Object[] members() {
        return new Object[]{"properties", props};
    }

    @Override
    public String nodeName() {
        return "Object";
    }

    @Override
    public List<Node> childNodes() {
        return props.stream().map(prop -> (Node) prop).toList();
    }

    @Override
    public String generate() {
        if(props == null || props.isEmpty()) return "{}";

        var str = new StringBuilder("{");
        for (var prop : props) {
            str.append(prop.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("}");

        return str.toString();
    }
}
