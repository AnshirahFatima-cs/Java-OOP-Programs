//Create a parent class Vehicle with method describe()
//that prints "This is a vehicle".
public class Vehicle {
    void describe(){
        System.out.println("this is a vehicle");
    }

    public static void main(String[] args) {
        Vehicle[] v1={
               new Vehicle(), new Car(),new Bike(),new Truck()
        };
        for(Vehicle v2:v1){
            v2.describe();
        }
    }
}
//Create subclasses Car, Bike,
// and Truck that each override describe() with their own message.
class Car extends Vehicle{
    @Override
    void describe(){
        System.out.println("this is car");
    }
}
class Bike extends Vehicle{
    @Override
    void describe(){
        System.out.println("this is bike ");
    }
}
class Truck extends Vehicle{
    @Override
    void describe() {
        System.out.println("this is truck");
    }
}