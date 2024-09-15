package java_classed_and_objects;

public class Dog {
    // fields
    public String picture;
    public String name;
    public int age;

    // default constructor
    public Dog() {

    }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    // method
    public void woof() {
        System.out.println(this.name + " just woofed!");
    }
}
