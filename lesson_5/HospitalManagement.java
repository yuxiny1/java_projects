package Lesson_5;

public class HospitalManagement {
    //nurse 
    private void checkVitalSigns(){
        System.out.println("Nurse checking vitals");
    }

    private void drawBlood(){
        System.out.println("Nurse drawing blood");
    }

    private void cleanPatientArea(){
        System.out.println("Nurse cleaning patient area");
    }

    //doctors 

    private void prescribeMedicine(){
        System.out.println("Doctor prescribing medicine");
    }

    private void diagnosePatient(){
        System.out.println("Doctor diagnosing patient");
    }

    public void callUpon(Employee employee) {
        if(employee instanceof Nurse){
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        } else if(employee instanceof Doctor){
            prescribeMedicine();
            diagnosePatient();
        }
        //employee.performDuties();
    }
}