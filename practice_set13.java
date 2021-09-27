package com.company;

import java.util.Scanner;
class MaxException extends Exception{
    public  String toString(){
        return "You Are Reached at your Max Retries ";
    }
}
public class practice_set13 {
    public static void maxExceptionMethod() throws MaxException{
        System.out.println("You Are Reached at your Max Retries");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Practice-Set 13");
        Scanner sc=new Scanner(System.in);
        // WAP Syntax,Logical and Runtime Error
        /* Syntax
        int a=6
        int b=7;
        System.out.println(a+b); */

        // Logical- - > WAP to print 1 b/w 10 prime number
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);// 9 Not a prime number
        }
        /* Runtime
        int a=5;
        int b=0;
        System.out.println(a/b);
        cannot divide by zero
        */

        /* 2
        * WAP to print "HaHa" during Arithmetic Exception and "HeHe" during an illegal Argument Exception
        *
        System.out.println("Enter Your Number");
        int a=sc.nextInt();
        System.out.println("Enter Your Second");
        int b=sc.nextInt();
        try {
            System.out.println("The value of a/b is: "+a/b);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            System.out.println("HaHaHaHaHa");
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
            System.out.println("HeHeHeHeHe");
        }
        // 3 WAP that allows if max retries exceed 5 print "ERROR"
        int [] marks={56,78,9};
        boolean flag=true;
        int i=0;
        while(flag&&i<5){
        try{
            System.out.println("Enter the Index of Array ");
            int index=sc.nextInt();
            System.out.println("The value of array at index "+index+" "+marks[index]);
            break;
        }catch (Exception e){
            System.out.println("Invalid Index");
            i++;
        }
        }
        if(i>=5) {
            System.out.println("Error");
        }
        // 4 Modify program 3 to throw a custom exception
        int [] marks={56,78,9};
        boolean flag=true;
        int i=0;
        while(flag&&i<5){
            try{
                System.out.println("Enter the Index of Array ");
                int index=sc.nextInt();
                System.out.println("The value of array at index "+index+" "+marks[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5) {
            try {
                throw new MaxException();

            }catch(Exception e){
                System.out.println("Error");
                System.out.println("Reason:"+e);
            }
        }
        */
        // 5 Wrap the program in 3 inside a method which throws your custom Exception

        int [] marks={56,78,9};
        boolean flag=true;
        int i=0;
        while(flag&&i<5){
            try{
                System.out.println("Enter the Index of Array ");
                int index=sc.nextInt();
                System.out.println("The value of array at index "+index+" "+marks[index]);
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5) {
                maxExceptionMethod();
        }
    }
}
