package Employee_SDR.clients;

import org.w3c.dom.css.CSSValue;

public class ClientModule {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee = new Employee(1, "John", "IT", true);
        Employee peggy = new Employee(2, "Peggy", "accounting", true);
        employeeDAO.saveEmployee(employee);
        printEmployeeReport(peggy, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        // formatter.getFormattedEmployee();
        System.out.println(formatter.getFormattedEmployee());
    }
}