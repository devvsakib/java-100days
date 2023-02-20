package com;

import java.util.Scanner;

public class ErrorDemo {
    public static void main(String[] args) {
        // write a program to print all prime numbesr between 1 to 10.
        // Logical error
        for (int i = 1; i < 5; i++) {
            // System.out.println(2 * i + 1);
        }

        // Runtime Error
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = sc.nextInt();
        System.out.println(100 / k);
    }
}
/*
 * untime error after:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 
 */


 // run code: javac -d . ErrorDemo.java && java com/ErrorDemo