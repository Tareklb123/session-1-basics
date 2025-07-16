package org.example;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
