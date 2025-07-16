package org.example;

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //exo1
        String name = "tarek";
        int number = 19;
        double height = 1.74;

        System.out.println("Hello, " + name + "!");
        System.out.println("The number is: " + number);
        System.out.println("the height is " + height + " meters");

        System.out.println(" My name is " + name + " , I am " + number + " years old and " + height + " meters tall.");


        //exo2


        System.out.println("give me 2 number");

        Scanner nmbr = new Scanner(System.in);
        System.out.println("number 1:");
        int nbr1 = nmbr.nextInt();
        System.out.println("number 2: ");
        int nbr2 = nmbr.nextInt();
        int sum = nbr1 + nbr2;
        int difference = nbr1 - nbr2;
        int product = nbr1 * nbr2;
        double quotient = nbr1 / nbr2;
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);


        //exo3


        System.out.println("give me your grade: ");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if (grade >= 90) {
            System.out.println("Your grade is A");
        } else if (grade >= 80) {
            System.out.println("Your grade is B");
        } else if (grade >= 70) {
            System.out.println("Your grade is C");
        } else if (grade >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }


        //exo4


        System.out.println("//////GAME GUESS THE NUMBER.//////");


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


        //exo5


        Scanner scannr = new Scanner(System.in);
        int choice;
        final double PI = 3.14159;

        do {
            // Display the menu
            System.out.println("\nJava Syntax Exercises");
            System.out.println("1) Calculate area of rectangle");
            System.out.println("2) Calculate area of circle");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    double Rectangle = length * width;
                    System.out.println("Area of rectangle: " + Rectangle);
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    double Circle = PI * radius * radius;
                    System.out.println("Area of circle: " + Circle);
                    break;

                case 3:
                    System.out.println("'/'/'/'/Goodbye'/'/'/'/");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }

        } while (choice != 3);

        scanner.close();


        //exo6


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner2.nextLine();

        int length = sentence.length();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);

        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();

        boolean contains = lowerCase.contains("java");

        // Display results
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Contains 'Java': " + contains);

        scanner.close();


        //exo7


        Scanner scar = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Java Syntax Exercises");
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sam = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        double average = 0;

        // Loop through array to calculate sum, min, max
        for (int num : numbers) {
            sam += num;
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            average = (double) sam / numbers.length;
        }


        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        scanner.close();


        //exo8


    }
}