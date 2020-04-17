package com.zubko.homework.hw_08.task1;

import com.zubko.homework.hw_08.task1.ConfigurationManager;

public class Configuration {
    public static void main(String[] args) {
        ConfigurationManager conf = ConfigurationManager.getInstance();

        System.out.println("Url: " + conf.getUrl());
        System.out.println("RunTime " + conf.getRunTime());
        System.out.println("NumberOfThreads " + conf.getNumberOfThreads());
    }
}
