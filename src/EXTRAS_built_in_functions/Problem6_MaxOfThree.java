package EXTRAS_built_in_functions;

import java.util.Scanner;

public class Problem6_MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = takeInput(sc);
        int b = takeInput(sc);
        int c = takeInput(sc);
        System.out.println("Maximum: " + findMax(a, b, c));
    }

    static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}
