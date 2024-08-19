package ast;

import Util.ToString;

import java.util.List;

abstract public class Node {
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
}
