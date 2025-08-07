package week04_day2_SubmissionOfJavaCollections;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> voteMap = new HashMap<>();
        voteMap.put("Candidate A", 0);
        voteMap.put("Candidate B", 0);

        String[] votes = {"Candidate A", "Candidate A", "Candidate B", "Candidate A"};

        for (String vote : votes) {
            voteMap.put(vote, voteMap.getOrDefault(vote, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " received " + entry.getValue() + " votes.");
        }
    }
}