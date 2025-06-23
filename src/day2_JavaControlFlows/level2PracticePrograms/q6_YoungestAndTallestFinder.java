package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q6_YoungestAndTallestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = sc.nextInt(), height1 = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int age2 = sc.nextInt(), height2 = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int age3 = sc.nextInt(), height3 = sc.nextInt();

        if (age1 < age2 && age1 < age3)
            System.out.println("Youngest: Amar");
        else if (age2 < age1 && age2 < age3)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (height1 > height2 && height1 > height3)
            System.out.println("Tallest: Amar");
        else if (height2 > height1 && height2 > height3)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");

        sc.close();
    }
}
