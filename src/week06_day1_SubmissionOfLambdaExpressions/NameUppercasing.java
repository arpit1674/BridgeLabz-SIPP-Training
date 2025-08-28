package week06_day1_SubmissionOfLambdaExpressions;

import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Arpit", "Neha", "Raj");
        employees.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
