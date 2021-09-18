package com.company;
class Hello{
    int id;
    String name;
    private String name1;
    private int id1;

    void setId1(int id1){
        this.id1=id1;
    }
   int getId1(){
        return id1;
   }

    void setName1(String name1){
        this.name1=name1;
    }
    String getName1(){
        return name1;
    }
}
public class lc_23_access_modifiers {
    public static void main(String[] args) {
        System.out.println("Access Modifiers");
        Hello h=new Hello();
        h.id=40;
        h.name="CodeWithHarry";
        System.out.println("The Id Of "+h.id);
        System.out.println("The Name Of "+h.name);
        System.out.println("Private Access Modifiers");
        //h.id1=40;
       //h.name1="CodeWithHarry";--> It Gives error bcz private variable not accessable by directly object its access by methods

        h.setId1(405);
        h.setName1("Mohammad Saqib");
        System.out.println("The Id Of In Methods :"+h.getId1());
        System.out.println("The Name Of In Methods :"+h.getName1());
    }
}
