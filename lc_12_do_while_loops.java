package com.company;

import java.util.Scanner;

public class lc_12_do_while_loops {
    public static void main(String[] args) {
        int n=5;
        do {
            System.out.println("Running "+n);
            n++;
        }while(n<10);

        //  Print First n natural number
        System.out.println("Enter Your Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        do {
            System.out.println("Natural Numbers "+num);
            num++;
        }while(num<100);
    }
}
