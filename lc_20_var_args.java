package com.company;

public class lc_20_var_args {
    static int sum(int a){
        return a;
    }
    static int sum(int a, int b){
        int c=a+b;
        return c;
    }
    static int sum(int a, int b,int c){
        int d=a+b+c;
        return d;
    }

    static int add(int ...arr){
        int result=0;
        for (int v:arr) {
            result=result+v;
        }
        return result;
    }

    // In this VarArgs Atleast one arguments pass
    static int add1(int a,int ...arr){
        int result=a;
        for (int v:arr) {
            result=result+v;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Var Args ");
        int a=5;
        int b=10;
        int c=5;
        System.out.printf("The sum of %d  = ",a);
        System.out.println(sum(a));
        System.out.printf("The sum of %d and %d = ",a,b);
        System.out.println(sum(a,b));
        System.out.printf("The sum of %d ,%d and %d = ",a,b,c);
        System.out.println(sum(a,b,c));

        // Why We Use VarArgs :- VarArgs Simply removes the if you want to method overload for 1 variable,2 variable, 3 variable,     ,etc

        System.out.println("Tha Addition By VarArgs "+add());
        System.out.println("Tha Addition By VarArgs "+add(5));
        System.out.println("Tha Addition By VarArgs "+add(5,10));
        System.out.println("Tha Addition By VarArgs "+add(5,10,15));
        System.out.println("Tha Addition By VarArgs "+add(5,10,15,20));
        System.out.println("Tha Addition By VarArgs "+add(a,b,c));

        // One Arguments VarArgs

        // System.out.println("Tha Addition By VarArgs "+add1()); Give Error Bcz no arguments Takes
        System.out.println("Compulsory Argument takes VarArgs");
        System.out.println("Tha Addition By VarArgs "+add1(5));
        System.out.println("Tha Addition By VarArgs "+add1(5,10));
        System.out.println("Tha Addition By VarArgs "+add1(5,10,15));
        System.out.println("Tha Addition By VarArgs "+add1(1,2,3,4));
        System.out.println("Tha Addition By VarArgs "+add1(1,2,3,4,5));
        System.out.println("Tha Addition By VarArgs "+add1(1,2,3,4,5,6));



    }
}
