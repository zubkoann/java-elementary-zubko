package com.zubko.homework.hw_23;

import com.zubko.homework.hw_23.config.Config;

import java.sql.*;

public class UserDatabaseConnector {
    private static UserDatabaseConnector instance;

    public static UserDatabaseConnector getInstance() {
        if (instance == null) {
            try {
                instance = new UserDatabaseConnector();
            } catch (Exception e) {
                throw new RuntimeException("");
            }
        }
        return instance;
    }

    private UserDatabaseConnector() {
        try {
            createNewTable();
        } catch (Exception e) {
            throw new RuntimeException("");
        }

    }

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Config.getInstance().getDbUrl());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private void createNewTable() {
        final String sql = "CREATE TABLE IF NOT EXISTS users ("
                + "	id INTEGER PRIMARY KEY autoincrement,"
                + "	userName VARCHAR(20) NOT NULL,"
                + "	email VARCHAR(20) NOT NULL,"
                + "	password VARCHAR(20) NOT NULL,"
                + "	role VARCHAR(20)"
                + ");";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Таблица создана");
    }

    public void insert(User user) {
        String sql = "INSERT INTO users(userName,email, password, role) VALUES(?,?,?,?);";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getRole());
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?;";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("User deleted = " + id);
    }

    public void update(User user) {
        String sql = "UPDATE main.users set userName='?', email='?', password='?', role='?'   WHERE id = ?";
        int id = Integer.valueOf(user.getId());
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getRole());
            pstmt.setInt(5, id);
            pstmt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("User update = " + user);

    }

    public void findBy(String param, String value) {
        String sql = "SELECT * FROM main.users WHERE ? = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            if (param.equals("id")) {
                pstmt.setString(1, param);
                pstmt.setInt(2, Integer.valueOf(value));
            } else {
                pstmt.setString(1, param);
                pstmt.setString(2, value);
            }
            ResultSet rs = pstmt.executeQuery();
            System.out.println(rs.next());
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("userName") + "\t" +
                        rs.getString("email") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("role"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("User search = " + param + ": " + value);
    }

    public void getAll() {
        String sql = "SELECT * FROM users;";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("userName") + "\t" +
                        rs.getString("email") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("role"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
