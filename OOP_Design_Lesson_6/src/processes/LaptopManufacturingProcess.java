package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

	public LaptopManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("laptop assembled ");
	}

	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("laptop teseted");
	}

	@Override
	protected void packageDeivce() {
		// TODO Auto-generated method stub
		System.out.println("laptop packaged");

		
	}

	@Override
	protected void storeDevice() {
		// TODO Auto-generated method stub
		System.out.println("laptop stored");

	}

}
