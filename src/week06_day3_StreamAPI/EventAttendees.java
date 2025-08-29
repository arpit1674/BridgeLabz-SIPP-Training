package week06_day3_StreamAPI;

import java.util.*;

class EventAttendees {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Alice", "Bob", "Charlie");

        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
    }
}
