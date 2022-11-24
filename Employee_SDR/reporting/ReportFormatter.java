package  Employee_SDR.reporting;

public class ReportFormatter{

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType){
        switch(formatType){
            case XML:
            formattedOutput = convertObjectToXML(object);
                System.out.println("Converting report to XML");
                break;
            case CSV:
            formattedOutput = convertObjectToCSV(object);
                System.out.println("Converting report to CSV");
                break;
        }
    }


    private String converObjectToXML(Object object){
        return "XML: <title>" + object.toString() + "</title>";
    }

    protected String getFormattedValue(){
        return formattedOutput;
    }

}