package com.zubko.homework.hm_02;

public class DescribeAge {
    public static void main(String[] args) {
        System.out.println(describeAge(67));
        System.out.println(describeAge(55));
        System.out.println(describeAge(55));
        System.out.println(describeAge(5));
        System.out.println(describeAge(-5));
    }

    public static String describeAge(int age) {
        if (age <= 12 && age > 0) {
            return "You are kid";
        } else if (age > 12 && age <= 17) {
            return "You are kid";
        } else if (age > 17 && age <= 64) {
            return "You are adult";
        } else if (age > 64) {
            return "You are elderly";
        } else {
            return "Age 0 or less";
        }

    }
}
