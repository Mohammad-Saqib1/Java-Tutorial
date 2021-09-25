package com.company;
//1 Write a program to print Good Morning and Welcome Continuously
class PrSet12Thread1 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println(" Welcome 1");
            i++;
        }
    }
}
class PrSet12Thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<400){

            System.out.println(" Good Morning 1");
            i++;
        }
    }
}
// 2 Add a sleep Method in Welcome Thread to delay 200ms
class PrSet12Thread3 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println(" Welcome 2 ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class PrSet12Thread4 extends Thread{
    public void run(){
        int i=0;
        while(i<400){

            System.out.println(" Good Morning 2 ");
            i++;
        }
    }
}
class PrSet12Thread5 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println(" Welcome 3");
            i++;
        }
    }
}
class PrSet12Thread6 extends Thread{
    public void run(){
        int i=0;
        while(i<400){

            System.out.println(" Good Morning 3");
            i++;
        }
    }
}
class CheckState extends Thread{
    public void run(){
        System.out.println("Checking State and Current State");
    }
}
public class practice_set12 {
    public static void main(String[] args) {
        System.out.println("Practice Set-12");
        //1
        PrSet12Thread1 pr1=new PrSet12Thread1();
        PrSet12Thread2 pr2=new PrSet12Thread2();
        pr1.start();
        pr2.start();
         //2 Add a sleep Method in Welcome Thread to delay 200ms
        PrSet12Thread3 pr3=new PrSet12Thread3();
        PrSet12Thread4 pr4=new PrSet12Thread4();
        pr3.start();
        pr4.start();
        // 3 Demonstrate getPriority and setPriority
        PrSet12Thread5 pr5=new PrSet12Thread5();
        PrSet12Thread6 pr6=new PrSet12Thread6();
        pr5.start();
        pr6.start();
        pr5.setPriority(2);
        pr6.setPriority(5);
        System.out.println("Priority of pr5 "+pr5.getPriority());
        System.out.println("Priority of pr6 "+pr6.getPriority());


        // 4 How to check Thread State
        CheckState cs=new CheckState();
        System.out.println(cs.getState());
        cs.start();
        System.out.println(cs.getState());
        // 5 How to check Current Thread State
        System.out.println(Thread.currentThread().getState());


    }
}
