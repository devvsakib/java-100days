package com;

import java.util.Random;
import java.util.Scanner;

class GenNumber {
    public int rand;
    public int userInput;
    public int totalGuess = 0;

    GenNumber() {
        Random randNumber = new Random();
        this.rand = randNumber.nextInt(100);
    }

    public void getUserInput() {
        System.out.print("Guess any number between 0-100: ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    boolean Game() {
        totalGuess++;
        if (userInput == rand) {
            System.out.println("You Win! Total guesses: " + totalGuess);
            return false;
        } else if (userInput < rand) {
            System.out.println("Too Low");
            return true;
        } else {
            System.out.println("Too HIgh");
            return true;
        }
    }
}

public class Game {
    public static void main(String[] args) {
        GenNumber gn = new GenNumber();
        boolean isRunning = true;
        while (isRunning) {
            gn.getUserInput();
            if (gn.Game() == false) {
                break;
            }
        }

    }
}