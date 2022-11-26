import java.lang.Thread.Builder;

public class vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    private vehicle(Builder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.currentVelocity = builder.currentVelocity;
        this.currentDirection = builder.currentDirection;
    }

    public static class Builder{
        private String name;
        private String size;
        private int currentVelocity;
        private int currentDirection;

        public Builder(String name, String size){
            this.name = name;
            this.size = size;
        }

        public Builder currentVelocity(int currentVelocity){
            this.currentVelocity = currentVelocity;
            return this;

        }

        public Builder currentDirection(int currentDirection){
            this.currentDirection = currentDirection;
            return this;
        }

        public vehicle build(){
            return new vehicle(this);
        }
    }
    public String toString(){
        return "vehicle{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", currentVelocity=" + currentVelocity +
                ", currentDirection=" + currentDirection +
                '}';
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}