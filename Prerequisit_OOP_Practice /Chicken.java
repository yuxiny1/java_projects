public class Chicken extends Bird {

    public Chicken(String name, int age, int height, String gender) {
        super(name, age, height, height, gender);

    }
    public void move() {
        System.out.println("Flappying wings. but not fly..");
    }
    // overridng the method defiend in bird
    // public void fly() {
    //     System.out.println("I can't fly");
    // }
}