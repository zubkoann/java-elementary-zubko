package com.zubko.homework.hw_12;


import java.util.Date;

public class WorkHoursControl {

    public static String countTimeLeft() {
        int hours = 0;
        Day[] days = Day.values();

        for (int i = new Date().getDay(); i <= days.length; i++) {
            hours += days[i - 1].getWorkHours();
        }

        return (hours > 0) ? hours + "hours left" : "Weekday. Have a rest!!! ;)";
    }

}



