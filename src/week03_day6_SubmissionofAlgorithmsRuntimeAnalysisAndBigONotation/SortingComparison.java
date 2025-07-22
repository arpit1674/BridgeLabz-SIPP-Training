package week03_day6_SubmissionofAlgorithmsRuntimeAnalysisAndBigONotation;

import java.util.Arrays;

public class SortingComparison {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] original = new int[10000];
        for (int i = 0; i < original.length; i++) original[i] = (int)(Math.random() * 10000);

        int[] copy = Arrays.copyOf(original, original.length);
        long start = System.nanoTime();
        bubbleSort(copy);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) / 1e6 + " ms");

        copy = Arrays.copyOf(original, original.length);
        start = System.nanoTime();
        mergeSort(copy, 0, copy.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort: " + (end - start) / 1e6 + " ms");

        copy = Arrays.copyOf(original, original.length);
        start = System.nanoTime();
        Arrays.sort(copy);
        end = System.nanoTime();
        System.out.println("Quick Sort (Java): " + (end - start) / 1e6 + " ms");
    }
}
