package OOP_Desing_Lesson_9;

public class LargeEngine implements Engine {
    private int horsePower;
    
    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    
    @Override
    public void startEngine() {
        System.out.println("Starting large engine" + this.horsePower);
    }

    public void stopEngine() {
        System.out.println("Stopping large engine" + this.horsePower);
    }
}