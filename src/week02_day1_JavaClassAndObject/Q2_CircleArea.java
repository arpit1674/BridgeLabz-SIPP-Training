package week02_day1_JavaClassAndObject;

import java.util.Scanner;

public class Q2_CircleArea {
    double radius;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2_CircleArea circle = new Q2_CircleArea();

        System.out.print("Enter Radius: ");
        circle.radius = sc.nextDouble();

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        sc.close();
    }
}
