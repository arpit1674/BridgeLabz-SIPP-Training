package week06_day1_SubmissionOfLambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message, type;
    Alert(String message, String type) {
        this.message = message; this.type = type;
    }
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Patient needs immediate attention!", "Critical"),
                new Alert("Routine check-up scheduled.", "Info"),
                new Alert("Cafeteria menu updated.", "General")
        );

        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);
    }
}
