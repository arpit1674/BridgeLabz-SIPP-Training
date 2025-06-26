package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q6_VehicleRegistrationSystem {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    public Q6_VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void display() {
        if (this instanceof Q6_VehicleRegistrationSystem) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Q6_VehicleRegistrationSystem v1 = new Q6_VehicleRegistrationSystem("Sana", "Car", "MH1234");
        v1.display();
        updateRegistrationFee(6000);
        v1.display();
    }
}
