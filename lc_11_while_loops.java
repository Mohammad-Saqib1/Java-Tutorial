package com.company;

import java.util.Scanner;

public class lc_11_while_loops {
    public static void main(String[] args) {
        int n=5;
        while (n<10){
            System.out.println("Runninig "+n);
            n++;
        }

        // Print First n natural number
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your  Number");
        int nmbr=sc.nextInt();
        while (nmbr<10){
            System.out.println(nmbr);
            nmbr++;
        }
    }
}
