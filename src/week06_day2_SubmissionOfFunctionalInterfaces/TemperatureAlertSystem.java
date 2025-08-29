package week06_day2_SubmissionOfFunctionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 40.0;
        double currentTemp = 42.5;
        System.out.println(isHighTemp.test(currentTemp) ? "ALERT: High Temperature!" : "Temperature Normal");
    }
}
