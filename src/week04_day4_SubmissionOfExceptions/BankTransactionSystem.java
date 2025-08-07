package week04_day4_SubmissionOfExceptions;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
