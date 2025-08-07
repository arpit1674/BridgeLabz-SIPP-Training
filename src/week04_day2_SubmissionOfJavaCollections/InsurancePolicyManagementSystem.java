package week04_day2_SubmissionOfJavaCollections;
import java.util.*;

public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        Map<String, String> policyMap = new HashMap<>();
        policyMap.put("P101", "Ravi Kumar");
        policyMap.put("P102", "Sneha Mehta");

        for (String key : policyMap.keySet()) {
            System.out.println("Policy No: " + key + ", Holder: " + policyMap.get(key));
        }
    }
}