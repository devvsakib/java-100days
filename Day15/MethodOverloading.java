import javax.swing.event.ChangeEvent;

public class MethodOverloading {
    static void tellJoke() {
        System.out.println("Hi, I'm not returning anything. I'm void");
    };

    static void replaceElement(int a) {
        a = 100;
    }

    static void replaceElement(float[] a) {
        a[0] = 90;
    }

    // Overloading
    static void foo() {
        System.out.println("No argument");
    }

    static void foo(int a) {
        System.out.println("With argument " + a);
    }

    static void foo(int a, int b) {
        System.out.println("With Two argument " + a + b);
    }

    public static void main(String[] args) {
        // float[] marksf = { 1.1f, 2.3f, 5.6f, 12.3f };
        // Case 1 changing integer
        // int x = 980;
        // replaceElement(x); // no changes

        // Case 2 changing Array
        // replaceElement(marksf); // no changes
        // System.out.println("The value of x is: " + marksf[0]);

        //  Method Overloading
        foo();
        foo(30);
        foo(30, 90);
        // Argument are actuall -> 30, 90
        // Parameter -> int a, int b

    };
};

/*
 * Void return type
 * ----------------
 * When we dont want to return anything from method. use void return type
 * Can be access in anywhere in main class(MethodOverloading)
 * 
 * Method Overloading
 * ------------------
 * Two or more methods can have same name but different parameters. Such methods
 * are overloaded methods.
 * 
 * 1. change perameter
 * 
 */