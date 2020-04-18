package com.zubko.homework.hw_08.task2;

import com.zubko.homework.hw_08.task2.controllers.OrdersManager;
import com.zubko.homework.hw_08.task2.models.Order;

public class ManagerApp {
    public static void main(String[] args) {
        OrdersManager manager = new OrdersManager();
        manager.add("simple");
        manager.add("insured");
        manager.add("express");
        manager.add("air");

        manager.show();
    }
}
