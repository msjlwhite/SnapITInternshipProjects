// Date:
// Created By: J White
// Task: Write a Java program to take a String as input, and print it out backwards.
//      (Write a separate method to hold the logic, then call this method from main)
//
//      Sample Output:
//      Input a word: dsaf
//      Reverse word: fasd

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // prints out welcome message to the user
        System.out.println("Welcome the Unbelievable Word Reverser!!");

        // triggers method get number feet info from user
        getWord();
    }

    private static void getWord() {
        // collects and holds the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word for me to reverse: ");
        String urWord = scanner.nextLine();

        System.out.println(urWord);

//        reverse(urWord);
    }

    private static void reverse (String a)
        //(String [] args)
    {
         String newWord = a;
    }


}


/*
// Original
package com.company;

import java.util.Scanner;

public class feetToMeters {

    public static void main(String[] args) {
        // prints out welcome message to the user
        System.out.println("Welcome User to the Super Feet to Meters Converter!!");

        // triggers method get number feet info from user
        getNum();
    }

    private static void getNum() {

        // collects and holds the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to convert from feet to meters: ");
        String urNum = scanner.nextLine();

        //System.out.println("You entered in: " + urNum);
        operation(urNum);
    }

    private static void operation(String num) {

        // changes user's input then converts their input from feet to meters
        double meters = Double.parseDouble(num ) / 3.2808;
        System.out.println(num + " feet is equal to " + meters + " in meters.");
        // System.out.println("Your number in meters " + meters);

        // thank you message after the problem completes.
        System.out.println("Thank You for using the Super Feet to Meters Converter!!");

//        // checks to see if user wants to enter in another number
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Would you like to enter in another number? [Y/N]  " + meters);
//        String resume = scanner.nextLine();
//        char ans = resume.charAt(0);
//
//        if (ans == 'y' || ans == 'Y')
//        {
//            main();
//        }

    }


}

 */
