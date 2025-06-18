package day4_JavaMethods.level3PracticeProblems;
import java.util.Random;

public class Q15_MatrixManipulation {

    static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < cols; i++)
            for (int j = 0; j < rows; j++)
                trans[i][j] = matrix[j][i];
        return trans;
    }

    static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / (double) det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / (double) det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / (double) det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / (double) det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;
        return inv;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix3x3 = generateMatrix(3, 3);
        System.out.println("Original 3x3 Matrix:");
        printMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix3x3));

        int det3x3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant: " + det3x3);

        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) {
            System.out.println("\nInverse:");
            printMatrix(inv3x3);
        } else {
            System.out.println("\nInverse doesn't exist (Determinant is 0)");
        }

        System.out.println("\n--- 2x2 Matrix Test ---");
        int[][] matrix2x2 = generateMatrix(2, 2);
        printMatrix(matrix2x2);

        int det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant: " + det2x2);

        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) {
            System.out.println("Inverse:");
            printMatrix(inv2x2);
        } else {
            System.out.println("Inverse doesn't exist (Determinant is 0)");
        }
    }
}