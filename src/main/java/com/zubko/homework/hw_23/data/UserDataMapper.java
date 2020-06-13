package com.zubko.homework.hw_23.data;

import com.zubko.homework.hw_23.User;

import java.util.List;

public interface UserDataMapper {
    User findUserById(String id);

    User findUserByUsername(String userName);

    User findUserByEmail(String email);

    List<User> getAll();
}
