package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q9_CountdownUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int count = sc.nextInt();
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");
        sc.close();
    }
}
