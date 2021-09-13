package com.company;

public class lc_4_operators {
    public static void main(String[] args) {
        // 1 Arithmetic Operator
        int a=50;
        int b=10;
        System.out.println("Arithmetic Operator");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // 2 Assignment Operator
        System.out.println("Assignment Operator");
        b+=10;
        System.out.println(b);
        b-=10;
        System.out.println(b);
        b*=10;
        System.out.println(b);
        b/=10;
        System.out.println(b);

        // 3 Comparison Operator
        System.out.println("Comparison Operator");
        System.out.println(68>62);
        System.out.println(68<62);
        System.out.println(68==62);
        System.out.println(68>=62);
        System.out.println(68<=62);
        System.out.println(68!=62);

        // 4 Logical Operator
        System.out.println("Logical Operator");
        System.out.println(86>85 && 75<80);
        System.out.println(86>85 || 75>80);

        // 5 Bitwise Operator
        System.out.println("Bitwise Operator");
        System.out.println(2&3);
        System.out.println(2|3);


    }
}
