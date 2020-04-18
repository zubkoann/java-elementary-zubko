package com.zubko.homework.hw_08.task2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Задание 2:
 * Система управления доставкой товара. Создать родительский класс «Заказ» (дата, время, идентификатор) и дочерние классы:
 * «Обычный заказ»;
 * «Срочный заказ» (курьер, дата доставки);
 * «Застрахованный заказ» (компания страхования, сумма).
 * Реализовать класс для хранения списка заказов с методом добавления заказа и методом печати списка заказов.
 */
public class Order {
    private String id;
    private String date;
    private String time;

    public Order(String id, String date, String time ){
        this.id = id;
        this.date = date;
        this.time = time;
    }

}