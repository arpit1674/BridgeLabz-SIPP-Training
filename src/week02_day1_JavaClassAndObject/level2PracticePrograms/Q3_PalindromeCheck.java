package week02_day1_JavaClassAndObject.level2PracticePrograms;
import java.util.Scanner;

public class Q3_PalindromeCheck {
    String text;

    public boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) rev += text.charAt(i);
        return text.equalsIgnoreCase(rev);
    }

    public void displayResult() {
        System.out.println("Is Palindrome: " + isPalindrome());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3_PalindromeCheck obj = new Q3_PalindromeCheck();
        System.out.print("Enter text: ");
        obj.text = sc.nextLine();
        obj.displayResult();
        sc.close();
    }
}
