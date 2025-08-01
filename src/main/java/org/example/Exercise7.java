package org.example;

import java.util.Scanner;




public class Exercise7 {
    public static void main(String[] args) {
        Scanner scar = new Scanner(System.in);
        int[] numbers = new int[5];
        // good job
        System.out.println("Java Syntax Exercises");
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scar.nextInt();
        }

        int sam = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        double average = 0;


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


        System.out.println("Sum: " + sam);
        System.out.println("Average: " + average);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }
}
