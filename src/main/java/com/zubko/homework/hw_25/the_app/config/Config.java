package com.zubko.homework.hw_25.the_app.config;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Config instance;

    private String filePath;
    private String dbUrl;
    private String dataSource;
    private String serviceUrl;


    private Config() {
        try {
            Properties props = new Properties();
            props.load(new FileReader(new File("src/main/resources/data.properties")));
            filePath = props.getProperty("filePath");
            dbUrl = props.getProperty("dbUrl");
            dataSource = props.getProperty("dataSource");
            serviceUrl = props.getProperty("serviceUrl");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getDataSource() {
        return dataSource;
    }
}
