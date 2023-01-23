import java.nio.channels.AsynchronousByteChannel;

import org.xml.sax.SAXNotSupportedException;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5, 6 };
        float[] marksf = { 1.1f, 2.3f, 5.6f, 12.3f };
        String[] names = { "S", "A", "K", "I", "b" };
        // System.out.println(names);
        // System.out.println(marks[3]);
        // System.out.println(marksf[3]);
        // System.out.println(marks.length);
        // System.out.println(marks.length);

        for (int i = 0; i < names.length; i++) {
            if(names[i] == "b"){
                names[i] = "B";
            }
            System.out.printf(names[i]);
        }

    }
}
