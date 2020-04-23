package com.zubko.homework.hw_10.models;

public class OilChange implements Service {
    private int service;
    private String type;

    public OilChange(int service) {
        this.service = service;
        this.type = "OilChange";
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
        return "OilChange{" +
                "service=" + service +
                '}';
    }
}
