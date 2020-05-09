package com.zubko.lectures.lecture_14;

import java.util.Arrays;
import java.util.List;

public class Tuple<E> {
    private final E[] items; //не изменяемый , статиком сделать нельзя так как в статике нужно опредалить тип (храниться в heap)

    public Tuple(E... items) {
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
