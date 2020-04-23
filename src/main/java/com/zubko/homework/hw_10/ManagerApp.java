package com.zubko.homework.hw_10;

import com.zubko.homework.hw_10.controllers.ActControll;
import com.zubko.homework.hw_10.models.*;

public class ManagerApp {
    public static void main(String[] args) {
        Worker w1 = new Worker("Ivanov", "P");
        Worker w2 = new Worker("Sidorov", "P");
        Customer c1 = new Customer("Sultan", "P");
        Customer c2 = new Customer("Skip", "P");
        Product tire = new Product("tire", 150);
        Product oil = new Product("oil", 50);
        Product wheels = new Product("wheels", 250);
        Service s1 = new OilCheck(100);
        Service s2 = new OilChange(200);
        Service s3 = new TyresChange(300);
        ServiceAct act1 = new ServiceAct(1, w1, c1);
        ServiceAct act2 = new ServiceAct(2, w2, c2);
        act1.setAct(s1);
        act2.setProducts(tire, oil, wheels);
        act2.setAct(s2);
        act2.setAct(s1);
        act2.setAct(s3);
        act2.setClosed("11-11-2019");


        ActControll acts = new ActControll();
        acts.add(act1);
        acts.add(act2);
        acts.getAct(1);

//        System.out.println(acts.searchByCustomer("P", "Sultan"));
//        System.out.println(acts.searchByWorker("P", "Sidorov"));
    }
}
