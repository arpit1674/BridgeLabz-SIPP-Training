package day2_JavaControlFlows.level3PracticePrograms;
import java.util.Scanner;

public class q3_GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = scanner.nextDouble();

        // Calculate average
        double average = (physics + chemistry + maths) / 3;

        // Determine grade and remarks
        String grade;
        String remarks;

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output results
        System.out.printf("\nAverage Marks: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        scanner.close();
    }
}

