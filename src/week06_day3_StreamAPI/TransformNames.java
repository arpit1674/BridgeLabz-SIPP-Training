package week06_day3_StreamAPI;

import java.util.*;
import java.util.stream.*;

class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "mike", "sara");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
