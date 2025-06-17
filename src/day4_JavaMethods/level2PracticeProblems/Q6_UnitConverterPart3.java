package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q6_UnitConverterPart3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter choice (1-6): ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double input = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = convertFahrenheitToCelsius(input); break;
            case 2: result = convertCelsiusToFahrenheit(input); break;
            case 3: result = convertPoundsToKilograms(input); break;
            case 4: result = convertKilogramsToPounds(input); break;
            case 5: result = convertGallonsToLiters(input); break;
            case 6: result = convertLitersToGallons(input); break;
            default: System.out.println("Invalid choice"); sc.close(); return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
