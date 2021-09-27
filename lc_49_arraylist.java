package com.company;

import java.util.ArrayList;

public class lc_49_arraylist {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(77);
        l2.add(78);
        l2.add(79);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(4);
        l1.add(3);
        l1.add(3,4);
        l1.remove(3);
        l1.add(5);
        l1.addAll(l2);
        l1.addAll(0,l2);
        System.out.println(l1);
        for (Integer aFloat : l1) {
            System.out.print(aFloat+", ");
        }
        System.out.println();
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(25));
        System.out.println(l1.clone());
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.get(5));
        l1.clear();
        System.out.println(l1);


    }
}
