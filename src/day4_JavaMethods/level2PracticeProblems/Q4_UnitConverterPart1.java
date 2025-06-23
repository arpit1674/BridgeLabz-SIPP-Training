package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q4_UnitConverterPart1 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Test the conversions with a simple menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. Km to Miles");
        System.out.println("2. Miles to Km");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double input = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = convertKmToMiles(input);
                System.out.println("Km to Miles: " + result);
                break;
            case 2:
                result = convertMilesToKm(input);
                System.out.println("Miles to Km: " + result);
                break;
            case 3:
                result = convertMetersToFeet(input);
                System.out.println("Meters to Feet: " + result);
                break;
            case 4:
                result = convertFeetToMeters(input);
                System.out.println("Feet to Meters: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
