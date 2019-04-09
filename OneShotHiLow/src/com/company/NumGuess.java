/*
Author: J White
Date: 4/8/2019
Task: Write a program that picks a random number from 1-100. Give the user a chance to guess it.
      If they get it right, tell them so. If their guess is higher than the number, say "Too high."
      If their guess is lower than the number, say "Too low." Then quit. (They don't get any more
      guesses for now.)
*/

package com.company;

// imports java libraries to use the Scanner and ThreadLocalRandom methods
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumGuess {

    //class variable declaration
    Scanner scanner = new Scanner(System.in);       // reads in the user's guess as input
    int guess;                                      // holds the user's guess
    int reality;                                    // holds the actual number that was randomly generated
    String cont;                                    // holds user's choice for whether run the application again

    // method that will randomly
    public void shot()
    {
        //prints out welcome message and directions to the user
        System.out.println("Welcome to the Great Numerator Guessimator!");
        System.out.println("Can you guess the number I am thinking of in one shot?");
        System.out.println("Try, ... if you dare!!");
        System.out.println("");

        // randomly generates a number to compare the user's guess to
        reality = ThreadLocalRandom.current().nextInt(1, 100);

//        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter in one single or two digit number between 1 and 100: ");
            guess = scanner.nextInt();

            // checks to see if the number is higher, lower or the same as the randomly generated number
            if (guess > reality) {
                System.out.println("Oh NO!! You're guess is too high!");

            } else if (guess < reality) {

                System.out.println("Oh NO!! You're guess is too low!");

            } else
                System.out.println("Right on! You must be a psychic! You guessed my number.");

            System.out.println("");
//        }

        // prints out the program's guess
        System.out.println("The actual number was: " + reality);
        System.out.println("");

        // prints out a Thank you for message for the user
        System.out.println("Thank you for using Numerator Guesstimator!!");
        ;

    }// end of shot() Method

}//end of NumGuess Class()
