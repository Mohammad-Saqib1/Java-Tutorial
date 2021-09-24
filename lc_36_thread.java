package com.company;
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<400;i++){
            System.out.println("I Am MyThread 1 ");
            System.out.println("I Am Happy ");
        }
    }

}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<400;i++){
            System.out.println("I Am MyThread 2");
            System.out.println("I Am Sad");
        }
    }
}

public class lc_36_thread {
    public static void main(String[] args) {
        System.out.println("Thread Tutorial");
        // If you want to execute concurrency work then you can use threading
        // Concurrency - - > Means You are doing multiple work but at a time you are executing only on task
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start(); //Execute run method always call start()
        t2.start(); //Execute run method always call start()

    }
}
