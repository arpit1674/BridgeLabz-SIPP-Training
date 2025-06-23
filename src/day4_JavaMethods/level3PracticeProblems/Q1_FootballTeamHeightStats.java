package day4_JavaMethods.level3PracticeProblems;
import java.util.*;

public class Q1_FootballTeamHeightStats {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);
        System.out.println("Player heights: " + Arrays.toString(heights));
        double mean = findMean(heights);
        int min = findShortest(heights);
        int max = findTallest(heights);

        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + min + " cm");
        System.out.println("Tallest Height: " + max + " cm");
    }

    public static int[] generateRandomHeights(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(101) + 150;
        return arr;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) min = Math.min(min, i);
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) max = Math.max(max, i);
        return max;
    }
}