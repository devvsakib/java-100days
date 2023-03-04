package com;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(12);
        myHashSet.add(12);
        myHashSet.add(15);
        myHashSet.add(8);
        myHashSet.add(10);
        System.out.println(myHashSet);
    }
}

/*
    In Java, a HashSet is a collection class that implements the Set interface and allows you to store elements in a collection with no duplicates. It is a part of the Java Collections Framework.
*/


// javac -d . HashSetJava.java && java com/HashSetJava