package com.zubko.homework.hw_23;

import com.zubko.homework.hw_13.UserNotFoundException;
import com.zubko.homework.hw_23.config.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDatabaseConnector {
    private static UserDatabaseConnector instance;

    public static UserDatabaseConnector getInstance() {
        if (instance == null) {
            instance = new UserDatabaseConnector();
        }
        return instance;
    }

    private UserDatabaseConnector() {
        try {
            createNewTable();
        } catch (Exception e) {
            throw new RuntimeException("Failed createNewTable connection");
        }
    }


    private void createNewTable() {
        final String sql = "CREATE TABLE IF NOT EXISTS users ("
                + "	id INTEGER PRIMARY KEY  autoincrement,"
                + "	userName VARCHAR(20) NOT NULL,"
                + "	email VARCHAR(20) NOT NULL,"
                + "	password VARCHAR(20) NOT NULL,"
                + "	role VARCHAR(20)"
                + ");";

        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insert(User user) {
        String sql = "INSERT INTO users(userName,email, password, role) VALUES(?,?,?,?);";
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getRole());
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection" + e);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?;";
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection" + e);
        }
        System.out.println("User deleted = " + id);
    }

    public void update(User user) {
        String sql = "UPDATE users set userName = ?, email = ?, password = ?, role = ? WHERE id = ?";
        int id = Integer.valueOf(user.getId());
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getRole());
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection" + e);
        }
        System.out.println("User update = " + user);

    }

    public User findBy(String param, String value) {
        String sql = "SELECT * FROM users where ? = ?;";
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, param);

            if (param.equals("id")) {
                pstmt.setInt(2, Integer.valueOf(value));
            } else {
                pstmt.setString(2, value);
            }

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new User(
                        Integer.toString(rs.getInt("id")),
                        rs.getString("userName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role"));
            } else {
                throw new UserNotFoundException(param + " with " + value + " NOT FOUND");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection");
        }
    }

    public User findById(int value) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, value);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new User(Integer.toString(rs.getInt("id")),
                        rs.getString("userName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role"));
            } else {
                throw new RuntimeException("not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection" + e.getMessage());
        }
    }

    public List<User> getAll() {
        String sql = "SELECT * FROM users;";
        List<User> array = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                array.add(new User(Integer.toString(rs.getInt("id")),
                        rs.getString("userName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")));
            }
            return array;
        } catch (SQLException e) {
            throw new RuntimeException("Failed connection" + e);
        }
    }


}
