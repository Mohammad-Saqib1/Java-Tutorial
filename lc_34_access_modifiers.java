package com.company;

import com.saqib.checking;

class abc extends checking{
    int a=5;
    public int b=10;
    protected int c=15;
    private int d=20;
    public  void meth1() {
        // These are in same Class So,access all members
        System.out.println("The value of a in Class abc "+a);
        System.out.println("The value of b in Class abc "+b);
        System.out.println("The value of c in Class abc "+c);
        System.out.println("The value of d in Class abc "+d);
    }
    public void meth2(){
        //System.out.println(a1); This is outside of the package but in subclass So, not access default member
        System.out.println("The value of c1 in Class Checking "+c1);
        //System.out.println(d1); This is outside of the package but in subclass So, not access private member
        System.out.println("The value of d1 in Class Checking "+b1);
    }
}

public  class lc_35_access_modifiers {
    public static void main(String[] args) {
        System.out.println("Access Modifiers Tutorial");
        abc ab = new abc();
        ab.meth1();
        System.out.println("The Value of a in Class abc "+ab.a);
        System.out.println("The Value of b in Class abc "+ab.b);
        System.out.println("The Value of c in Class abc "+ab.c);
        //System.out.println(ab.d); Error Bcz This is in other Class in Same Package So, not access private member
        abc ch=new abc();
        System.out.println("The Value of b1 in Class Checking "+ch.b1);
        //System.out.println(ch.a1);Error bcz this variable is  outside of the class and in different package So,no access default member
        //System.out.println(ch.c1);Error bcz this variable is  outside of the class and in different package So,no access protected member
        //System.out.println(ch.d1);Error bcz this variable is  outside of the class and in different package So,no access private member

        ch.meth2();
            }
        }
