
public class App {
    public static void main(String[] args){
        System.out.println("Hello World");

        vehicle vehicle = new vehicle.Builder("AE85", "AWD")
                .currentVelocity(100)
                .currentDirection(90)
                .build();

                System.out.println(vehicle.toString());
                //System.out.println(vehicle.steer(0));

    }
}