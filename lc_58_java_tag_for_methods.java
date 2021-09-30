package com.company;

public class lc_58_java_tag_for_methods {
    /**This is a sum method which adds simply two number
     * @author Saqib
     * @param a a is always integer
     * @param b b is always integer
     * @version 1
     * @since 2000
     * {@code
     * sum method is a static method so you don't want to create object for calling}
     */
    public static void sum(int a,int b){
        System.out.println("The Sum Is: "+(a+b));
    }
    public static void main(String[] args) {
        System.out.println("Java Tags For Methods");
        sum(10,20);
    }
}
