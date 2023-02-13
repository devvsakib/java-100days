public class MultiThreading {
    public static void main(String[] args) {
        System.out.println("MultiThread ");
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