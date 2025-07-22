package week03_day6_SubmissionofAlgorithmsRuntimeAnalysisAndBigONotation;

public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibonacciRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive Fibonacci Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative Fibonacci Time: " + (end - start) / 1e6 + " ms");
    }
}
