package com.zubko.homework.hm_03;

/**
 * Write a program which checks if a string (array of chars) is a
 * palindrome
 */

public class Palindrome {
    public static void main(String[] args) {
        getPalindrome("mom");
        getPalindrome("moms");
    }

    public static void getPalindrome(String s) {
        char[] charArray = s.toCharArray();
        String reverseString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseString = reverseString + charArray[i];
        }
        if (s.equals(reverseString)) {
            System.out.println(s + " - String is a palindrome.");
        } else {
            System.out.println(s + " - String is not a palindrome.");
        }


    }
}
