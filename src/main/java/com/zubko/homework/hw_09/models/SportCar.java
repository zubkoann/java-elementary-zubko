package com.zubko.homework.hw_09.models;

public class SportCar extends Car {
    private int maxspeed;
    private double engine;
    private int power;

    public SportCar(String brand, int year, int price, String equipment, String country, String saleDate, String customer, int maxspeed, double engine, int power) {
        super(brand, year, price, equipment, country, saleDate, customer);
        this.maxspeed = maxspeed;
        this.engine = engine;
        this.power = power;
    }

    @Override
    public String getInfo() {
        return brand + " " + year + " " + price;
    }

    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxspeed=" + maxspeed +
                ", engine=" + engine +
                ", power=" + power +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", equipment='" + equipment + '\'' +
                ", country='" + country + '\'' +
                ", saleDate='" + saleDate + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}
