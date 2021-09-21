package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording 4K Video...");
    }

}
interface MyWifi{
    String[] getNetwork();
    void connectNetwork(String network);
    private void wifiOff(){
        System.out.println("Wifi Off...");
            }
    default void hotspot(){
        wifiOff();
        System.out.println("Hotspot On");
    }
}
class MyCellPhone{
    void callNo(long number){
        System.out.println("Calling from this ..."+number);
    }
    void picCall(){
        System.out.println("Call Picking...");
    }

}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }



    @Override
    public String[] getNetwork() {
        System.out.println("Getting Network");
        String[] networkList={"Saqib","Amir","Harry"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("Connecting Network... "+network);
    }
}

public class lc_32_default_methods_in_intrface {
    public static void main(String[] args) {
        System.out.println("Default Methods in Interfaces");
        MySmartPhone ms=new MySmartPhone();
        ms.callNo(8302104444l);
        ms.picCall();
        ms.connectNetwork("Saqib");
        String[] gn=ms.getNetwork();
        System.out.println("Checking the NetworkList ");
        for(int i=0;i<gn.length;i++){
            System.out.println(gn[i]);
        }
        ms.recordVideo();
        ms.takeSnap();
        // If you want use an extra method without disturbing any class you must define a default method in interfaces
        ms.record4kVideo();
        //ms.wifiSpeed(); Error Bcz you Can't access private method
        ms.hotspot();// If you Want to access any method with any other method you can create private method and call in default method
    }
}
