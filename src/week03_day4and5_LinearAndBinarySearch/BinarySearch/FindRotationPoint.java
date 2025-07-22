package week03_day4and5_LinearAndBinarySearch.BinarySearch;

public class FindRotationPoint {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int index = findRotationPoint(arr);
        System.out.println("Rotation point index: " + index);
    }

    static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
