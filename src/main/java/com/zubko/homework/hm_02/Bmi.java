package com.zubko.homework.hm_02;

public class Bmi {
    public static void main(String[] args) {
        System.out.println(getBpm(58, 1.7));
    }

    public static String getBpm(double weight, double height) {
        double bpm = weight / Math.pow(height, 2);

        if (bpm <= 18.5) {
            return bpm + " - Unterweight";
        } else if (bpm <= 25) {
            return bpm + " - Normal";
        } else if (bpm <= 30) {
            return bpm + " - Overweight";
        } else {
            return bpm + " - Obese";
        }
    }
}
