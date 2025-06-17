package day3_JavaArrays.level1PracticePrograms;

import java.util.Scanner;

public class Q4_InputUntilNegativeAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Sum of numbers entered: " + total);
        sc.close();
    }
}
