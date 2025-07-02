package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicleInfo() {
        System.out.println("Vehicle: " + type + ", Number: " + vehicleNumber + ", Rate: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Standard Car Insurance";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    public double calculateInsurance() {
        return 300;
    }

    public String getInsuranceDetails() {
        return "Basic Bike Insurance";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return "Heavy Vehicle Insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("CAR123", 2000);
        vehicles[1] = new Bike("BIKE456", 500);
        vehicles[2] = new Truck("TRUCK789", 3000);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayVehicleInfo();
            System.out.println("Rental for 5 days: " + vehicles[i].calculateRentalCost(5));
            if (vehicles[i] instanceof Insurable) {
                Insurable ins = (Insurable) vehicles[i];
                System.out.println("Insurance: " + ins.calculateInsurance());
                System.out.println("Details: " + ins.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
