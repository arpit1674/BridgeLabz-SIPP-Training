package day3_PracticeProblems.selfProblems;
import java.util.Scanner;

public class q3_powerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + result);
        sc.close();
    }
}
