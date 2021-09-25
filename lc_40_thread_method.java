package com.company;
class MyNewThr1 extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Thank You In MyNewThr1");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Thank You In MyNewThr2");
            i++;
        }
    }
}
public class lc_40_thread_method {
    public static void main(String[] args) {
        System.out.println("Thread Methods");
        MyNewThr1 t1=new MyNewThr1();
        MyNewThr2 t2=new MyNewThr2();
        //If You want to execute first MyNewThr1 after completed MyNewThr1 then execute MyNewThr2 ,So You must used Join()
        t1.start();
        try{
            t1.join();

        }catch (Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}
