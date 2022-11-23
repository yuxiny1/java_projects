public class Sparrow extends Bird implements Flyable { 
    public Sparrow(String name, int height, int width, String gender){
        super(name, width, height, width, gender);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high");
    }

    public void move() {
        System.out.println("Sparrow flying high");
    }

}