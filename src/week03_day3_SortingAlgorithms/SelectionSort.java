package week03_day3_SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {75, 82, 60, 90, 68};
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[i]; scores[i] = scores[minIdx]; scores[minIdx] = temp;
        }
        for (int score : scores) System.out.print(score + " ");
    }
}
