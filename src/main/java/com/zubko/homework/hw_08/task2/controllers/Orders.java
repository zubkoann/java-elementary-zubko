package com.zubko.homework.hw_08.task2.controllers;

import com.zubko.homework.hw_08.task2.models.ExpressOrder;
import com.zubko.homework.hw_08.task2.models.InsuredOrder;
import com.zubko.homework.hw_08.task2.models.Order;
import com.zubko.homework.hw_08.task2.models.OrdinaryOrder;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    public static void main(String[] args) {
        Orders.add("simple");
        Orders.add("insured");
        Orders.add("express");
        Orders.show();
    }

    private static List<Order> orders = new ArrayList<>();

    public static void add(String type) {
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
            default:
                break;
        }
    }

    public static void show() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
