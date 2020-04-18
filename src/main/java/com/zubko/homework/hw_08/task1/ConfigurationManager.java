package com.zubko.homework.hw_08.task1;


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

    private static ConfigurationManager instance;
    public String numberOfThreads;
    public String runTime;
    public String url;

    private ConfigurationManager() {
        this.numberOfThreads = getNumberOfThreads() ;
        this.runTime = getRunTime() ;
        this.url = getUrl() ;
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public  String getNumberOfThreads() {
        return (System.getenv("NUMBER_OF_THREADS") == null) ? "default"  : System.getenv("NUMBER_OF_THREADS");
    }

    public  String getRunTime() {
        return (System.getenv("RUN_TIME") == null) ? "default"  : System.getenv("RUN_TIME");
    }

    public  String getUrl() {
        return (System.getenv("URL") == null) ? "default"  : System.getenv("URL");
    }


}
