package com.zubko.homework.hw_08.task1;


public class Configuration {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("URL: " + config.getUrl());
        System.out.println("RUN_TIME " + config.getRunTime());
        System.out.println("NUMBER_OF_THREADS " + config.getNumberOfThreads());
    }

}
