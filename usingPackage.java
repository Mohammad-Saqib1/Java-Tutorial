import arithmetic.*;
public class usingPackage{
    public static void main(String[] args){
        System.out.println("Use Our Custom Packages");
        System.out.println();
        addition a=new addition();
        substract s=new substract();
        multi m=new multi();
        divide d=new divide();
        System.out.println("Use Our Custom Packages For Addition ");
        a.add();
        System.out.println("Use Our Custom Packages For Substraction ");
        s.sub();
        System.out.println("Use Our Custom Packages For Multiply");
        m.mul();
        System.out.println("Use Our Custom Packages For Divide");
        d.div();
    }
}