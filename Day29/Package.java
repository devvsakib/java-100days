package common;
// package common.anotherFolder;
// package common.anotherFolder.anotherFolder;

import common.Package2;

public class Package {
    public static void main(String[] args) {
        System.out.println("Use package");
        Package2 pk2 = new Package2();
        
    }
}

/*
 * Package use to group related class.
 * javac -d . *.java
 * javac -d . Test.java
 * javac -d newFolder Test.java
 * 
 */
