package assignment_3;

import java.util.Scanner;

class Question {
    private String question;
    private String answer;

    public Question() {
        this.question = "";
        this.answer = "";
    }

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("What is my name?", "Alex");
        Question q2 = new Question("What is my age?", "20");
        Question q3 = new Question("What is my gender?", "male");
        Question q4 = new Question("Where do I live?", "Toronto");
        Question q5 = new Question("What is my nationality?", "China");
        Question[] questions = {q1, q2, q3, q4, q5};

        Scanner s = new Scanner(System.in);

        int i = 0;
        while (i < questions.length) {
            System.out.println("Question " + (i+1) + ":");
            System.out.println(questions[i].getQuestion());

            if (s.next().equals(questions[i].getAnswer())) {
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
