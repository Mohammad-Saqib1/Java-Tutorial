package com.company;

import java.util.LinkedList;

public class lc_50_linkedlist {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(95);
        l2.add(85);
        l2.add(75);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        //l1.addAll(l2);
        l1.addAll(0,l2);
        l1.addFirst(5);
        l1.addLast(11);
        l1.add(3,111);
        l1.add(11);
        System.out.println(l1.contains(78));
        l1.remove(4);
        System.out.println(l1);
        l1.removeAll(l2);
        System.out.println(l1);
        System.out.println(l1.indexOf(111));
        System.out.println(l1.lastIndexOf(11));

    }
}
