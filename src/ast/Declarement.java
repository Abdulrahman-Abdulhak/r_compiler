package ast;

import java.util.ArrayList;
import java.util.List;

public class Declarement {
    List<String> signs;
    List<Declarable> declarables;
    Expression value;

    public Declarement() {
        this.signs = new ArrayList<>();
        this.declarables = new ArrayList<>();
    }
    public Declarement(Expression value) {
        this.value = value;
        this.signs = new ArrayList<>();
        this.declarables = new ArrayList<>();
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
}
