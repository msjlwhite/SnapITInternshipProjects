// Date: 3/20/2019
// Created by: J White

// Edited
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

        // takes the user's input to perform the feet to meters conversion
        operation(urNum);
    }

    private static void operation(String num) {

        // changes user's input then converts their input from feet to meters
        double meters = Double.parseDouble(num ) / 3.2808;
        System.out.println(num + " feet is equal to " + meters + " in meters.");

        // thank you message after the problem completes.
        System.out.println("Thank You for using the Super Feet to Meters Converter!!");

    }

} // end of file





