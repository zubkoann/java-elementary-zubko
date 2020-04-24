package com.zubko.homework.hw_10.models;

public class OilChange implements Service {
    private int servicePrice;
    private String type;

    public OilChange(int servicePrice) {
        this.servicePrice = servicePrice;
        this.type = "Oil Change";
    }

    @Override
    public void perform() {
        System.out.println(type + " - " + servicePrice);
    }

    public int getServicePrice() {
        return servicePrice;
    }

    @Override
    public String toString() {
        return "OilChange{" +
                "servicePrice=" + servicePrice +
                '}';
    }
}
