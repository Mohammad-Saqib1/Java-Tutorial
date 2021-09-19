package com.company;
class Base{
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
}

class Derived extends Base{
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class lc_25_inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance Tutorial");
        Base b=new Base();
        b.setId(43);
        System.out.println("The Id Is "+b.getId());
        b.setName("Saqib");
        System.out.println("The Name IS "+b.getName());
       // b.setSalary(25000); Error bcz Base Class object can't access Derived Class Variable
        // but Derived Class Object can always access Base Class Variable
        Derived d=new Derived();
        d.setId(45);
        System.out.println("The Id In Derived Class "+d.getId());
        d.setName("CodeWithHarry");
        System.out.println("The Name In Derived Class "+d.getName());
        d.setSalary(50000);
        System.out.println("The Salary In Derived Class "+d.getSalary());
    }
}
