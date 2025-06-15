package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;

public class q1_CheckDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isDivisible = number % 5 == 0;
        System.out.println("Is the number " + number + " divisible by 5? " + (isDivisible ? "Yes" : "No"));
        sc.close();
    }
}

