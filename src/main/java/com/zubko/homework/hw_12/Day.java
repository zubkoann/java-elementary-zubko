package com.zubko.homework.hw_12;

import java.time.DateTimeException;

public enum Day {
    SUNDAY(1, 0),
    MONDAY(2, 8),
    TUESDAY(3, 8),
    WEDNESDAY(4, 8),
    THURSDAY(5, 8),
    FRIDAY(6, 6),
    SATURDAY(7, 0);
    private int dayNumber;
    private int workHours;

    Day(int dayNumber, int workHours) {
        this.dayNumber = dayNumber;
        this.workHours = workHours;
    }

    private static final Day[] ENUMS = values();


    public static Day convertIntToDay(int dayOfWeek) {
        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            return ENUMS[dayOfWeek - 1];
        } else {
            throw new DateTimeException("Invalid value for DayOfWeek: " + dayOfWeek);
        }
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getWorkHours() {
        return workHours;
    }
}
