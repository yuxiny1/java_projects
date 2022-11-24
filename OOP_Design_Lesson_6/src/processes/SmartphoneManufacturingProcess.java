package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

	public SmartphoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("assembled smartphone");
		
	}

	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("tested smartphone");
		
	}

	@Override
	protected void packageDeivce() {
		// TODO Auto-generated method stub
		System.out.println("packaged smartphone");
		
	}

	@Override
	protected void storeDevice() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone stored");
	}

}
