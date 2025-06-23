package day4_JavaMethods.level3PracticeProblems;
public class Q7_FactorsCalculator {
    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor: " + greatest(factors));
        System.out.println("Sum of Factors: " + sum(factors));
        System.out.println("Product of Factors: " + product(factors));
        System.out.println("Cube Product of Factors: " + cubeProduct(factors));
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        return factors;
    }

    public static int greatest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr)
            if (val > max) max = val;
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int val : arr) prod *= val;
        return prod;
    }

    public static long cubeProduct(int[] arr) {
        long prod = 1;
        for (int val : arr) prod *= Math.pow(val, 3);
        return prod;
    }
}
