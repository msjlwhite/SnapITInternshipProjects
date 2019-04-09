/*
Author: J White
Date: 4/9/2019
Task: Adding Values in a Loop
Write a program that gets several integers from the user.
Sum up all the integers they give you. Stop looping when
they enter a 0. Display the total at the end.

You must use a while loop.
*/

package com.company;

import java.util.Scanner;

public class MathLoop {

    // class variable declaration
    Scanner scanner = new Scanner(System.in);   // takes in the users input
    int value;                                  // holds the value that user enters
    int sum;                                    // holds the total of the sum of all the values that
                                                // the user has entered.

    // method that will run a loop that will take in
    // and add numbers entered together until user
    // enters zero to stop the program.
    public void addLoop() {

        // Inital Method call test
        System.out.println("I'm a loop to add numbers!! ^_^");
        System.out.println("");

        // prints out welcome message and explanation of app
        System.out.println("Welcome to the Addition Mathematician!");
        System.out.println("I will add up the numbers you give me ...");

        // loop to add
        do{

            System.out.print("Please enter in a number: ");
            value = scanner.nextInt();
            sum = sum + value;
            System.out.println("The total so far is " + sum);

        } while (value != 0);

        System.out.println("");
        System.out.println("The total is " + sum);

    }//end of addLoop() method

}// end of MathLoop() class
