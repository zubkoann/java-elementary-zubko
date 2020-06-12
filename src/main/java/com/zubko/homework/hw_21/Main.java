package com.zubko.homework.hw_21;

public class Main {
    public static void main(String[] args) {
        DbHandler dbHandler = new DbHandler();
        dbHandler.createNewTable();
        dbHandler.insert("QQQ", "3535");
        dbHandler.insert("QQfdQ", "3");
//        dbHandler.delete(5);
//        dbHandler.delete(6);
        dbHandler.delete(2);
        dbHandler.selectAll();

    }
}
