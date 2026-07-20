package dsa.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKCustomers {

    // Finds the top k highest spending customers from a stream/array of transactions.
    public List<Integer> getTopK(int[] transactions, int k) {
        // We'll maintain a min-heap of size k. 
        // Why a min-heap? Because the root will always be the smallest of our "top k" candidates.
        // It makes it easy to check if a new transaction should replace the weakest top candidate.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {
            if (minHeap.size() < k) {
                // If we haven't found k elements yet, just add it
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                // If the heap is full but this amount is bigger than our smallest top-k candidate,
                // we boot out the smallest one and add this new amount.
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        // Turn our heap into a list to return
        return new ArrayList<>(minHeap);
    }
}
