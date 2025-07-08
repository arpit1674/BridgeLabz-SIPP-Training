package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.StacksAndQueues;
import java.util.Stack;

public class Q2_SortStackRecursively {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertSorted(stack, top);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int val) {
        if (stack.isEmpty() || val > stack.peek()) {
            stack.push(val);
        } else {
            int top = stack.pop();
            insertSorted(stack, val);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(5);
        stack.push(20);
        stack.push(10);
        sortStack(stack);
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }
}
