package com.zubko.homework.hw_08.task2.models;

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
    protected String id;
    protected String date;
    protected String time;

    public Order( ){
        this.id = UUID.randomUUID().toString();;
        this.date = DateTimeFormatter.ofPattern("yyy/MM/dd").format(LocalDate.now());
        this.time = LocalTime.now().toString();
    }

}
