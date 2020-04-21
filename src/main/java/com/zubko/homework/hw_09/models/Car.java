package com.zubko.homework.hw_09.models;

public abstract class Car {
    protected int id;
    protected String brand;
    protected int year;
    protected int price;
    protected String equipment;
    protected String country;
    protected String saleDate;
    protected String customer;


    public Car(int id, String brand, int year, int price, String equipment, String country, String saleDate, String customer) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.equipment = equipment;
        this.country = country;
        this.saleDate = saleDate;
        this.customer = customer;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String getInfo();

    public abstract String getCustomer();

}
