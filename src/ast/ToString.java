package ast;

import java.util.*;

public class ToString {

    static String self(String name, String inside) {
        var start = name + " {";
        var end = inside.isEmpty() ? "}" : "\n}";

        return start + inside + end;
    }

    static <T> String list(List<T> list) {
        StringBuilder str = new StringBuilder();

        for (T item : list) {
            str.append(item);
            str.append(',');
        }
        if (!list.isEmpty()) str.deleteCharAt(str.length() - 1);

        return str.toString();
    }

    static String notNull(Object... arr) {
        String str = "";

        for (var i = 0; i < arr.length ; i+=2) {
            var name = arr[i];
            var member = arr[i+1];

            if(member == null) continue;
            return var(name.toString(), member);
        }

        return str;
    }

    static String all(Object... arr) {
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

    static String allNotNull(Object... arr) {
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

    static String map(Map<Object, Object> entries) {
        StringBuilder str = new StringBuilder("{");
        for (var entry : entries.entrySet()) {
            str.append(nameAlias(entry.getKey(), entry.getValue()));
            str.append(",\n");
        }
        if(!entries.isEmpty()) {
            str.deleteCharAt(str.length() - 1);
            str.deleteCharAt(str.length() - 1);
            str.append("\n}");
        } else str.append('}');

        return str.toString();
    }

    static <T, H> String namesAliases(List<T> names, List<H> aliases) {
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
    static String nameAlias(Object name, Object alias) {
        if(alias == null) return name.toString();
        return name + " -> " + alias;
    }

    static String var(String name, Object value) {
        String end = "";

        if (value instanceof List<?>) {
            end = '[' +
                    list((List<?>) value) +
                    (((List<?>) value).isEmpty() ? ']' : "\n]")
            ;
        } else if (value instanceof Map<?, ?>) {
            end = map((Map<Object, Object>) value);
        } else end = value.toString();

        return '\n' + name + (end.isEmpty() ? "" : ":") + end;
    }
}
