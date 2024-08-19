package ast;

import java.util.List;
import java.util.stream.Stream;

public class Multiplication extends LeftRightOperation {
        public Multiplication(Expression left, String sign, Expression right, int lineDefined) {
                super(left, sign, right, lineDefined);
        }

        @Override
        String type() { return "Multiplication"; }

        @Override
        public String nodeName() {
                return "Multiplication";
        }

        @Override
        public List<Node> childNodes() {
                return Stream.of(left, right).map(item -> (Node) item).toList();
        }
}
