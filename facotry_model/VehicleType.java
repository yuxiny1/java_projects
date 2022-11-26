public enum VehicleType {

    //predefine constances can be called upon certai nbehavior
    TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    },
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    },
    ElECTRIC{
        public Vehicle getVehicle(){
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}