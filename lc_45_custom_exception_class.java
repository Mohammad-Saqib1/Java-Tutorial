package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return " Age Can't be greater than 125 ";
    }
    public String getMessage(){
        return " Please Enter the Correct Value ";
    }
}
class ExceptionArea extends Exception{

    public String toString(){
        return " Negative Parameters Not Allowed\n" +
                "Please Enter the Correct Parameters";
    }
    public float area(float a,float b){
        return 3.14f*a*b;
    }
}
public class lc_45_custom_exception_class {
    public static void main(String[] args) {
        System.out.println("Make Your Own Custom Exception Class");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>125){
            try{
                throw new MyException();
            }catch(Exception e){
                System.out.println("Reason: "+e);
                System.out.println(e.getMessage());
            }
        }
        else if(age<0){
            try{
                throw new ArithmeticException("Negative Value Not Allowed\n Please Enter the Correct Age Value");
            }catch(Exception e){
                System.out.println("Reason: "+e);
            }
        }
        else{
            System.out.println("Age is "+age);
        }
        System.out.println("Enter the First parameters");
        float a=sc.nextFloat();
        System.out.println("Enter the Second parameters");
        float b=sc.nextFloat();
        ExceptionArea abc=new ExceptionArea();
        float c=abc.area(a,b);
        if(a<0 || b<0){
            try {
                throw new ExceptionArea();
            }catch(Exception e){
                System.out.println("Reason :"+e);
            }
        }else{
            System.out.println("Area Is "+c);
        }


    }
}
