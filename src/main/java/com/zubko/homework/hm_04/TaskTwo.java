package com.zubko.homework.hm_04;

import java.util.Arrays;

/**
 * Product code validation eg: AX6BYU56UX6CV6BNT7NM
 * 287430
 * • 1st part can contain only capital letters and 6 digits. 2nd
 * part is all digits and = the product of the first 6 digits
 * taken in groups of two from the left. Eg 65*66*67 =
 * 287430
 */


public class TaskTwo {
    public static void main(String[] args) {
        run("AX6BYU56UX6CV6BNT7NM 287430");
        run("AX6BYU56UX6CV6BNT7NM 434535");
        run("AX6BuytutyuYU56UX6CV6BNT7NM tytyutu");
    }

    public static void run(String str) {
        System.out.println(getFirstPart(str));
        System.out.println(getSecondPart(str));
    }

    public static boolean getFirstPart(String str) {
        int start = 'A';
        int startDigit = '0';
        int end = 'Z';
        int endDigit = '9';
        int countDigits = 0;

        String[] array = str.split("\\s");
        String partOne = array[0];

        for (int i = 0; i < partOne.length(); i++) {
            if (((int) partOne.charAt(i) >= start && (int) partOne.charAt(i) <= end)) {
            } else if (partOne.charAt(i) <= endDigit && partOne.charAt(i) >= startDigit && countDigits <= 6) {
                countDigits++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean getSecondPart(String str) {
        String[] array = str.split("\\s");
        String partOne = array[0].replaceAll("\\D", "");
        String partTwo = array[1];
        int summ = 1;
        if (partTwo.matches("\\D*") ) {
            return false;
        } else {
            for (int i = 0; i < partOne.length(); i += 2) {
                int temp = Integer.parseInt(partOne.substring(i, i + 2));
                summ *= temp;
            }
        }
        return summ == Integer.parseInt(array[1]);
    }
}
