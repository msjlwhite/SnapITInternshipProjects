/*
Author: J White
Date: 4/8/2019
Task: Write a program that picks a random number from 1-100. Give the user a chance to guess it.
      If they get it right, tell them so. If their guess is higher than the number, say "Too high."
      If their guess is lower than the number, say "Too low." Then quit. (They don't get any more
      guesses for now.)
*/

package com.company;

public class Main {

    public static void main(String[] args) {
	// Calls class to start the program
        NumGuess start = new NumGuess();
        start.shot();
    }
}
