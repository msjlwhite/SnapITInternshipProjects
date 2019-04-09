/*
Author: J White
Date: 4/8/2019
Task: Assignments turned in without these things will receive no credit.

The real Magic 8-Ball™ contains 20 responses, not 15.
Change the code so that it picks a random number from 1-20,
and add the following five responses:
Don't count on it
My reply is no
My sources say no
Outlook not so good
Very doubtful

*/


package com.company;

public class Main {

    public static void main(String[] args) {
        //Object to create the to call the Magic 8 ball class to run the program
        Magic start = new Magic();
        start.ball();


    }
}
