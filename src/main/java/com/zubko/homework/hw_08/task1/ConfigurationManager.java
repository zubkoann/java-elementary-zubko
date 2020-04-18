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
    private String NUMBER_OF_THREADS;
    private String RUN_TIME;
    private String URL;

    private ConfigurationManager() {
        NUMBER_OF_THREADS = "NUMBER_OF_THREADS" ;
        RUN_TIME = "RUN_TIME" ;
        URL = "URL" ;
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
            instance.getValueOrDefault();
        }
        return instance;
    }

    public  String getNumberOfThreads() {
        return NUMBER_OF_THREADS;
    }

    public  String getRunTime() {
        return RUN_TIME;
    }

    public  String getUrl() {
        return URL;
    }
    private void getValueOrDefault(){
        NUMBER_OF_THREADS = (System.getenv("NUMBER_OF_THREADS") == null ||  System.getenv("NUMBER_OF_THREADS").isEmpty()) ?  NUMBER_OF_THREADS : System.getenv("NUMBER_OF_THREADS");
        RUN_TIME = (System.getenv("RUN_TIME") == null ||  System.getenv("RUN_TIME").isEmpty()) ?  RUN_TIME : System.getenv("RUN_TIME");
        URL = (System.getenv("URL") == null ||  System.getenv("URL").isEmpty()) ?  URL : System.getenv("URL");
    }


}
