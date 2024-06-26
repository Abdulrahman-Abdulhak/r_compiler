package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class Param {
    List<Expression> parameters;

    public Param() { parameters = new ArrayList<>(); }

    public void addNewParameter(Expression exp) { parameters.add(exp); }

    @Override
    public String toString() {
        return ToString.self(
                "",
                ToString.list(parameters),
                "[",
                "]"
        );
    }
}
