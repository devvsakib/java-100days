class C1 {
    public int x = 10;
    protected int y = 5;
    int z = 6;
    private int a = 90;

    public void method1() {
        System.out.println(x);
        // System.out.println(a);
    }
}

class C2 extends C1 {

}

public class AccessModi {
    public static void main(String[] args) {
        C1 c = new C1();
        c.method1();
        // System.out.println(c.a); // cant access due to private, access only in same
        // class. line-09
    }
}
/*
 * Determain whether other classes can use a particuler field or invoke a
 * particular method can be public, private, protected, or default
 * 
 * |-------------------------------------------------------|
 * | Modifier -|- Class -|- Package -|- Subclass -|- World |
 * |-----------|---------|-----------|------------|--------|
 * | Public ---|--- Y ---|----- Y ---|----- Y ----|--- Y --|
 * | Private --|--- Y ---|----- N ---|----- N ----|--- N --|
 * | Protected |--- Y ---|----- Y ---|----- Y ----|--- N --|
 * | Default --|--- Y ---|----- Y ---|----- N ----|--- N --|
 * |-----------|---------|-----------|------------|--------|
 */