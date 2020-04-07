package com.zubko.sandbox;

/**
 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 *
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class Task1 {
    public static void main(String[] args) {
        countBits(1234);
        countBits(4);
        countBits(7);
        countBits(9);
        countBits(10);
    }
    public static int countBits(int k){
        int count = 0;
        while (k != 0) {
            if (k % 2 > 0) {
                count++;
            }
            k = k >> 1;
        }
        System.out.println(count);
        return count;
    }
}
