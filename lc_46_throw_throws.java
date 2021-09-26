package com.company;
class NegativeRadiusException extends Exception{

   public String toString(){
        return "Radius Can't be Negative";
    }
}
public class lc_46_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Throw Vs Throws");
        try {
            int c=divide(6,0);
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Reason: "+e);
        }
        try {
            double ar=area(-2);
            System.out.println(ar);
        }catch(Exception e){
            System.out.println("Reason: "+e);
        }
    }
}
