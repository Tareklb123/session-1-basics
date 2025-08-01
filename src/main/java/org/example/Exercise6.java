package org.example;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        // good job, now you know how to manuplate data with the type string.
        // what if the user enters a number? handle it.
        // i want the program to start again when i enters a sentence, it asks the first time, i enter, it logs the sentence data, it asks again
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner2.nextLine();

        int length = sentence.length();

        char firstChar = sentence.charAt(0);
        // why did we minus one from the length?
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



    }
}
