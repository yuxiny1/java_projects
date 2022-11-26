import java.util.Scanner;


public class VehicleFactory {

	public Vehicle getVehicle(VehicleType vehicleType){
		return vehicleType.getVehicle();
	}
	// public Vehicle getVehicle(String vehicleType) 
	// {
	// 	if(vehicleType.equalsIgnoreCase("TRUCK")) {
	// 		return new Truck();
	// 	}else if (vehicleType.equalsIgnoreCase("CAR")) {
	// 		return new Car();
	// 	}else if (vehicleType.equalsIgnoreCase("ElECTRIC")) {
	// 		return new ElectricCar();
	// 	}
		
	// 	return null;
	// }

}
