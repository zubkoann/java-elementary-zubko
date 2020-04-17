package com.zubko.homework.hm_08;

public class ExpressOrder extends Order{
    public String courier;
    public int daysToDeliver;

    public ExpressOrder(String courier, int daysToDeliver) {
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



