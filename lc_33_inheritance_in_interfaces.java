package com.company;
interface SampleInterface{
    void meth1();
    void meth2();
}
//You Can Make Class interface to interface that's why used extends keyword instead of implements
interface ChildSampleInterface extends SampleInterface {

    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Meth 1...");
    }

    @Override
    public void meth2() {
        System.out.println("Meth 2...");

    }

    @Override
    public void meth3() {
        System.out.println("Meth 3...");

    }

    @Override
    public void meth4() {
        System.out.println("Meth 4...");

    }
}

public class lc_33_inheritance_in_interfaces {
    public static void main(String[] args) {
        System.out.println("Inheritance In Interfaces");

        MySampleClass ms=new MySampleClass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
