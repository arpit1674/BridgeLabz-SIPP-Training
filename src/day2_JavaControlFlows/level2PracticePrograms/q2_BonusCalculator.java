package day2_JavaControlFlows.level2PracticePrograms;

import java.util.Scanner;
public class q2_BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus applicable.");
        }
        sc.close();
    }
}