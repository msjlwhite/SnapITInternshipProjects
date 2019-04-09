/*
Author:J White
Date: 4/9/2019
Task: Displaying Some Multiples
Write a program to calculate the multiples of a given
number. Have the user enter a number, and then use a
for loop to display all the multiples of that number
from 1 to 12. It is not necessary to use a function.

You must use a for loop.

 */


package com.company;

//imports the java libraries for the scanner class

import java.util.Scanner;

public class Main {
//    //class variable declaration
//    Scanner scanner = new Scanner(System.in);   // takes in the users input
//    int num;                                    // holds the value that user enters
//    int product;                                // holds the multiplication results


    public static void main(String[] args) {

        //variable declaration
        Scanner scanner = new Scanner(System.in);   // takes in the users input
        int num;                                    // holds the value that user enters
        int product;                                // holds the multiplication results


        // prints out greeting to user
        System.out.println("Welcome to the Great Multiplier!!");

        // initial program test
        System.out.println("I will print out the times tables for any number " +
                "you enter going up to that number. ^_^");

        //asks user for input
        // initial program test
        System.out.print("Please enter a number: ");
        num = scanner.nextInt();

        System.out.println("");

        // loop to generate times table
        for (int i = 0; i <= num; i++)
        {
            product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }

        System.out.println("");
        System.out.println("Thank You!!");


    } // end of Main() method

}// end of Main {} method
