package com;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 12;
        marks[1] = 11;
        marks[2] = 32;
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while (cond) {
            System.out.print("Enter array index: ");
            int ind = sc.nextInt();
            try {
                // System.out.println("The value at array index is: " + marks[ind]);
                // System.out.println("The value of numebr is: " + marks[ind] / number);
                System.out.println("Nested block");

                try {
                    System.out.println(marks[ind]);
                    cond = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry, index is out of bound. Please enter valid index");
                    System.out.println("Exception Level 2");
                }

            } catch (Exception e) {
                System.out.println("Exception Level 1");
            }
        }
    }
}

// javac -d . NestedTryCatch.java && java com/NestedTryCatch