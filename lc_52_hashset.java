package com.company;

import java.util.HashSet;

public class lc_52_hashset {
    public static void main(String[] args) {
        System.out.println("HashSet Tutorial");
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        h1.add(16);
        h1.add(15);
        h1.add(17);
        h1.add(18);
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(4);
        System.out.println(h.size());
        System.out.println(h.equals(h1));
        System.out.println(h.contains(7));
        System.out.println(h.isEmpty());
        System.out.println(h.remove(6));
        System.out.println(h.addAll(h1));
        System.out.println(h.remove(6));
        System.out.println(h.removeAll(h1));
        System.out.println(h);
    }
}
