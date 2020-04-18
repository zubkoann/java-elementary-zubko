package com.zubko.homework.hw_08.task2.models;

import com.zubko.homework.hw_08.task2.models.Order;

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
