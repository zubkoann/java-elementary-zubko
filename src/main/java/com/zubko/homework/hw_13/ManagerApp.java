package com.zubko.homework.hw_13;

public class ManagerApp {
    public static void main(String[] args) {
        DataMapper mapper = new FileDataMapper();
        System.out.println(mapper.findUserById("2"));
        System.out.println(mapper.findUserByUsername("Zubko"));
        System.out.println(mapper.findUserByEmail("Ivanov@gmail.com"));
    }
}
