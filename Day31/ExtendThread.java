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
            System.out.println("Thread 2 Programme Runing..");
            i++;
        }
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread2 mt2 = new MyThread2();
        mt.start();
        mt2.start();
    }
}