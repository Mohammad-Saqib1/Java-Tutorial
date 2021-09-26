package com.company;

public class lc_41_types_of_errors {
    public static void main(String[] args) {
        System.out.println("Types Of Errors");

        // 1 SYNTAX ERRORS
//        int a=6;
//        int b=2
//        c=7;

        // 2 Logical Error
        // Print all prime number b/w 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);// 9 Is not a Prime Number
        }

        // Runtime Error
        int k=0;
        int j=1000;
        System.out.println("Integer Part of 1000 divided by k is "+j/k);
    }
}
