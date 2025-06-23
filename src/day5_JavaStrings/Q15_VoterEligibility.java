package day5_JavaStrings;
import java.util.*;

public class Q15_VoterEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkEligibility(ages);

        System.out.println("Age\tCan Vote");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
        sc.close();
    }

    public static int[] generateAges(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * 90) + 10;
        return arr;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return result;
    }
}
