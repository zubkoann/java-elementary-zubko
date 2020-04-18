package com.zubko.homework.hw_08.task2.models;

public final class InsuredOrder extends Order {
    private String company;
    private double amount;


    public InsuredOrder(String company, double amount) {
        super();
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
