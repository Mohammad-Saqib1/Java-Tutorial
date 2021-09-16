package com.company;

public class lc_18_methods {
    static int logic(int x,int y){
        int z=x+y;
        return z;

    }

    void checker(int x,int y){
        if(x>y){
            System.out.println("X Greater");
        }
        else{
            System.out.println("Y Greater");
        }
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("The Sum is: "+sum);


        int a1=15;
        int b1=6;
        int sum1=a1+b1;
        System.out.println("The Sum is: "+sum1);
        //Method Call Without object bcz of Using static keyword
        System.out.println("The Sum Is "+logic(a1,b1));
        System.out.printf("The Sum of %d and %d is = ",a1,b1);

        System.out.println(logic(a1,b1));
        System.out.println(" ");

        //Method Call With object bcz of Not Using static keyword
        lc_18_methods obj=new lc_18_methods();
        obj.checker(a,b);


    }
}
