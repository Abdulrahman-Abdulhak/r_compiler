package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Case extends Node {
    List<Expression> values;
    List<Line> body;
    boolean haveDefault;

    public Case(Expression value, int lineDefined, SymbolTable symbolTable) {
        this(Collections.singletonList(value), lineDefined, symbolTable);
    }
    public Case(List<Expression> values, int lineDefined, SymbolTable symbolTable) {
        this(values, new ArrayList<>(), lineDefined, symbolTable);
    }
    public Case(Expression value, boolean haveDefault, int lineDefined, SymbolTable symbolTable) {
        this(Collections.singletonList(value), haveDefault, lineDefined, symbolTable);
    }
    public Case(List<Expression> values, boolean haveDefault, int lineDefined, SymbolTable symbolTable) {
        this(values, new ArrayList<>(), haveDefault, lineDefined, symbolTable);
    }
    public Case(Expression value, List<Line> body, int lineDefined, SymbolTable symbolTable) {
        this(Collections.singletonList(value), body, lineDefined, symbolTable);
    }
    public Case(List<Expression> values, List<Line> body, int lineDefined, SymbolTable symbolTable) {
        this(values, body, false, lineDefined, symbolTable);
    }
    public Case(Expression value, List<Line> body, boolean haveDefault, int lineDefined, SymbolTable symbolTable) {
        this(Collections.singletonList(value), body, haveDefault, lineDefined, symbolTable);
    }
    public Case(List<Expression> values, List<Line> body, boolean haveDefault, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.values = values;
        this.body = body;
        this.haveDefault = haveDefault;
    }

    public List<Expression> getValues() {
        return values;
    }
    public void setValues(List<Expression> values) {
        this.values = values;
    }

    public List<Line> getBody() {
        return body;
    }
    public void setBody(List<Line> body) {
        this.body = body;
    }
    public void addLine(Line line) {
        body.add(line);
    }

    public boolean haveDefault() {
        return haveDefault;
    }
    public void setHaveDefault(boolean aDefault) {
        haveDefault = aDefault;
    }

    @Override
    public String toString() {
        return ToString.self(
            "cases",
            ToString.allNotNull(
            "have default", haveDefault,
                "with value", values.size() == 1 ? values.get(0) : null,
                "with values", values.size() > 1 ? values : null,
                "body", body
            )
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorValues = values.stream().filter(Node::errorCheck).toList();
        var errorValue = errorValues.isEmpty() ? null : errorValues.getFirst();

        if(errorValue == null) return null;
        return errorValue.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return values.stream().anyMatch(Node::errorCheck);
    }

    @Override
    public String nodeName() {
        return "Case";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>(values);
        children.addAll(body);

        return children;
    }

    private String casesGenerate() {
        if(values == null || values.isEmpty()) return "";

        var str = new StringBuilder();

        for (var value : values) {
            str.append("case ");
            str.append(value.generate());
            str.append(": ");
        }

        return str.toString();
    }
    private String linesGenerate() {
        if(body == null || body.isEmpty()) return "";

        var str = new StringBuilder();

        for (var line : body) {
            var generatedLine = line.generate();
            str.append(generatedLine);
            str.append(generatedLine.endsWith(";") ? "" : ";");
        }

        return str.toString();
    }

    @Override
    public String generate() {
        var default_ = haveDefault ? "default: " : "";

        return default_ + casesGenerate() + linesGenerate();
    }
}
