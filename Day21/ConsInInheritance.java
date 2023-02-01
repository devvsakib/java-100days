class Base1 {
    // constructor
    Base1() {
        System.out.println("Im a Base constructor");
    }

    Base1(int a) {
        System.out.println("Im a Base Arg constructor " + a);
    }

}

class Derived1 extends Base1 {
    // constructor
    Derived1() {
        super(0);
        System.out.println("Im a constructor | Derived");
    }

    Derived1(int a, int b) {
        super(1);
        System.out.println("Im a constructor | Derived arg " + a + " " + b);
    }

}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I'm a child of Derive");
    }

    ChildOfDerived(int x, int y) {
        super(x, y);
        System.out.println("I'm a child of Derive with arg " + x + " " + y);
    }
}

public class ConsInInheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1(1);
        // Derived1 b = new Derived1(1);
        ChildOfDerived d = new ChildOfDerived(10,12);

    }
}
/*
 * Constructor in Inheritance
 * --------------------------
 * When a Derived Class is extened from the Base class, the constructor of the
 * base class is executed first followed by the constructor of the derived
 * class.
 * 
 */