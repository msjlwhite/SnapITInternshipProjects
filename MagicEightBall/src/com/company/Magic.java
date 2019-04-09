/*
Author: J White
Date: 4/8/2019
Task: Assignments turned in without these things will receive no credit.

The real Magic 8-Ball™ contains 20 anss, not 15.
Change the code so that it picks a random number from 1-20,
and add the following five anss:
Don't count on it
My reply is no
My sources say no
Outlook not so good
Very doubtful

*/

package com.company;

// imports java libraries to use the Scanner and ThreadLocalRandom methods
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic {

    // variable declaration
    Scanner scanner = new Scanner(System.in);          // reads in the user's input
    String ans;                                        // hold the possible answer to the user's question
    String cont;                                       // holds the response to whether or not to continue running the
                                                       // program
    int num;                                           // hold the randomly generated number for the response that the
                                                       // application will give to the user.

    // class that will start the Magic 8 Ball application
    public void ball()
    {
        // generates a welcome message to greet the user
        System.out.println("Welcome to the All-Knowing All-Seeing Questionnator Oracle!!");
        System.out.println("Our great 'Oracle' will peer into the future to unravel any " +
                "uncertainty that you may hold.");
        System.out.println("");

        // creates and displays option to add a manager or a cashier to the system
        System.out.print("Please enter a question for the Questionnator to answer for you: ");
//        question = scanner.nextLine();
        scanner.nextLine();

        // generates a random number between 1 and 20
        num = ThreadLocalRandom.current().nextInt(1,20);

        // creates an nested IF-ELSE Statement to print out an answer to the user's question
        if ( num == 1 )
            ans = "It is certain";
        else if ( num == 2 )
            ans = "It is decidedly so";
        else if ( num == 3 )
            ans = "Without a doubt";
        else if ( num == 4 )
            ans = "Yes - definitely";
        else if ( num == 5 )
            ans = "You may rely on it";
        else if ( num == 6 )
            ans = "As I see it, yes";
        else if ( num == 7 )
            ans = "Most likely";
        else if ( num == 8 )
            ans = "Outlook good";
        else if ( num == 9 )
            ans = "Signs point to yes";
        else if ( num == 10 )
            ans = "Yes";
        else if ( num == 11 )
            ans = "Reply hazy, try again";
        else if ( num == 12 )
            ans = "Ask again later";
        else if ( num == 13 )
            ans = "Better not tell you now";
        else if ( num == 14 )
            ans = "Cannot predict now";
        else if ( num == 15 )
            ans = "Concentrate and ask again";
        else if ( num == 16 )
            ans = "You were expecting me to say yes or no, weren't you? Surprised you, haven't I?";
        else if ( num == 17 )
            ans = "I am  is not here right now. Please leave a message after the beep";
        else if ( num == 18 )
            ans = "I am out of order until further notice.";
        else if ( num == 19 )
            ans = "My sources say no.";
        else
            ans = "8-BALL ERROR!";

        // prints out the response here.
        System.out.println("The Oracle says; " + ans);
        System.out.println("");


//        System.out.println(ThreadLocalRandom.current().nextInt(1,20));

        // checks to see if the user would like to continue asking questions
        System.out.print("Would you like to continue? Y/N ");
        cont = scanner.nextLine().toUpperCase();
        System.out.println("");

        // Loop to allow users to continue asking questions until a no is entered.
        while (!cont.equals("N"))

        {
            ball();
        }//end of while () loop


        // prints out a Thank you for message for the user
        System.out.println("Thank you for using All-Knowing All-Seeing Questionnator Oracle!!");
        System.out.println("We will see you next time ... !");

    }//end of ball() loop

}//end of Magic() class
