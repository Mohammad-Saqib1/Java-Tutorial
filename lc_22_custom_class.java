package com.company;
class Employee{
    int id;
    String name;
     int set_Id(int n){
        id=n;
        return id;
    }
    String set_Name(String n){
        name=n;
        return name;
    }
}
public class lc_22_custom_class {
    public static void main(String[] args) {
        System.out.println("Our Custom Class");
        Employee emp=new Employee();
        emp.id=23;
        emp.name="Mohammad Saqib";
        System.out.println("The Id of by directly access "+emp.id);
        System.out.println("The Name of by directly access "+emp.name);
        Employee emp2=new Employee();
        System.out.println("The Id of By Method "+emp2.set_Id(45));
        System.out.println("The Name of By Method "+emp2.set_Name("Mohammad Saqib"));
    }
}
