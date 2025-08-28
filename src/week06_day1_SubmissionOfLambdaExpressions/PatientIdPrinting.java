package week06_day1_SubmissionOfLambdaExpressions;

import java.util.*;

public class PatientIdPrinting {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);
        patientIds.forEach(System.out::println);
    }
}
