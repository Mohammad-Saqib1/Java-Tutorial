package com.company;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);

    }
    int i=0;
    public void run(){
       while(i<21){
            System.out.println("Thank You "+this.getName());
            i++;
        }
    }
}

public class lc_39_thread_priorities {
    public static void main(String[] args) {
        System.out.println("Thread Priorities");
        MyThr1 t1=new MyThr1("Harry Bhai 1");
        MyThr1 t2=new MyThr1("Harry Bhai 2");
        MyThr1 t3=new MyThr1("Harry Bhai 3");
        MyThr1 t4=new MyThr1("Harry Bhai 4");
        MyThr1 t5=new MyThr1("Harry Bhai 5(Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
