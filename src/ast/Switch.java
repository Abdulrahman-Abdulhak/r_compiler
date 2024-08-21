package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Line {
    Expression test;
    List<Case> cases;

    public Switch(Expression test, int lineDefined, SymbolTable symbolTable) {
        this(test, new ArrayList<>(), lineDefined, symbolTable);
    }
    public Switch(Expression test, List<Case> cases, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.test = test;
        this.cases = cases;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "switch",
            ToString.allNotNull("expression", test, "cases", cases)
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        return test.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return test.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Switch";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>();
        children.add(test);
        children.addAll(cases);

        return children;
    }

    private String casesGenerate() {
        if(cases == null || cases.isEmpty()) return "";

        var str = new StringBuilder();

        for (var case_ : cases) {
            str.append(case_.generate());
        }

        return str.toString();
    }
    @Override
    public String generate() {
        return "switch (" + test.generate() + ") {" + casesGenerate() + "}";
    }
}
