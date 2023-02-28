package com;

import java.util.ArrayDeque;

public class ArrayDequeJava {
    public static void main(String[] args) {
            ArrayDeque<Integer> ad = new ArrayDeque<>();
            ArrayDeque<String> ad2 = new ArrayDeque<>();
            ad2.add("devv");
            ad2.add("sakib");

            ad.add(123);
            ad.add(132);
            ad.add(12);
            ad.add(2);
            ad.addFirst(-12);

            System.out.println(ad.getFirst());
            // System.out.println(ad2);
    }
}
// javac -d . ArrayDequeJava.java && java com/ArrayDequeJava