package Util;

import java.util.*;
import java.util.stream.Collectors;

public class ToString {
    private static String indentLines(String str) {
        return indentLines(str, "\t", true);
    }
    private static String indentLines(String str, boolean indentFirstLine) {
        return indentLines(str, "\t", indentFirstLine);
    }
    private static String indentLines(String str, String indentation) {
        return indentLines(str, indentation, true);
    }
    private static String indentLines(String str, String indentation, boolean indentFirstLine) {
        var startIndentation = indentFirstLine && !str.isEmpty() ? indentation : "";
        return startIndentation + str.replaceAll("\n", "\n" + indentation);
    }

    public static String self(String name, String inside) {
        return self(name, inside, "{", "}");
    }
    public static String self(String name, String inside, String open, String close) {
        var lineOnOpenAndClose = (inside.isEmpty() ? "" : "\n");
        var start = name + " " + open + lineOnOpenAndClose;
        start = name.isEmpty() ? start.replaceFirst(" ", "") : start; // remove the space at first
        var end = lineOnOpenAndClose + close;

        return start + indentLines(inside) + end;
    }

    public static <T> String list(List<T> list) {
        StringBuilder str = new StringBuilder();

        var multiLiner = false;
        var separator = ",";
        for (T item : list) {
            var itemString = item.toString();
            if(itemString.isEmpty()) continue;

            str.append(itemString);
            if(multiLiner || itemString.contains("\n")) {
                multiLiner = true;
                separator = ",\n";
            }
            str.append(separator);
        }

        if (!list.isEmpty()) return str.substring(0, str.length() - separator.length());
        return str.toString();
    }

    public static String notNull(Object... arr) {
        String str = "";

        for (var i = 0; i < arr.length ; i+=2) {
            var name = arr[i];
            var member = arr[i+1];

            if(member == null) continue;
            return var(name.toString(), member);
        }

        return str;
    }

    public static String all(Object... arr) {
        var str = new StringBuilder();

        for (var i = 0; i < arr.length ; i+=2) {
            var name = arr[i];
            var member = arr[i+1];

            str.append(var(name.toString(), member));
            str.append(",\n");
        }
        if (arr.length > 0) {
            str.deleteCharAt(str.length() - 1);
            str.deleteCharAt(str.length() - 1);
        }

        return str.toString();
    }

    public static String allNotNull(Object... arr) {
        var noNulls = new ArrayList<>();

        for (var i = 0; i < arr.length ; i+=2) {
            var name = arr[i];
            var member = arr[i+1];

            if(member == null) continue;

            noNulls.add(name);
            noNulls.add(member);
        }

        return all(noNulls.toArray());
    }

    public static String map(Map<Object, Object> entries) {
        StringBuilder str = new StringBuilder("{");
        if(!entries.isEmpty()) str.append("\n");

        for (var entry : entries.entrySet()) {
            var entryString = indentLines(nameAlias(entry.getKey(), entry.getValue()));
            str.append(entryString);

            str.append(",\n");
        }

        if(!entries.isEmpty()) {
            var result = str.substring(0, str.length() - 2);
            return result + "\n}";
        }

        str.append('}');
        return str.toString();
    }

    public static <T, H> String namesAliases(List<T> names, List<H> aliases) {
        var namesArr = names.toArray();
        var aliasesArr = aliases.toArray();

        StringBuilder str = new StringBuilder("{");
        if(!names.isEmpty()) str.append('\n');

        for (int i = 0; i < namesArr.length; i++) {
            str.append(nameAlias(namesArr[i], aliasesArr[i]));
            str.append(",\n");
        }

        if(!names.isEmpty()) {
            str.deleteCharAt(str.length() - 1);
            str.deleteCharAt(str.length() - 1);
            str.append("\n}");
        } else str.append('}');

        return str.toString();
    }
    public static String nameAlias(Object name, Object alias) {
        if(alias == null) return name.toString();
        return name + " -> " + alias;
    }

    public static String var(String name, Object value) {
        String end;

        if (value instanceof List<?>) {
            end = self("", list((List<?>) value), "[", "]");
        } else if (value instanceof Map<?, ?>) {
            end = map((Map<Object, Object>) value);
        } else end = value.toString();

        return name + (end.isEmpty() ? "" : ": ") + end;
    }

    public static String subType(String main, String sub) {
        if(sub == null || sub.isEmpty()) return main;
        return main + ":" + sub;
    }
}
