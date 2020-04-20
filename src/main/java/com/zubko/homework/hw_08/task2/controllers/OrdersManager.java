package com.zubko.homework.hw_08.task2.controllers;

import com.zubko.homework.hw_08.task2.models.Order;


public abstract class OrdersManager {
    public abstract void add(String type);

    public abstract Order get(String id);

    public abstract Order update(Order o);

    public abstract void delete(String id);

    public abstract void show();
}
