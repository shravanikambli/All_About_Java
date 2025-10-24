package ex11_while_loop;

import java.util.Scanner;
import java.util.Random;

public class lab08_while_guess_game {
    public static void main(String[] args) {

        Random r = new Random();
        int numToGuess = r.nextInt(58); // Generates a random number between 0 and 57

        Scanner s = new Scanner(System.in);
        System.out.println(" Welcome to the Guess the Number Game!");
        System.out.println("I’ve chosen a number between 0 and 57. Can you guess it?");

        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");

            // Check if input is a valid integer
            if (!s.hasNextInt()) {
                System.out.println(" Invalid input! Please enter a valid number.");
                s.next(); // clear invalid input
                continue; // restart loop
            }

            guess = s.nextInt();
            attempts++;

            if (guess < numToGuess) {
                System.out.println("⬇️ Too low, try again!");
            } else if (guess > numToGuess) {
                System.out.println("⬆️ Too high, try again!");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts!");
                break; // Exit loop when correct
            }
        }

        s.close();
    }
}
