public class Methods {

    // Method - static is important, only static method can be called in static
    // main.
    // static int logic(int a, int b) {
    // int c;

    // if (a > b) {
    // c = a - b;
    // } else {
    // c = a + b;
    // }
    // return c;
    // }
    int logic(int a, int b) {
        int c;

        if (a > b) {
            c = a - b;
        } else {
            c = a + b;
        }
        return c;
    }

    public static void main(String[] args) {
        int x, z, y, g,h,j;
        x = 10;
        y = 5;
        g = 11;
        h = 3;
        Methods obj = new Methods(); // crreating obj, no need static keyw
        z = obj.logic(x, y);
        j = obj.logic(h, g);
        // z = logic(x, y);
        System.out.println(z);
        System.out.println(j);
    }
}
/*
 * 
 * Sometimes our program grows in a size and we want to separate the logic of
 * main method to other methods.
 * DRY -> Do not Repeat Yourself
 * 
 * A method is a function written into a class. Since Java is an OOP, we need to
 * write method inside some class.
 * 
 * dataType name(x, y){
 * .. method here
 * }
 * 
 * Calling Method
 * A method can be called by creating an object of the class in which method
 * exists followed by the method call:
 * 
 * Calc obj = new Calc() // obj creation
 * obj.sum(a,b) // called
 * 
 * 
 */