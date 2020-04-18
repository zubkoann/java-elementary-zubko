package com.zubko.homework.hw_08.task2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class OrdinaryOrder extends Order {

    public OrdinaryOrder(String id, String date, String time) {
        super(id, date, time);
    }

    @Override
    public String toString() {
        return "OrdinaryOrder{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
