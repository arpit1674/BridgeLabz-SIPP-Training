package day1_ProgrammingElements.level1PracticePrograms;
import java.util.Scanner;
public class q15_MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
        input.close();
    }
}
