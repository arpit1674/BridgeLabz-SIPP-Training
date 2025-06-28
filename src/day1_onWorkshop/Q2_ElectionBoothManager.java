package day1_onWorkshop;
import java.util.Scanner;

public class Q2_ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vote1 = 0, vote2 = 0, vote3 = 0;
        while (true) {
            System.out.println("Enter age or -1 to stop:");
            int age = sc.nextInt();
            if (age == -1) break;
            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }
            System.out.println("Vote for candidate (1 / 2 / 3):");
            int vote = sc.nextInt();
            if (vote == 1) vote1++;
            else if (vote == 2) vote2++;
            else if (vote == 3) vote3++;
            else System.out.println("Invalid vote.");
        }
        System.out.println("Votes - Candidate 1: " + vote1 + ", Candidate 2: " + vote2 + ", Candidate 3: " + vote3);
        sc.close();
    }
}
