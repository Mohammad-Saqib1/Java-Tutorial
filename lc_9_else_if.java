package com.company;

import java.util.Scanner;

public class lc_9_else_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age= sc.nextInt();
        if (age==18){
            System.out.println("You are a Young Boy");
        }
        else if (age<18){
            System.out.println("You are a Baby");
        }
        else if (age>18 && age<25){
            System.out.println("You are a Employed Person");
        }
        else{
            System.out.println("Enjoy Your Life");
        }

    }
}
