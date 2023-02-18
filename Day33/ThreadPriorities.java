package com;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);

    }

    public void run() {
        while (true) {
            System.out.println("I am Thread");
            System.out.println("MyThread Running..." + this.getName());
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {

        MyThread mt = new MyThread("1");
        MyThread mt1 = new MyThread("2 (MIN_PRIORITY)");
        MyThread mt2 = new MyThread("3");
        MyThread mt3 = new MyThread("4 (MAX_PRIORITY)");
        MyThread mt4 = new MyThread("5");
        MyThread mt5 = new MyThread("6");

        mt3.setPriority(Thread.MAX_PRIORITY);
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}

/*
 * For example: In your home, you have the highest priority to your parent, if
 * your country PM come to your home, then your parent will give the highest
 * priority to PM.
 * 
 * 
 * Thread executing HIGHLY depend on OS
 * 
 * 
 */

// javac -d . ThreadPriorities.java && java com/ThreadPriorities