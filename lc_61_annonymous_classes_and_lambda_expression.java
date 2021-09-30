package com.company;
interface AnoDemo{
    void meth1();
    void meth2();
}
// 1 Method
class Demo implements AnoDemo{

    @Override
    public void meth1() {
        System.out.println("Method 1");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2");
    }
}
@FunctionalInterface
interface LambdaExp{
    void meth1();
}
public class lc_61_anonymous_classes_and_lambda_expression {
    public static void main(String[] args) {
        System.out.println("Anonymous Class and Lambda Expression");
        // 2 Method
        AnoDemo ad=new AnoDemo() {
            @Override
            public void meth1() {
                System.out.println("Method 1 by anonymous");
            }

            @Override
            public void meth2() {
                System.out.println("Method 2 by anonymous");

            }
        };
        // 1 Method
        Demo d=new Demo();
        d.meth1();
        d.meth2();
        // 2 Method
        ad.meth1();
        ad.meth2();


        // Lambda Expression:- If you use lambda expression interface must be FunctionalInterface(Interface contains only one abstract method)
        LambdaExp obj=()-> {System.out.println("This Is Method 1 By Lambda Expression");
            System.out.println("You Can Add Multiple Lines of Code");
        };
        obj.meth1();
    }
}
