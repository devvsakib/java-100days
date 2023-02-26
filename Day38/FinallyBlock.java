package com;

public class FinallyBlock {
    public static int greet() {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Ending of progrmme");
        }
        return 0; // if programme don't go to try.
    }

    public static int loops() {
        for (int i = 0; i < 10; i++) {
            try {
                if (i == 2) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.format("i == %d, still execute after break ", i);
                System.out.println();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        // System.out.println(k);
        loops();
    }
}

/*
 * Finally block code execute no matter what happens.
 * In greet() function, programme return with c value but finally block return
 * as well.
 * 
 * 
 */

// javac -d . FinallyBlock.java && java com/FinallyBlock