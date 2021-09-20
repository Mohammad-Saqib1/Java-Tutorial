package com.company;
interface Cycle{
    public int pahiya=2;
     default void setPahiya(){
        System.out.println("Pahiya = "+pahiya);
    }
    public int handle=1;
     default void setHandle(){
         System.out.println("Handle = "+handle);
     }
    public void horn();
    public void light();
    public void speedMeter();

}
class MotorCycle implements Cycle{
    public void horn(){
        System.out.println("Horn Please PEE PEE PEE PEE...");
    }
    public void light(){
        System.out.println("Light On...");
    }
    public void speedMeter(){
        System.out.println("SpeedMeter On - - > Speed=10,20,30,40....");
    }
}
public class lc_31_interfaces {
    public static void main(String[] args) {
        System.out.println("Interfaces Tutorial");

        //If You want implements all method of base class in derived class you must used interface
        // In InterFaces All Methods are Abstract

        MotorCycle mt=new MotorCycle();
        mt.setPahiya();
        mt.setHandle();
        mt.speedMeter();
        mt.light();
        mt.horn();

    }
}
