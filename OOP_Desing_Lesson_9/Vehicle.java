package OOP_Desing_Lesson_9;

public class Vehicle {

    Engine myEngine;

    // Tire tire;
    // WindShield shield;
    // Roof roof;

    //proper indepency injection
    public Vehicle(Engine anEngine) {
    // this.myEngine = anEngine;
    // expecting an engine object to be passed in 
        myEngine = anEngine;
    }

    //Engine racingEngine = this.myEngine;

    public void crakIgnition() {
        myEngine.startEngine();
        System.out.println("Vrooom");
    }
}