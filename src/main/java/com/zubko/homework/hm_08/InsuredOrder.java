package com.zubko.homework.hm_08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

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
