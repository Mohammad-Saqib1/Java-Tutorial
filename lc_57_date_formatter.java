package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class lc_57_date_formatter {
    public static void main(String[] args) {
        System.out.println("Java DateFormatter");
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy--E H:m a");
        System.out.println(dtf);
        String mydate=dt.format(dtf);
        System.out.println(mydate);

    }
}
