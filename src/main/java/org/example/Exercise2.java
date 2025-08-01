package org.example;

import java.util.Scanner;



public class Exercise2 {
    //exo2

    // good job, loggin the answers in the console will teach how to log data and output, it's a really important skill in debugging.

    public static void main(String[] args) {

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

}}
