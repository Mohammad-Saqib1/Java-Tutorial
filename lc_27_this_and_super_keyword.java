package com.company;
class This{
    public int id;
    This(){
        System.out.println("I am default Constructor in This Class");
    }
    This(int id){
        this.id=id;
        System.out.println("The ID Is "+id);
    }
}

class Keyword extends This{
    String name;
    Keyword(){
        super(45);
        System.out.println("I am Default Constructor in Keyword Class");
    }
    Keyword(String name){
        super();
        this.name=name;
        System.out.println("The Name Is "+name);
    }
}

public class lc_27_this_and_super {
    public static void main(String[] args) {
        System.out.println("This And Super Keyword");
        This t=new This();
        Keyword k=new Keyword("Saqib ");
    }
}
