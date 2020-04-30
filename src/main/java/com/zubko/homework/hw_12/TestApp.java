package com.zubko.homework.hw_12;

/**
 * Написать enum Day со списком дней недели и 2 параметрами - порядковый номер дня недели
 * (начало недели с понедельника) и количество рабочих часов (пн-чт 8 часов, пт - 6 часов)
 * Написать программу, которая будет используя данный enum показывать количество рабочих часов,
 * которые остались до конца рабочей недели относительно текущего дня
 * Как взять текущий день:
 * Calendar calendar = Calendar.getInstance();
 * calendar.setTime(new Date());
 * DayOfWeek today = DayOfWeek.convertIntToDay(calendar.get(Calendar.DAY_OF_WEEK));
 */

public class TestApp {
    public static void main(String[] args) {
        WorkHoursControl f = new WorkHoursControl();
        WorkHoursControl f2 = new WorkHoursControl(11);

        f.setBeginOfWorkDay(8);

        System.out.println(f.countTimeLeft());
        System.out.println(f2.countTimeLeft());
    }
}
