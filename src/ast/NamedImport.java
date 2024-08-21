package ast;

import Util.ToString;
import errors.messages.AlreadyDefined;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamedImport extends Node {
    List<String> names;
    List<ValidName> convertedNames;

    public NamedImport(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.names = new ArrayList<>();
        this.convertedNames = new ArrayList<>();
    }
    public NamedImport(List<String> names, List<ValidName> convertedNames, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.names = names;
        this.convertedNames = convertedNames;
    }

    public void addOriginalName(String name) {
        names.add(name);
        convertedNames.add(null);
    }
    public void addNameWithConverted(String name, ValidName newName) {
        names.add(name);
        convertedNames.add(newName);
    }

    public List<String> finalNames() {
        var names = new ArrayList<String>();

        var originalNAmes = this.names.toArray();
        var aliasNames = this.convertedNames.toArray();
        for (int i = 0; i < originalNAmes.length; i++) {
            if(aliasNames[i] == null) {
                names.add(originalNAmes[i].toString());
                continue;
            }

            names.add(((ValidName) aliasNames[i]).identifier);
        }

        return names;
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorNames = convertedNames.stream().filter(name -> symbolTable.has(name.getIdentifier())).toList();
        var errorName = errorNames.isEmpty() ? null : errorNames.getFirst();

        if(errorName != null) return new AlreadyDefined(lineDefined);
        return null;
    }

    @Override
    public boolean errorCheck() {
        return convertedNames.stream().anyMatch(name -> symbolTable.has(name.getIdentifier()));
    }

    @Override
    public String toString() {
        return ToString.namesAliases(names, convertedNames);
    }

    @Override
    public String nodeName() {
        return "Named Import";
    }

    @Override
    public List<Node> childNodes() {
        return convertedNames.stream().map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        var str = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {
            str.append(names.get(i));

            var alias = convertedNames.get(i);
            if(alias != null) {
                str.append("as");
                str.append(alias.generate());
            }
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");

        return "{ " + str + " }";
    }
}
