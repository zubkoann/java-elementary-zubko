package com.zubko.homework.hm1;

import org.w3c.dom.ls.LSOutput;

import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args) {
        getTask9(20);
        getTask10(20);
        getTask11(20);
        getTask12(20);
        getTask13(20);
        getTask14(20);
        getTask15(20);
        getTask16(20);
        getTask17(20);
        getTask18(20);
        getTask19(20);
        getTask20(20);
        getTask21(20);
        getTask22(20);
        getTask23(20);
        getTask24(20);
        getTask25(20);
        getTask26(20);

//        System.out.println(cbrt(20) + " ___ " + pow(20, 1. / 3));
    }

    private static void getTask9(double x) {
        double y = 1.1 * pow(E, -x) + abs(cos(sqrt(PI * x))) - 3.0 / 8;
        System.out.println("getTask9 = " + y);
    }

    private static void getTask10(double x) {
        double y = (1.0 / 3) * sqrt(abs(sin(x))) * cbrt(pow(E, 0.12 * x));
        System.out.println("getTask10 = " + y);
    }

    private static void getTask11(double x) {
        double y = 2 * PI * x - abs(sin(sqrt(10 * x))) / ((cbrt(pow(x, 2))) + 1.0 / 7);
        System.out.println("getTask11 = " + y);
    }

    private static void getTask12(double x) {
        double y = log(sqrt(abs(2 - x)) + 1.2) / (2 + pow(E, -x)) + cbrt(2.0 / x);
        System.out.println("getTask12 = " + y);
    }

    private static void getTask13(double x) {
        double y = pow(pow(E, -(2 + x)), 1.0 / 5) / sqrt(pow(x, 2) + pow(x, 4) + log(abs(x - 3.14)));
        System.out.println("getTask13 = " + y);
    }

    private static void getTask14(double x) {
        double sin3 = (3 * sin(x / 2) - sin(3 * x / 2)) / 4;
        double y = (sqrt(abs(sin3)) + cbrt(pow(E, 1.3 * x) + pow(E, -1.3 * x))) / abs(x + 2.0 / 5);
        System.out.println("getTask14 = " + y);

    }

    private static void getTask15(double x) {
        double y = (abs(x * log(x) - 4) * sqrt(x)) / pow(pow(E, 4 * x - 1), 1.0 / 5);
        System.out.println("getTask15 = " + y);
    }

    private static void getTask16(double x) {
        double y = cbrt(pow(E, 2 * x) * sqrt(x) - (x + 1 / 3.) / x) * abs(cos(2.5 * x));
        System.out.println("getTask16 = " + y);
    }

    private static void getTask17(double x) {
        double y = pow(x, 3) / 3. - pow(E, x) * log(abs(pow(1.3, 3) + pow(x, 3))) + 4 / 3.;
        System.out.println("getTask17 = " + y);
    }

    private static void getTask18(double x) {
        double y = (abs(7.2 - 10 * x)) / cbrt(sqrt(x) + pow(E, x)) * atan(4 * x / 3. / sqrt(pow(1.1, 3) + sqrt(x)));
        System.out.println("getTask18 = " + y);
    }

    private static void getTask19(double x) {
        double y = acos(tan(5 * x / PI)) + pow(x, 3.2) / 28;
        System.out.println("getTask19 = " + y);
    }

    private static void getTask20(double x) {
        double y = (pow(sqrt(log(x)) * x, 1 / 3) + tan(cos(PI * x))) * abs(log(x / 10.5) + 1 / 3.);
        System.out.println("getTask20 = " + y);
    }

    private static void getTask21(double x) {
        double z = (x + 3 > PI) ? toRadians(x + 3) : x + 3;
        double y = (pow(log10(x), 1 / 4) + acos(z)) / abs(x + 2 * sqrt(x));
        System.out.println("getTask21 = " + y);
    }

    private static void getTask22(double x) {
        double y = asin(log10(x) / (sqrt(x) + 5 * x + 1)) - pow(x, 3.2) / 28;
        System.out.println("getTask22 = " + y);
    }

    private static void getTask23(double x) {
        double y = acos(tan(5 * x / PI)) + pow(x, 5.7) / 23;
        System.out.println("getTask23 = " + y);
    }

    private static void getTask24(double x) {
        double y = atan(abs(8.3 - 21 * sqrt(x) + 0.8 * x) / pow(2.5 + 1 / sqrt(x), 1 / 3.));
        System.out.println("getTask24 = " + y);
    }

    private static void getTask25(double x) {
        double y = pow(log10(acos(abs(pow(x, 3.4) + 2.5 * pow(x, 1.2) - 0.7) / pow(pow(E, 2.5 * x), 1 / 3.))), 1 / 4.) + 1;
        System.out.println("getTask25 = " + y);
    }

    private static void getTask26(double x) {
        double y = log(abs(sin(x))) + 2 * pow(E, x) + 2 * cos(abs(x)) + 2;
        System.out.println("getTask26 = " + y);
    }
}
