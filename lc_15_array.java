package com.company;

public class lc_15_arrays {
    public static void main(String[] args) {
        // 1 D Arrays
        //Method 1
        System.out.println("1 D Arrays Method 1");
        int[] marks=new int[5];
        marks[0]=5;
        marks[1]=15;
        marks[2]=25;
        marks[3]=35;
        marks[4]=45;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // Method 2
        int [] flats;
        flats=new int[5];
        System.out.println("1 D Arrays Method 2");
        flats[0]=5;
        flats[1]=15;
        flats[2]=25;
        flats[3]=35;
        flats[4]=45;
        System.out.println(flats[0]);
        System.out.println(flats[1]);
        System.out.println(flats[2]);
        System.out.println(flats[3]);
        System.out.println(flats[4]);

        // Method 3
        System.out.println("1 D Arrays Method 3");
        String[] students={"Harry","Larry","Saqib","Shakil","Amir"};
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);

    }
}
