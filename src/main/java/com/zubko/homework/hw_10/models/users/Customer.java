package com.zubko.homework.hw_10.models.users;

public class Customer extends Person {

    public Customer(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
