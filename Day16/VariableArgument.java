public class VariableArgument {
    // static int foo(int a, int b) {
    // return a + b;
    // }

    // static int foo(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sumTheNumber(int... arr) {
    //     // Available as int[] arr;
    //     int result = 0;
    //     for (int a : arr) {
    //         result += a;
    //     }
    //     return result;
    // }
    //  one argument must need to pass
    static int sumTheNumber(int x, int... arr) {
        // Available as int[] arr;
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("Welcome to this repository!");
        // System.out.println(foo(2, 4));
        int[] a = { 1, 2, 3 };
        // System.out.println(sumTheNumber(1, 2, 4, 5, 6));
        // System.out.println(sumTheNumber());
        // System.out.println(sumTheNumber(a));
        System.out.println(sumTheNumber(1));
    }
}

/*
 * Pass argument
 * 
 * 
 */