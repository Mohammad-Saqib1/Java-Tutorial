package com.company;
// 1
class Circle{
    public int radius;
    public double area(int radius)
    {
        return Math.PI*radius*radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    public double area(int radius,int height){
        return 2*Math.PI*radius*(height+radius);
    }
    public double volume(int radius,int height)
    {
        return Math.PI*radius*radius*height;
    }
}
// 2
class Rectangle2{
    public int width;
    public int height;
    public int area(int width,int height){
        return width*height;
    }
}

class Cube extends Rectangle2{
    public int volume(int width){
        return width*width*width;
    }
}

// 3
class For3Ques{
    public int width;
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return width*height;
    }
    public int volume(){
        return width*width*width;
    }
}

// 4
class ConstructorExecution1{
    public int a;
    ConstructorExecution1(){
        System.out.println("Default Constructor in ConstructorExecution1");
    }
    ConstructorExecution1(int a){
        System.out.println("Parameterized Constructor in Class ConstructorExecution1 "+a);
    }
}
class ConstructorExecution2 extends ConstructorExecution1{
    public int a;
    ConstructorExecution2(){
        System.out.println("Default Constructor in ConstructorExecution2");
    }
    ConstructorExecution2(int a){
        super(a);
        System.out.println("Parametrized Constructor in ConstructorExecution2 "+a);
    }
}
public class practice_set9 {
    public static void main(String[] args) {
        System.out.println("Practice Set-9");
        // 1 Create a Class Circle and USE Inheritance to create another class Cylinder
        Cylinder1 c1=new Cylinder1();
        System.out.println("The Area Of A Cylinder Is "+c1.area(5,5));
        Cylinder1 c2=new Cylinder1();
        System.out.println("The Volume Of A Cylinder Is "+c2.volume(5,6));
        Circle c=new Circle();
        System.out.println("The Area Of A Circle Is "+c.area(5));


        // 2 Create a Class Rectangle and Use Inheritance to create another Class Cube
        Cube rec=new Cube();
        System.out.println("The Area of Rectangle is "+rec.area(5,10));
        System.out.println("The Area of Rectangle is "+rec.volume(10));

        // 3  Create a Class  For area and volume by getter and setter
        For3Ques f=new For3Ques();
        f.setWidth(5);
        f.setHeight(5);
        System.out.println(f.area());
        System.out.println(f.volume());

        // 4 Order of Constructor Execution
        ConstructorExecution2 ce=new ConstructorExecution2();
        ConstructorExecution2 ce1=new ConstructorExecution2(5);
        /*
        1.Default Constructor Called in Class ConstructorExecution1
        2.Default Constructor Called in Class ConstructorExecution2
        3.Parameterized Constructor Called in Class ConstructorExecution1--> Bcz Of super Keyword
        4.Parameterized Constructor Called in Class ConstructorExecution2

        */


    }



}
