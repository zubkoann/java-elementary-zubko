package com.zubko.homework.hw_09.controllers;

import com.zubko.homework.hw_09.models.Car;


public abstract class CarSaver {
    public abstract void add(Car car);

    public abstract void delete(Car car);

    public abstract void update(String brand, Car newCar);

    public abstract void show(Car car);

    public abstract Car get(int index);

    public abstract void getList();

}
