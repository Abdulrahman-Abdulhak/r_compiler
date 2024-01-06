package ast;

import java.util.ArrayList;
import java.util.List;

public class JsObject extends Returnable {
    List<ObjectPropDefine> props;

    public JsObject() { props = new ArrayList<>(); }

    public void addProperty(ObjectPropDefine prop) { props.add(prop); }

    public List<ObjectPropDefine> getProps() { return props; }

    @Override
    String type() { return "Object"; }

    @Override
    Object[] members() {
        return new Object[]{"properties", props};
    }
}
