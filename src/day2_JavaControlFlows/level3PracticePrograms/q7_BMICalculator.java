package day2_JavaControlFlows.level3PracticePrograms;
import java.util.Scanner;

public class q7_BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        // Input height in centimeters
        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine BMI status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output results
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
        scanner.close();
    }
}

