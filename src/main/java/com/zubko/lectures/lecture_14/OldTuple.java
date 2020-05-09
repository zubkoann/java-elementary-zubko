package com.zubko.lectures.lecture_14;

import java.util.Arrays;
import java.util.List;
//БЕЗ ДЖЕНЕРИКОВ

public class OldTuple {
    private Object[] items;

    public OldTuple(Object... items) {
        this.items = items;
    }

    public Object getItems(int i) {
        return items[i];
    }

    public Object[] getAll() {
        return items;
    }

    public List<Object> toList() {
        return Arrays.asList(items);
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
