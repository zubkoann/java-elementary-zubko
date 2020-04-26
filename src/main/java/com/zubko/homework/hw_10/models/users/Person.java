package com.zubko.homework.hw_10.models.users;

public class Person {
    protected String surname;
    protected String firstName;

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
