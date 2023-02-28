package com;

import java.util.*;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        LinkedList<Integer> lss = new LinkedList<>();
        ls.add(56);
        ls.add(63);
        ls.add(5);
        ls.add(3);
        ls.add(0, 8);
        ls.add(0, 1);

        lss.add(12);
        lss.add(12);
        lss.addAll(ls);
        lss.addLast(34); // 
        lss.addFirst(34); // 
        lss.removeFirst(); // 

        
        System.out.println(lss);
        
        int i = 0;
    }
}

/*
 * LinkedList:
 * ----------
 * All value linked with each other.
 * Value regerece -> Prev, Next
 * 
 * ------- Head ----------------------- Tail
 * Nil <- value <-> value <-> value <-> value <-> nil
 * 
 * 
 * 
 * 
 */

// javac -d . LinkedListJava.java && java com/LinkedListJava