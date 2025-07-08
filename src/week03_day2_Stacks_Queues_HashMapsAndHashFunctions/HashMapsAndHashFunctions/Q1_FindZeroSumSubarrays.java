package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.HashMapsAndHashFunctions;
import java.util.*;

public class Q1_FindZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1)));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray: " + (start + 1) + " to " + i);
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}
