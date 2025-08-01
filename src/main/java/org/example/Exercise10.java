package org.example;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {



        // good job so far, code well-structured, good naming of variables.
        // i want you to redo this program, i want you to print the vowels it found.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a sentence: ");
                String sentence = scanner.nextLine();

                String[] words = sentence.trim().split("\\s+"); // can you explain what you did here?

                int wordCount = words.length;

                int vowelCount = 0;
                int consonantCount = 0;

                String lowerSentence = sentence.toLowerCase();

                for (int i = 0; i < lowerSentence.length(); i++) {
                    char ch = lowerSentence.charAt(i);
                    if (Character.isLetter(ch)) {
                        if ("aeiou".indexOf(ch) != -1) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }

                System.out.println("Number of words: " + wordCount);
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);

                scanner.close();
            }
        }

