package week02_day5_Inheritance.HierarchicalInheritance;

class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displayAccountType() {
        System.out.println("Savings Account: " + accountNumber + " " + balance + " " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    void displayAccountType() {
        System.out.println("Checking Account: " + accountNumber + " " + balance + " " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockPeriod;

    void displayAccountType() {
        System.out.println("Fixed Deposit Account: " + accountNumber + " " + balance + " " + lockPeriod);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "S123";
        sa.balance = 5000;
        sa.interestRate = 4.5;
        sa.displayAccountType();

        CheckingAccount ca = new CheckingAccount();
        ca.accountNumber = "C456";
        ca.balance = 3000;
        ca.withdrawalLimit = 1000;
        ca.displayAccountType();

        FixedDepositAccount fda = new FixedDepositAccount();
        fda.accountNumber = "F789";
        fda.balance = 10000;
        fda.lockPeriod = 12;
        fda.displayAccountType();
    }
}
