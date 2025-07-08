package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.StacksAndQueues;
import java.util.Stack;

public class Q1_QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) return -1;
        return stack2.pop();
    }

    public static void main(String[] args) {
        Q1_QueueUsingTwoStacks q = new Q1_QueueUsingTwoStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
