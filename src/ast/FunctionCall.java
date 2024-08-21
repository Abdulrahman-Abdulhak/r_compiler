package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class FunctionCall extends Expression {
    Param param;
    TemplateLiteral templateLiteral;
    Expression nameSpace;

    public FunctionCall(Expression functionNameSpace, Param param, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        nameSpace = functionNameSpace;
        this.param = param;
    }
    public FunctionCall(Expression functionNameSpace, TemplateLiteral param, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        nameSpace = functionNameSpace;
        templateLiteral = param;
    }

    private String subType() { return templateLiteral == null ? "" : "TaggedTemplateLiteral"; }

    @Override
    String type() { return ToString.subType("FunctionCall", subType()); }

    @Override
    Object[] members() {
        return new Object[]{
            "nameSpace", nameSpace,
            "parameters", param,
            "parameters", templateLiteral
        };
    }

    @Override
    public ErrorMessage errorMessage() {
        if(nameSpace.errorCheck()) return nameSpace.errorMessage();
        return param.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return nameSpace.errorCheck() || param.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Function Call";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(nameSpace, param, templateLiteral).toList();
    }

    @Override
    public String generate() {
        return nameSpace.generate() + (param != null ? param.generate() : templateLiteral.generate());
    }
}
