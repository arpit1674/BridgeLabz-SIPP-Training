package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q1_FactorDetails {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sum(int[] factors) {
        int sum = 0;
        for (int num : factors) sum += num;
        return sum;
    }

    public static int product(int[] factors) {
        int product = 1;
        for (int num : factors) product *= num;
        return product;
    }

    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int num : factors) sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of squares = " + sumOfSquares(factors));

        sc.close();
    }
}
