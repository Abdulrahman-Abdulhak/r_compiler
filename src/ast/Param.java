package ast;

import java.util.ArrayList;
import java.util.List;

public class Param {
    List<Expression> parameters;

    public Param() { parameters = new ArrayList<>(); }

    public void addNewParameter(Expression exp) { parameters.add(exp); }

    @Override
    public String toString() {
        return ToString.self(
                "Param",
                ToString.var("parameters", parameters)
        );
    }
}
