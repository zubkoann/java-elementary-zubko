package com.zubko.homework.hw_12;


import java.util.Calendar;
import java.util.Date;

public class WorkHoursControl {
    private int beginOfWorkDay;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int dayNumber = calendar.get(Calendar.DAY_OF_WEEK); //5
        Day dass = Day.convertIntToDay(dayNumber);
        System.out.println(dass);
    }

    public WorkHoursControl() {
        beginOfWorkDay = 10;
    }

    public WorkHoursControl(int beginOfWorkDay) {
        this.beginOfWorkDay = beginOfWorkDay;
    }

    public void setBeginOfWorkDay(int beginOfWorkDay) {
        this.beginOfWorkDay = beginOfWorkDay;
    }

    public String countTimeLeft() {
        String timeLeft;

        int hours = 0;
        int minutes = 0;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = dayNumber; i <= Day.FRIDAY.getDayNumber(); i++) {
            if (i == dayNumber) {
                int minutesNow = calendar.get(Calendar.MINUTE);
                int am_pm = calendar.get(Calendar.AM_PM);
                int hourNow = (am_pm == 1) ? calendar.get(Calendar.HOUR) + 12 : calendar.get(Calendar.HOUR);
                if (beginOfWorkDay > hourNow) {
                    hours += Day.convertIntToDay(i).getWorkHours();
                } else if (beginOfWorkDay < hourNow && hourNow < beginOfWorkDay + Day.convertIntToDay(i).getWorkHours()) {
                    hours += beginOfWorkDay + Day.convertIntToDay(i).getWorkHours() - hourNow;
                    if (minutesNow > 0) {
                        hours -= 1;
                        minutes += 60 - minutesNow;
                    }
                }
            } else {
                hours += Day.convertIntToDay(i).getWorkHours();
            }
        }
        timeLeft = "hours: " + hours + "   minutes: " + minutes;
        return timeLeft;
    }

}



