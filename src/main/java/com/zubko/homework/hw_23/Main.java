package com.zubko.homework.hw_23;

import com.zubko.homework.hw_23.config.Config;
import com.zubko.homework.hw_23.config.DataSource;
import com.zubko.homework.hw_23.data.DataBaseUserDataMapper;
import com.zubko.homework.hw_23.data.FileUserDataMapper;
import com.zubko.homework.hw_23.data.UserDataMapper;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = getMapper().getAll();
        UserDatabaseConnector db = UserDatabaseConnector.getInstance();
        for (User user : users) {
            db.insert(user);
        }
        db.delete(8);
        db.update(new User("10", "Mayak", "mayak@ua.ua", "34242", "director"));
//        db.findBy("id","10");
        db.getAll();
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
