package com.zubko.homework.hm_03;


import java.util.Arrays;

/**
 * Write a program which checks if given number is
 * STRONG, i.e. the sum of the factorials of its digits is equal
 * to number itself: 1! + 4! + 5! = 1 + 24 + 120 = 145
 */
public class Factorials {
    public static void main(String[] args) {
        System.out.println(isFactorialSumEqualNumber(145));
        System.out.println(isFactorialSumEqualNumber(14512));
    }

    public static boolean isFactorialSumEqualNumber(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += getFactorial(Character.getNumericValue(digits[i]));
        }

        if (sum == num) return true;
        return false;
    }

    public static int getFactorial(int num) {
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
