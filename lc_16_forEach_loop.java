package com.company;

public class lc_16_forEach_loop {
    public static void main(String[] args) {
        System.out.println("For Loop");
        String[] students={"Harry","Larry","Amir","Saqib","Shakir"};
        for (int i = 0; i <students.length ; i++) {
            System.out.println("Index of Students "+i+" "+students[i]);
        }


        System.out.println("ForEach Loop");
        String[] studentsForEach={"Harry","Larry","Amir","Saqib","Shakir"};
        for (String forEach : studentsForEach) {
            System.out.println(forEach);
        }
    }
}
