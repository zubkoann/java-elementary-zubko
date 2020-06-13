package com.zubko.homework.hw_23.data;

import com.zubko.homework.hw_23.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUserDataMapper extends AbstractUserDataMapper {

    public FileUserDataMapper(String file) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(file)));

            String line;
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split(",");
                users.add(
                        new User(parts[0], parts[1], parts[2], parts[3], parts[4])
                );
            }
        } catch (Exception ex) {
            throw new RuntimeException("Failed filed to parse");
        }
    }


}
