package com.company;
interface MyCamera2{
    void takeSnap();
    void recordVideo();

}
interface MyWifi2{
    private void wifi(){
        System.out.println("Wifi OFF...");
    }
     default void hotspot(){
        wifi();
         System.out.println("Hotspot On...");
    }

}
 class MyCellPhone2{
    void callPick(){
        System.out.println("Call Picking...");
    }
    void phoneNo(long phoneNo){
        System.out.println("Phone No Is "+phoneNo);
    }
 }
 class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{

     @Override
     public void takeSnap() {
         System.out.println("Taking ScreenShot...");
     }

     @Override
     public void recordVideo() {
         System.out.println("Record Video...");

     }
 }

public class lc_34_polymorphism_in_interfaces {
    public static void main(String[] args) {
        System.out.println("Polymorphism In InterFaces");
        //PolyMorphism Means simply you create of any class or interfaces object ,So you only access that classes or interfaces properties or methods
        // Only Call MyCellPhone 2 Method
        System.out.println("MyCellPhone2 Object");
        MyCellPhone2 mcp=new MySmartPhone2();
        mcp.phoneNo(8302104444L);
        mcp.callPick();
        // Only Call MyCamera2 Method
        System.out.println("MyCamera2 Object");
        MyCamera2 s=new MySmartPhone2();
        s.recordVideo();
        s.takeSnap();
        // Only Call MyWifi2 Method
        System.out.println("MyWifi2 Object");
        MyWifi2 mw=new MySmartPhone2();
        mw.hotspot();
        // Call All Classes and Interfaces Methods
        System.out.println("MySmartPhone2 Object");
        MySmartPhone2 msp=new MySmartPhone2();
        msp.phoneNo(6578903671L);
        msp.callPick();
        msp.recordVideo();
        msp.takeSnap();
        msp.hotspot();
    }
}
