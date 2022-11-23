public class Bird extends Animals {
    //not implementing flyable interface

    public Bird(String name, int age, int height, int width, String gender) {
        super(name, age, height, width, gender);
    }

    // public void fly() {
    //     System.out.println("fly,...");
    // }
    public void move() {
        System.out.println("Flappying wings...");
    }


}