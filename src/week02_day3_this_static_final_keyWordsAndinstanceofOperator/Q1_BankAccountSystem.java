package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q1_BankAccountSystem {
    static String bankName = "Axis Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    public Q1_BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof Q1_BankAccountSystem) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        Q1_BankAccountSystem a1 = new Q1_BankAccountSystem("Amit", 1001);
        Q1_BankAccountSystem a2 = new Q1_BankAccountSystem("Riya", 1002);
        a1.displayDetails();
        a2.displayDetails();
        getTotalAccounts();
    }
}
