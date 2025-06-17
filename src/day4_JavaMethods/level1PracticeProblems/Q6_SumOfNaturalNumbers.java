package day4_JavaMethods.level1PracticeProblems;
import java.util.Scanner;

public class Q6_SumOfNaturalNumbers {
    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of natural numbers: " + sumNatural(n));
        sc.close();
    }
}
