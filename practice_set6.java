package com.company;

public class practice_set6 {

    static void table(int n){
        System.out.printf("Multiplication Table of %d ",n);
        System.out.println("");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(" "+n+" X "+i+" = "+n*i);
        }
    }


    static void  sum(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.printf("The Sum Of %d Natural Number Is ",n);
        System.out.println(""+" = "+sum);

    }

    static void average(float n){
        float avg;
        float sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        avg=sum/n;
        System.out.printf("The Average Of %f Natural Numbers Is =",n);
        System.out.println(" "+avg);
    }

    static void convert(double n){
        System.out.printf("Convert Celcius %f into Farenhite =",n);
        n=(n*9/5)+32;

        System.out.println(" "+n);
    }

    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        // 1 Multiplication Table By Method
        int n=10;
        table(n);

        // 2 Sum of n natural numbers by method
        sum(n);
        // 3 Average Of N Numbers By Method
        average(10);
        // 4 Sum of n natural numbers by for loop
        int sum=0;
        for (int i = 1 ; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.printf("The Sum Of %d Natural Numbers Is = ",n);
        System.out.println(" "+sum);

        // 5 Convert Celcius into Farenhite
        convert(10);

        // 6 Fibonacci Series By Method
        int n1=5;
        for (int i = 0; i <n1 ; i++) {
            System.out.print(" "+fibonacci(i));

        }

    }
}
