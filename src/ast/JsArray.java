package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class JsArray extends Returnable {
    List<Expression> items;

    public JsArray(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        items = new ArrayList<>();
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorItems = items.stream().filter(Node::errorCheck).toList();
        var errorItem = errorItems.isEmpty() ? null : errorItems.getFirst();

        if(errorItem != null) return errorItem.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return items.stream().anyMatch(Node::errorCheck);
    }

    public void addItem(Expression exp) { items.add(exp); }

    @Override
    String type() { return "Array"; }

    @Override
    Object[] members() {
        return new Object[]{"items", items};
    }

    @Override
    public String nodeName() {
        return null;
    }

    @Override
    public List<Node> childNodes() {
        return items.stream().map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        if(items == null || items.isEmpty()) return "[]";

        var str = new StringBuilder("[");
        for (var item : items) {
            if(item != null) str.append(item.generate());
            str.append(',');
        }
        str.replace(str.length() - 1, str.length(), "");
        str.append("]");

        return str.toString();
    }
}
