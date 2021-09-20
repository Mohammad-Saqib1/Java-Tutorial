package com.company;

abstract class Rikshaw{
    public int pahiya;
    public int handle;

    public int getPahiya() {
        return pahiya;
    }

    public void setPahiya(int pahiya) {
        this.pahiya = pahiya;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    abstract void light();

}
class ERikshaw extends Rikshaw{
    public int light;

    public void setLight(int light) {
        this.light = light;
    }

    public void light(){
        System.out.println("I am Light Method for setting Light Value "+light);
    }
}
public class lc_30_abstract {
    public static void main(String[] args) {
        System.out.println("Abstract Class");
      // If You want to must execute any method in derived class you must make abstract method(same name) in base class
      // You Don't create any object of abstract clas
    // In Abstract Class atleast one abstract method
        ERikshaw er=new ERikshaw();
        er.setPahiya(3);
        System.out.println("Pahiya in Rikhsaw "+er.getPahiya());
        er.setHandle(1);
        System.out.println("Handle in Rikhsaw "+er.getHandle());
        er.setLight(5);
        System.out.println("Light In ERikhsaw ");
        er.light();
    }
}
