package org.example;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //exo3

        // now you know how to use if/else if/ else, know that there's a differene between else and else if, search about it.


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

        // what if the user inserts an invalid number by mistake or a letter? try it and see what happens, handle it.


    }
}
