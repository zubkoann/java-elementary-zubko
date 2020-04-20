package com.zubko.homework.hw_09.controllers;

import com.zubko.homework.hw_09.models.Car;

import java.util.ArrayList;
import java.util.List;

public class SavedCarSaver {
    private List<Car> array;

    public SavedCarSaver() {
        array = new ArrayList<>();
    }

    public void add(Car car) {
        array.add(car);
    }

    public void show() {
        for (Car car : array) {
            System.out.println(car.getInfo());
            System.out.println(car.getCustomer());
        }
    }

}
