package week03_day6_SubmissionofAlgorithmsRuntimeAnalysisAndBigONotation;

import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        for (int i = 0; i < N; i++) array[i] = i;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
            hashSet.add(num);
            treeSet.add(num);
        }

        long start = System.nanoTime();
        for (int num : array) {
            if (num == target) break;
        }
        long end = System.nanoTime();
        System.out.println("Array Search: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) / 1e6 + " ms");
    }
}
