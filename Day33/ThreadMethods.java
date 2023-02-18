package com;

class MyThread1 extends Thread {
    public void run() {
        int i = 0;

        while (true) {
            System.out.println("MyThread 1: ");
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            i++;
        }
    }

}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyThread 2: ");
        }
    }

}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        MyThread2 t1 = new MyThread2();

        t.start();
        // try {
        // t.join();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        t1.start();
    }
}
/*
 * t2.start() will never start until t1 finish when use t.join().
 * 
 */
// javac -d . ThreadMethods.java && java com/ThreadMethods