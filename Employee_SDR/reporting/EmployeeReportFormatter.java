package  Employee_SDR.reporting;

import Employee_SDR.domain.Employee;

public class  EmployeeReportFormatter extends ReportFormatter{
    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}