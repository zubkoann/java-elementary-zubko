package com.zubko.homework.hw_08.task2.models;

public class AirOrder extends ExpressOrder {
    private String comp;

    public AirOrder(String courier, int daysToDeliver, String comp) {
        super(courier, daysToDeliver);
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "AirOrder{" +
                "comp='" + comp + '\'' +
                ", courier='" + courier + '\'' +
                ", daysToDeliver=" + daysToDeliver +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
