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

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getNumberOfThreads() {
        return getValueOrDefault("NUMBER_OF_THREADS", "def");
    }

    public String getRunTime() {
        return getValueOrDefault("RUN_TIME", "def");
    }

    public String getUrl() {
        return getValueOrDefault("URL", "def");
    }

    private String getValueOrDefault(String env, String defaultValue) {
        return (System.getenv(env) != null && !System.getenv(env).isEmpty()) ? System.getenv(env) : defaultValue;
    }


}
