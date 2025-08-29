package week06_day2_SubmissionOfFunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = msg -> msg.length();
        String message = "Hello Functional Interfaces!";
        System.out.println("Length: " + lengthFunc.apply(message));
    }
}
