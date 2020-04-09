package com.zubko.homework.hm_04;

/**
 * Given a string of digits, you should replace any digit
 * below 5 with '0' and any digit 5 and above with '1'. Return
 * the resulting string.
 */
public class TaskFour {
    public static void main(String[] args) {
        System.out.println(getString("2348982344"));
        System.out.println(getString("66hhh"));
    }

    public static String getString(String str) {
        return (str.matches("\\d*")) ?
                str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1") :
                "Not valid";
    }
}
