package ast;

import Util.ToString;
import errors.Error;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

abstract public class Node {
    int lineDefined;
    SymbolTable symbolTable;
    public Node(int lineDefined, SymbolTable symbolTable) {
        this.lineDefined = lineDefined;
        this.symbolTable = symbolTable;
    }

    public abstract ErrorMessage errorMessage();
    public abstract boolean errorCheck();

    public int getLineDefined() {
        return lineDefined;
    }
    public void setLineDefined(int lineDefined) {
        this.lineDefined = lineDefined;
    }

    public abstract String nodeName();

    public abstract List<Node> childNodes();

    public String treeAsString() {
        if(nodeName() == null || nodeName().isEmpty()) return "";

        StringBuilder generalString = new StringBuilder(nodeName());
        var children = childNodes();

        if(children == null || children.isEmpty()) return generalString.toString();

        generalString.append("\n|");
        for (var child : children) {
            if(child == null) continue;

            var childString = child.treeAsString();
            if (childString == null || childString.isEmpty()) continue;

            childString = ToString.indentLines(childString, "|\t");

            generalString.append("\n").append(childString);
        }

        return generalString.toString();
    }

    public void printTree() {
        System.out.println(treeAsString());
    }

    public void getErrors(Error errors) {
        var nodes = new ArrayList<Node>();
        nodes.add(this);

        while (!nodes.isEmpty()) {
            var current = nodes.removeFirst();
            System.out.println(nodeName());
            if(current == null) continue;

            if(current.errorCheck()) errors.addError(current.errorMessage());

            var children = childNodes();
            System.out.println(children.size());
            if(children != null) nodes.addAll(children);
        }
    }

    public abstract String generate();
}
