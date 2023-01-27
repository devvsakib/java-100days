public class Recursion {
    // factorial

    static int factorial_interative(int a) {
        int fact = 1;
        if (a <= 0) {
            return 0;
        }
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    static int factorial(int n) {
        // int fact = 1;
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int x = 9;
        // System.out.println(factorial(x));
        System.out.println(factorial_interative(x));
    }
}

/*
 * A function i Java can call itself, is recursion
 *
 * 
 */