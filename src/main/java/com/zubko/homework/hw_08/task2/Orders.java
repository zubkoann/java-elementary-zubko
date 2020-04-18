package com.zubko.homework.hw_08.task2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Orders {
    public static void main(String[] args) {
       Orders.add("simple");
       Orders.add("insured");
       Orders.add("express");
       Orders.show();
    }

    private static List<Order> orders = new ArrayList<>();

    public static void add(String type) {
        String id = UUID.randomUUID().toString();
        String date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(LocalDate.now());
        String time = LocalTime.now().toString();
        switch (type) {
            case "simple":
                orders.add(new OrdinaryOrder(id, date,  time));
                break;
            case "insured":
                orders.add(new InsuredOrder("AXA", 100000,id, date,  time));
                break;
            case "express":
                orders.add(new ExpressOrder("Raketa", 5, id, date,  time));
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
