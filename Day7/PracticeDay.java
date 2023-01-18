import javax.swing.text.AbstractDocument.LeafElement;

public class PracticeDay {
    public static void main(String[] arggs) {
        // Excercise 1 Lowercase
        String name = "DEVVSAKIB";
        System.out.println(name.toLowerCase());

        // Excercise 2 Replace
        String replaceWithUscr = "Devv Sakib";
        System.out.println(replaceWithUscr.replace(" ", "_"));

        // Excercise 3 Replace
        String letter = "Hi <|name|>, Thank you";
        System.out.println(letter.replace("<|name|>", "DevvSakib"));

        // Excercise 4 Detect 2/3pl spaces
        String doubleSpaces = "This is double spaces  ";
        System.out.println(doubleSpaces.indexOf("  "));
        System.out.println(doubleSpaces.indexOf("    ")); // false

        // Excercise 5 Format using escap sequence
        String ltr = "HI \n\tThis is Java of 100 Days";
        System.out.println(ltr);

    }

}
