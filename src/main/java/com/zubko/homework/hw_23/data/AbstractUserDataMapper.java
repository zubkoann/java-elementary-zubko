package com.zubko.homework.hw_23.data;

import com.zubko.homework.hw_23.User;
import com.zubko.homework.hw_23.exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class AbstractUserDataMapper implements UserDataMapper {
    protected List<User> users = new ArrayList<>();

    @Override
    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new UserNotFoundException("No  user with id = " + id);
    }

    @Override
    public User findUserByUsername(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        throw new UserNotFoundException("No  user with " + userName + " name");
    }

    @Override
    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new UserNotFoundException("No  user with " + email + " email");
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
