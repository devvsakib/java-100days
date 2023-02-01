class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass() {

    }

    EkClass(int x) {
        this.a = x;
        System.out.println("This is base cons with para " + x);
    }

    public int returnnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int a) {
        super(a);
        System.out.println("I'm a doclass cons with para " + a);
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        EkClass ec = new EkClass(10);
        DoClass dc = new DoClass(11);
        System.out.println(ec.getA());
    }
}

/*
 * this->
 * ----->
 * this is a way for us to reference an object of the class which is being
 * created or referenced.
 *
 * refer current class
 * 
 * super->
 * ------>
 * When there are multiple Constructors in the parent class, the constructor
 * without any parameters is called from the child class.
 * If we want to call the constructor with parameter from the parent calss, we
 * can use super keyword.
 * 
 * 
 * 
 */