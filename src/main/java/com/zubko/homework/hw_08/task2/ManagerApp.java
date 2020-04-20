package com.zubko.homework.hw_08.task2;

import com.zubko.homework.hw_08.task2.controllers.InMemoryOrdersManager;
import com.zubko.homework.hw_08.task2.controllers.OrdersManager;
import com.zubko.homework.hw_08.task2.models.ExpressOrder;
import com.zubko.homework.hw_08.task2.models.Order;

public class ManagerApp {
    public static void main(String[] args) {
        OrdersManager manager = new InMemoryOrdersManager();
        manager.add("simple");
        manager.add("insured");
        manager.add("express");
        manager.add("air");

        manager.show();


        Order o1 = new ExpressOrder("My Order", 10);
        o1.completeOrder();
        System.out.println(o1.getTimeStamp());

    }
}
