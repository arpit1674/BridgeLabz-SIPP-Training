package week06_day3_StreamAPI;

import java.util.*;
import java.time.*;
import java.util.stream.*;

class ExpiringMemberships {
    public static void main(String[] args) {
        class Member {
            String name; LocalDate expiry;
            Member(String name, LocalDate expiry) { this.name = name; this.expiry = expiry; }
            public String toString() { return name + " expires " + expiry; }
        }

        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(25))
        );

        members.stream()
               .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
               .forEach(System.out::println);
    }
}
