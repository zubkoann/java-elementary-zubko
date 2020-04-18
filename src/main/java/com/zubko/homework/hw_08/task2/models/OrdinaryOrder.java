package com.zubko.homework.hw_08.task2.models;

import com.zubko.homework.hw_08.task2.models.Order;

public class OrdinaryOrder extends Order {

    public OrdinaryOrder() {
        super();
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
