package parts;


public class SmallEngine implements Engine {
    //creating engine object with int hoursePower
    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    

    public void startEngine() {
        System.out.println("Starting small engine" + this.horsePower +"hulala ");
    }

    public void stopEngine() {
        System.out.println("Stopping small engine" + this.horsePower +"didi baba wo");
    }
}