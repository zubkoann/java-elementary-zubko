package com.zubko.homework.hw_12;

public enum Day {
    MONDAY(1, 8),
    TUESDAY(2, 8),
    WEDNESDAY(3, 8),
    THURSDAY(4, 8),
    FRIDAY(5, 6),
    SATURDAY(6, 0),
    SUNDAY(7, 0);

    private int dayNumber;
    private int workHours;

    Day(int dayNumber, int workHours) {
        this.dayNumber = dayNumber;
        this.workHours = workHours;
    }


    public int getDayNumber() {
        return dayNumber;
    }

    public int getWorkHours() {
        return workHours;
    }
}
