package com.zubko.homework.hm_03;

import java.util.Random;

/**
 * Write a program which calculates the sum of two columns.
 * Print table with results if columns have the same size (col_1
 * | col_2 | sum). Otherwise print which column has bigger size
 */

public class Table {
    public static void main(String[] args) {
        int[] col1 = new int[10];
        int[] col2 = new int[10];
        int[] col1_test = new int[5];
        Random rand = new Random();
        for (int i = 0; i < col1.length; i++) {
            col1[i] = rand.nextInt(1000);
            col2[i] = rand.nextInt(1000);
        }
        System.arraycopy(col1, 2, col1_test, 0, col1_test.length);
        getTable(col1, col2);
        getTable(col1, col1_test);
        getTable(col1_test, col1);
    }

    public static void getTable(int[] col1, int[] col2) {
        if (col1.length == col2.length) {
            System.out.println(String.format("%10s %5s %10s %5s %10s", "Col 1", "|", "Col 2", "|", "Summ"));
            for (int i = 0; i < col1.length; i++) {
                String[] array = new String[3];
                array[0] = Integer.toString(col1[i]);
                array[1] = Integer.toString(col2[i]);
                array[2] = Integer.toString(col1[i] + col2[i]);
                System.out.println(String.format("%10s %5s %10s %5s %10s", array[0], "|", array[1], "|", array[2]));
            }
        } else if (col1.length > col2.length) {
            System.out.println("col1 is bigger than col2");
        } else {
            System.out.println("col2 is bigger than col1");
        }


    }
}
