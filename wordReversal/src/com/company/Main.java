// Date:
// Created By: J White
// Task: Write a Java program to take a String as input, and print it out backwards.
//      (Write a separate method to hold the logic, then call this method from main)
//
//      Sample Output:
//      Input a word: dsaf
//      Reverse word: fasd

// Edited Version

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // prints out welcome message to the user
        System.out.println("Welcome the Unbelievable Word Reverser!!");

        // triggers method to collect and holds the user's input
        getWord();
    }

    private static void getWord() {
        // asks user for input, puts the input into a variable then triggers the reverse word method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word for me to reverse: ");
        String urWord = scanner.nextLine();

        // triggers the reverse word method on the user's input
        reverse(urWord);
    }

    private static void reverse (String a) //(String [] args)
    {
        // puts string into a variable for manipulation
        // then reverses the characters in the string
        String oldWord = a;

        for (int i = oldWord.length()-1; i >= 0; i--)
        {
            System.out.print(oldWord.charAt(i));
        }

        // prints out thank you message to the user
        System.out.println("");
        System.out.println("Thank You for using the Unbelievable Word Reverser!!");
    }

}



// Original Version
//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // prints out welcome message to the user
//        System.out.println("Welcome the Unbelievable Word Reverser!!");
//
//        // triggers method to collect and holds the user's input
//        getWord();
//    }
//
//    private static void getWord() {
//        // asks user for input, puts the input into a variable then triggers the reverse word method
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a word for me to reverse: ");
//        String urWord = scanner.nextLine();
//
//        // triggers the reverse word method on the user's in
//        // put
//       reverse(urWord);
//    }
//
//    private static void reverse (String a) //(String [] args)
//    {
//        // then reverses the characters the
//        String oldWord = a;
//
////        System.out.println(newWord.length());
////        System.out.println(newWord.charAt(3));
//
//        for (int i = oldWord.length()-1; i >= 0; i--)
//        {
//            System.out.print(oldWord.charAt(i));
//        }
//    }
//
//}
