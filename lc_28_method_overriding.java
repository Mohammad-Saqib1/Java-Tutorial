package com.company;
class A1{
    public void meth1(){
        System.out.println("I am Meth1 in Class A1");
    }
    public void meth2(){
        System.out.println("I am Meth2 in Class A1");

    }
}
class B1 extends A1{
    public void meth3(){
        System.out.println("I am Meth3 in Class B1");
    }
    @Override
    public void meth2(){
        System.out.println("I am Meth2 In Class B1");
    }
}

public class lc_28_method_overriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        B1 b=new B1();
        b.meth3();
        b.meth1();
        // meth2 called in Class B1 bcz of overriding
        b.meth2();
        A1 a=new A1();
        // meth2 called in Class A1
        a.meth2();
    }
}
