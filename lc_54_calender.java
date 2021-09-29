package com.company;

import java.util.Calendar;

public class lc_54_calender {
    public static void main(String[] args) {
        System.out.println("Calender Class");
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.getTime());
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(c.getMaximum(Calendar.MONTH));
        c.add(Calendar.MONTH,2);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR,-12);
        System.out.println(c.getTime());
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getWeekYear());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getMinimalDaysInFirstWeek());

    }
}
