package com.zubko.homework.hw_08.task2.models;

public class ExpressOrder extends Order {
    protected String courier;
    protected int daysToDeliver;


    public ExpressOrder(String courier, int daysToDeliver) {
        super();
        this.courier = courier;
        this.daysToDeliver = daysToDeliver;
    }

    //getTimeStamp определили как final тут переопределить нельзя
//    @Override
//    public String getTimeStamp() {
//        return "my new timestamp";
//    }


    @Override
    public void completeOrder() {
        int dayDelta = 18-17;
        if (dayDelta>daysToDeliver){
            System.out.println("ooops!!!!!");
        }
        super.completeOrder();
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



