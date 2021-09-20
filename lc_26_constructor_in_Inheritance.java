package com.company;


class A{
    A(){
        System.out.println("I am a default Constructor in class A");
    }
    A(int a){
        System.out.println("I am a parameterized Constructor in class A with Value "+a);

    }
    A(int a,int b){
        System.out.println("I am a parameterized Constructor in class A with Value "+a+","+b);

    }

}
class B extends A{
    B(){
        super(5);
        System.out.println("I am a default Constructor in class B");
    }
    B(int b){
        super(5,10);
        System.out.println("I am a parameterized Constructor in class B with Value "+b);
    }
    B(int a,int b){
        super(a,b);
        System.out.println("I am a parameterized Constructor in class B with Value "+a+","+b);
    }
}

public class lc_26_constructor_in_inheritance {
    public static void main(String[] args) {
        System.out.println("Constructor In Inheritance");
        // Default Constructor
        A obja=new A();
        B objb=new B();
       // Parameterized Constructor
        A obja1=new A(5);
        B objb1=new B(10);
        B objb2=new B(10);


    }
}
