package com.company;

import java.util.Scanner;

public class lc_3_input_user {
    public static void main(String[] args) {
        //Take Input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        System.out.println("Your Age Is"+age);


        System.out.println("Enter Your Float Age");
        float age1=sc.nextFloat();
        System.out.println("Your Float Age Is"+age1);

        System.out.println("Enter Your Double Age");
        double age2= sc.nextDouble();
        System.out.println("Your Double Age Is"+age2);

        System.out.println("Enter Long Age");
        long age3= sc.nextLong();
        System.out.println("Your Long Age Is"+age3);

        System.out.println("Enter Your Short Age");
        short age4= sc.nextShort();
        System.out.println("Your Short Is"+age4);


        System.out.println("Enter Your Byte Age");
        byte age5= sc.nextByte();
        System.out.println("Your Byte Is"+age5);

        //nextLine() contains all the sentence
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println("Your Name Is "+name);

        //next() only contains first word
        System.out.println("Enter Your Name");
        String name1=sc.next();
        System.out.println("Your Name Is "+name1);



    }
}
