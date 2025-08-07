package week04_day3_SubmissionOfJavaStreams;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String file = "words.txt";
        Map<String, Integer> freqMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isBlank())
                        freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        freqMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
