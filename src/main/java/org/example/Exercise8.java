package org.example;

import java.util.Scanner;

public class Exercise8 {


            public static double celsiusToFahrenheit(double celsius) {
                return (celsius * 9 / 5) + 32;
            }

            // good job, when the programm finishes i have to run it again so i can choose again, i want it to rerun, handle that.
            public static double fahrenheitToCelsius(double fahrenheit) {
                return (fahrenheit - 32) * 5 / 9;
            }
            public static void displayMenu() {

                System.out.println("Temperature Converter");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                displayMenu();
                System.out.print("Choose conversion: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);
                } else if (choice == 2) {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("%.1f F = %.1f C%n", fahrenheit, celsius);
                } else {
                    System.out.println("Invalid choice.");
                }

                scanner.close();
            }
        }


