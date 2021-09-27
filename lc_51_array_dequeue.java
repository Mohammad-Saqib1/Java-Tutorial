package com.company;

import java.util.ArrayDeque;

public class lc_51_array_dequeue {
    public static void main(String[] args) {
        System.out.println("Array Dequeue");
        ArrayDeque<Integer> l2=new ArrayDeque<>();
        l2.add(95);
        l2.add(85);
        l2.add(75);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.pop();
        l2.push(80);
        l2.addFirst(60);
        l2.addLast(60);
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());
        System.out.println(l2);
    }
}
