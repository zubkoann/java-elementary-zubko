package com.zubko.lectures.lecture_04;

public class Revert {
    public static void main(String[] args) {
        String str = "Name Surname";
        System.out.println(new StringBuilder(str));
        System.out.println(new StringBuffer(str).reverse().toString());
    }
    //        char a = 'A';
//        System.out.println((int)a);
}
