package EXTRAS_built_in_functions;

import java.util.Scanner;

public class Problem11_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        sc.close();
    }

    static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
