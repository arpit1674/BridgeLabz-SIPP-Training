package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;

public class q2_CheckFirstSmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter` third number: ");
        int c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
        sc.close();
    }
}