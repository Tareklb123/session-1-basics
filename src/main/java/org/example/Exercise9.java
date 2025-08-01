package org.example;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {


        // good job, try to redo this code and understand what's happening.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter number of rows (1-10): ");
                int rows = scanner.nextInt();

                if (rows < 1 || rows > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                } else {
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                scanner.close();
            }
        }


