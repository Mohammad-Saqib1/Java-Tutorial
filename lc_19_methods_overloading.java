package com.company;

public class lc_19_methods_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a ){
        System.out.println("Good Morning "+a+" bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Moring "+a+" Enjoy Your day "+b);
    }

    static void change(int a){
        a=98;
        System.out.println("The Value Of a Is "+a);
    }
    static void change2(int [] arr){
        arr[0]=90;
        System.out.print("The Value Of a Is ");
    }
    public static void main(String[] args) {
        System.out.println("Methods Overloading");
        foo();
        foo(300);
        foo(300,500);


        //Value of a will not change bcz method takes a object copy not real value
        change(50);

        //Value of arr will  change bcz array takes a reference
        int [] marks={23,24,25,26};
        change2(marks);
        System.out.println(" "+marks[0]);

    }
}
