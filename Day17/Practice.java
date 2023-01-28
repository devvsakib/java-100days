import javax.swing.text.html.HTMLDocument.RunElement;

public class Practice {

    // Practice 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d \n", n, i, n * i);
        }
    }

    // Practice 2
    static void pattern(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
        // Practice 4
        for (int i = a; i > 0; i--) {
            for (int j = i; j > 0 + 1; j--) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }

    // Practice 3
    static int sumRecursive(int a) {
        if (a == 1) {
            return 1;
        }
        return a + sumRecursive(a - 1);
    }

    // Practice 5
    static int fibn(int a) {
        if (a == 1) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        return fibn(a - 1) + fibn(a - 2);

    }

    static void patternRec(int a) {
        if (a > 0) {
            patternRec(a - 1);
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // multiplication(5);

        // pattern(5);

        // int x = sumRecursive(12);
        // System.out.println(x);

        // int fib = fibn(7);
        // System.out.println(fib);

        patternRec(5);

    }

}
