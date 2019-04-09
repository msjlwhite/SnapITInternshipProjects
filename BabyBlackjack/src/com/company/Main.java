/*
Author:
Date:
Task: Baby Blackjack
Write a program that allows a human user to play a single hand of "blackjack"
against a dealer.

Pick two values from 1-10 for the player. These are the player's "cards".
Pick two more values from 1-10 for the dealer.
Whoever has the highest total is the winner.
There is no betting, no busting, and no hitting. Save that for real blackjack.

 */

package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    // calls the deal method to start the program
    public static void main(String[] args) {
        deal();
    }//end of main () Method

    // method to start the blackjack game between the user and "dealer"
    private static void deal() {
        //variable declaration
        Scanner scanner = new Scanner(System.in);    // reads in user's input for card amount
        int pCard1;                         // holds the user's (player) card amount
        int pCard2;                         // holds the user's (player) card amount
        int dCard1;                         // holds the dealer's (computer) card amount
        int dCard2;                         // holds the dealer's (computer) card amount
        int pSum;                           // holds the user's final score
        int dSum;                           // holds the dealer's final score


        // generates greeting
        System.out.println("Howdy, Player!");
        System.out.println("You look lucky ... ");
        System.out.println("How about you have a seat and we have us a nice little " +
                "game of Blackjack?");

        System.out.println("");
//        System.out.print("Please pick a card (enter a number between 1-10): ");
        pCard1 = scanner.nextInt();

//        System.out.println("");
//        System.out.print("Please another card (enter another number between 1-10): ");
        pCard2 = scanner.nextInt();
        System.out.println("");

        System.out.println("Now I will pick two cards ...");
        System.out.println("1...");
        dCard1 = ThreadLocalRandom.current().nextInt(1,10);

        System.out.println("2...");
        dCard2 = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("");

        pSum = pCard1 + pCard2;
        System.out.println("Player, you drew " + pCard1 + " and " + pCard2 + ".");
        System.out.println("Your total is "+ pSum + ".");

        dSum = dCard1 + dCard2;
        System.out.println("The Dealer drew " + dCard1 + " and " + dCard2 + ".");
        System.out.println("The Dealer's total is "+ dSum + ".");

        if(pSum > dSum)
        {
            System.out.println("YOU WIN, PARDNER! GREAT JOB!");
            System.out.println("Thanks for playing.");

        } else
            System.out.println("YOU LOSE, PARDNER! MAYBE NEXT TIME.");
            System.out.println("Thanks for playing.");



    }// end of

}// end of
