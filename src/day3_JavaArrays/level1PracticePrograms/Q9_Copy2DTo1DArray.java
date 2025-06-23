package day3_JavaArrays.level1PracticePrograms;
import java.util.Scanner;

public class Q9_Copy2DTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flatArray = new int[rows * cols];
        int index = 0;

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flatArray[index++] = matrix[i][j];
            }
        }

        System.out.println("Flattened 1D Array:");
        for (int i = 0; i < flatArray.length; i++) {
            System.out.print(flatArray[i] + " ");
        }

        sc.close();
    }
}
