package com.company;

/**
 * This is Display class which inherits from Phone class
 * @author Saqib
 * @version 1
 * @Since 2002
 * @See <a href="www.google.com">Java Docs</>
 */
class Display {
    public void show(){
        System.out.println("Show Display");
    }
    public void time(){
        System.out.println("Show Time");
    }
    public void date(){
        System.out.println("Show Date");
    }
}

public class lc_59_java_tag_for_class {
    public static void main(String[] args) {
        System.out.println("Java Tags For Class");
        Display d=new Display();
        d.date();
        d.show();
        d.time();

    }
}
