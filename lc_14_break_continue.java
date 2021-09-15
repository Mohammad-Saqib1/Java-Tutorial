package com.company;

public class lc_14_break_continue {
    public static void main(String[] args) {
        int n=5;
        // Break Statements
        for (int i=0;i<n;i++){
            System.out.println("You Are In For Loop "+i);
            if(i==2){
                System.out.println("Admin Not allowed to run after i=2");
                break;
            }
        }

        // Continue Statements
        System.out.print("\n\n");
        for (int i=0;i<n;i++){
            System.out.println("You Are In For Loop "+i);

            if(i==2){
                System.out.println("Admin  allowed to run before i=2 and after i=2 but not allowed to i==2");
                continue;
            }
            System.out.println("Execute Continue Statements For  "+i);

        }
    }
}
