package com.zubko.homework.hw_09.controllers;

import com.zubko.homework.hw_09.models.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarManager extends CarSaver {
    private List<Car> array;

    public InMemoryCarManager() {
        array = new ArrayList<>();
    }

    public void add(Car car) {
        array.add(car);
    }

    public void show(Car car) {
        int index = array.indexOf(car);

        System.out.println(array.get(index));
    }

    @Override
    public void delete(Car car) {
        int index = array.indexOf(car);
        array.remove(index);
    }

    @Override
    public void update(String brand, Car newCar) {
        int index;
        for (Car car : array) {
            if (car.getBrand() == brand) {
                index = array.indexOf(car);
                array.set(index, newCar);
            }
            break;
        }


    }

    @Override
    public Car get(int index) {
        return array.get(index);
    }

    public void getList() {
        array.forEach(el -> System.out.println(el));
    }

}
