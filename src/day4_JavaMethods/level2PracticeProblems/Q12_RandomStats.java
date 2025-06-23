package day4_JavaMethods.level2PracticeProblems;

import java.util.Arrays;

public class Q12_RandomStats {

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated numbers: " + Arrays.toString(numbers));

        double[] result = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f, Min: %d, Max: %d\n", result[0], (int)result[1], (int)result[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // 1000 to 9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
}
