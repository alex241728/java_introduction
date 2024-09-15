package if_and_else_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exam1 = 65;
        int exam2 = 51;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Result for Exam 1: ");
        exam1 = scanner.nextInt();
        System.out.println("Result for Exam 2: ");
        exam2 = scanner.nextInt();

        scanner.close();

        if (exam1 >= 50) {
            System.out.println("You have passed Exam 1.");
        }
        else {
            System.out.println("You have FAILED Exam 1.");
        }

        if (exam2 >= 50) {
            System.out.println("You have passed Exam 2.");
        }
        else {
            System.out.println("You have FAILED Exam 2.");
        }

        if (exam1 >= 50 && exam2 >= 50) {
            System.out.println("You have passed the CLASS.");
        }
    }
}
