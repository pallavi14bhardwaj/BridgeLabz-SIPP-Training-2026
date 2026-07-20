package dsa.heaps;

import java.util.PriorityQueue;

public class KthLargestScore {

    // Finds the k-th largest score without fully sorting the array.
    public int findKthLargest(int[] scores, int k) {
        // Same idea as finding the top k, we use a min-heap of size k.
        // After processing everything, the root of this min-heap will be exactly the k-th largest element!
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        // The root is the k-th largest score. Boom.
        return minHeap.peek(); 
    }
}
