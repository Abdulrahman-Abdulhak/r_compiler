package ast;

import Util.ToString;

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
    public String toString() {
        return ToString.namesAliases(names, convertedNames);
    }
}
