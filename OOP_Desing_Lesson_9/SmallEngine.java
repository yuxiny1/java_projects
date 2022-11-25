package OOP_Desing_Lesson_9;

public class SmallEngine implements Engine {
    //creating engine object with int hoursePower
    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    
    @Override
    public void startEngine() {
        System.out.println("Starting small engine" + this.horsePower +"hulala ");
    }

    public void stopEngine() {
        System.out.println("Stopping small engine" + this.horsePower);
    }
}