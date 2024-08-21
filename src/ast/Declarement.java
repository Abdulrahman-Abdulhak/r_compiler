package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;

import java.util.ArrayList;
import java.util.List;

public class Declarement extends Node {
    List<String> signs;
    List<Declarable> declarables;
    Expression value;

    public Declarement(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.signs = new ArrayList<>();
        this.declarables = new ArrayList<>();
    }

    public Declarement(Expression value, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.value = value;
        this.signs = new ArrayList<>();
        this.declarables = new ArrayList<>();
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorDeclarements = declarables.stream().filter(Node::errorCheck).toList();
        var errorDelarement = errorDeclarements.isEmpty() ? null : errorDeclarements.getFirst();

        if(errorDelarement != null) return errorDelarement.errorMessage();

        if(value != null) return value.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return declarables.stream().anyMatch(Node::errorCheck);
    }

    public List<Declarable> getDeclarables() {
        return declarables;
    }

    public void addAssignment(Declarable declarable) {
        declarables.add(declarable);
    }
    public void addAssignment(String sign) {
        signs.add(sign);
    }
    public void addAssignment(Declarable declarable, String sign) {
        declarables.add(declarable);
        signs.add(sign);
    }

    @Override
    public String toString() {
        var str = new StringBuilder();

        var signArr = signs.toArray();
        var declarersArr = declarables.toArray();

        int i = 0;
        for (; i < signs.size(); i++) {
            str.append(declarersArr[i]);
            str.append(' ');
            str.append(signArr[i]);
            str.append(' ');
        }
        if(i < declarables.size()) str.append(declarersArr[i]);
        if(i > 0) str.append(value);

        return str.toString() + value;
    }

    @Override
    public String nodeName() {
        return "Declarement";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>(declarables);
        children.add(value);

        return children;
    }

    @Override
    public String generate() {
        if (signs == null || signs.isEmpty() || value == null) {
            return declarables.getFirst().generate();
        }

        var str = new StringBuilder();
        for (int i = 0; i < signs.size(); i++) {
            str.append(declarables.get(i).generate());
            str.append(signs.get(i));
        }
        assert value != null;
        str.append(value.generate());

        return str.toString();
    }
}
