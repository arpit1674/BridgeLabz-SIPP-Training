package week03_day6_SubmissionofAlgorithmsRuntimeAnalysisAndBigONotation;

import java.util.Arrays;

public class SearchComparison {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dataset = new int[1_000_000];
        for (int i = 0; i < dataset.length; i++) dataset[i] = i + 1;

        int target = 999999;

        long start = System.nanoTime();
        linearSearch(dataset, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        binarySearch(dataset, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1e6 + " ms");
    }
}
