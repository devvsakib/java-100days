package pack.pack1.pack2;

class Calculator {
    public void calculator(int a, int b) {
        System.out.println("Sum of a + b " + (a + b));
    }
}

class ScCalculator {
    public void calculator(int a, int b) {
        System.out.println("Sum of a + b " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void calculator(int a, int b) {
        System.out.println("Sum of a + b " + (a + b));
        System.out.println("Sum of a + b " + Math.sin(a + b));
    }
}

public class Practice2 {
    protected int proInt = 5;
    int defInt = 50;
    public static void main(String[] args) {
        System.out.println("Calculator");
    }
}