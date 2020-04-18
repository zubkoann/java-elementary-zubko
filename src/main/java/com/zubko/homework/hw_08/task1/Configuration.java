package com.zubko.homework.hw_08.task1;


public class Configuration {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("Url: " + config.url);
        System.out.println("RunTime " + config.runTime);
        System.out.println("NumberOfThreads " + config.numberOfThreads);
    }
}
