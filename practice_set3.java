package com.company;

import java.util.Scanner;

public class practice_set3 {
    public static void main(String[] args) {

        // 1 A student pass if contain 33% in each subject and overall 40%
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Math Marks");
        float math = sc.nextFloat();
        System.out.println("Enter Your Physics Marks");
        float physics = sc.nextFloat();
        System.out.println("Enter Your Chemistry Marks");
        float chemistry = sc.nextFloat();
        float result = (math + physics + chemistry) / 3;
        if (math >= 33 && physics >= 33 && chemistry >= 33) {
            if (result >= 40) {
                System.out.println("You Are Passed");
            } else {
                System.out.println("You Are Failed");
            }

        } else {
            System.out.println("Your Are Failed");
        }
        System.out.println("Total Percentage is " + result + "%");

        // 2 Find Week day by
        System.out.println("Enter Your Enums 1 for Sunday ");
        int enums = sc.nextInt();
        switch (enums) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enums no match ");
                break;
        }

        // 3 A Year is Leap or not
        System.out.println("Enter Your Year ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year is a Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Not a Leap year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }



            // 4 Find A Website Type (1) .com->commercial website,(2).org->organization website and (3).in->indian website
        System.out.println("Enter Your Website URL ");
        String website = sc.nextLine();
        if (website.endsWith(".org")) {
            System.out.println("Website Is Organizational Website");
        } else if (website.endsWith(".com")) {
            System.out.println("Website Is Commercial Website");
        } else if (website.endsWith(".in")) {
            System.out.println("Website Is indian Website");
        } else {
            System.out.println("Wrong URl");
            }
        }
}


