package practice_PracticeProblems.selfProblems;
import java.util.Scanner;

public class q5_kilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
        sc.close();
    }
}