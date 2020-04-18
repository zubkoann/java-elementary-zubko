package com.zubko.homework.hw_08.task2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ExpressOrder extends Order {
    private String courier;
    private int daysToDeliver;


    public ExpressOrder(String courier, int daysToDeliver, String id, String date, String time) {
        super(id, date, time);
        this.courier = courier;
        this.daysToDeliver = daysToDeliver;
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
                "courier='" + courier + '\'' +
                ", daysToDeliver=" + daysToDeliver +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}



