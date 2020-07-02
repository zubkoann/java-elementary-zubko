package com.zubko.homework.hw_25.the_app;

import com.zubko.homework.hw_25.the_app.config.Config;
import com.zubko.homework.hw_25.the_app.config.DataSource;
import com.zubko.homework.hw_25.the_app.data.DataBaseUserDataMapper;
import com.zubko.homework.hw_25.the_app.data.FileUserDataMapper;
import com.zubko.homework.hw_25.the_app.data.RemoteUserDataMapper;
import com.zubko.homework.hw_25.the_app.data.UserDataMapper;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {

//        UserDatabaseConnector db = UserDatabaseConnector.getInstance();
//        User u = new User("", "Some", "some@milo.ua", "77777", "admin");
//        db.insert(u);
//        List<User> users = getMapper().getAll();
//        for (User user : users) {
//            db.insert(us    er);
//        }
//        db.delete(31);
//        db.update(new User("1", "Mayak", "mayak@ua.ua", "34242", "director"));
//        System.out.println(db.findBy("userName","Zubko"));
//        System.out.println(db.findById(2));
//        System.out.println(db.findBy("role", "admin"));
//        System.out.println(users);

        UserDataMapper user = getMapper();
        System.out.println(user.getAll());
    }

    public static UserDataMapper getMapper() {
        DataSource datasource = DataSource.valueOf(Config.getInstance().getDataSource().toUpperCase());
        switch (datasource) {
            case DB:
                return new DataBaseUserDataMapper(Config.getInstance().getDbUrl());
            case FILE:
                return new FileUserDataMapper(Config.getInstance().getFilePath());
            case REMOTE:
                return new RemoteUserDataMapper(Config.getInstance().getServiceUrl());
            default:
                throw new IllegalArgumentException("Not implemented yet");

        }
    }
}
