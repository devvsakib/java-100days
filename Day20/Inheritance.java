class Base {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printHim() {
        System.out.println("Hey I'm Him");
    }
}

/*
 * Inheritance
 * Derived class name;
 */

class Derived extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(3);
        int t = b.getX();
        System.out.println(t);

        Derived c = new Derived();
        c.setX(4);
        int p = c.getX();
        System.out.println(p);
    }
}
/*
 * Inheritance is used to borrow properties from existing class.
 * 
 * Browser -> Chrome Browser with many feature.
 */