package com.zubko.homework.hm_06;

public class FractionNumber {
    private int num1;
    private int num2;

    public static void main(String[] args) {
        FractionNumber h = new FractionNumber(30,4);
        System.out.println(h.toString());
        System.out.println(h.plus());
        System.out.println(h.multiply());
        System.out.println(h.divide());
    }

    public FractionNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public FractionNumber() {
    }

    public int plus() {
        return this.num1 + this.num2;
    }

    public int minus() {
        return this.num2 + this.num1;
    }

    public int multiply() {
        return this.num2 * this.num1;
    }

    public double divide() {
        try {
            return (double)this.num1 / this.num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
