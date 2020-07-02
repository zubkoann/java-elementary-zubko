package com.zubko.homework.hw_25.storage;

import com.zubko.homework.hw_25.the_app.User;

import java.util.UUID;

public class NetWorkingApp {
    public static void main(String[] args) {
        UserStorageClient client = new UserStorageClient("https://simplae-app-course.herokuapp.com/users");
//        System.out.println(client.findById("985327eb-0283-46ae-b48e-5aeafb428fb0"));
//        System.out.println(client.findById("1234"));
//        System.out.println(client.findById("345345"));

        User newUser = new User(UUID.randomUUID().toString(), "username", "username@mail.ru", "1234", "director");
        client.create(newUser);
//        System.out.println(newUser);
//        System.out.println(client.findById(newUser.getId()));

        String email = "myemail@i.ua";
        String pass = "mmmmm";
        newUser.setEmail(email);
        newUser.setPassword(pass);
        client.update(newUser);
        System.out.println(newUser);
        System.out.println(client.findById(newUser.getId()));

    }
}
















