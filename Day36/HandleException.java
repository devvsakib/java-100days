package com;

import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 12;
        marks[1] = 11;
        marks[2] = 32;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter number to divide value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index is: " + marks[ind]);
            System.out.println("The value of numebr is: " + marks[ind] / number);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Aray exception occured");
            System.out.println(e);
        }catch(B){

        } catch (Exception e) {
            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}

// javac -d . HandleException.java && java com/HandleException