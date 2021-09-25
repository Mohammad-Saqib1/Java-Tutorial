package com.company;
class MyThr extends Thread{
    public MyThr(String name)
    {
        super("CodeWithHarry");
        System.out.println("MyThr Constructor "+name);
    }




}

public class lc_38_java_thread_constructor {
    public static void main(String[] args) {
        System.out.println("Thread Constructor");
        MyThr t1=new MyThr("Saqib");
        MyThr t2=new MyThr("Hello");
        System.out.println("The Name Is "+t1.getName());
        System.out.println("The Id Is "+t1.getId());
        System.out.println("The Name Is "+t2.getName());
        System.out.println("The Id Is "+t2.getId());
    }
}
