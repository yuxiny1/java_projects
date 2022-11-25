public class Sparrow extends Animals implements Flyable{

    public Sparrow(String name, int age, int height,int width, String gender){
        super(name,age,height,width,gender);
    };

    public void move() {
        System.out.println("Flappying wings...");
    }

    public void fly() {
        System.out.println("Flying..on the skay.");
    }

}