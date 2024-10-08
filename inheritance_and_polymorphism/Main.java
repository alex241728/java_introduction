package inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Inheritance & Polymorphism */

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 12);

        whiskers.makeSound();
        bengie.makeSound();
        gracie.makeSound();

        Animal animal = new Dog("jenny.png", "Jenny", 15);
        animal.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(whiskers);

        animals.get(1).makeSound();
    }
}