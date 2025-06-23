package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q5_UnitConverterPart2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter choice (1-5): ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double input = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1: result = convertYardsToFeet(input); break;
            case 2: result = convertFeetToYards(input); break;
            case 3: result = convertMetersToInches(input); break;
            case 4: result = convertInchesToMeters(input); break;
            case 5: result = convertInchesToCentimeters(input); break;
            default: System.out.println("Invalid choice"); sc.close(); return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
