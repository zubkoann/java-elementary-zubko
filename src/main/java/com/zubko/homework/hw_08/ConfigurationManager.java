package com.zubko.homework.hw_08;


/**
 * Singleton гарантирует, что класс имеет только один экземпляр, и предоставляет глобальную точку доступа к этому экземпляру.
 * *******************************
 * Задание 1: ConfigurationManager
 * Написать класс ConfigurationManager, который будет
 * 1) реализовывать шаблон проектирования Singleton
 * 2) в нем будет приватный конструктор
 * 3) будет метод getInstance для получения объекта класса
 * 4) методы getNumberOfThreads, getRunTime, getUrl, которые будут возвращать значения соответствующих переменных окружения или дефолтные значения, если этих переменных нет
 * 5) метод private getValueOrDefault для реалзизации п4
 */

public class ConfigurationManager {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getInstance().numberOfThreads);
        System.out.println(ConfigurationManager.getInstance().runTime);
        System.out.println(ConfigurationManager.getInstance().url);
    }

    private static ConfigurationManager instance;
    private static String numberOfThreads;
    private static String runTime;
    private static String url;

    private ConfigurationManager() {
        getValueOrDefault();
    }

    public static ConfigurationManager getInstance() {
        if (numberOfThreads == null || runTime == null || url == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void getValueOrDefault() {
        this.numberOfThreads = getNumberOfThreads();
        this.runTime = getRunTime();
        this.url = getUrl();
    }

    private String getNumberOfThreads() {
        return (System.getenv("NUMBER_OF_THREADS") == null) ? "No configuration" : System.getenv("NUMBER_OF_THREADS");
    }

    private String getRunTime() {
        return (System.getenv("RUN_TIME") == null) ? "No configuration" : System.getenv("RUN_TIME");
    }

    private String getUrl() {
        return (System.getenv("URL") == null) ? "No configuration" : System.getenv("URL");
    }


}
