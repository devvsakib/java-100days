package com;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // problem 1
        // syntax error - int a = 4

        // problem 2
        // try {
        // int a = 66/9;
        // System.out.println(a);
        // } catch (IllegalArgumentException e) {
        // System.out.println("Haha");
        // }catch(ArithmeticException e){
        // System.out.println("Hihi");
        // }

        // problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 34;
        marks[1] = 24;
        marks[2] = 54;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag) {
            try {
                System.out.print("index: ");
                index = sc.nextInt();
                System.out.println("marks[ind] is: " + marks[index]);
                System.out.println("You entered invalid index: " + i + " times.");
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index.");
                i++;
            }
        }          
    }
}