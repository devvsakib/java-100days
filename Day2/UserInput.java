import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        System.out.println("Get input from users.");
        Scanner getInp = new Scanner(System.in);
        System.out.println("Enter a integer 1:");
        int a = getInp.nextInt();
        System.out.println("Enter a integer 2:");
        int b = getInp.nextInt();
        System.out.println(a + b);

    }
}
// in order to read data from the keyboard, java has a scanner class. Scanner
// class has a lot of methods to read the data fromthe keyboard.
// Scanner name = new Scanner(System.in)
// System.in -> read from keyboard
//
// int a = name.nextInt() -> nextIn() read from keybaord integer