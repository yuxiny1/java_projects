package parts;

public class LargeEngine implements Engine {
    private int horsePower;
    
    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    
   
    public void startEngine() {
        System.out.println("Starting large engine" + this.horsePower + "boom shaka laka ");
    }

    public void stopEngine() {
        System.out.println("Stopping large engine" + this.horsePower + " wulala");
    }
}