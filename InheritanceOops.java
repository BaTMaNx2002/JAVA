// Inheritance
// Inheritance allows a new class to inherit the properties and methods of an existing class. This promotes code reusability.

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    } 
}

class Bike extends Vehicle {
    void honk() {
        System.out.println("Bike is honking");
    }
}

public class InheritanceOops {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start(); // Inherited method
        myBike.honk();  // Bike's own method
    }
}
