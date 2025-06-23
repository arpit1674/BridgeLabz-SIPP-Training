package day4_JavaMethods.level1PracticeProblems;
import java.util.Scanner;

public class Q2_Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum handshakes possible: " + calculateHandshakes(n));
        sc.close();
    }
}
