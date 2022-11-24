package processes;

public abstract class GeneralManufacturingProcess {
	
	private String processName;
	public GeneralManufacturingProcess(String name) {
		processName = name;
		
	}
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDeivce();
	protected abstract void storeDevice();
	
	//template method 
	
	public void launchProcess(){
		
		if(processName !=null && !processName.isEmpty()) {
		assembleDevice();
		testDevice();
		packageDeivce();
		storeDevice();
		}else {
			System.out.println("no process name was specified");
		}
		
		
	}
}
