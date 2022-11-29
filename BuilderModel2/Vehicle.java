public class Vehicle {
    int price;
    String type;
    String make;
    int horsePower;
    String model;
    String color;
    int doors;
    
    public Vehicle(Builder builder){
        this.price = builder.price;
        this.type = builder.type;
        this.make = builder.make;
        this.horsePower = builder.horsePower;
        this.model = builder.model;
        this.color = builder.color;
        this.doors = builder.doors;
    }

    public String toString(){
        return "Vehicle: " + this.type + " " + this.make + " " + this.model + " " + this.color + " " + this.doors + " " + this.horsePower + " " + this.price;
    }

    public static class Builder {
        //static class because it is not dependent on the instance of the outer class
        int price;
        String type;
        String make;
        int horsePower;
        String model;
        String color;
        int doors;
        
        public Builder(int price, String type, String make){
            this.price = price;
            this.type = type;
            this.make = make;
        }
        
        public Builder horsePower(int horsePower){
            this.horsePower = horsePower;
            return this;
        }
        
        public Builder model(String model){
            this.model = model;
            return this;
        }
        
        public Builder color(String color){
            this.color = color;
            return this;
        }
        
        public Builder doors(int doors){
            this.doors = doors;
            return this;
        }
        
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
    
}
