package com.zubko.homework.hm_04;

/**
 * Write a simple regex to validate a username. Allowed
 * characters are:
 * • lowercase letters,
 * • numbers,
 * • underscore
 * • Length should be between 4 and 16 characters (both
 * included).
 */
public class TaskThree {
    public static void main(String[] args) {
        System.out.println(nameVaidation("anna_zubko"));
        System.out.println(nameVaidation("anna_zub3242ko"));
        System.out.println(nameVaidation("DDdfdf"));
        System.out.println(nameVaidation("ss"));
    }
    public static boolean nameVaidation(String str){
        return str.matches("[a-z\\d\\_]{4,16}");
    }
}
