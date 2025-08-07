package week04_day2_SubmissionOfJavaCollections;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<Integer, Double> accountBalance = new HashMap<>();
        accountBalance.put(1001, 25000.0);
        accountBalance.put(1002, 18000.0);

        for (Map.Entry<Integer, Double> entry : accountBalance.entrySet()) {
            System.out.println("Account: " + entry.getKey() + ", Balance: ₹" + entry.getValue());
        }
    }
}