package inheritance;

class Vehicle{
    public void start(){
        System.out.println("Starting......");
    }
    public void accelerate(){
        System.out.println("Accelerating.....");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
}

class Car extends Vehicle{
    public void reverse(){
        System.out.println("Reverse........");
    }
}

public class useVehicle {
    public static void main(String[] args){
        Car objCar = new Car();
        objCar.start();// parent class method
        objCar.accelerate(); // parent class method
        objCar.reverse();
        objCar.turnLeft();//parent class method
        objCar.turnRight(); // parent class method
    }
}
