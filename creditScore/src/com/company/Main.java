/*
Date: 03/20/2019
Created by: J White
Task: Write a Java program that determines someone's credit score.

The program will read two types of scores (Equifax and TransUnion) and will determine the category of
credit based on the following rules:

if the score is >= 750 -> category = excellent
if the score is >= 650 && < 750 -> category = good
if the score is >= 550 && < 650 -> category = fair
if the score is >= 450 && < 550 -> category = poor

Example output:

Equifax score: 670
TransUnion score: 540
Final score: 605
Your credit is fair.

*Extra Requirement:
Use "Scanner" to take input from a user. The user should be asked to type in their two credit scores,
then you will take both scores and calculate the average. The average will go through a check (i recommend
using if/else conditions, or a switch statement for this) and give the user their credit category.

*Hint:
You will need Google lol
 */


// Edited

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // prints out welcome message to the user
        System.out.println("Welcome You Might Want To Sit Down For This Credit Score Checker!");

        // triggers method get credit score info from user
        getScore();
    }

    private static void getScore() {

        // collects and holds the user's input
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter your Equifax credit score: ");
        String score1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter your TransUnion credit score: ");
        String score2 = scanner2.nextLine();

        finalScore(score1, score2);
    }

    // method to get the user's average credit score then report it and give their credit category to the user
    private static void finalScore(String score1, String score2) {

        // variables that will turn the credit scores from strings to integers to hold the average
        int fax = Integer.parseInt(score1);
        int union = Integer.parseInt(score2);

        // variable to hold the credit score average
        int avg = (fax + union) / 2;
        System.out.println("Your credit score average is: " + avg);

        // conditional statement to check the credit score category
        if (avg >= 750) {
            System.out.println("Your credit rating is: Excellent!");
        } else if ((avg >= 650) && (avg < 750)) {
            System.out.println("Your credit rating is: Good");
        } else if ((avg >= 550) && (avg < 650)) {
            System.out.println("Your credit rating is: Fair!");
        } else {
            System.out.println("Your credit rating is: Poor!");
        }

        // thank you message once the program completes running.
        System.out.println("Thank You for using the You Might Want To Sit Down For This Credit Score Checker!");
        System.out.println("We hope that we were able to give you some good news!");
    }

} /// end of program


//// Original
//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // prints out welcome message to the user
//        System.out.println("Welcome You Might Want To Sit Down For This Credit Score Checker!");
//
//        // triggers method get number feet info from user
//        getScore();
//    }
//
//    private static void getScore() {
//
//        // collects and holds the user's input
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Please enter your Equifax credit score: ");
//        String score1 = scanner1.nextLine();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Please enter your TransUnion credit score: ");
//        String score2 = scanner2.nextLine();
//
//        //System.out.println("Score 1: " + score1);
//        //System.out.println("Score 2: " + score2);
//
//        finalScore(score1, score2);
//    }
//
//    // method to get the user's average credit score then report it and their credit category to the user
//    private static void finalScore(String score1, String score2) {
//
//        // variables that will turn the credit scores from strings to integers to hold the average
//        int fax = Integer.parseInt(score1);
//        int union = Integer.parseInt(score2);
//
//        // variable to hold the credit score average
//        int avg = (fax + union) / 2;
//        System.out.println("Your credit score average is: " + avg);
//
//        String credCat = "";
//
//        /*
//        if the score is >= 750 -> category = excellent
//        if the score is >= 650 && < 750 -> category = good
//        if the score is >= 550 && < 650 -> category = fair
//        if the score is >= 450 && < 550 -> category = poor
//             */
//
//        if (avg >= 750) {
//            System.out.println("Your credit rating is: Excellent!");
//        } else if ((avg >= 650) && (avg < 750)) {
//            System.out.println("Your credit rating is: Good");
//        } else if ((avg >= 550) && (avg < 650)) {
//            System.out.println("Your credit rating is: Fair!");
//        } else {
//            System.out.println("Your credit rating is: Poor!");
//        }
//
//        // thank you message once the program completes running.
//        System.out.println("Thank You for using the You Might Want To Sit Down For This Credit Score Checker!");
//        System.out.println("We hope that we were able to give you some good news!");
//    }
//
//} /// end of program
