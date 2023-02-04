abstract class Parent {
    public Parent() {
        System.out.println("Base2 Cons");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning form Child");
    }
    @Override
    public void greet2() {
        System.out.println("Good Morning form Child");
    }
}
abstract class Child2 extends Parent {
    public void th() {
        System.out.println("I'm Good");
    }
}

public class AbstractClassMethod {
    public static void main(String[] args) {
        // Parent p = new Parent();
        Child c = new Child();
        // Child2 c2 = new Child2();

    }
}
/*
 * Abstract Class
 * --------------
 * If a class includes abstract methods, then the class itself must be declared
 * abstract.
 * 
 * public abstract class Phone{
 * abstract void off();
 * }
 * 
 * 
 * Abstract Method
 * ---------------
 * A method that is declared without an implementation
 * 
 * abstract void moveTo(int x, int y)
 * 
 */