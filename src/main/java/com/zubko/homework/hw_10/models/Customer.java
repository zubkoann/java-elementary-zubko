package com.zubko.homework.hw_10.models;

public class Customer {
    private String surname;
    private String firstName;


    public Customer(String surname, String firstName) {
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
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", firstname='" + firstName + '\'' +
                '}';
    }
}
