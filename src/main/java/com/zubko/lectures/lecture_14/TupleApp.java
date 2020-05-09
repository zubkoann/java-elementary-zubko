package com.zubko.lectures.lecture_14;

public class TupleApp {
    public static void main(String[] args) {
        OldTuple old = new OldTuple();
        System.out.println(old);
        short s = 1;
        long l = 1L;
        Tuple<? extends Number> t = new Tuple<>(1, 2, 3, 4, 5, 6, 6, s, l);
        Tuple<Integer> t1 = new Tuple<>(1, 2, 3, 4, 5, 6);

    }
}
