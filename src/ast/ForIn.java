package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;

import java.util.List;
import java.util.stream.Stream;

public class ForIn extends Line {
    VariableDefineMethod declarer;
    ValidName variable;
    Expression iterable;
    Line line;
    Block body;

    public ForIn(VariableDefineMethod declarer, ValidName variable, Expression iterable, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.variable = variable;
        this.iterable = iterable;
        this.declarer = declarer;
    }
    public ForIn(VariableDefineMethod declarer, ValidName variable, Expression iterable, Line line, int lineDefined, SymbolTable symbolTable) {
        this(declarer, variable, iterable, lineDefined, symbolTable);
        this.line = line;
    }
    public ForIn(VariableDefineMethod declarer, ValidName variable, Expression iterable, Block body, int lineDefined, SymbolTable symbolTable) {
        this(declarer, variable, iterable, lineDefined, symbolTable);
        this.body = body;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "for-in Loop",
            ToString.allNotNull(
                "variable", variable,
                "iterable", iterable,
                "body", line,
                "body", body
            )
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        return iterable.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return iterable.errorCheck();
    }

    @Override
    public String nodeName() {
        return "For-In Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(variable, iterable, line, body).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "for (" + declarer + variable.generate() + " in " + iterable.generate() + ")"
                + (line != null ? line.generate() + new NoUse().generate() : body.generate());
    }
}
