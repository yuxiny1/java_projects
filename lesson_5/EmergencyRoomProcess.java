package Lesson_5;

import Lesson_5.HospitalManagement;

public class EmergencyRoomProcess {
    public static void main(String args[]) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);
        ERDirector.callUpon(peggy);
    }
}