package com.company;

// 1
class Emp{
    int salary;
    String name;
    void setSalary(int s){
        salary=s;
    }
    int getSalary(){
        return salary;
    }
    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}

// 2
class CellPhone{
    void ringing(){
        System.out.println("CellPhone Is Ringing");
    }
    void vibrating(){
        System.out.println("CellPhone Is Vibrating");
    }
    void calling(){
        System.out.println("CellPhone Is Calling");
    }
}

// 3
class Square{
    float area;
    float parameter;

    float getArea(){
        area=parameter*parameter;
        return area;
    }
    void setParameter(float p){
        parameter=p;

    }


}

// 4
class Rectangle{
    float area;
    float length;
    float width;

    float getArea(){
        area=length*width;
        return area;
    }
    void setParameter(float len,float wid){
            length=len;
            width=wid;

    }
}

// 5
class Telling{
    void hitting(){
        System.out.println("I Am Hitting ");
    }

    void Running(){
        System.out.println("I Am Running");
    }
    void Firing(){
        System.out.println("I Am Firing");
    }
}
public class practice_set7 {
    public static void main(String[] args) {
        System.out.println("Practice Set 7");

        // 1 Create Emp Class With Following Properties
        Emp e1=new Emp();
        e1.setSalary(20000);
        e1.setName("Mohammad Saqib");
        System.out.println("My Name IS "+e1.getName());
        System.out.println("My Salary Is "+e1.getSalary());

        // 2 Create a Class CellPhone with vibrating,ringing and calling
        CellPhone cp=new CellPhone();
        cp.calling();
        cp.ringing();
        cp.vibrating();

        // 3 Create a Class Square with a method to initialize its side
        Square s=new Square();
        s.setParameter(5.5f);
        System.out.println("The Area Of A Square Is :"+s.getArea());
        // 4 Create a Class Square with a method to initialize its side
        Rectangle rec=new Rectangle();
        rec.setParameter(5,4);
        System.out.println("The Area Of A Rectangle Is :"+rec.getArea());

        // 5 Create a Class telling with hitting,running,and firing
            Telling t=new Telling();
            t.Firing();
            t.hitting();
            t.Running();

    }
}
