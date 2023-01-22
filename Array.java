import org.w3c.dom.TypeInfo;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0] = 0;
        // marks[1] = 10;
        // marks[2] = 20;
        // marks[3] = 30;
        // marks[4] = 40;
        // marks[4] = 60; // overwrite
        // marks[5] = 60;
        int[] marks = { 1, 2, 3, 4, 6, 7 };
        System.out.println(marks.length);
    }
}

/*
 * Array
 * -----
 * Array is collection of similar type of data
 * datatype [] Name
 * int [] student = new int [5]
 * .........................
 * ....0 1 2 3 4 ...........
 * ....[][][][][] <- [] ....
 * ......object . . marks ..
 * .........................
 * 4 byte of 1 int
 * 
 * Memory Allocation -> new int[n]
 * {1, 2,3, 4, 5, 6, 7}
 */