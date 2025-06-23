package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q11_MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number < 1 || number >= 100)
            System.out.println("Invalid input.");
        else {
            for (int i = 1; i < 100; i++) {
                if (i % number == 0)
                    System.out.println(i);
            }
        }
        sc.close();
    }
}
