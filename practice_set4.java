package com.company;

public class practice_set4 {
    public static void main(String[] args) {


 // 1 print a pattern for n numbers in reverse order
        int n=5;
        for (int i=n;i>0;i--){
          for (int j=0;j<i;j++){
              System.out.print(" * ");
          }
          System.out.print("\n");
      }
 //2 Sum First n even Numbers
     int num=5;
        int sum=0;
        for (int i=0;i<num;i++){

            sum=sum+(2*i);

        }
        System.out.println("The Sum Of Even Numbers Is "+sum);

        // 3 Print Multiplication Table
        int mul=5;
        System.out.println("The Table Of 5 is ");
        for (int i=1;i<11;i++){
            System.out.println("5 X "+i+" = "+mul*i);
        }


        // 4 Print Multiplication Table of 10 in reverse order
        int mul1=10;
        System.out.println("The Table Of 10 is in reverse order ");
        for (int i3=10;i3>0;i3--){
            System.out.println("10 X "+i3+" = "+mul1*i3);
        }

        // 5 Find Factorial
        int fact=1;
        int n1=5;
        int i2=1;
        while(i2<=n1){
            fact=fact*i2;
            i2++;
        }
        System.out.println(fact);



        // 6 Sum Of Number Occuring The Table Of 8

        int sum1=0;
        for (int i1=1;i1<=10;i1++){
            sum1=sum1+8*i1;
            System.out.println("8 X "+i1+" = "+8*i1);
        }
        System.out.println(sum1);
    }
}
