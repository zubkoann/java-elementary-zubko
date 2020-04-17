package com.zubko.homework.hm_08;

public class InsuredOrder extends Order{
    public String company;
    public double amount;

    public InsuredOrder(String company, double amount ) {
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
