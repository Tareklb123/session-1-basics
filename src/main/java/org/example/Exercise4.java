package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("//////GAME GUESS THE NUMBER.//////");

            // good job, now you know how the while loop works and used both of loops and conditional statements.


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int realnumbre = random.nextInt(10) + 1;
        int guess;
        int attempt = 0;

        System.out.print("Guess a number between 1 and 10: ");

        while (true) {
            guess = scanner.nextInt();
            attempt++;

            if (guess < realnumbre) {
                System.out.print("Too low! Try again: ");
            } else if (guess > realnumbre) {
                System.out.print("Too high! Try again: ");
            } else {
                System.out.println("Correct! You guessed it in " + attempt + " attempt" + (attempt > 1 ? "s." : "."));
                break;
            }
        }
        scanner.close();

        // what if the user enters a letter? handle it
    }}
