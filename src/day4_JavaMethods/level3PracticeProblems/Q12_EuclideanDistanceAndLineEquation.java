package day4_JavaMethods.level3PracticeProblems;
import java.util.Scanner;

public class Q12_EuclideanDistanceAndLineEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 2 points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        // Calculate line equation
        double[] lineEquation = getLineEquation(x1, y1, x2, y2);
        if (lineEquation == null) {
            System.out.println("Line is vertical. Slope is undefined.");
        } else {
            double m = lineEquation[0];
            double b = lineEquation[1];
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n", m, b);
        }

        sc.close();
    }

 
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            return null; // Vertical line (undefined slope)
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}