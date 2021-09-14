package com.company;

import java.util.Scanner;

public class lc_10_switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Case ");
        int Case=sc.nextInt();
        switch (Case){
                case 23:
                    System.out.println("You are a Employed Person");
                    break;
                case 18:
                    System.out.println("You are a Young Boy");
                    break;
                case 17:
                    System.out.println("You are a Teenager");
                    break;
                case 45:
                    System.out.println("You are a Resting Person");
                    break;
                default:
                System.out.println("Enjoy Your Life");
                break;

        }
    }
}
