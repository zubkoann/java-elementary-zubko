package com.zubko.lectures.lecture_02;

public class Task {
    public static void main(String[] args) {
        getLiters(3);
        getLiters(6.7);
        getLiters(11.8);
    }

    public static void getLiters(double time) {
        int liters = (int) time / 2;
        System.out.println(liters);
    }
}
