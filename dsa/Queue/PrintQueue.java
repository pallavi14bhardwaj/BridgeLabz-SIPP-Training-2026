package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {
    
    // our print server queue using a built-in Deque
    private Deque<Integer> queue = new ArrayDeque<>();

    // standard job submitted by a regular user
    public void submitJob(int jobId) {
        System.out.println("Normal job " + jobId + " added to the back.");
        queue.addLast(jobId); 
    }

    // urgent job from the boss that cuts the line
    public void submitUrgentJob(int jobId) {
        System.out.println("URGENT job " + jobId + " cutting to the front!");
        queue.addFirst(jobId); 
    }

    // printer pulls the next job from the front
    public int printNextJob() {
        if (queue.isEmpty()) {
            throw new RuntimeException("No jobs left to print.");
        }
        int nextJob = queue.removeFirst();
        System.out.println("Now printing job: " + nextJob);
        return nextJob;
    }

    public static void main(String[] args) {
        PrintQueue printer = new PrintQueue();
        
        printer.submitJob(10);
        printer.submitJob(11);
        printer.submitUrgentJob(99);
        printer.submitJob(12);
        
        printer.printNextJob();
        printer.printNextJob();
    }
}
