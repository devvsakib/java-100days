import org.w3c.dom.css.Rect;

class Cylinder {
    // Practice 01
    private int radius;
    private int height;

    // Practice 03
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    // Practice 02
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

// Practice 04
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }


}

public class Practice {
    public static void main(String[] args) {
        // Practice 01
        // Cylinder myCl = new Cylinder();
        // myCl.setHeight(12);
        // System.out.println(myCl.getHeight());
        // myCl.setRadius(9);
        // System.out.println(myCl.getRadius());

        // Practice 02
        // System.out.println(myCl.surfaceArea());
        // System.out.println(myCl.volume());

        // Practice 03
        // Cylinder myCl = new Cylinder(12, 9);
        // System.out.println(myCl.volume());
        
        // Practice 04
        Rectangle myRec = new Rectangle(12, 9);
        System.out.println(myRec.getLength());
        System.out.println(myRec.getBreadth());

        


    }
}