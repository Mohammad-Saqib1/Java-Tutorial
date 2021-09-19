package com.company;

class Cons{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Default Constructor
    public Cons(){
        System.out.println("I Am Default Constructor");
    }
    // Parameterized Constructor
    public Cons(int id, String name) {
        System.out.println("I Am Parameterized Constructor");
        this.id = id;
        this.name = name;
        System.out.println("Id Is "+id);
        System.out.println("Name Is "+name);
    }
}

public class lc_24_constructor {
    public static void main(String[] args) {
        System.out.println("Constructor Tutorial");
        Cons c=new Cons();
        c.setId(45);
        System.out.println("Id Is "+c.getId());
        c.setName("CodeWithHarry");
        System.out.println("Name Is "+c.getName());


        //Constructor Generally used for directly set parameter
        Cons c1=new Cons(43,"Saqib");
    }
}
