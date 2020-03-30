package com.zubko.homework.hm_02;

public class Century {
    public static void main(String[] args) {
        System.out.println(getCentury(1705));
        System.out.println(getCentury(1900));
        System.out.println(getCentury(1601));
        System.out.println(getCentury(2000));
    }

    public static int getCentury(int year) {
        double century =  Math.ceil(year / 100.);
        return  (int) century;
    }
}
