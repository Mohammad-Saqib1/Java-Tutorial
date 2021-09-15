package com.company;

import java.util.Scanner;

public class lc_13_for_loops {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            System.out.println("Running "+i);
        }

        //Print First N natural numbers
        System.out.println("Enter Your Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Numbers IS "+i);

        }

        System.out.println("In Reverse Order");
        for (int i=num;i>0;i--){
            System.out.println(i);
        }
    }
}
