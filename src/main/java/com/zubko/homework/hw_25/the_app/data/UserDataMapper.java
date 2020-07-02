package com.zubko.homework.hw_25.the_app.data;

import com.zubko.homework.hw_25.the_app.User;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public interface UserDataMapper {
    User findUserById(String id);

    User findUserByUsername(String userName);

    User findUserByEmail(String email);

    List<User> getAll() throws ExecutionControl.NotImplementedException;
}
