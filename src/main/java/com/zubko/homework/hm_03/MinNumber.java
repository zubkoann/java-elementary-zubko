package com.zubko.homework.hm_03;

import java.util.Arrays;
import java.util.Random;

/**
 * Write a program which finds minimal number in int array
 **/


public class MinNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        int min = 1;
        int max = 1000;
        int diff = max - min;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(diff + 1) + min;
        }
        System.out.println("initial array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
        System.out.println("sorted array: " + Arrays.toString(array));
    }
}
