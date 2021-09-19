package com.company;
// 1
class Cylinder{
    float radius;
    float height;
    int length=5;
    int breadth=5;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // 2
    public float surface(){
        float s;
        s=2*3.14f*radius*(height+radius);
        return s;
    }
    public float volume(){
        float v;
        v=3.14f*radius*radius*height;
        return v;
    }

    // 3
    public Cylinder(){
        System.out.println("Default Constructor");
    }
    public Cylinder(float radius,float height){
        this.radius=radius;
        this.height=height;
        System.out.println("The Height In Constructor "+height);
        System.out.println("The radius In Constructor "+radius);

    }
    }
    // 4
class Rectangle1{
    float length;
    float breadth;

        public float getLength() {
            return length;
        }

        public void setLength(float length) {
            this.length = length;
        }

        public float getBreadth() {
            return breadth;
        }

        public void setBreadth(float breadth) {
            this.breadth = breadth;
        }

        public Rectangle1(float length, float breadth) {
            this.length = length;
            this.breadth = breadth;
            System.out.println("The length custom Is "+length);
            System.out.println("The breadth custom Is "+breadth);
        }
        public Rectangle1(){
            length=5;
            breadth=5;
            System.out.println("The length default Is "+length);
            System.out.println("The breadth default Is "+breadth);
        }
    }

    class Sphere{
    float radius;
    float height;
    public void setRadius(float radius){
        this.radius=radius;

    }
    public float getRadius(){
        return radius;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getHeight(){
        return height;

    }
    public float surface(){
        float s;
        s=4f*3.14f*radius*radius;
        return s;
    }
    public float volume(){
        float v;
        v=(4f/3f)*3.14f*radius*radius*radius;
        return v;
    }
    public Sphere(){
        System.out.println("Default Constructor in Sphere");
    }
    public Sphere(float radius){
        this.radius=radius;
        System.out.println("The Radius Of Parameterized Sphere "+radius);
    }
    }
public class practice_set8 {
    public static void main(String[] args) {
        System.out.println("Practice Set-8");

        // 1 Create A Class Cylinder and use getter & setters to set its radius and height

        // 2 use(1) and Calculate surface and volume
        Cylinder cel=new Cylinder();
        cel.setRadius(3.5f);
        cel.setHeight(5.6f);
        System.out.println("The Volume Of Cylinder Is "+cel.surface());
        System.out.println("The Volume Of Cylinder Is "+cel.volume());

        // 3 Use a Constructor and repeat(1)
        Cylinder cel2=new Cylinder(4.5f,5.5f);

        // 4 Set a Constructor for rectangle length and breadth 5 using Rectangle Class
            Rectangle1 rec=new Rectangle1();
            Rectangle1 rec1=new Rectangle1(10,10);

        //5 Repeat (1) for a Sphere
            Sphere s=new Sphere();
            //s.setHeight(5);
            s.setRadius(6);
            System.out.println("The Surface Of A Sphere Is "+s.surface());
            System.out.println("The Volume Of A Sphere IS "+s.volume());
            Sphere s1=new Sphere(5);


    }
}
