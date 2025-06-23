package week02_day1_JavaClassAndObject.level2PracticePrograms;
import java.util.Scanner;

public class Q2_ATMSimulator {
    String accountHolder;
    long accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2_ATMSimulator acc = new Q2_ATMSimulator();
        System.out.print("Enter account holder name: ");
        acc.accountHolder = sc.nextLine();
        System.out.print("Enter account number: ");
        acc.accountNumber = sc.nextLong();
        acc.balance = 0;

        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();

        sc.close();
    }
}
