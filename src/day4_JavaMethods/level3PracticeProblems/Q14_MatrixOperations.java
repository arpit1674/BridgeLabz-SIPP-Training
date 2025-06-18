package day4_JavaMethods.level3PracticeProblems;
import java.util.Random;

public class Q14_MatrixOperations {

    static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = random.nextInt(10);
        return matrix;
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = createRandomMatrix(2, 3);
        int[][] b = createRandomMatrix(2, 3);
        int[][] c = createRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Matrix B:");
        printMatrix(b);
        System.out.println("Addition of A and B:");
        printMatrix(addMatrices(a, b));
        System.out.println("Subtraction of A and B:");
        printMatrix(subtractMatrices(a, b));
        System.out.println("Multiplication of A and C:");
        printMatrix(multiplyMatrices(a, c));
    }
}
