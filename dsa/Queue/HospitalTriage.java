package Queue;

import java.util.PriorityQueue;

public class HospitalTriage {
    
    // a patient with a priority score (lower number = more urgent)
    static class Patient {
        int priority;
        String name;
        
        Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return name + " (Priority " + priority + ")";
        }
    }

    // our min-heap triage system based entirely on priority, ignoring arrival time
    private PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> a.priority - b.priority); 

    // a new patient walks into the ER
    public void admitPatient(Patient p) {
        System.out.println("Admitting " + p);
        triageQueue.offer(p);
    }

    // doctor is ready for the next patient
    public Patient callNextPatient() {
        if (triageQueue.isEmpty()) {
            System.out.println("Waiting room is empty.");
            return null;
        }
        
        // always serves the lowest priority number next
        Patient next = triageQueue.poll(); 
        System.out.println("Doctor is seeing: " + next);
        return next;
    }

    public static void main(String[] args) {
        HospitalTriage er = new HospitalTriage();
        
        er.admitPatient(new Patient(3, "Alice"));
        er.admitPatient(new Patient(5, "Bob"));
        er.admitPatient(new Patient(1, "Charlie")); // highly critical!
        
        er.callNextPatient();
        er.callNextPatient();
    }
}
