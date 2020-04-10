package com.zubko.homework.hm_06;

/**
 * Написать класс FractionNumber, который бы представлял тип даных "Простая Дробь"
 * В классе должно быть две поля
 * В классе должны быть методы (plus, minus, multiply, divide)
 * Также, в классе должен быть метод toString, который печатает дробь в виде "2/3"
 * Сделать этот тип данных неизменяемым (immutable)
 */

public class FractionNumber {
    private int numerator;
    private int denominator;


    public static void main(String[] args) {
        FractionNumber h = new FractionNumber(3, 2);
        FractionNumber d = new FractionNumber(4, 10);
        System.out.println(h.plus(d));
        System.out.println(h.minus(d));
        System.out.println(h.multiply(d));
        System.out.println(h.divide(d));
    }

    public FractionNumber(int numerator, int denominator) {
        if (numerator == 0 || denominator == 0)
            throw new ArithmeticException();
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public FractionNumber plus(FractionNumber FractionNumber2) {
        int numerator3 = numerator * FractionNumber2.denominator + FractionNumber2.numerator * denominator;
        int denominator3 = denominator * FractionNumber2.denominator;
        return new FractionNumber(numerator3, denominator3);
    }

    public FractionNumber minus(FractionNumber FractionNumber2) {
        int numerator3 = numerator * FractionNumber2.denominator - FractionNumber2.numerator * denominator;
        int denominator3 = denominator * FractionNumber2.denominator;
        return new FractionNumber(numerator3, denominator3);
    }

    public FractionNumber multiply(FractionNumber FractionNumber2) {
        int numerator3 = numerator * FractionNumber2.numerator;
        int denominator3 = denominator * FractionNumber2.denominator;
        return new FractionNumber(numerator3, denominator3);
    }

    public FractionNumber divide(FractionNumber FractionNumber2) {
        int numerator3 = numerator * FractionNumber2.denominator;
        int denominator3 = FractionNumber2.numerator * denominator;
        return new FractionNumber(numerator3, denominator3);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    @Override
    public String toString() {
        return "FractionNumber{" + numerator +
                " / " + denominator +
                '}';
    }
}
