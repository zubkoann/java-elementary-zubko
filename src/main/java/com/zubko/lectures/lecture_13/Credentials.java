package com.zubko.lectures.lecture_13;

import java.util.Objects;

public class Credentials {
    private String id;
    private String service;
    private String username;
    private String password;

    public Credentials(String id, String service, String username, String password) {
        this.id = id;
        this.service = service;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credentials that = (Credentials) o;
        return service.equals(that.service) &&
                username.equals(that.username) &&
                password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, username, password);
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "id='" + id + '\'' +
                ", service='" + service + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
