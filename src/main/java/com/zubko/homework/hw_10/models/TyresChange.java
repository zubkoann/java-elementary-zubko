package com.zubko.homework.hw_10.models;

public class TyresChange implements Service {
    protected int service;
    protected String type;

    public TyresChange(int service) {
        this.service = service;
        this.type = "Tyres Change";
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
        return "TyresChange{" +
                "service=" + service +
                '}';
    }
}
