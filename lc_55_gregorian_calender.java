package com.company;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class lc_55_gregorian_calender {
    public static void main(String[] args) {
        System.out.println("Gregorian Calender");
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2000));
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(gc.getTime());
        System.out.println(gc.getFirstDayOfWeek());
        System.out.println(gc.getMinimalDaysInFirstWeek());
    }
}
