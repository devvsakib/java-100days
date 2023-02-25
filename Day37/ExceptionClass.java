package com;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am getMessage()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a = 10;
        if (a < 12) {
            try {
                // throw new MyException();
                throw new ArithmeticException();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e); // toString method run
            }
        }
    }
}

/*
 * We can write custom Exception susing Exception class in Java.
 * String toString() ->
 * Void printStackTrace() ->
 * String getMessage() ->
 * 
 * We can throw our custom exception using "throw".
 * 
 */

// javac -d . ExceptionClass.java && java com/ExceptionClass