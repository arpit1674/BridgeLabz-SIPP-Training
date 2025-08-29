package week06_day2_SubmissionOfFunctionalInterfaces;

interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 75%"); }
}

class PetrolCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 100 km/h"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle eCar = new ElectricCar();
        Vehicle pCar = new PetrolCar();
        eCar.displaySpeed(); eCar.displayBattery();
        pCar.displaySpeed(); pCar.displayBattery();
    }
}
