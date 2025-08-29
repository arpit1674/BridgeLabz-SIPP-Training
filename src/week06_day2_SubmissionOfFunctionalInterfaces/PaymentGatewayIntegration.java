package week06_day2_SubmissionOfFunctionalInterfaces;

interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Default Refund of " + amount + " initiated.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) { System.out.println("PayPal payment of " + amount); }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.processPayment(2500);
        paypal.refund(1000);
    }
}
