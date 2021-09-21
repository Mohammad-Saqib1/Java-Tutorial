package com.company;
// 1 Create a abstract class pen with write() and refill()
abstract class Pen{
    abstract void write();
    abstract void refill();
}
// 2 Use (1) and Create another Class FountainPen with extra method ChangeNib
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refill...");
    }
    void changeNib(){
        System.out.println("Change Nib...");
    }
}

// 3 Create a Class Monkey with Jump() and Bit() .Create a Class human which inherits this monkey class
//and implements basic animal interface with eat() and sleep()
class Monkey{
    void jump(){
        System.out.println("Monkey is Jumping...");
    }
    void bit(){
        System.out.println("Monkey Is Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
//4 Create a Class Telephone with phoneNo() and Disconnected() as abstract Create another Class SmartTelephone and Demonstrate polymorphism
abstract class Telephone{
    abstract void phoneNo(long number);
    abstract void disconnected();
}
class SmartTelephone extends Telephone{

    @Override
    void phoneNo(long number) {
        System.out.println("Phone Number..."+ number);
    }

    @Override
    void disconnected() {
        System.out.println("Call Disconnecting...");
    }
    void wifi(){
        System.out.println("Wifi Connection In SmartPhone...");
    }
}

// 6 Create an interface TvRemote and use it to inherit another interface smart TvRemove
interface TvRemote{
    void button();
    default void battery(){
        System.out.println("Battery Change-ble In TvRemote...");
    }
}
interface SmartTvRemote extends TvRemote{
    void sensor();
    void foldSystem();
    default void batteryChargeble(){
        System.out.println("Battery Charge-ble In SmartTvRemote...");
    }
}
// 7 Create a Class TV which implements TvRemote interface from Q6
class TV implements SmartTvRemote{

    @Override
    public void button() {
        System.out.println("Button On...");
    }

    @Override
    public void sensor() {
        System.out.println("Sensor Working...");
    }

    @Override
    public void foldSystem() {
        System.out.println("Remote Fold...");
    }
    void screenOn(){
        System.out.println("Screen On...");
    }
    void screenOff(){
        System.out.println("Screen OFF...");
    }
}
public class practice_set10 {
    public static void main(String[] args) {
        System.out.println("Practice Set-10");
        //1 + 2
        FountainPen fp=new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
        //3
        Human h=new Human();
        h.jump();
        h.bit();
        h.eat();
        h.sleep();
        // 4
        Telephone t=new SmartTelephone();
        t.phoneNo(5432217890L);
        t.disconnected();
        //t.wifi(); Error(PolyMorphism)
        SmartTelephone st=new SmartTelephone();
        st.phoneNo(76635455735L);
        st.disconnected();
        st.wifi();
        // 5 Demonstrate PolyMorphism using Monkey class form 3
        Monkey m=new Human();
        m.jump();
        m.bit();
        //m.eat(); Error(PolyMorphism)
        Human h1=new Human();
        h1.jump();
        h1.bit();
        h1.eat();
        h1.sleep();

        //6+7
        TV tv=new TV();
        tv.button();
        tv.sensor();
        tv.foldSystem();
        tv.screenOn();
        tv.screenOff();
        tv.battery();
        tv.batteryChargeble();

    }
}
