/*
Author: J White
Date: 4/8/2019
Task: Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
      For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6
      numbers, each from 1-54.

*/


package com.company;


// imports java libraries to use the Scanner and ThreadLocalRandom methods
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fortune {

    // variable declarations
    Scanner scanner = new Scanner(System.in);            // reads in the user's guess as input
    String fortune;                                      // holds the user's fortune
    int select;                                          // hold the number that user inputs (from 1 to 6)
    int num;                                             // hold the randomly generated lucky numbers

    public void eat()
    {

        //prints out welcome message and directions to the user
        System.out.println("Welcome to the Fortune Cookie Fortune Creator!");
        System.out.println("What does the future hold for you? Find out by choosing your own fortune.");
        System.out.println("");

        System.out.print("Welcome wanderer, please pick a number from 1 to 6: ");
        select = scanner.nextInt();
        System.out.println("");

        // nested IF-Else Statement -- PLEASE NOTE THAT THESE ARE FORTUNES THAT oTHERS ACTUALLY FOUND IN THEIR FORTUNE
        // COOKIES
        if (select == 1)
        {
            fortune ="No snowflake in an avalanche ever feels responsible.";

        } else if (select == 2) {
            fortune ="About time I got out that cookie!";

        } else if (select == 3) {
            fortune = "If you eat something and no one sees then it has no calories.";

        } else if (select == 4) {
            fortune ="I cannot help you for I am just a cookie!";

        } else if (select == 5) {
            fortune ="If you think, I am going to sum up your whole life in just one fortune, then you're just" +
                    " crazy!";

        } else if (select == 6) {
            fortune ="I see money in your future .... its not yours though.";

        } else
            fortune ="You laugh now, but wait until you get home!";


        //prints out fortune
        System.out.println("Your Fortunes: " + fortune);

        //prints out lucky numbers
        System.out.print("Your lucky numbers are: ");

        // for loop to generate 6 random lucky numbers
        for (int i = 0; i < 6 ; i++)
        {
            num = ThreadLocalRandom.current().nextInt(1,100);
            System.out.print(num + " ");

        } //end of for() loop

        System.out.println("");

        //prints out welcome message and directions to the user
        System.out.println("Thank you for using the Fortune Cookie Fortune Creator!");

    }
}
