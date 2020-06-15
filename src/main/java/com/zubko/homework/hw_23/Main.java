package com.zubko.homework.hw_23;

import com.zubko.homework.hw_23.config.Config;
import com.zubko.homework.hw_23.config.DataSource;
import com.zubko.homework.hw_23.data.DataBaseUserDataMapper;
import com.zubko.homework.hw_23.data.FileUserDataMapper;
import com.zubko.homework.hw_23.data.UserDataMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDatabaseConnector db = UserDatabaseConnector.getInstance();
        User u = new User("", "Some", "some@milo.ua", "77777", "admin");
        db.insert(u);
        List<User> users = getMapper().getAll();
//        for (User user : users) {
//            db.insert(user);
//        }
//        db.delete(31);
//        db.update(new User("1", "Mayak", "mayak@ua.ua", "34242", "director"));
//        System.out.println(db.findBy("userName","Zubko"));
//        System.out.println(db.findById(2));

        System.out.println(db.findBy("role", "admin"));

        System.out.println(users);
    }

    public static UserDataMapper getMapper() {
        DataSource datasource = DataSource.valueOf(Config.getInstance().getDataSource().toUpperCase());
        switch (datasource) {
            case DB:
                return new DataBaseUserDataMapper(Config.getInstance().getDbUrl());
            case FILE:
                return new FileUserDataMapper(Config.getInstance().getFilePath());
            default:
                throw new IllegalArgumentException("Not implemented yet");

        }
    }
}
