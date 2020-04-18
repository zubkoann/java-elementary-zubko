package com.zubko.homework.hw_08.task2;

public class InsuredOrder extends Order {
    private String company;
    private double amount;


    public InsuredOrder(String company, double amount, String id, String date, String time) {
        super(id, date, time);
        this.company = company;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InsuredOrder{" +
                "company='" + company + '\'' +
                ", amount=" + amount +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
