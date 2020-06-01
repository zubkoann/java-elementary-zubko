package com.zubko.homework.hw_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

public class Configuration {
    private String dbPort;
    private String dbHost;
    private String dbPassword;
    private String dbUser;
    public static Configuration instance;

    public static void main(String[] args) {
        Configuration c = new Configuration();
        System.out.println(c.dbHost);
        ResourceBundle b =ResourceBundle.getBundle("ru");

    }

    public Configuration() {
        try {
            Properties props = new Properties();
            props.load(new FileReader(new File("src/main/resources/config.properties")));

            dbHost = props.getProperty("dbHost");
            dbPort = props.getProperty("dbPort");
            dbPassword = props.getProperty("dbPassword");
            dbUser = props.getProperty("dbUser");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  static Configuration getInstance(){
        if (instance==null)instance=new Configuration();
        return instance;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDbHost() {
        return dbHost;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getDbUser() {
        return dbUser;
    }
}
