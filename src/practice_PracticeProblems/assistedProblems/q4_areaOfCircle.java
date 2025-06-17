package practice_PracticeProblems.assistedProblems;
import java.util.Scanner;

public class q4_areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        sc.close();
    }
}