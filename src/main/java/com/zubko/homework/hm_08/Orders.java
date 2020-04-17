package com.zubko.homework.hm_08;

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
                orders.add(new InsuredOrder("AXA", 100000));
                break;
            case "express":
                orders.add(new ExpressOrder("Raketa", 5));
                break;
            default:
                break;
        }
    }
    public static void show(){
        for (Order order:orders){
            System.out.println(order);
        }
    }
}
