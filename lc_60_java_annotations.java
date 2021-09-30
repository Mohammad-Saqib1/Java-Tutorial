package com.company;
@FunctionalInterface
interface MyFunctional{
    void thisMethod();
    //void thisMethod1();
}

class Bunk{
    public void afterLunch(){
        System.out.println("You Can Bunk After Lunch ");
        System.out.println("This Sentence is spoke by Class Teacher");
    }
}
class College extends Bunk{
    @Override//override annotations
    public void afterLunch() {
        System.out.println("You Can't Bunk After Lunch ");
        System.out.println("This Sentence is spoke by HOD");
    }
    @Deprecated
    public void sum(int a,int b){
        System.out.println("The Sum Is :"+(a+b));
    }
}
public class lc_60_java_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Java Annotations");
        College c=new College();
        c.sum(10,20);
    }
}
