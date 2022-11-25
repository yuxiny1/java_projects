package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import parts.LargeEngine;
import parts.SmallEngine;
import vehicles.Vehicle;

public class App{
    public static void main(String[] args){
        
    	//spring object
    	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	
    	Vehicle aCar = (Vehicle)context.getBean("mrBeansCar");
    	aCar.crakIgnition();
    	aCar.stopCar();
    	
    	
    	Vehicle bCar= (Vehicle)context.getBean("raceCar");
    	bCar.crakIgnition();
    	bCar.stopCar();
    	
//        Vehicle raceCar= new Vehicle(new SmallEngine(100));
//        Vehicle familyTruck= new Vehicle(new LargeEngine(500));
//        Vehicle familyCar= new Vehicle(new SmallEngine(100));
//
//        raceCar.crakIgnition();
//        familyTruck.crakIgnition();
//        familyCar.crakIgnition();
        

    }
}