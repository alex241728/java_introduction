package ouptut_and_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Students!");

        int x = 10;
        System.out.println(x);

        System.out.println("Outputting some value: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your username:");
        String input = scanner.next();
        System.out.println("Your username is: " + input);

        scanner.close();
    }
}
