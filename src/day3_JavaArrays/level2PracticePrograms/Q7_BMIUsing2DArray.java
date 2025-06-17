package day3_JavaArrays.level2PracticePrograms;
import java.util.Scanner;

public class Q7_BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [][0]=weight, [][1]=height, [][2]=BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Validate weight input
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Please enter a positive weight.");
            } while (weight <= 0);

            // Validate height input
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Please enter a positive height.");
            } while (height <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying result
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
