package com.company;

import java.util.Scanner;

public class lc_44_nested_try_catch {
    public static void main(String[] args) {
        System.out.println("Nested Try Catch");
        int[] marks={40,30,20,10};
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Enter the Array Index");
            int index = sc.nextInt();
            System.out.println("Enter the value you want to divide");
            int number = sc.nextInt();
            try {
                System.out.println("Welcome to Try Catch ");
                try {
                    System.out.println("The Value of Array Index Is " + marks[index]);
                    System.out.println("The Value of Array marks[index]/number " + marks[index] / number);
                    flag =false;
                } catch (ArithmeticException e) {
                    System.out.println(" ArithmeticException");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException");
                }
            } catch (Exception e) {
                System.out.println("Ending Of Try Catch");
            }
        }
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
