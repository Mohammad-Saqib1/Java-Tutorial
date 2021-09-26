package com.company;

public class lc_47_finally_block {
    public static void greet(){
        try {
            int a=50;
            int b=0;
            int c=a/b;
            System.out.println("Result :"+c);
        }catch(Exception e){
            System.out.println("Reason "+e);
        }finally {
            System.out.println("Cleaning Up Resources...");
        }
    }
    public static void main(String[] args) {
        System.out.println("Finally Block");
        greet();
        int a=9;
        int b=11;
        while(true){
            try {
                System.out.println("The Value of a/b..:"+a/b);
            }catch(Exception e){
                System.out.println("Reason:"+e);
                break;
            }
            finally {
                System.out.println("I am Finally Block");
            }
            b--;
        }

        try {
            System.out.println(50/3);
        }finally {
            System.out.println("Yes It is Allowed You Can used finally with only try block..");
        }
    }
}
