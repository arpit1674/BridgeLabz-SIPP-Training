package week02_day5_Inheritance.AssistedProblems;

class Vehicle {
    int maxSpeed;
    String fuelType;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + hasCarrier);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];
        v[0] = new Car();
        v[0].maxSpeed = 180;
        v[0].fuelType = "Petrol";
        ((Car) v[0]).seatCapacity = 5;

        v[1] = new Truck();
        v[1].maxSpeed = 120;
        v[1].fuelType = "Diesel";
        ((Truck) v[1]).loadCapacity = 10000;

        v[2] = new Motorcycle();
        v[2].maxSpeed = 90;
        v[2].fuelType = "Petrol";
        ((Motorcycle) v[2]).hasCarrier = true;

        for (Vehicle vehicle : v) {
            vehicle.displayInfo();
        }
    }
}
