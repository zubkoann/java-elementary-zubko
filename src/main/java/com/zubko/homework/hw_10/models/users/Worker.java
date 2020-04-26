package com.zubko.homework.hw_10.models.users;

public class Worker extends Person {

    public Worker(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
