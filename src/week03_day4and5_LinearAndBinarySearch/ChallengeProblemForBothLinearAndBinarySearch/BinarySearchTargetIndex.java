package week03_day4and5_LinearAndBinarySearch.ChallengeProblemForBothLinearAndBinarySearch;

import java.util.Arrays;

public class BinarySearchTargetIndex {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Index of target " + target + ": " + index);
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
