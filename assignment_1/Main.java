package assignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner Object
        Scanner s = new Scanner(System.in);

        // Question 1
        System.out.println("Question 1:");
        System.out.println("What is my name?");
        System.out.print("Your answer: ");

        String answer1 = "Alex";
        boolean isQ1Correct = false;
        if (s.next().equals(answer1)) {
            isQ1Correct = true;
            System.out.println("Your answer is correct.");
        }
        else {
            System.out.println("Your answer is incorrect.");
        }

        // Question 2
        System.out.println("Question 2:");
        System.out.println("What is my age?");
        System.out.print("Your answer: ");

        String answer2 = "20";
        boolean isQ2Correct = false;
        if (s.next().equals(answer2)) {
            isQ2Correct = true;
            System.out.println("Your answer is correct.");
        }
        else {
            System.out.println("Your answer is incorrect.");
        }

        // Question 3
        System.out.println("Question 3:");
        System.out.println("What is my gender?");
        System.out.print("Your answer: ");

        String answer3 = "male";
        boolean isQ3Correct = false;
        if (s.next().equals(answer3)) {
            isQ3Correct = true;
            System.out.println("Your answer is correct.");
        }
        else {
            System.out.println("Your answer is incorrect.");
        }

        // close scanner
        s.close();

        // all correct
        if (isQ1Correct && isQ2Correct && isQ3Correct) {
            System.out.println("All your answers are correct.");
        }
    }
}
