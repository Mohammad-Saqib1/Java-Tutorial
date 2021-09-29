package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class lc_56_api {
    public static void main(String[] args) {
        System.out.println("Java API");
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        LocalTime t1=LocalTime.of(13,18,50);
        System.out.println(t1);
        System.out.println(t1.getHour());
        System.out.println(t1.getMinute());
        System.out.println(t1.plusHours(5));
        System.out.println(t1.minusMinutes(8));
    }
}
