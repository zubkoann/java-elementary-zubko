package com.zubko.homework.hw_10.controllers;

import com.zubko.homework.hw_10.models.Product;
import com.zubko.homework.hw_10.models.ServiceAct;

import java.util.ArrayList;
import java.util.List;

public class ActControll {
    private List<ServiceAct> actList;

    public ActControll() {
        actList = new ArrayList<>();
    }

    public void add(ServiceAct act) {
        actList.add(act);
    }


    public void getList() {
        actList.forEach(el -> System.out.println(el));
    }

    public void getAct(int index) {
        ServiceAct act = actList.get(index);
        List<Product> products = act.getProducts();

        System.out.println("Act # " + act.getId());

        System.out.println();
        System.out.println("Services:");

        act.getService().forEach((el) -> {
            el.perform();
        });

        System.out.println();
        System.out.println("Products:");
        products.forEach((el) -> System.out.println(el.getProduct() + " - " + el.getPrice()));

        System.out.println();
        System.out.println("Sum: " + act.getSum());
        System.out.println();

        System.out.println("Worker: " + act.getWorker().getSurname() + " " + act.getWorker().getFirstName());
        System.out.println("Closed: " + act.getClosed() + "   _________/" +
                act.getCustomer().getSurname() + " " + act.getCustomer().getFirstName());
    }


    public void closeAct(int id, String date) {
        actList.forEach(el -> {
            if (el.getId() == id) el.setClosed(date);
        });
    }

    public List searchByWorker(String name, String surname) {
        List<ServiceAct> actsByWorker = new ArrayList<>();
        actList.forEach(el -> {
            if (el.getWorker().getFirstName() == name && el.getWorker().getSurname() == surname)
                actsByWorker.add(el);
        });
        return actsByWorker;
    }

    public List searchByCustomer(String name, String surname) {
        List<ServiceAct> actsByCustomer = new ArrayList<>();
        actList.forEach(el -> {
            if (el.getCustomer().getFirstName() == name && el.getCustomer().getSurname() == surname)
                actsByCustomer.add(el);
        });
        return actsByCustomer;
    }

    @Override
    public String toString() {
        return "ActControll{" +
                "actList=" + actList +
                '}';
    }
}
