package assignment_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = {"What is my name?", "What is my age?", "What is my gender?", "Where do I live?", "What is my nationality?"};
        String[] answers = {"Alex", "20", "male", "Toronto", "China"};

        Scanner s = new Scanner(System.in);

        int i = 0;
        while (i < questions.length) {
            System.out.println("Question " + (i+1) + ":");
            System.out.println(questions[i]);

            if (s.next().equals(answers[i])) {
                System.out.println("You are correct.");
                i++;
            }
            else {
                System.out.println("You are wrong. Please answer this question again.");
            }
        }

        System.out.println("You have completed all the questions. Good job!");
        s.close();
    }
}