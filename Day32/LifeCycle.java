package com;
class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Runnable thread 1 running");
    }
}

class RunnableThread2 implements Runnable {
    public void run() {
        System.out.println("Runnable thread 2 running");
    }
}

public class LifeCycle {
    public static void main(String[] args) {
        RunnableThread bullet1 = new RunnableThread();
        Thread gun1 = new Thread(bullet1);

        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
/*
 * 1. New -> 2. Runnable -> 3. Running  -> 4. Non Runnable(Blocked) Go back to 2-> 5. Terminated
 * 
 * 1. New -> Instance of thread created which  not yet started by invoking start();
 * 
 * 2. Runnable -> After invocation of start() & before it as selected to be run;
 * 
 * 3. Running -> After thread sheduler has selected it;
 * 
 * 4.Non Runnable -> Thread alive, but not eligible to run;
 * 
 * 5. Terminated -> run() method has exitted;
 * 
 */