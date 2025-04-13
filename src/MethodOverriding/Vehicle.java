package MethodOverriding;

public class Vehicle {
    void vehicle(){
        System.out.println("This is vehicle");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.vehicle();
        Vehicle v1 = new Bike();
        v1.vehicle();
    }
}
class Car extends Vehicle{
    @Override
    void vehicle(){
        System.out.println("This is car");
    }

}
class Bike extends Vehicle{
    @Override
    void vehicle(){
        System.out.println("This is bike");
    }
}