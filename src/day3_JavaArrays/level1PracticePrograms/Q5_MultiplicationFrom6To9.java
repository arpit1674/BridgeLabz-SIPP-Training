package day3_JavaArrays.level1PracticePrograms;
import java.util.Scanner;

public class Q5_MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[][] result = new int[4][10];

        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                result[i - 6][j - 1] = number * j;
            }
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table for " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + result[i - 6][j - 1]);
            }
            System.out.println();
        }

        sc.close();
    }
}