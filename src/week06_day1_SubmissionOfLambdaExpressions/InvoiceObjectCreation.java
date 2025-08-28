package week06_day1_SubmissionOfLambdaExpressions;

import java.util.*;

class Invoice {
    String transactionId;
    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice generated for transaction: " + transactionId;
    }
}

public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN123", "TXN124", "TXN125");
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).toList();
        invoices.forEach(System.out::println);
    }
}
