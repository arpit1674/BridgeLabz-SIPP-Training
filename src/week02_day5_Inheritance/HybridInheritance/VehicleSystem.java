package week02_day5_Inheritance.HybridInheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging electric vehicle model: " + model);
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol vehicle model: " + model);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.model = "Tesla";
        ev.maxSpeed = 250;
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle();
        pv.model = "Honda City";
        pv.maxSpeed = 180;
        pv.refuel();
    }
}
