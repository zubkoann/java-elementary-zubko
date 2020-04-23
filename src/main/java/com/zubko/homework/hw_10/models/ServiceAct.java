package com.zubko.homework.hw_10.models;

import java.util.ArrayList;
import java.util.List;

public class ServiceAct {
    private int id;
    private List<Service> service;
    private List<Product> products;
    private Worker worker;
    private Customer customer;
    private String closed;
    private int sum;

    public ServiceAct(int id, Worker worker, Customer customer, String closed) {
        this.id = id;
        this.service = new ArrayList<>();
        this.products = new ArrayList<>();
        this.worker = worker;
        this.customer = customer;
        this.closed = closed;
        this.sum = 0;
    }

    public ServiceAct(int id, Worker worker, Customer customer) {
        this.id = id;
        this.service = new ArrayList<>();
        this.products = new ArrayList<>();
        this.worker = worker;
        this.customer = customer;
        this.sum = 0;
    }

    public void setAct(Service service) {
        this.service.add(service);
        this.sum += service.perform();
    }

    public void setProducts(Product... products) {
        for (Product prod : products) {
            this.products.add(prod);
            this.sum += prod.getPrice();
        }
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public Worker getWorker() {
        return worker;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Service> getService() {
        return service;
    }

    public String getClosed() {
        return closed;
    }

    @Override
    public String toString() {
        return "ServiceAct{" +
                "id=" + id +
                ", service=" + service +
                ", worker=" + worker +
                ", customer=" + customer +
                ", closed='" + closed + '\'' +
                '}';
    }
}
