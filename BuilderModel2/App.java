public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Vehicle myCar = new Vehicle.Builder(10000, "Sedan", "honda")
                    .horsePower(200)
                    .model("civic")
                    .color("red")
                    .doors(4)
                    .build();

        System.out.println(myCar.toString());

        Vehicle myTruck = new Vehicle.Builder(20000, "Truck", "ford")
                    .horsePower(300)
                    .model("f150")
                    .color("blue")
                    .doors(2)
                    .build();

        System.out.println(myTruck.toString());

        Vehicle mySUV = new Vehicle.Builder(30000, "SUV", "toyota")
                    .horsePower(400)
                    .model("rav4")
                    .color("black")
                    .doors(4)
                    .build();

        System.out.println(mySUV.toString());
        
    }
}