package dsa.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// Basic class to represent a log entry for our scenario
class LogEntry {
    int timestamp;
    String message;

    public LogEntry(int timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }
}

public class MergeSortedLogs {

    // Merges k sorted lists of log entries into one fully sorted list.
    public List<LogEntry> mergeKLogs(List<List<LogEntry>> sources) {
        // We need a min-heap that holds the current smallest log from each of the k sources.
        // We'll store an int[] in the heap: {sourceIndex, elementIndex}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            int timeA = sources.get(a[0]).get(a[1]).timestamp;
            int timeB = sources.get(b[0]).get(b[1]).timestamp;
            return Integer.compare(timeA, timeB);
        });

        // Seed the heap with the first entry from each source (if it's not empty)
        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0});
            }
        }

        List<LogEntry> merged = new ArrayList<>();

        // Keep popping the smallest log and adding the next log from the same source
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sourceIdx = top[0];
            int elemIdx = top[1];

            // Add the smallest log we found to our final merged list
            merged.add(sources.get(sourceIdx).get(elemIdx));

            // If there's another log in that same source list, push it into the heap
            if (elemIdx + 1 < sources.get(sourceIdx).size()) {
                minHeap.offer(new int[]{sourceIdx, elemIdx + 1});
            }
        }

        return merged;
    }
}
