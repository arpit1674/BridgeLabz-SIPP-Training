package week03_day4and5_LinearAndBinarySearch.ChallengeProblemForBothLinearAndBinarySearch;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);
    }

    static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return n + 1;
    }
}
