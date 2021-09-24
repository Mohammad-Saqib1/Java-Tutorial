package com.company;
class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<400;i++){
            System.out.println(" I Am MyThreadRunnable 1");
            System.out.println(" I Am MyThreadRunnable 1 I Am Happy");
        }
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<400;i++){
            System.out.println(" I Am MyThreadRunnable 2");
            System.out.println(" I Am MyThreadRunnable 2 I Am Sad");

        }
    }
}

public class lc_37_runnable_thread {
    public static void main(String[] args) {
        System.out.println(" Threading Using Runnable ");
        /*
        * You can not access start() directly,So You must create Thread object before using start() after
        * then pass Class Object in Thread class then access start() using Thread Object
        * Example given below
        * */
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
