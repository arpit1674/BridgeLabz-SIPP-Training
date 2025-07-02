package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + holderName + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SAV123", "Alice", 6000);
        accounts[1] = new CurrentAccount("CUR456", "Bob", 12000);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayAccountDetails();
            System.out.println("Interest: " + accounts[i].calculateInterest());
            if (accounts[i] instanceof Loanable) {
                Loanable loan = (Loanable) accounts[i];
                loan.applyForLoan();
                System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
