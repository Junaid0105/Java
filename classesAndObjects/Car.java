package classesAndObjects;

public class Car {

    // Object  =  An entity that holds data (Attributes)
    //            and can perform actions (methods)
    //            It is a reference data type

    // instance variables...................
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // instance methods...............
    public void drive(){
        System.out.println("Car is driving....");
        currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
