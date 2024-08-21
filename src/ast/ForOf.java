package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;

import java.util.List;
import java.util.stream.Stream;

public class ForOf extends Line {
    VariableDefineMethod declarer;
    ValidName variable;
    Expression iterable;
    Line line;
    Block body;

    public ForOf(VariableDefineMethod declarer, ValidName variable, Expression iterable, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.declarer = declarer;
        this.variable = variable;
        this.iterable = iterable;
    }
    public ForOf(VariableDefineMethod declarer, ValidName variable, Expression iterable, Line line, int lineDefined, SymbolTable symbolTable) {
        this(declarer, variable, iterable, lineDefined, symbolTable);
        this.line = line;
    }
    public ForOf(VariableDefineMethod declarer, ValidName variable, Expression iterable, Block body, int lineDefined, SymbolTable symbolTable) {
        this(declarer, variable, iterable, lineDefined, symbolTable);
        this.body = body;
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
    String lineContent() {
        return ToString.self(
            "for-of Loop",
            ToString.allNotNull(
                "variable", variable,
                "iterable", iterable,
                "body", line,
                "body", body
            )
        );
    }

    @Override
    public String nodeName() {
        return "For-Of Loop";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(variable, iterable, line, body).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "for (" + declarer + variable.generate() + " of " + iterable.generate() + ")"
                + (line != null ? line.generate() + new NoUse().generate() : body.generate());
    }
}
