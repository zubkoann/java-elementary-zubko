package com.zubko.homework.hw_10.models;

public class Product {
    private String product;
    private int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
