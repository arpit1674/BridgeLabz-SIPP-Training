package workshop;
import java.util.Scanner;

public class Q3_ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;
        int occupied = 0;
        while (true) {
            System.out.println("1. Park\n2. Exit\n3. Show Occupancy\n4. Quit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Car parked. Occupied: " + occupied);
                    } else {
                        System.out.println("Parking full.");
                    }
                    break;
                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited. Occupied: " + occupied);
                    } else {
                        System.out.println("No cars to exit.");
                    }
                    break;
                case 3:
                    System.out.println("Occupied slots: " + occupied + "/" + capacity);
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
