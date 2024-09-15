package boolean_and_comparision_operators;

public class Main {
    public static void main(String[] args) {
        /* Boolean */
        boolean likesTheLectures = true;
        boolean askedQuestion = false;
        System.out.println("You like these lectures " +  likesTheLectures);
        System.out.println("You have asked a Question in the Q&A " + askedQuestion);

        /* Comparison operators */
        int yourScore = 98;

        boolean passedClass = yourScore >= 50;
        System.out.println("You passed: " + passedClass + " with " + yourScore + " points!");

        boolean hasPerfectScore = yourScore == 100;
        boolean failedClass = !passedClass;
    }
}
