package access_modifiers;

public class Main {
    public static void main(String[] args) {
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        System.out.println(bengie.name);
        System.out.println(bengie.getAge());

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        System.out.println(gracie.name);
        System.out.println(gracie.getAge());

        bengie.woof();
        gracie.woof();

        // DOESN'T WORK!
        // bengie.getAge() = 10;
        System.out.println(bengie.getAgeInHumanYears());
    }
}
