package com.zubko.homework.hw_25.the_app.data;

import com.zubko.homework.hw_25.the_app.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataBaseUserDataMapper extends AbstractUserDataMapper {

    public DataBaseUserDataMapper(String dbUrl) {
        try {
            Connection connection = DriverManager.getConnection(dbUrl);
            ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM users");
            while (rs.next()) {
                users.add(new User(
                        rs.getString("id"),
                        rs.getString("userName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")
                ));

            }
            connection.close();
        } catch (Exception ex) {
            throw new RuntimeException("Failed connection");
        }
    }
}
