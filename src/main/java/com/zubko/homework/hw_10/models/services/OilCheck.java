package com.zubko.homework.hw_10.models.services;

public class OilCheck implements Service {
    private int servicePrice;
    private String type;

    public OilCheck(int servicePrice) {
        this.servicePrice = servicePrice;
        this.type = "Oil Check";
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
        return "OilCheck{" +
                "servicePrice=" + servicePrice +
                '}';
    }


}
