package com.zubko.homework.hw_09.models;

public class SpecialCar extends Car {
    private String type;
    private int weight;

    public SpecialCar(int id, String brand, int year, int price, String equipment, String country, String saleDate, String customer, String type, int weight) {
        super(id, brand, year, price, equipment, country, saleDate, customer);
        this.type = type;
        this.weight = weight;
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
        return "SpecialCar{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
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
