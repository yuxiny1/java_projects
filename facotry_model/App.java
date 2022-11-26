
public class App {
	public static void main(String args[]) {

		VehicleFactory vehicleFactory = new VehicleFactory();

		Vehicle car= vehicleFactory.getVehicle(VehicleType.CAR);
		car.startEngine();

		Vehicle truck=vehicleFactory.getVehicle(VehicleType.TRUCK);

		truck.startEngine();
		
		// Vehicle vehicle = vehicleFactory.getVehicle("CAR");

		// vehicle.startEngine();
		
		// Vehicle vehicle2 = vehicleFactory.getVehicle("TRUCK");

		// vehicle2.startEngine();
		
	}

}
