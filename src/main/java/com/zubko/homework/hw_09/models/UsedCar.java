package com.zubko.homework.hw_09.models;

public class UsedCar extends Car {
    private String owner;
    private int mileage;

    public UsedCar(String brand, int year, int price, String equipment, String country, String saleDate, String customer, String owner, int mileage) {
        super(brand, year, price, equipment, country, saleDate, customer);
        this.owner = owner;
        this.mileage = mileage;
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
        return "UsedCar{" +
                "owner='" + owner + '\'' +
                ", mileage=" + mileage +
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
