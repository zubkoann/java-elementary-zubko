package com.zubko.homework.hw_08.task2.controllers;

import com.zubko.homework.hw_08.task2.models.*;

import java.util.ArrayList;
import java.util.List;

public class OrdersManager {

    private  List<Order> orders;

    public OrdersManager() {
        orders = new ArrayList<>();
    }

    public void add(String type) {
        switch (type) {
            case "simple":
                orders.add(new OrdinaryOrder());
                break;
            case "insured":
                orders.add(new InsuredOrder("AXA", 100));
                break;
            case "express":
                orders.add(new ExpressOrder("Racket", 1));
                break;
            case "air":
                orders.add(new AirOrder("Racket", 1, "Air"));
                break;
            default:
                break;
        }
    }

    public  void show() {
        for (Order order:orders){
            System.out.println(order);
        }
    }
}
