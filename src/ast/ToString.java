package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ToString {

    static String self(String name, String inside) {
        var start = '\n' + name + " {";
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

    static String var(String name, Object value) {
        String end = "";

        if (value instanceof List) {
            end = '[' +
                    list((List<?>) value) +
                    (((List<?>) value).isEmpty() ? ']' : "\n]")
            ;
        }
        else end = value.toString();

        return '\n' + name + ": " + end;
    }
}
