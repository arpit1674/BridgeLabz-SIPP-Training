package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q15_FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
