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

public class ThreadRunnable {
    public static void main(String[] args) {
        RunnableThread bullet1 = new RunnableThread();
        Thread gun1 = new Thread(bullet1);

        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
