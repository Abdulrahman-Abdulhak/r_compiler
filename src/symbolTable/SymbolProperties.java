package symbolTable;

import Util.ListUtil;
import symbolTable.property.SymbolProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SymbolProperties {
    private List<SymbolProperty> properties;

    public SymbolProperties() { properties = new ArrayList<>(); }
    public SymbolProperties(List<SymbolProperty> properties) { this.properties = properties; }

    public boolean doesHave(String key) {
        return properties.stream().anyMatch(prop -> Objects.equals(prop.type, key));
    }

    public void addProperty(SymbolProperty prop) { properties.add(prop); }
    public void addProperty(String key, Object value) { properties.add(new SymbolProperty(key, value)); }
    public SymbolProperty getProperty(String key) {
        for (var prop : properties)
            if(Objects.equals(prop.type, key)) return prop;

        return null;
    }

    public void setProperties(List<SymbolProperty> properties) { this.properties = properties; }
    public List<SymbolProperty> getProperties() { return properties; }

    @Override
    public SymbolProperties clone() {
        List<SymbolProperty> propsClone = new ListUtil<SymbolProperty, SymbolProperty>().map(
                properties,
                SymbolProperty::clone
        );

        return new SymbolProperties(propsClone);
    }
}

