package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        try {
            checkForZero(i);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally");
        }

        System.out.println("This happens always");

        s.close();
    }

    private static void checkForZero(int number) throws TestException {
        if (number == 0) {
            throw new TestException("NUMBER IS ZERO!");
        }
    }
}
