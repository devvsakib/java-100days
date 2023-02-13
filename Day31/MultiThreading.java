class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thread 1 Programme Runing..");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Thread 1 Programme Runing..");
            i++;
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread2 mt2 = new MyThread2();
        mt.start();
        mt2.start();
    }
}
/*
 * Multithreading
 * --------------
 * Multiprocessing and multithreading both are used to achieve multitasking.
 * 
 * 
 * Flow
 * 
 * No Threading->
 * Main() -> func1() -> func2() -> End
 * 
 * Threading->
 * Main -> Func() ===|
 * ------------------|==> End
 * ------- Func2() ==|
 * 
 * 
 * Creating a Thread
 * There are two ways to create a thread.
 * i. extenda thread class
 * ii. implementing Runnable interfaces
 * 
 * 
 */