package week03_day3_SortingAlgorithms;

public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {15, 12, 10, 18, 15, 13};
        int max = 18;
        int[] count = new int[max + 1];
        for (int age : ages) count[age]++;
        int index = 0;
        for (int i = 10; i <= max; i++) {
            while (count[i]-- > 0) ages[index++] = i;
        }
        for (int age : ages) System.out.print(age + " ");
    }
}
