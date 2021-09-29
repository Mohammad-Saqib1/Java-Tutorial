package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practice_set14 {
    public static void main(String[] args) {
        System.out.println("Practice-Set 14");

        // 1 Create an ArrayList and store the names of ten students and print using for-Each loop
        ArrayList<String> students=new ArrayList<>();
        students.add("Harry");
        students.add("Harry");
        students.add("Shubham");
        students.add("Rohan");
        students.add("Rohit");
        students.add("Sahil");
        students.add("Sadique");
        students.add("Riyaz");
        students.add("Ahmad");
        students.add("Ansari");
        for (String names:students) {
            System.out.println(names);
        }

        // 2 Use the Date class to print the time in the following format 21:47:02
        Date d=new Date();
        System.out.println("By Using Date Class");
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // 3 Repeat Question 2 using Calender class
        Calendar c=Calendar.getInstance();
        System.out.println("By Using Calender Class");
        //System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));//Use This

        // 4 Repeat Question 2 using java API class
        LocalTime dt=LocalTime.now();
        System.out.println("By Using API Class");
        System.out.println(dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond());

        // 5 Create a Set try to solve the duplicate values elements inside this set ad verify that only one instance is stored
        HashSet<Integer> h=new HashSet<>();
        h.add(6);
        h.add(5);
        h.add(4);
        h.add(3);
        h.add(2);
        h.add(1);
        h.add(9);
        h.add(6);
        h.add(9);//Accept only last element (Same Element)
        System.out.println(h);



    }
}
