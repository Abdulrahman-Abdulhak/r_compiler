package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListUtil<T, R> {
    public ArrayList<R> map(List<T> list, Function<T, R> callback) {
        var newList = new ArrayList<R>();

        for (var item : list)
            newList.add(callback.apply(item));

        return newList;
    }

    public ArrayList<T> filled(int size, T filler) {
        var newList = new ArrayList<T>();

        for (int i = 0; i < size; i++)
            newList.add(filler);

        return newList;
    }
}
