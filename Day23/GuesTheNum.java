import java.util.Random;
import java.util.Scanner;;

class Game {
    public int num;
    public int inputNum;
    public int noOfGuesses = 0;

    public int getNoGuess() {
        return noOfGuesses;
    }

    public void setNoGuess(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNum == num) {
            System.out.println("You Win! after trying: " + noOfGuesses);
            return true;
        } else if (inputNum > num) {
            System.out.println("Too High...");
        } else if (inputNum < num) {
            System.out.println("Too Low...");
        }
        return false;

    }

}

public class GuesTheNum {
    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
        boolean b = false;
        while (!b) {
            g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
