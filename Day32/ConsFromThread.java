package com;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 30;
        System.out.println("Useless");
        // while (true) {
        //     System.out.println("I'm a thread");
        // }
    }

}

public class ConsFromThread {
    public static void main(String[] args) {
        MyThr mt = new MyThr("DevvSakib");
        MyThr t = new MyThr("Devv");
        mt.start();
        t.start();
        System.out.println("The id of the thread is: " + mt.getId() + ' ' + t.getId());
        System.out.println("The name of the thread is: " + mt.getName() + ' ' + t.getName());
    }
}
/*
 * 
 * Constructors
 * ========== 
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r, String name)
 * 
 * 
 */