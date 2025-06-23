package day3_JavaArrays.level2PracticePrograms;
import java.util.Scanner;

public class Q8_StudentGradesCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3]; // 0 - Physics, 1 - Chemistry, 2 - Maths
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid mark. Please enter a positive mark between 0 and 100.");
                    j--; // repeat input for the same subject
                } else {
                    marks[i][j] = mark;
                }
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double percent = percentages[i];
            if (percent >= 80) {
                grades[i] = "A";
            } else if (percent >= 70) {
                grades[i] = "B";
            } else if (percent >= 60) {
                grades[i] = "C";
            } else if (percent >= 50) {
                grades[i] = "D";
            } else if (percent >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("\n--- Student Grade Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close();
    }
}
