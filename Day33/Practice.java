package com;

class PracticeA extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class PracticeB extends Thread {
    public void run() {
        // while (false) {
        //     // try {
        //     //     Thread.sleep(40);
        //     // } catch (InterruptedException e) {
        //     //     e.printStackTrace();
        //     // }
        //     System.out.println("Welcome=============");
        // }
    }
}

public class Practice {
    public static void main(String[] args) {
        PracticeA pa = new PracticeA();
        PracticeB pb = new PracticeB();

        // p2
        // pa.setPriority(6);
        // pb.setPriority(9);
        // System.out.println(pa.getPriority()); // default prio - 5
        // System.out.println(pb.getPriority());
        // System.out.println(pb.getState());
        // pa.start();
        pb.start();
        // System.out.println(pb.getState());

        System.out.println(Thread.currentThread().getState());
   }

}
// javac -d . Practice.java && java com/Practice