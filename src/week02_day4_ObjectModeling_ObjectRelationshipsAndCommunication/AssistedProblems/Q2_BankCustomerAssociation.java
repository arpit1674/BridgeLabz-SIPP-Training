package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.AssistedProblems;
public class Q2_BankCustomerAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer customer = new Customer("Arpit", 5000);
        bank.openAccount(customer);
        customer.viewBalance();
    }
}

class Bank {
    String name;
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account at " + name);
    }
}

class Customer {
    String name;
    double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}