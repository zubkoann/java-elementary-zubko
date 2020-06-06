package com.zubko.homework.hm_04;

import java.util.Random;

/**
 * Write a class StringUtils which has one static method
 * randomString. This method takes two params: String type
 * and int length.
 * • Method would return new string of given length and
 * containing random symbols of given type.
 * • Types: alpha (only letters), numeric (only numbers),
 * alphanumeric ([a…z & 0..9]
 */


public class StringUtils {
    public static void main(String[] args) {
        System.out.println(getStringUtils("numeric", 10));
        System.out.println(getStringUtils("alfa", 20));
        System.out.println(getStringUtils("alfanumeric", 20));
    }

    public enum typeS {NUMERIC, ALFA, ALFANUMERIC}

    public static String getStringUtils(String type, int length) {
        StringBuilder str = new StringBuilder("");
        String alphabet = "";


        switch (type) {
            case "numeric":
                alphabet = "1234567890";
                break;
            case "alfa":
                alphabet = "qwertyuioplkjhgfdsazxcvbnm";
                break;
            case "alfanumeric":
                alphabet = "1234567890qwertyuiopasdfghjklzxcvbnm";
                break;
            default:
                return "ERROR";
        }

        for (int i = 0; i < length; i++) {
            char rand = alphabet.charAt(new Random().nextInt(alphabet.length()));
            str.append(rand);
        }
        return str.toString();
    }

}
