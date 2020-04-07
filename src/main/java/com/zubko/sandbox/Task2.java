package com.zubko.sandbox;

import java.util.Arrays;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * <p>
 * Examples:
 * Input: 21445 Output: 54421
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 123456789 Output: 987654321
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sortDesc(21445));
        System.out.println(sortDesc(0));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
        System.out.println(sortDesc(987654321));
    }

    public static int sortDesc(final int num) {
        String initString = Integer.toString(num);
        char[] chars = initString.toCharArray();
        Arrays.sort(chars);
        initString = String.valueOf(chars);
        return Integer.valueOf(new StringBuilder(initString).reverse().toString());
    }
}
