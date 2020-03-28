package com.zubko.lectures.lecture_01;

public class Lecture {
    public static void main(String[] args) {
        getTask1(1, 2, 3, 4);
        getTask1();
        getTask2(4);
        getTask3();
        getTask4("My new string");
    }

    public static void getTask1(int... args) {
        int sum = 0;
        if ( args.length>0){
            for (int num : args) sum += num;
            System.out.println("sum " + sum);
        }else{
            System.out.println("No arguments ");
        }

    }

    public static void getTask2(int humanAge) {
        int firstAge = 15;
        int secondAge = 9;
        int otherAgeCat = 4;
        int otherAgeDog = 5;
        int dogAge = 0;
        int catAge = 0;

        for (int i = 1; i < humanAge; i++) {
            if (i == 1) {
                dogAge += firstAge;
                catAge += firstAge;
            } else if (i == 2) {
                dogAge += secondAge;
                catAge += secondAge;
            } else {
                dogAge += otherAgeDog;
                catAge += otherAgeCat;
            }
        }

        System.out.println("humanAge=" + humanAge);
        System.out.println("dogAge=" + dogAge);
        System.out.println("catAge=" + catAge);
    }

    public static void getTask3() {
        int lines = 7;

        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines - 1) {
                for (int j = 0; j < lines; j++) {
                    System.out.print("# ");
                }
                System.out.print("  ");

                for (int j = 0; j < lines; j++) {
                    System.out.print("# ");
                }
                System.out.print("  ");

                for (int j = 0; j < lines; j++) {
                    System.out.print("# ");
                }
            } else {
                for (int j = 0; j < lines; j++) {
                    if (j == 0 || j == 6) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("  ");

                for (int j = 0; j < lines; j++) {
                    if (j == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("  ");

                for (int j = 6; j >= 0; j--) {
                    if (j == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");

        }


    }

    public static void getTask4(String str) {
        String[] array = str.split(" ");
        String output = "";

        for (String word : array) {
            String first = word.substring(0, 1).toUpperCase();
            String last = word.substring(1).toLowerCase();
            output += first + last + " ";
        }
        System.out.println(output);
    }
}