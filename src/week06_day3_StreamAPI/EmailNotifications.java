package week06_day3_StreamAPI;

import java.util.*;

class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@test.com", "b@test.com", "c@test.com");

        emails.forEach(email -> System.out.println("Sending email to: " + email));
    }
}
