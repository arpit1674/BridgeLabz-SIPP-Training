package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideBike extends RideVehicle implements GPS {
    private String location;

    public RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideAuto extends RideVehicle implements GPS {
    private String location;

    public RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle[] vehicles = new RideVehicle[3];
        vehicles[0] = new RideCar("C101", "Ravi", 12.5);
        vehicles[1] = new RideBike("B202", "Arun", 6.0);
        vehicles[2] = new RideAuto("A303", "Sita", 8.5);

        double[] distances = {10, 5, 7};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].getVehicleDetails();
            System.out.println("Distance: " + distances[i] + " km");
            System.out.println("Fare: ₹" + vehicles[i].calculateFare(distances[i]));
            System.out.println("------");
        }
    }
}
