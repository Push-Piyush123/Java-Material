// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Child class
class Car extends Vehicle {
    void fuel() {
        System.out.println("Car uses petrol or diesel.");
    }
}

// Child class
class Bike extends Vehicle {
    void fuel() {
        System.out.println("Bike uses petrol.");
    }
}

// Main class
public class VehicleMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.fuel();

        System.out.println("----");

        Bike b = new Bike();
        b.run();
        b.fuel();
    }
}
