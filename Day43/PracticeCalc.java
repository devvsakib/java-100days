package com;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "string";
    }

    public String getMessage() {
        return "Cannot add 8 and 9";
    }
}
class CannotDivideByZero extends Exception {
    @Override
    public String toString() {
        return "string";
    }

    public String getMessage() {
        return "Cannot divide by 0";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException {

        if (a == 8 || b == 9) {

            throw new InvalidInputException();
        }

        return a + b;
    }

    double substract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZero {
        if (b==0) {
            throw new CannotDivideByZero();
        }
        return a / b;
    }
}

public class PracticeCalc {
    public static void main(String[] args) throws InvalidInputException {
        CustomCalculator c = new CustomCalculator();
        System.out.println(c.add(9, 2));
        System.out.println(c.divide(9, 0));
    }
}

// you have to throw Exception