package ast;

import java.util.ArrayList;
import java.util.List;

public class JsArray extends Returnable {
    List<Expression> items;

    public JsArray() { items = new ArrayList<>(); }

    public void addItem(Expression exp) { items.add(exp); }

    @Override
    String type() { return "Array"; }

    @Override
    Object[] members() {
        return new Object[]{"items", items};
    }
}
