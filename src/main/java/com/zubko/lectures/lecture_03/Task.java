package com.zubko.lectures.lecture_03;

import java.util.Random;
import java.util.Scanner;

public class Task {
    private static Scanner s = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        getTask();
    }


    private static void getTask() {

        int min = 1;
        int max = 50;
        int diff = max - min;
        int number = rand.nextInt(diff + 1) + min;
        int guessNumber;
        System.out.println("number " + number);

        do {
            System.out.println("try to guess the number ");
            guessNumber = s.nextInt();

            if (guessNumber > number) {
                System.out.println("guessNumber > number");
            } else {
                System.out.println("guessNumber < number");
            }

        } while (guessNumber != number);

        System.out.println("CONGRATULATE!!!! YOU HAVE WIN!");


    }
}
