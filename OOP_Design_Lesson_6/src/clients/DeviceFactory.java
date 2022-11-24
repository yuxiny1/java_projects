package clients;
import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;
import processes.LaptopManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]) {
		
		GeneralManufacturingProcess manfacturer =
				new SmartphoneManufacturingProcess("IPhone");
		
		manfacturer.launchProcess();
		
		GeneralManufacturingProcess lapManfacturer=
				new LaptopManufacturingProcess("Macbook pro 16 inch");
		
		lapManfacturer.launchProcess();
		
	}

};
