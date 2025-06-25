package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;

public class Q6_CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;

    public Q6_CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void display() {
        double cost = rentalDays * 1000.0;
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Cost: " + cost);
    }

    public static void main(String[] args) {
        Q6_CarRentalSystem rental = new Q6_CarRentalSystem("Bob", "Swift", 5);
        rental.display();
    }
}
