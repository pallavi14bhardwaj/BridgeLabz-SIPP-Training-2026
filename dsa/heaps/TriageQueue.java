package dsa.heaps;

import java.util.PriorityQueue;

// A simple class to represent a patient
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class TriageQueue {
    // We want a max-heap based on severity, so the most severe patient is always at the top.
    // By default PriorityQueue is a min-heap, so we pass a custom comparator.
    private PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

    // O(log n) time - we just add the patient to the heap
    public void addPatient(Patient p) {
        queue.offer(p);
    }

    // O(log n) time - grab the most severe patient and remove them from the queue
    public Patient treatNext() {
        return queue.poll();
    }
    
    // O(1) time - just peek at who is next without removing
    public Patient peekNext() {
        return queue.peek();
    }
}
