package access_modifiers;

public class Dog {
    public String picture;
    protected String name;
    private int age;
    public static final int dogToHumanYearMultiplier = 7;

    public int getAge() {
        return age;
    }

    public Dog() {

    }

    public void birthday() {
        age++;
    }

    public int getAgeInHumanYears() {
        return age * dogToHumanYearMultiplier;
    }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }
    
    public void woof() {
        System.out.println(this.name + " just woofed!");
    }
}
