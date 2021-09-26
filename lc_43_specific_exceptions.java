package com.company;

import java.util.Scanner;

public class lc_43_specific_exceptions {
    public static void main(String[] args) {
        System.out.println("Handling Specific Exceptions");
        int[] marks={70,80,60,50,40,30};
        boolean flag=true;
        while(flag){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Index ");
        int index=sc.nextInt();
        System.out.println("Enter the Number you want to divide the value ");
        int number=sc.nextInt();
        try {
            System.out.println("The Value of Array Index is "+marks[index]);
            System.out.println("The Value of Array Value/Number is "+marks[index]/number);
            flag=false;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException "+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException "+e);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException "+e);
        }catch(Exception e){
            System.out.println("Some Other Exception "+e);
        }
            System.out.println("Thanks For Using this Code");
    }
    }
}
