package symbolTable;

import Util.ListUtil;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private String name;
    private SymbolTable parent;
    private final List<SymbolTable> children;
    private Map<String, SymbolProperties> rows;

    public SymbolTable() {
        name = "";
        children = new ArrayList<>();
        rows = new Hashtable<>();
    }
    public SymbolTable(String name) {
        name = name;
        children = new ArrayList<>();
        rows = new Hashtable<>();
    }

    public void setRows(Map<String, SymbolProperties> rows) {
        this.rows = rows;
    }
    public Map<String, SymbolProperties> getRows() {
        return rows;
    }

    public void insert(String key, SymbolProperties information) {
        rows.put(key, information);
    }

    public SymbolProperties lookup(String key) {
        return rows.get(key);
    }

    public SymbolTable addNewSymbolTable() {
        var table = new SymbolTable();
        return addNewSymbolTable(table);
    }
    public SymbolTable addNewSymbolTable(SymbolTable table) {
        children.add(table);
        table.setParent(this);

        return table;
    }

    public String getName() { return name; }

    public void setParent(SymbolTable table) { parent = table; }
    public SymbolTable getParent() { return parent; }

    public List<SymbolTable> getChildren() { return children; }

    @Override
    public String toString() {
        var inlinePadding = 2;

        var table = new ArrayList<ArrayList<String>>();
        var header = new ArrayList<String>();
        header.add("name");
        table.add(header);

        for (var entry : rows.entrySet()) {
            var propertyRow = new ListUtil<String, Void>().filled(header.size(), "");
            var name = entry.getKey();
            propertyRow.set(0, name);

            var props = entry.getValue();

            for (var prop : props.getProperties()) {
                var propType = prop.type;
                var propValue = prop.value.toString();

                var indexOfProp = header.indexOf(propType);
                if(indexOfProp < 0) {
                    header.add(propType);
                    propertyRow.add(propValue);
                } else { propertyRow.set(indexOfProp, propValue); }
            }

            table.add(propertyRow);
        }

        var sizes = new ArrayList<Integer>();
        for (var row : table) {
            var i = 0;
            for (var item : row) {
                var cellWidth = item.length() + inlinePadding;

                if(sizes.size() == i) sizes.add(cellWidth);
                else sizes.set(i, Math.max(sizes.get(i), cellWidth));

                i++;
            }
        }

        return getStringBuilder(table, sizes).toString();
    }
    private static StringBuilder getStringBuilder(ArrayList<ArrayList<String>> table, ArrayList<Integer> sizes) {
        var widthOfTable = sizes.stream().reduce(0, Integer::sum) + sizes.size() + 1;
        var str = new StringBuilder();

        final var valueUnknown = "-";
        final var topDash = "‾";
        final var middleDash = "—";
        final var bottomDash = "_";
        final var bar = "|";

        str.repeat(bottomDash, widthOfTable);
        str.append('\n');
        var rowIndex = 0;
        for (var row : table) {
            var i = 0;
            for (var item : row) {
                var itemToUse = item.isEmpty() ? valueUnknown : item;

                str.append(bar);
                var cellSize = sizes.get(i);
                var spaces = cellSize - itemToUse.length();

                var leftPadding = spaces / 2;
                str.repeat(" ", leftPadding);
                str.append(itemToUse);
                str.repeat(" ", spaces - leftPadding);
                i++;
            }
            str.append(bar + "\n");

            if(rowIndex == 0) {
                for (var size : sizes) {
                    str.append(bar);
                    str.repeat(middleDash, size);
                }
                str.append(bar);
                str.append('\n');
            }

            rowIndex++;
        }
        str.repeat(topDash, widthOfTable);

        return str;
    }
}
