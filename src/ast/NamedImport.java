package ast;

import java.util.ArrayList;
import java.util.List;

public class NamedImport {
    List<String> names;
    List<ValidName> convertedNames;

    public NamedImport() {
        this.names = new ArrayList<>();
        this.convertedNames = new ArrayList<>();
    }
    public NamedImport(List<String> names, List<ValidName> convertedNames) {
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

    @Override
    public String toString() {
        return ToString.namesAliases(names, convertedNames);
    }
}
