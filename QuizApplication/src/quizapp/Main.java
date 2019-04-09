
/*
*Java Object-Oriented Programming : Build a Quiz Application*
Author(s): Abhay Redkar (course instructor) -- Udemy Online Video Tutorial
           J. White (Student ??)
Date:
Task: This course also has a mini project at the end which a console-base
      Quiz Application. This application is designed using object-oriented
      approach and will be a good revision of the entire course as a lot of
      concepts will be covered in it. (object-oriented concepts like
      inheritance, polymorphism, interface, abstract class etc and also
      understand why they are used.)

 */

package quizapp;

import java.util.Scanner;

/* A simple console based app that will ask the user 5 questions. For each question it will display, a multiple choice
answer with 4 options that the user can chose from. Each question has its own answer and once the user has entered in an
option (answer) then a message will display one the screen to tell whether the answer is correct or not.
Once the quiz is completed, it will display the results.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        Quiz quiz = new Quiz();
        quiz.begin();

    }// end of MAIN() method

}// end of MAIN CLASS

// core (MOST iMPORTANT) class in the application
class Quiz
{
    // indicates the starts of the application//
    void begin()
    {
        // 4(5) "question" objects with options and the correct answer. These (options) will be loaded into the answer class.
        Question q1 = new Question("What is the opposite of have-not?","Have","Hold","Don't Know","Don't Care", new Answer("Have"));
        Question q2 = new Question("What is the first letter of the 'alphabet' ?","Alpha","A","Bet","Y?", new Answer("A"));
        Question q3 = new Question("Today was such a ____ day!","Good","Aight","Nice","Terrible, Horrible, No-Good, Very Bad", new Answer("Nice"));
        Question q4 = new Question("The word of the ___ is . . .","Fantod","Year","Time","Day", new Answer("Day"));

        // variable declaration and initialization
        Question questionArr[] = {q1,q2,q3,q4};     // creates and array to hold the questions and their answers
        int countTtotal = 0;                        // total number of quiz questions
        int countCorrect = 0;                       // total number answered correctly
        int countWrong = 0;                         // total number answered wrong

//        Answer answerArr[] = {};


        // created a FOR loop to go through question array and do the following:
        for (Question q:questionArr)
        {
            // prints out the question and 4 possible answers for each loop iteration
            // then takes the user submitted answers and runs them through the "getter" methods
            System.out.println(q.getQuestion());
            System.out.println("A. "+q.getOption1());
            System.out.println("B. "+q.getOption2());
            System.out.println("C. "+q.getOption3());
            System.out.println("D. "+q.getOption4());

            System.out.println("");
            System.out.print("Please enter your answer: ");

            // gets and hold the information (input) from user
            Scanner scanner = new Scanner(System.in);
            char option = scanner.next().toUpperCase().charAt(0);
            String answer="";

            //
            switch (option)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                    default: break;
            }// end of switch()

            // display the a message if the user submitted answer is correct or not
            // then will increment the countCorrect, countWrong and countTotal accordingly
            if(answer.equals(q.answer.getAnswer()))
            {
                System.out.println("---------------------------------------------");
                System.out.println("Correct Answer");
                System.out.println("---------------------------------------------");
                countCorrect++;

            }
            else
            {
                System.out.println("---------------------------------------------");
                System.out.println("Wrong Answer, Try Again!");
                System.out.println("---------------------------------------------");
                countWrong++;
            }// end of If-Else statement()

            System.out.println("");
            System.out.println("==============================================================");

            countTtotal++;

        }// end of For Loop()


        //call to IResult() Method/class
        Result result = new Result(countTtotal, countCorrect, countWrong);//, answerArr.toString());

        //invoking
        result.showResult();


    }// end of BEGIN() Method

}// end of Quiz class

// creating a class called Question -- is an "object" that has its own class
class Question
{
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    Answer answer;

    // creating a constructor for the Question class
    public Question(String question, String option1, String option2, String option3, String option4, Answer answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    // generating Getters for the Question class
    public String getQuestion() {
        return question;
    }

    public String getOption1() { return option1; }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public Answer getAnswer() {
        return answer;
    }
} // end of Question class

// created an Interface class or method? -- creates ABSTRACTION *see below*
/*
Why do we use interface ?

It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.
 */

//
interface IResult
{
    void showResult();
    double showPerecentage(int correctAnswers, int totalQuestions);
    String showPerformance(double percentage);
        } // end of inheritance IResult()

// created Result class
class Result implements IResult
{
    int totalQuestions;
    int correctAnswers;
    int wrongAnswers;
    //Answer answerArr[];

    public Result(int totalQuestions, int correctAnswers, int wrongAnswers)//, String answerArr)
    {
        super();
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;

    }// end of Results

    //
    public double showPerecentage(int correctAnswers, int totalQuestions) {
        return ((double)correctAnswers/totalQuestions)*100;
    }

    //
    public String showPerformance(double percentage) {
        String performance = "";
        if (percentage > 60)
        {
            performance = "Good";
        }
        else if (percentage < 40)
        {
            performance = "Poor";
        }
        else
        {
            performance = "Average";
        }

        return performance;
    }

    // displays the user's results from the quiz
    public void showResult() {


        System.out.println("Your Result: ");
        System.out.println("-------------------------------------");
        System.out.println("Total Questions:    "+totalQuestions);
        System.out.println("Correct Answers:    "+correctAnswers);
        System.out.println("Wrong Answers:      "+wrongAnswers);
        System.out.println("Percentage:         "+showPerecentage(correctAnswers,totalQuestions));
        System.out.println("Overall Performance: "+showPerformance(showPerecentage(correctAnswers,totalQuestions)));
//        System.out.println("Your Responses make the following secret message: " + answerArr);
        System.out.println("-------------------------------------");

    }// end of showResult() method

} // end of class Result implements IResult

// creating a class called Answer
class Answer
{
    String answer;

    //created a constructor with a string variable parameter
    public Answer(String answer) {
        super();
        this.answer = answer;

    } //end of constructor Answer

    //creating a getter method --
    public String getAnswer() {
        return answer;
    } //end of getter getAnswer

} // End of Answer class