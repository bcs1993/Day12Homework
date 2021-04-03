import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public void guessingGame() {

        Random rand = new Random();
        int secretNumber = rand.nextInt(10 + 1);
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;
        while (win = false) {
            System.out.println("Guess the secret number between 1 and 10");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == secretNumber) {
                win = true;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too LOW!");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high");
            }

        }

    }

}
