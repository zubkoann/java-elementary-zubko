package com.zubko.homework.hw_13;

public interface DataMapper {
    User findUserById(String id);

    User findUserByUsername(String userName);

    User findUserByEmail(String email);
}
