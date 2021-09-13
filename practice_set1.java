package com.company;

import java.util.Scanner;

public class practice_set1 {
    public static void main(String[] args) {
        // 1 calculate percentage
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Hindi Marks");
        float hindi=sc.nextFloat();
        System.out.println("Enter Your English Marks");
        float english=sc.nextFloat();
        System.out.println("Enter Your Math Marks");
        float math=sc.nextFloat();
        System.out.println("Enter Your Physics Marks");
        float physics=sc.nextFloat();
        System.out.println("Enter Your Chemistry Marks");
        float chemistry=sc.nextFloat();
        float percentage;
        percentage=(hindi+english+math+physics+chemistry)/5;
        System.out.println("Your Total Percentage Is "+percentage+"%");

        // 2 Sum Of Three Numbers
        System.out.println("Enter Your First Number");
        int n1=sc.nextInt();
        System.out.println("Enter Your Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter Your Third Number");
        int n3=sc.nextInt();
        int res=n1+n2+n3;
        System.out.println("The Sum Of The Number Is "+res);


        // 3  Calculate CGPA
        System.out.println("Enter Your Hindi Marks");
        float hindi1=sc.nextFloat();
        System.out.println("Enter Your English Marks");
        float english1=sc.nextFloat();
        System.out.println("Enter Your Math Marks");
        float math1=sc.nextFloat();
        System.out.println("Enter Your Physics Marks");
        float physics1=sc.nextFloat();
        System.out.println("Enter Your Chemistry Marks");
        float chemistry1=sc.nextFloat();
        float CGPA;
        CGPA=(hindi1+english1+math1+physics1+chemistry1)/50;
        System.out.println("Your Total CGPA Is "+CGPA);

        // 4 Take input username & print "Hello"<name>
        System.out.println("Enter Your Name");
        String str= sc.nextLine();
        System.out.println("Hello "+str);

        // 5 Convert KM To Miles
        System.out.println("Enter Your KM Value");
        float km=sc.nextFloat();
        float miles=km*(0.621f);
        System.out.println("Converting Value in Miles Is "+miles);

        // 6 Check number is int or not
        System.out.println("Enter Your number");
        boolean a= sc.hasNextInt();
        System.out.println(a);
    }
}
