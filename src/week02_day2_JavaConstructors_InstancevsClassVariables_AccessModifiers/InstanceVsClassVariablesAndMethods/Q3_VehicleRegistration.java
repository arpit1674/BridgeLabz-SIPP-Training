package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers.InstanceVsClassVariablesAndMethods;

public class Q3_VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    public Q3_VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Q3_VehicleRegistration v1 = new Q3_VehicleRegistration("Arjun", "Car");
        Q3_VehicleRegistration v2 = new Q3_VehicleRegistration("Meera", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        updateRegistrationFee(6000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
