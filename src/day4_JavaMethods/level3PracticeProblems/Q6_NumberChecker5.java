package day4_JavaMethods.level3PracticeProblems;
public class Q6_NumberChecker5 {
    public static void main(String[] args) {
        int number = 145;
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }

    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}
