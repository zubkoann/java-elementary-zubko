package com.zubko.homework.hw_10.models;

public class TyresChange implements Service {
    protected int servicePrice;
    protected String type;

    public TyresChange(int servicePrice) {
        this.servicePrice = servicePrice;
        this.type = "Tyres Change";
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
        return "TyresChange{" +
                "servicePrice=" + servicePrice +
                '}';
    }
}
