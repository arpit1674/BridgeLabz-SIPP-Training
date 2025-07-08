package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.StacksAndQueues;
import java.util.Stack;

public class Q3_StockSpanProblem {
    public static void calculateSpan(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        for (int s : span) System.out.print(s + " ");
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}
