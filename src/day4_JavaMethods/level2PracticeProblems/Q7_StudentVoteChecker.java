package day4_JavaMethods.level2PracticeProblems;

import java.util.Scanner;

public class Q7_StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Can vote");
            } else {
                System.out.println("Cannot vote");
            }
        }

        sc.close();
    }
}
