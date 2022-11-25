package OOP_Desing_Lesson_9;

public class App{
    public static void main(String[] args){
        
        Vehicle raceCar= new Vehicle(new SmallEngine(100));
        Vehicle familyTruck= new Vehicle(new LargeEngine(500));
        Vehicle familyCar= new Vehicle(new SmallEngine(100));

        raceCar.crakIgnition();
        familyTruck.crakIgnition();
        familyCar.crakIgnition();
        

    }
}