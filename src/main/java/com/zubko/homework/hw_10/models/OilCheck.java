package com.zubko.homework.hw_10.models;

public class OilCheck implements Service {
    private int service;
    private String type;

    public OilCheck(int service) {
        this.service = service;
        this.type = "Oil Check";
    }


    @Override
    public int perform() {
        return service;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "OilCheck{" +
                "service=" + service +
                '}';
    }


}
