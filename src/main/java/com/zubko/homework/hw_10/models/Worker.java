package com.zubko.homework.hw_10.models;

public class Worker {
    private String surname;
    private String firstName;


    public Worker(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }


    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
