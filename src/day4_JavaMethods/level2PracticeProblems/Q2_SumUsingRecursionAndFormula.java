package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q2_SumUsingRecursionAndFormula {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
            sc.close();
            return;
        }

        int rec = recursiveSum(n);
        int form = formulaSum(n);

        System.out.println("Recursive Sum: " + rec);
        System.out.println("Formula Sum: " + form);
        System.out.println("Both are " + (rec == form ? "Equal" : "Not Equal"));

        sc.close();
    }
}
