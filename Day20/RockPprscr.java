import java.util.Random;
import java.util.Scanner;

public class RockPprscr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock 0");
        System.out.println("Paper 1");
        System.out.println("Scissor 2");
        System.out.print("Enter your number: ");
        int userInpt = sc.nextInt();

        Random rand = new Random();
        int comptInput = rand.nextInt(3);
        System.out.println(comptInput);

        if (userInpt == comptInput) {
            System.out.println("Draw");
        } else if (userInpt == 0 && comptInput == 2 || userInpt == 1 && comptInput == 0
                || userInpt == 2 && comptInput == 1) {
            System.out.println("You won!");
        } else {
            System.out.println("Computer won!");
        }
        if (comptInput == 0) {
            System.out.println("Computer: Rock");
        } else if (comptInput == 1) {
            System.out.println("Computer: Paper");
        }else{
            System.out.println("Computer: Scissor");
        }
    }
}
