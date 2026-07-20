package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NetworkThroughput {

    // computes the max throughput seen in every sliding window of size k
    public static int[] maxThroughputWindow(int[] readings, int k) {
        int n = readings.length;
        int[] result = new int[n - k + 1];
        
        // deque stores indices, ensuring values are strictly decreasing from front to back
        Deque<Integer> deque = new ArrayDeque<>(); 
        
        for (int i = 0; i < n; i++) {
            // kick out old indices that have fallen behind the sliding window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            
            // kick out smaller elements from the back because they are useless now
            while (!deque.isEmpty() && readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }
            
            // push current index
            deque.offerLast(i);
            
            // once our window is fully formed, record the max element (sitting at the front)
            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] throughputs = {40, 50, 30, 20, 80, 10, 60};
        int windowSize = 3;
        
        int[] maxInWindows = maxThroughputWindow(throughputs, windowSize);
        System.out.println("Throughputs:   " + Arrays.toString(throughputs));
        System.out.println("Max per window: " + Arrays.toString(maxInWindows));
    }
}
