package com.zubko.homework.hw_09;

import com.zubko.homework.hw_09.controllers.SavedCarSaver;
import com.zubko.homework.hw_09.models.SportCar;

public class ManagerApp {
    public static void main(String[] args) {
        SportCar car1 = new SportCar("BMW", 1999, 6000,
                "X5", "Germany", "19.11.2019",
                "Ivanov A.A.", 190, 2.5, 300);

        SavedCarSaver s = new SavedCarSaver();
        s.add(car1);
        s.show();
    }
}
