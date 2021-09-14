package com.company;

import java.util.Scanner;

public class lc_8_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age :");
        int age= sc.nextInt();
        if (age==18){
            System.out.println("You Can Drive Car ");
        }
        else{
            System.out.println("You Can't Drive Car");
        }

    }
}
