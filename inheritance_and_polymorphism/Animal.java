package inheritance_and_polymorphism;

public class Animal {
    public String picture;
    protected String name;
    protected int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }

    public void makeSound() {
        System.out.println(this.name + " just made a Sound!");
    }
}
