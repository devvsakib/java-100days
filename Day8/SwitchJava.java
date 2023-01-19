import java.util.Scanner;

public class SwitchJava {
    public static void main(String[] args) {
        // int age = 40;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // if (age > 49) {
        // System.out.println("I'm in half century");
        // } else {
        // System.out.println("I'm not half century yet");
        // }
        switch (age) {
            case 30:
                System.out.println("Age under 30");
                break;
            case 35:
                System.out.println("Age under 35");
                break;
            case 50:
                System.out.println("I'm in  half century");
                break;
            case 51:
                System.out.println("I'm in  half century");
                break;
            case 52:
                System.out.println("I'm in  half century");
                break;
            default:
                System.out.println("Enjoy");
                break;
        }
    }
}
//  breack -> kill flow  