class A {
    public int a;

    public int sakib() {
        return 4;
    }

    // overriding ->
    // public void meth2(int a) {

    // not overriding ->
    public void meth2() {
        System.out.println("Method 2 from class A");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("Method 2 from class B");
    }

    public void meth3() {
        System.out.println("Method 3 from class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}

/*
 * If the child class implements the same method present in the parent class
 * again, it is known as method overriding.
 * 
 */