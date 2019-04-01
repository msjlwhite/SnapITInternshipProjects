/*
Author: J White
Date: 3/26/2019 - 4/1/2019
Task: Pig Latin Converter – Pig Latin is a game of alterations played on the English language game.
To create the Pig Latin form of an English word the initial consonant sound is transposed
to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).
Read Wikipedia for more information on rules.

*/

package com.company;

// imports the java Scanner libraries
import java.util.Scanner;

// Edited / Updated Version
// Class that hold the main parts (methods and variables) to help convert words or phrases into pig latin
public class PigLatin {

    // Instance variable declaration for the Pig Latin class
    String usrInpt;     // holds the users input for the word or phrase to convert
    String[] phrase;    // places the word/phrase into an array
//    String[] symbol = {"~","`","!","@","#","£","€","$","¢","¥","§","%","°","^","&","*","(",")","-","_","+","=","{","}","[","]","|","/",":",";","<",">",".","?"};    // places the word/phrase into an array
    String pLatinV;     // used to hold the converted Pig Latin words that start with a vowel
    String pLatinC;     // used to hold the converted Pig Latin words that start with a single
                        // or double consonant
    String choice;      // holds the user's choice on whether to continue running the app or exit


    // method called by the Main class and Main Method to start the PiLgLatin App
    public void welcome(){

        // App displays a welcome message to the user
        System.out.println("Welcome to the Igpay Atinlay Onvertercay (Pig Latin Converter)!!");
        System.out.println("");

        // calls the convert message to start app
        convert();


    } //end of welcome() method

    // method that will take in user input then convert it into Pig Latin
    public void convert() {

            // Asks user to enter in a word or phrase to convert
            System.out.println("Please enter a word or phrase that you would like to convert to Pig Latin.");
            System.out.print("Please enter in a single word or phrase (seperated by spaces) here: ");

            // takes in the user input (the word or phrase entered) then converts it to lowercase
            Scanner scanner = new Scanner(System.in);
            usrInpt = scanner.nextLine().toLowerCase();
//            usrInpt.replaceAll("[^a-zA-Z0-9]"," ");

            // places the word or phrase into an array while taking out the spaces to make it easier to work with
//            usrInpt.replaceAll("[^a-zA-Z0-9]", " ");
            phrase = usrInpt.split(" ");


            //FOR loop to print out the individual word for the word or phrase entered
            for (int i = 0; i < phrase.length; i++) {

                // Checks to see if the first character in each word is a VOWEL or not, if it is then it will add
                // an "ay" to end of the word and print it back out
                if (((phrase[i].charAt(0) == 'a') || (phrase[i].charAt(0) == 'e') || (phrase[i].charAt(0) == 'i') ||
                        (phrase[i].charAt(0) == 'o') || (phrase[i].charAt(0) == 'u'))) {
                    pLatinV = phrase[i] + "ay";
                    System.out.print(pLatinV + " ");

                    // if the word DOES NOT begin with a VOWEL, it checks to see if the second character of the word
                    // is a VOWEL or not. If it is then it will move the first letter/character to end of the word
                    // then adds an "ay" to end of the word and print it back out
                } else if (((phrase[i].charAt(0) != 'a') && (phrase[i].charAt(1) == 'a')) || ((phrase[i].charAt(0) != 'e') && (phrase[i].charAt(1) == 'e')) ||
                        ((phrase[i].charAt(0) != 'i') && (phrase[i].charAt(1) == 'i')) || ((phrase[i].charAt(0) != 'o') && (phrase[i].charAt(1) == 'o')) ||
                        (phrase[i].charAt(0) != 'u') && (phrase[i].charAt(1) == 'u')) {
                    pLatinC = phrase[i].substring(1, phrase[i].length()) + phrase[i].substring(0, 1) + "ay";
                    System.out.print(pLatinC + " ");

                    // if the first and second letter/character of the word ARE NOT VOWELs, then it will move the first
                    // and second letters/characters to end of the word then adds an "ay" to end of the word and print
                    // it back out
                } else {
                    pLatinC = phrase[i].substring(2, phrase[i].length()) + phrase[i].substring(0, 2) + "ay";
                    System.out.print(pLatinC + " ");
                }

            }//END of FOR loop

        // asks user if they would like to continue to enter in words or phrases for Pig Latin conversion
        System.out.println("");
        System.out.print("Would you like to convert another word or phrase into Pig Latin? (Y/N) ");

        // takes in the user input (the word or phrase entered) then converts it to lowercase
        Scanner c = new Scanner(System.in);
        choice = scanner.nextLine().toLowerCase();

        // run divider for multiple runs
        System.out.println("");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("");

        // uses the user's choice to continue to run the app or exits with a thank you message.
        switch (choice.toString())
        {
            // if the user chooses to continue then the convert method with run again until the chose
            // to exit
            case "y":
                convert();
                break;

                // if the user chooses to exit then the program will display a thank you message
                // then exit
                default: goodbye();
                break;
        }

    } // END of convert() method

    public void goodbye() {

        // App displays a thank you message to the user
        System.out.print("");
        System.out.println("Thank you for using the Igpay Atinlay Onvertercay (Pig Latin Converter)!!");
        System.out.println("Have A Wonderful Day! -- Avehay Aay Onderfulway Ayday!");

    } //  END of goodbye() method

} // END PigLatin Class
