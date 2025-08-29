package week06_day2_SubmissionOfFunctionalInterfaces;

interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI"); }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card"); }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet"); }
}

public class DigitalPaymentInterface {
    public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment cc = new CreditCard();
        DigitalPayment wallet = new Wallet();
        upi.pay(500);
        cc.pay(1000);
        wallet.pay(300);
    }
}
