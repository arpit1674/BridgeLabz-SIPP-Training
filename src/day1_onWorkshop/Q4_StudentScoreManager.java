package day1_onWorkshop;

import java.util.Scanner;

public class Q4_StudentScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Enter number of students: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Number of students must be positive.");
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            }
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; ) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                int score = sc.nextInt();
                if (score >= 0) {
                    scores[i] = score;
                    i++;
                } else {
                    System.out.println("Score cannot be negative.");
                }
            } else {
                System.out.println("Invalid input. Enter numeric score.");
                sc.next();
            }
        }

        int sum = 0, max = scores[0], min = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }

        double avg = (double) sum / n;
        System.out.println("\nAverage Score: " + avg);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);

        System.out.print("Scores above average: ");
        for (int score : scores) {
            if (score > avg) {
                System.out.print(score + " ");
            }
        }

        sc.close();
    }
}
