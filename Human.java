public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Heelo , my name is " + name);
        System.out.println("I am " + age + "years old");
        System.out.println("I am " + heightInInches + " inches tall");

    }
    public void eat(){
        System.out.println("Eating");
    }
}
