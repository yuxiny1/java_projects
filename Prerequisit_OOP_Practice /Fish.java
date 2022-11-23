public class Fish extends Animals {

    public Fish(String name, int age, int height, int width, String gender) {
        super(name, age, height, width, gender);
    }

    public void swim() {
        System.out.println("swim...");
    }
    public void move() {
        System.out.println("fish swiming...");
    }
}