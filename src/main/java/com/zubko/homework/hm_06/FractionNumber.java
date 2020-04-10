package com.zubko.homework.hm_06;

public class FractionNumber {
    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;


    public static void main(String[] args) {
        FractionNumber h = new FractionNumber(3, 2, 2, 4);
        System.out.println(h);
        System.out.println(h.plus());
        System.out.println(h.minus());
        System.out.println(h.multiply());
        System.out.println(h.divide());
    }

    public FractionNumber(int numerator1, int denominator1, int numerator2, int denominator2) {
        if (numerator1 == 0 || denominator1 == 0 || numerator2 == 0 || denominator2 == 0)
            throw new ArithmeticException();
        this.numerator1 = numerator1;
        this.denominator1 = denominator1;
        this.numerator2 = numerator2;
        this.denominator2 = denominator2;
    }

    public double plus() {
        return (double) (numerator1 * denominator2 + numerator2 * denominator1) / (denominator1 * denominator2);
    }

    public double minus() {
        return (double) (numerator1 * denominator2 - numerator2 * denominator1) / (denominator1 * denominator2);
    }

    public double multiply() {
        return (double) (numerator1 * numerator2) / (denominator1 * denominator2);
    }

    public double divide() {
        return (double) (numerator1 * denominator2 / numerator2 * denominator1);
    }

    public int getNumerator1() {
        return numerator1;
    }

    public void setNumerator1(int numerator1) {
        this.numerator1 = numerator1;
    }

    public int getDenominator1() {
        return denominator1;
    }

    public void setDenominator1(int denominator1) {
        this.denominator1 = denominator1;
    }

    public int getNumerator2() {
        return numerator2;
    }

    public void setNumerator2(int numerator2) {
        this.numerator2 = numerator2;
    }

    public int getDenominator2() {
        return denominator2;
    }

    public void setDenominator2(int denominator2) {
        this.denominator2 = denominator2;
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                "numerator1=" + numerator1 +
                ", denominator1=" + denominator1 +
                ", numerator2=" + numerator2 +
                ", denominator2=" + denominator2 +
                '}';
    }
}
