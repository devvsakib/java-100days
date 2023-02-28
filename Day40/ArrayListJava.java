package com;

import java.util.*;
//  * => import all;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(1);
        l1.add(56);
        l1.add(63);
        l1.add(5);
        l1.add(3);
        l1.add(0, 8);
        l1.add(0, 1);

        l2.add(12);
        l2.add(12);
        l2.addAll(l1);
        // l2.add(12); // will not add to the list

        l2.set(0, null);
        System.out.println(l2);
        l1.clear();
        int i = 0;
        // while (i < l1.size()) {
        // System.out.println(l2.get(i));
        // i++;
        // }
        // System.out.println(l2.contains(12)); // true
        // System.out.println(l2.indexOf(12)); // get index of the given element
        // System.out.println(l2.indexOf(-12)); // if not, return -1
    }
}
// javac -d . ArrayListJava.java && java com/ArrayListJava