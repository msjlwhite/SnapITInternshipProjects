/*
Author: J White
Date: 3/26/2019 - 3/30/2019
Task: Pig Latin – Pig Latin is a game of alterations played on the English language game.
To create the Pig Latin form of an English word the initial consonant sound is transposed
to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).
Read Wikipedia for more information on rules.

*/

package com.company;

// the Main Program class that runs the application
public class Main {

    public static void main(String[] args) {
        // creates a call to the class PigLatin to run the PigLatin app
        PigLatin run = new PigLatin();
        run.welcome();


    }
}
