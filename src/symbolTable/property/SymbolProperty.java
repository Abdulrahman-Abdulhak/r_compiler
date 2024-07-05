package symbolTable.property;

import java.util.Objects;

public class SymbolProperty {
    public String type;
    public Object value;

    public SymbolProperty(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SymbolProperty that = (SymbolProperty) o;
        return Objects.equals(type, that.type) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public SymbolProperty clone() {
        return new SymbolProperty(type, value);
    }
}
