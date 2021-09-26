package com.company;

public class lc_42_try_catch {
    public static void main(String[] args) {
        System.out.println("Try Catch Block");
        int a=1000;
        int b=0;
        //Without Try Catch
        //System.out.println(a/b);
        //With Try Catch
        try{
            int c=a/b;
            System.out.println("Result IS "+c);
        }catch(Exception e){
            System.out.println("Failed to divide - - > Reason: "+e);
        }

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
