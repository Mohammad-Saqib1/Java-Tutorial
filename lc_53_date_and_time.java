package com.company;

import java.util.Date;

public class lc_53_date_and_time {
    public static void main(String[] args) {
        System.out.println("Date And Time");
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getSeconds());
        System.out.println(d.getTime());


    }
}
