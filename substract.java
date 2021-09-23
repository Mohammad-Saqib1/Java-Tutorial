package arithmetic;

import java.util.Scanner;

public class substract{
    public static void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number :");
        float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :");
        float b=sc.nextFloat();
        float c=a-b;
        System.out.println(" Substraction "+c);
    }
   
    
}
