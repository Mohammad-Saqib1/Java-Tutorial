package com.company;

class MyGeneric<T1,T2,T3>{
    private T1 t1;
    private T2 t2;
    private T3 t3;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T3 getT3() {
        return t3;
    }

    public void setT3(T3 t3) {
        this.t3 = t3; }

    public MyGeneric(T1 t1, T2 t2, T3 t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
public class lc_62_java_generics {
    public static void main(String[] args) {
        System.out.println("Java Generics");
        System.out.println("By Constructor");
        MyGeneric<Integer,String,Float> g1=new MyGeneric(45,"CodeWithHarry",2.5f);
        System.out.println("By Object");
        g1.setT1(25);
        g1.setT2("Imran");
        g1.setT3(3.5f);
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
        System.out.println(g1.getT3());

    }
}
