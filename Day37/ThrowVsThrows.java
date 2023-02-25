package com;

class NegativeExceptions extends Exception {
    @Override
    public String toString() {
        return "Radius Cann't be negative";
    }

    public String getMessage() {
        return "Radius Cann't be negative";
    }
}

public class ThrowVsThrows {
    public static double area(int r) throws NegativeExceptions {
        if (r < 0) {
            throw new NegativeExceptions();
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        try {
            // double c = area(10);
            double c = area(-1);
            System.out.println(c);
        } catch (Exception e) {
            // System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}

/*
 * Throw:
 * Throw is use to throw an exception to stop the programmer immediately.
 * 
 * Throws:
 * Use to alert other that my programme can throw exception. Thats mean I have
 * to handle it with TryCatch.
 * 
 */
// javac -d . ThrowVsThrows.java && java com/ThrowVsThrows