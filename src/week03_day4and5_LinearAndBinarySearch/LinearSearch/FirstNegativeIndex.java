package week03_day4and5_LinearAndBinarySearch.LinearSearch;

public class FirstNegativeIndex {
    public static void main(String[] args) {
        int[] arr = {12, 7, 9, -3, 14, -8};

        int index = findFirstNegative(arr);
        System.out.println("Index of first negative number: " + index);
    }

    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
