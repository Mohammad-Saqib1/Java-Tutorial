package com.company;

import java.util.Scanner;

// 1 Create three Class Calc , Sc Calc and Hybrid Calc and group them.
interface Calculator{
    default void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number :");
         float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :");
         float b=sc.nextFloat();
         float c=a+b;
        System.out.printf("The Addition Of %f %f ",a,b);
        System.out.println(c);
    }
    default void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number :");
         float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :");
         float b=sc.nextFloat();
         float c=a-b;
        System.out.printf("The Addition Of %f %f ",a,b);
        System.out.println(c);
    }
    default void mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number :");
         float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :");
         float b=sc.nextFloat();
         float c=a*b;
        System.out.printf("The Addition Of %f %f ",a,b);
        System.out.println(c);
    }
    default void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number :");
         float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :");
         float b=sc.nextFloat();
         float c=a/b;
        System.out.printf("The Addition Of %f %f ",a,b);
        System.out.println(c);
    }

}
interface ScCalculator{
    default void sinVal(int val){
        if(val==0){
            System.out.println("Sin(0)=0");
        }
        else if(val==30){
            System.out.println("Sin(30)=1/2");
        }
        else if(val==45){
            System.out.println("Sin(45)=1/√2");
        }
        else if(val==60){
            System.out.println("Sin(60)=√3/2");
        }
        else if(val==90){
            System.out.println("Sin(90)=1");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
        default void cosVal(int val){
        if(val==0){
            System.out.println("cos(0)=1");
        }
        else if(val==30){
            System.out.println("cos(30)=√3/2");
        }
        else if(val==45){
            System.out.println("cos(45)=1/√2");
        }
        else if(val==60){
            System.out.println("cos(60)=1/2");
        }
        else if(val==90){
            System.out.println("cos(90)=0");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
        default void tanVal(int val){
        if(val==0){
            System.out.println("tan(0)=0");
        }
        else if(val==30){
            System.out.println("tan(30)=1/√3");
        }
        else if(val==45){
            System.out.println("tan(0)=1");
        }
        else if(val==60){
            System.out.println("tan(60)=√3");
        }
        else if(val==90){
            System.out.println("tan(90)=undefined");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
class Hybrid implements ScCalculator,Calculator{

}

public class practice_set11 {
    public static void main(String[] args) {
        System.out.println("Practice-Set 11");
      Calculator calc=new Hybrid();
      calc.add();
      calc.sub();
      calc.mul();
      calc.div();

      ScCalculator sCalc=new Hybrid();
      sCalc.sinVal(60);
      sCalc.cosVal(70);
      sCalc.tanVal(60);

      Hybrid h=new Hybrid();
      h.add();
      h.sub();
      h.mul();
      h.div();
      h.cosVal(90);
      h.sinVal(45);
      h.tanVal(45);
    }
}
