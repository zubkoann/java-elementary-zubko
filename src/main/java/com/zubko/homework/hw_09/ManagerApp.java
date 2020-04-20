package com.zubko.homework.hw_09;

import com.zubko.homework.hw_09.controllers.CarSaver;
import com.zubko.homework.hw_09.controllers.InMemoryCarManager;
import com.zubko.homework.hw_09.models.SportCar;

public class ManagerApp {
    public static void main(String[] args) {
        SportCar car1 = new SportCar(0, "BMW", 1999, 6000,
                "X5", "Germany", "19.11.2019",
                "Ivanov A.A.", 190, 2.5, 300);
        SportCar car2 = new SportCar(1, "Audi", 2009, 10_000,
                "Full", "Germany", "19.11.2019",
                "Petrov A.A.", 230, 2.5, 220);

        CarSaver carManager = new InMemoryCarManager();
        carManager.add(car1);
        carManager.add(car2);
        carManager.show(car2);
        carManager.update("BMW", car2);
        carManager.get(0);
        carManager.delete(car2);
        carManager.getList();

    }
}
