package casting;

public class Main {
    public static void main(String[] args) {
        int loan = 750;
        float interestRate = 0.0525f;
        
        float interest = (float) loan * interestRate;
        System.out.println(interest);
    }
}
