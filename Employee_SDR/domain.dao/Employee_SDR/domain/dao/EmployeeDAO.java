package Employee_SDR.domain.dao;

public class EmployeeDAO{
    public void saveEmployee(Employee employee){
        //DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        System.out.println("Employee saved: " + employee);

        // connectionManager.connect();
        // connectionManager.getConnection().prepareStatement("insert into employee values (" + employee.getId() + ", '" + employee.getName() + "', '" + employee.getDepartment() + "', " + employee.isWorking() + ")");
         System.out.println("Employee saved: " + employee);

    }
    public void deleteEmployee(Employee employee){
        System.out.println("Employee deleted: " + employee);
    }
}