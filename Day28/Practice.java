// Practice 1: create an abastract class with 2 method.
abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writing..");
    }

    void refill() {
        System.out.println("Refilling...");
    }

    void changeBall() {
        System.out.println("Changing Ball...");
    }

}

// Practice 2: write a class named Monkey with two method. Create a class Human
// which inherits this Monkey class and implements BasicAnimal interface with
// eat() sleep() methods
class Monkey {
    void Jump() {
        System.out.println("jump");
    }

    void Bite() {
        System.out.println("Bite");
    }
}

interface BasicAnimal {
    void Eat();

    void Sleep();
}

class Human extends Monkey implements BasicAnimal {
    void Speak() {
        System.out.println("Speaking...");
    }

    @Override
    public void Eat() {
        System.out.println("Eating...");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping...");

    }

}

// Practice 3:

public class Practice {
    public static void main(String[] args) {
        // p1
        FountainPen pen = new FountainPen();
        // pen.changeBall();

        // p2
        Human s1 = new Human();
        // s1.Sleep();
        // s1.Jump();
        // s1.Eat();

        // p3
        Monkey m1 = new Human();
        // m1.Jump();
        // m1.Bite();
        // m1.Sleep(); // cannt use sleep method, only monkey class included method are allowed to use.
        
        BasicAnimal b1 = new Human();
        b1.Sleep();
        b1.Eat();

    }
}
