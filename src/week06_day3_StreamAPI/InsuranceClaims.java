package week06_day3_StreamAPI;

import java.util.*;
import java.util.stream.*;

class InsuranceClaims {
    public static void main(String[] args) {
        class Claim {
            String type; double amount;
            Claim(String type, double amount) { this.type = type; this.amount = amount; }
        }

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 20000),
            new Claim("Car", 15000),
            new Claim("Health", 30000),
            new Claim("Car", 25000),
            new Claim("Home", 50000)
        );

        Map<String, Double> avgClaims = claims.stream()
                .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> System.out.println(type + " -> " + avg));
    }
}
