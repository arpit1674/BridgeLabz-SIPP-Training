package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.StacksAndQueues;
import java.util.*;

public class Q4_SlidingWindowMaximum {
    public static void maxInWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) System.out.print(nums[dq.peekFirst()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        maxInWindow(nums, k);
    }
}
