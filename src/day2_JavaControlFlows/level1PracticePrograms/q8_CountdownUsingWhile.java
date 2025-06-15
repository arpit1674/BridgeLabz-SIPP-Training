package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q8_CountdownUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int count = sc.nextInt();
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Lift off!");
        sc.close();
    }
}
