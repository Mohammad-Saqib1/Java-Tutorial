package com.company;
class Phone{
    public void showTime(){
        System.out.println("I Am Time Showing Method in Phone");
    }
    public void on(){
        System.out.println("I Am On Method in Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("I AM Music Method In SmartPhone");
    }
    @Override
    public void on(){
        System.out.println("I AM On Method in Smartphone");
    }
}

public class lc_29_dynamic_dispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic Method Dispatch");
        // Access All Property in Both Class
        SmartPhone obj=new SmartPhone();
        obj.showTime();
        obj.on();
        obj.music();

        // Access All Property in Only Derived Class only Not access same method which also belongs in Derived Class (override Method )
        Phone p=new Phone();
        p.on();
        p.showTime();

        // If You Want to Access Override method in Derived class by using using Base class Object then you used dynamic dispatch
        Phone ps=new SmartPhone();
        ps.on();
        ps.showTime();
        // ps.music(); Error You Can't Access any method of Smartphone instead of override method
       //SmartPhone sp=new Phone(); Error Not Allowed
    }
}
