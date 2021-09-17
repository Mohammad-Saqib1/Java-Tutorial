package com.company;

public class lc_21_recursion {
    // Recursive Method
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }

    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }

        else{
            int val=1;
            for (int i = 1; i <=n; i++) {
                val=val*i;
            }
            return val;
        }
    }
    public static void main(String[] args) {
        System.out.println(" Recursion Tutorial ");
        int n=5;
        System.out.printf("The Factorial Of %d ",n);
        System.out.println(" = "+ factorial(n));

        //Iterative Method
        System.out.printf("The Factorial Of %d ",n);
        System.out.println(" = "+factorial_iterative(n));

    }
}
